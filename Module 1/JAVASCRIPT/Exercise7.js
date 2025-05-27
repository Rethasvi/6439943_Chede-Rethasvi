const container = document.querySelector("#eventContainer");
communityEvents.forEach(event => {
  const card = document.createElement("div");
  card.className = "eventCard";
  card.textContent = `${event.name} - ${event.type}`;
  container.appendChild(card);
});
