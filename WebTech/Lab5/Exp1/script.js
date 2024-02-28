function larger() {
    let a = parseInt(prompt("Enter the first number"));
    let b = parseInt(prompt("Enter the first number"));
    let l= a>b?a:b;
    document.getElementById("display").innerHTML="the largest no. is"+ l;
}