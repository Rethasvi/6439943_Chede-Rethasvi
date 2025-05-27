function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}

Event.prototype.checkAvailability = function () {
  return this.seats > 0;
};

const e = new Event("Gardening 101", "2025-07-20", 15);
console.log(Object.entries(e));