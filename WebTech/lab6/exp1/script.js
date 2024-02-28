function genout() {
    const rndom = Math.random();
    const frndom = Math.floor(rndom * 100)+1;
    
    document.getElementById("output").innerHTML = frndom;   
}


function clearoutput() {
    

    document.getElementById("output").innerHTML = " ";
  }