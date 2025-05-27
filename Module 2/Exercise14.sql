Use Mydata;
SELECT e.event_id, e.title, COUNT(*) AS registration_count
FROM Registrations r
JOIN Events e ON r.event_id = e.event_id
GROUP BY r.event_id
ORDER BY registration_count DESC
LIMIT 3;
