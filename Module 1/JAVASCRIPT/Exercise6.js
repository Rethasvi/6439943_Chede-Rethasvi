const communityEvents = [];
communityEvents.push({ name: "Baking Workshop", type: "Workshop" });
const musicEvents = communityEvents.filter(e => e.type === "Music");
const formatted = communityEvents.map(e => `${e.type}: ${e.name}`);
console.log(formatted);
