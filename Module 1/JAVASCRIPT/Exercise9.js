function loadEvents() {
  const spinner = document.querySelector("#loading");
  spinner.style.display = "block";
  fetch("https://jsonplaceholder.typicode.com/posts")
    .then(res => res.json())
    .then(data => {
      spinner.style.display = "none";
      console.log("Fetched events", data.slice(0, 5));
    })
    .catch(err => {
      spinner.style.display = "none";
      console.error("Error loading events", err);
    });
}
async function loadEventsAsync() {
  try {
    document.querySelector("#loading").style.display = "block";
    const res = await fetch("https://jsonplaceholder.typicode.com/posts");
    const data = await res.json();
    document.querySelector("#loading").style.display = "none";
    console.log("Async Events", data.slice(0, 5));
  } catch (err) {
    console.error(err);
  }
}
