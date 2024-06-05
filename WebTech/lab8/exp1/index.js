const express = require('express')
const app = express()
const port = 2000
const exp2 = require("./exp2")


app.get("/hello", (req, res) =>{
    res.send("Hello World !")
})

app.get("/exp2", (req, res) =>{
    // Call a function from exp2.js and send its result as the response
    const result = exp2.replaceAsWithB();
    res.send(result);
});

app.get("/t", (req, res) =>{
    res.location("/exp3.js")
});

app.listen(port, () => {
  })

