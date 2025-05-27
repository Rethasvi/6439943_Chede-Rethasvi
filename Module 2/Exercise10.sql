Use Mydata;
SELECT e.event_id, e.title
FROM Events e
JOIN Registrations r ON e.event_id = r.event_id
WHERE e.event_id NOT IN (
  SELECT DISTINCT event_id FROM Feedback
)
GROUP BY e.event_id;
