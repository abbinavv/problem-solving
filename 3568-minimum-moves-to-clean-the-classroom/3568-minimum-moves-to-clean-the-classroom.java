class Solution {

    static class State {
        int r, c, energy, mask, moves;

        State(int r, int c, int energy, int mask, int moves) {
            this.r = r;
            this.c = c;
            this.energy = energy;
            this.mask = mask;
            this.moves = moves;
        }
    }

    public int minMoves(String[] classroom, int energy) {

        int m = classroom.length;
        int n = classroom[0].length();

        int startR = 0;
        int startC = 0;

        // litterIndex[r][c] tells us which litter this cell represents
        // -1 means this cell is not litter
        int[][] litterIndex = new int[m][n];

        for (int[] row : litterIndex) {
            Arrays.fill(row, -1);
        }

        int litterCount = 0;

        // Find starting position and assign an index to every litter
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {

                char ch = classroom[r].charAt(c);

                if (ch == 'S') {
                    startR = r;
                    startC = c;
                }

                if (ch == 'L') {
                    litterIndex[r][c] = litterCount;
                    litterCount++;
                }
            }
        }

        // No litter to collect
        if (litterCount == 0) {
            return 0;
        }

        // Example: litterCount = 3
        // 1 << 3 = 1000
        // - 1   = 0111
        int allCollected = (1 << litterCount) - 1;

        /*
         * visited[r][c][energy][mask]
         *
         * mask tells us which litter has been collected.
         */
        boolean[][][][] visited =
            new boolean[m][n][energy + 1][1 << litterCount];

        Queue<State> queue = new LinkedList<>();

        // Starting state
        queue.offer(new State(startR, startC, energy, 0, 0));
        visited[startR][startC][energy][0] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {

            State curr = queue.poll();

            // We collected every litter
            if (curr.mask == allCollected) {
                return curr.moves;
            }

            // No energy -> cannot make another move
            if (curr.energy == 0) {
                continue;
            }

            // Try 4 directions
            for (int d = 0; d < 4; d++) {

                int nr = curr.r + dr[d];
                int nc = curr.c + dc[d];

                // Outside grid
                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                // Obstacle
                if (classroom[nr].charAt(nc) == 'X') {
                    continue;
                }

                // Moving costs 1 energy
                int newEnergy = curr.energy - 1;

                // Keep current litter mask
                int newMask = curr.mask;

                // If we stepped on litter
                if (classroom[nr].charAt(nc) == 'L') {

                    int index = litterIndex[nr][nc];

                    newMask = newMask | (1 << index);
                }

                // Reset energy if we stepped on R
                if (classroom[nr].charAt(nc) == 'R') {
                    newEnergy = energy;
                }

                // If this exact state hasn't been visited
                if (!visited[nr][nc][newEnergy][newMask]) {

                    visited[nr][nc][newEnergy][newMask] = true;

                    queue.offer(
                        new State(
                            nr,
                            nc,
                            newEnergy,
                            newMask,
                            curr.moves + 1
                        )
                    );
                }
            }
        }

        // Impossible to collect all litter
        return -1;
    }
}
    
