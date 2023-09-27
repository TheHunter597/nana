let form = document.querySelector("form");

form.addEventListener("submit", async function (e) {
  e.preventDefault();
  let name = document.querySelector("#name").value;
  let email = document.querySelector("#email").value;
  console.log(name, email);
  let formData = new FormData();
  formData.append("name", name);
  formData.append("email", email);
  await fetch("localhost:3000/mail", {
    method: "POST",
    body: formData,
  });
});
