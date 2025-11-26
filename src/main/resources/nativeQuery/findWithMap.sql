SELECT cod as "id", full_name as "name" FROM USER
WHERE 1=1
/* for item in params */
AND {{item}} = :{{item}}
/* endfor */
