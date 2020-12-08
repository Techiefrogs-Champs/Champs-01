var myDate = new Date(); 
var myDay = myDate.getDay(); 

// Array of days. 
var weekday = ['Sunday', 'Monday', 'Tuesday', 
    'Wednesday', 'Thursday', 'Friday', 'Saturday' 
]; 
document.write("Today is : " + weekday[myDay]); 
document.write("<br/>"); 

// get hour value. 
var hours = myDate.getHours(); 
var ampm = hours >= 12 ? 'PM' : 'AM'; 
hours = hours % 12; 
hours = hours ? hours : 12; 
var minutes = myDate.getMinutes(); 
minutes = minutes < 10 ? '0' + minutes : minutes; 
var myTime = hours + " " + ampm + " : " + minutes + 
    " : " + myDate.getMilliseconds(); 
document.write("\tCurrent time is : " + myTime); 

function print_current_page()
{
window.print();
}
function getCurrentDate() { 
    let date = new Date().toDateString(); 

    document.querySelector('.output').textContent   = date; 
} 
var side1 = 5; 
var side2 = 6; 
var side3 = 7; 
var s = (side1 + side2 + side3)/2;
var area =  Math.sqrt(s*((s-side1)*(s-side2)*(s-side3)));

console.log(area);
document.write("area of a triangle : " + area); 

var myVar = setInterval(myFunction, 1000);

var word = 'w3resource';
var newArray = word.split('');

function myFunction() {
var letter = newArray.pop();
var newWord = newArray.unshift(letter);
var theWord = newArray.join('');
document.getElementById('moveIt').innerHTML = theWord;
}

function leapyear(year)
{
return (year % 100 === 0) ? (year % 400 === 0) : (year % 4 === 0);
}
console.log(leapyear(2016));
console.log(leapyear(2000));
console.log(leapyear(1700));
console.log(leapyear(1800));
console.log(leapyear(100));

//7
console.log('--------------------');
for (var year = 2014; year <= 2050; year++)
    {
    var d = new Date(year, 0, 1);
    if ( d.getDay() === 0 )
        console.log("1st January is being a Sunday  "+year);
    }
console.log('--------------------');

//8
// Get a random integer from 1 to 10 inclusive
const num = Math.ceil(Math.random() * 10);
console.log(num);
 const gnum = prompt('Guess the number between 1 and 10 inclusive');
 if (gnum == num)
   console.log('Matched');
  else
   console.log('Not matched, the number was '+gnum);

   //9
   today=new Date();
    var cmas=new Date(today.getFullYear(), 11, 25);
    if (today.getMonth()==11 && today.getDate()>25) 
    {
    cmas.setFullYear(cmas.getFullYear()+1); 
    }  
    var one_day=1000*60*60*24;
    console.log(Math.ceil((cmas.getTime()-today.getTime())/(one_day))+" days left until Christmas!");

    //10
    function multiplyBy()
    {
            num1 = document.getElementById("firstNumber").value;
            num2 = document.getElementById("secondNumber").value;
            document.getElementById("result").innerHTML = num1 * num2;
    }

    function divideBy() 
    { 
            num1 = document.getElementById("firstNumber").value;
            num2 = document.getElementById("secondNumber").value;
    document.getElementById("result").innerHTML = num1 / num2;
    }
