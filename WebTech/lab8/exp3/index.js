const express = require('express');
const app = express();

app.get('/calculate', (req, res) => {
  const num1 = parseFloat(req.query.num1);
  const num2 = parseFloat(req.query.num2);
  const operation = req.query.operation;

  if (!operation || !['add', 'subtract', 'multiply', 'divide'].includes(operation)) {
    return res.status(400).send('Invalid operation');
  }

  let result;
  switch (operation) {
    case 'add':
      result = num1 + num2;
      break;
    case 'subtract':
      result = num1 - num2;
      break;
    case 'multiply':
      result = num1 * num2;
      break;
    case 'divide':
      if (num2 === 0) {
        return res.status(400).send('Division by zero is not allowed');
      }
      result = num1 / num2;
      break;
  }

  res.send(`${result}`);
});

app.listen(3000, () => {
  console.log('Server is running on port 3000');
});