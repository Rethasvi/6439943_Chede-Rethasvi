const events = [
  { name: "Yoga Session", date: "2025-07-01", seats: 10 },
  { name: "Old Music Fest", date: "2023-01-01", seats: 20 },
  { name: "Coding Bootcamp", date: "2025-06-10", seats: 0 },
];

const today = new Date();

events.forEach(event => {
  const eventDate = new Date(event.date);
  if (eventDate > today && event.seats > 0) {
    console.log(`Upcoming Event: ${event.name}`);
  } else {
    console.log(`Skipping: ${event.name}`);
  }
});

try {
  function registerEvent(event) {
    if (event.seats > 0) {
      event.seats--;
      console.log(`Registered for ${event.name}`);
    } else {
      throw new Error("No seats available");
    }
  }
  registerEvent(events[0]);
} catch (e) {
  console.error(e.message);
}
