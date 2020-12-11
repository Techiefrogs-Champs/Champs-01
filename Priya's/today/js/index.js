function Display_date_and_time() {
    document.getElementById("ShowDateAndTime").innerHTML = Date();

};

function print_current_pg() {
        window.print()
    };


    var today = new Date();
    var dd = today.getDate();
    var mm = today.getMonth()+1;
    var yyyy = today.getFullYear();

    if (dd<10) {
        dd = '0'+dd;
    }
    if (mm<10) {
        mm = '0'+mm;
    }
    
    today = mm+'-'+dd+'-'+yyyy;
    console.log(today);
    today = mm+'/'+dd+'/'+yyyy;
    console.log(today);
    today = dd+'-'+mm+'-'+yyyy;
    console.log(today);
    today = dd+'/'+mm+'/'+yyyy;
    console.log(today);
    
var triangleArea = function(){
 var side1 = parseFloat( document.getElementById('side1').value);
 var side2 = parseFloat(document.getElementById('side2').value );
 var side3 = parseFloat(document.getElementById('side3').value);

 var output = document.getElementById('output');
 var s = (side1 + side2 + side3)/2;
 var area = Math.sqrt(s*((s-side1)*(s-side2)*(s-side3)));

 output.textContent = "Area = "+ area;
};

function animate_string(id) 
{
    var element = document.getElementById(id);
    var textNode = element.childNodes[0]; 
    var text = textNode.data;

setInterval(function () 
{
 text = text[text.length - 1] + text.substring(0, text.length - 1);
  textNode.data = text;
}, 100);
}

function leapyr(yr){
    if ((yr%100!=0) && (yr%4==0) || (yr%400==0)) {
        alert("Leap Year")
    } else {
        alert("Not Leap Year")
    }
}

console.log('--------------------');
for (var year = 2014; year <= 2050; year++)
    {
    var d = new Date(year, 0, 1);
    if ( d.getDay() === 0 )
        console.log("1st January is being a Sunday  "+year);
    }
console.log('--------------------');


var number = function(){
// Get a random integer from 1 to 10 inclusive
const num = Math.ceil(Math.random() * 10);
console.log(num);
 const gnum = prompt('Guess the number between 1 and 10 inclusive');
 if (gnum == num)
   console.log('Matched');
  else
   console.log('Not matched, the number was '+gnum);
}


var num = function(){
    today=new Date();
var cmas=new Date(today.getFullYear(), 11, 25);
if (today.getMonth()==11 && today.getDate()>25) 
{
cmas.setFullYear(cmas.getFullYear()+1); 
}  
var one_day=1000*60*60*24;
console.log(Math.ceil((cmas.getTime()-today.getTime())/(one_day))+
" days left until Christmas!");

}

function cToF(celsius) 
{
  var cTemp = celsius;
  var cToFahr = cTemp * 9 / 5 + 32;
  var message = cTemp+'\xB0C is ' + cToFahr + ' \xB0F.';
    console.log(message);
}

function fToC(fahrenheit) 
{
  var fTemp = fahrenheit;
  var fToCel = (fTemp - 32) * 5 / 9;
  var message = fTemp+'\xB0F is ' + fToCel + '\xB0C.';
    console.log(message);
} 

function load(){
    //Write a JavaScript program to get the website URL (loading page)
alert(document.URL);

}


var user = function(){
    var var_name = 'abcd';
var n = 120;
this[var_name] = n;
console.log("user defined vairable is:"+ this[var_name])

}

var names = function() {
    filename = "system.php"
console.log("the 1st filename extenstion is:"+ filename.split('.').pop());
filename = "abc.js"
console.log("the second filename extenstion is:"+ filename.split('.').pop());

}

function difference(n)
 {
    if (n <= 13)
        return 13 - n;
    else
        return (n - 13) * 2;
 }

console.log("if n is less than or equal to 13 then the difference is:"+ difference(32));
console.log("else the difference is:"+ difference(11));


function sumTriple (x, y) {
    if (x == y) {
      return 3 * (x + y);
      } 
     else
     {
      return (x + y);
     }
   }

   console.log("---------------------------------------");
  console.log("the sum of two numbers is:"+ sumTriple(10, 20));
  console.log("the triples of 2 same numbers is:"+ sumTriple(10, 10));
  console.log("---------------------------------------");

  function testhundred(x) {
    return ((Math.abs(100 - x) <= 20) ||
       (Math.abs(400 - x) <= 20));
  }
  
  console.log(testhundred(10));
  console.log(testhundred(90));
  console.log(testhundred(99));
  console.log(testhundred(199));
  console.log(testhundred(200));
  
  function positive_negative(num1, num2)
{
  if ((num1 < 0 && num2 > 0) || num1 > 0 && num2 < 0) 
  {
    return true;
  }
  else 
  {
    return false;
  }
}
console.log(positive_negative(2, 2));
console.log(positive_negative(-2, 2));
console.log(positive_negative(2, -2));
console.log(positive_negative(-2, -2));

   
  

