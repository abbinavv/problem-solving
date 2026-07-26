class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] temp = new int[n1+n2];
        int index = 0;
        for(int i:nums1){
            temp[index++] = i;
        }
        for(int i : nums2){
            temp[index++] = i;
        }

        int N = temp.length;
        Arrays.sort(temp);


        if(N%2==1){
            return temp[N/2];
        }
        else{
            return (temp[N / 2 - 1] + temp[N / 2]) / 2.0;
        }
    }
}