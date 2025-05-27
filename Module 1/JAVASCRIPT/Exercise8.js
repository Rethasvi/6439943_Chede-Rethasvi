document.querySelectorAll(".registerBtn").forEach(btn => {
  btn.onclick = () => {
    alert("You have registered!");
  };
});
document.querySelector("#categoryFilter").onchange = (e) => {
  const selected = e.target.value;
  console.log("Filter by:", selected);
};
document.querySelector("#search").addEventListener("keydown", (e) => {
  console.log("Searching:", e.key);
});
