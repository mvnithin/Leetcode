# Write your MySQL query statement below
(select name as results from MovieRating join Users using(user_id) group by name order by count(*) desc,name limit 1)
union all
(SELECT title AS results
FROM MovieRating JOIN Movies USING(movie_id)
WHERE EXTRACT(YEAR_MONTH FROM created_at) = 202002
GROUP BY title
ORDER BY AVG(rating) DESC, title
LIMIT 1);
