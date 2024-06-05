const express = require('express');
const app = express();

const people = [
  { name: 'Bhavesh', age: 19 },
  { name: 'Aryan', age: 20 },
  { name: 'Rayan', age: 22 }
];

app.get('/', (req, res) => {
  const results = [];
  for (const p of people) {
    results.push(`Name: ${p.name}, Age: ${p.age}`);
    // res.send(results.join("\n"))
  }
  res.send(results.join('\n'));
});

app.listen(3000, () => {
  console.log('Server listening on port 3000');
});