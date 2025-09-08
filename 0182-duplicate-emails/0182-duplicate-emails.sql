SELECT distinct Email
FROM (SELECT Email,row_number() OVER (partition by Email) as rn_email
FROM Person ) email_rn
WHERE rn_email > 1