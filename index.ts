import express from "express";
import mongoose from "mongoose";

const app = express();

app.use(express.json());
await new Promise((resolve) => setTimeout(resolve, 8000));
await mongoose.connect("mongodb://mongo:27017/mydatabase");

const mailSchema = new mongoose.Schema({
  name: String,
  email: String,
});
const Mail = mongoose.model("Mail", mailSchema);
app.post("/mail", async (req, res) => {
  const { name, email } = req.body;
  const mail = await Mail.create({ name, email });
  await mail.save();
  res.send("Maifl saved");
});

app.get("/", (req, res) => {
  res.sendFile(__dirname + "/assets/index.html");
});

app.listen(4000, () => {
  console.log("Server is running on port 5000");
});
