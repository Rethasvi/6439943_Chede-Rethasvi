function submitRegistration(data) {
  setTimeout(() => {
    fetch("https://jsonplaceholder.typicode.com/posts", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(data),
    })
      .then(res => res.json())
      .then(res => console.log("Submission success", res))
      .catch(err => console.error("Submission failed", err));
  }, 2000); // simulate delay
}