/*
Problem Statement:
Perform sorting of an array in descending order.
*/

// Function to sort array in descending order.
function sortArray(array) 
{
    var sorted = false;
    while (!sorted) 
    {
        sorted = true;
        for (var i = 1; i < array.length; i += 1) 
        {
            if (array[i - 1] < array[i]) 
            {
                sorted = false;
                var tmp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = tmp;
            }
        }
    }
    return array;
}
  
var numbers = [23, 56, 98, -2, 5, -11];
console.log("Array Before Sorting: " + numbers);
sortArray(numbers);
console.log("Sorted Array in Descending Order: " + numbers);

/****************Output****************
Array Before Sorting: 23,56,98,-2,5,-11
Sorted Array in Descending Order: 98,56,23,5,-2,-11
*/
