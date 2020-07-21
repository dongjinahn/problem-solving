WITH a AS (
    SELECT class, COUNT(DISTINCT student) AS count FROM courses GROUP BY class
)
SELECT class FROM a WHERE count >= 5;