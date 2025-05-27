function greetUser(name = "Guest") {
  console.log(`Hello, ${name}!`);
}
const eventDetails = { name: "Dance Fest", date: "2025-08-01", type: "Music" };
const { name, date } = eventDetails;
console.log(`${name} is scheduled for ${date}`);
const allEventsCopy = [...communityEvents];
