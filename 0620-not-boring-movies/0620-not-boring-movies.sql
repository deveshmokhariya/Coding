# Write your MySQL query statement below
SELECT *
FROM Cinema
WHERE description != "boring" AND id IN (SELECT id FROM Cinema WHERE id%2 != 0)
ORDER BY rating DESC;