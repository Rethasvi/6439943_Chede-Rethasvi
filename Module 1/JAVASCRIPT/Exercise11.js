document.querySelector("#registrationForm").addEventListener("submit", function (e) {
  e.preventDefault();
  const name = this.elements["name"].value;
  const email = this.elements["email"].value;
  if (!name || !email) {
    document.querySelector("#error").textContent = "All fields required.";
    return;
  }
  console.log("Registered:", { name, email });
});