
// const readline = require('readline');

// const rl = readline.createInterface({
//   input: process.stdin,
//   output: process.stdout// input output function 
// });


// function replaceAsWithB(inputString) {
//   const regex = /bbb+/g;   // combination on global search
//   const replacedString = inputString.replace(regex, 'b');
//   return replacedString;
// }


// rl.question('Enter a string: ', (input) => {
//   const result = replaceAsWithB(input);
//   console.log('Result:', result);
//   rl.close();
// });


const readline = require('readline');

function replace(inputstring){
  const regex = /aa+/g;
  const replacedString = inputstring.replace(regex,'b');
}