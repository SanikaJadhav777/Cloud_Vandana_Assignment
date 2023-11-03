/*
Problem Statement:
Take a sentence as an input and reverse every word in that sentence.
    a. Example - This is a sunny day > shiT si a ynnus yad.
*/

// Function to reverse each word of given string.
function reverseEachWord(sentence) 
{
  const words = sentence.split(' ');
  const reversedWords = [];
  for (let i = 0; i < words.length; i++) 
  {
    let word = words[i];
    let reversedWord = '';
    for (let j = word.length - 1; j >= 0; j--) 
    {
      reversedWord += word[j];
    }
    reversedWords.push(reversedWord);
  }

  const reversedSentence = reversedWords.join(' ');
  return reversedSentence;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseEachWord(inputSentence);
console.log(reversedSentence); 

/*********************Ouput*********************
sihT si a ynnus yad
*/
