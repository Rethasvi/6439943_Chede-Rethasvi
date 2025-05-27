function addEvent(name, date, category) {
  events.push({ name, date, category, seats: 20 });
}

function filterEventsByCategory(category) {
  return events.filter(event => event.category === category);
}

function registrationTracker(category) {
  let count = 0;
  return function () {
    count++;
    console.log(`${count} registered for ${category}`);
  };
}

const musicRegistration = registrationTracker("Music");
musicRegistration();
musicRegistration();

function filterEvents(callback) {
  return events.filter(callback);
}
