SELECT cod as "id", full_name as "name" FROM USER
WHERE 1=1
/* if (filterId != null) */
AND cod = :filterId
/* endif  */
/* if (filterName != null) */
AND full_name like :filterName
/* endif  */