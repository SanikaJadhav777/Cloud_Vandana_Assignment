// Function to clear the input on the screen
function clearScreen() {
    document.getElementById("result").value = "";
}
 
// Function to display the values
function display(value) {
    document.getElementById("result").value += value;
}
 
// Function to evaluate the expression and return the result
function calculate() {
    var p = document.getElementById("result").value;
    var q = eval(p);
    document.getElementById("result").value = q;
}