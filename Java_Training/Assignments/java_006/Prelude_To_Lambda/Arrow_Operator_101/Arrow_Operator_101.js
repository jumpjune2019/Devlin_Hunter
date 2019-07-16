

// regular function
function funcName(params) {
    return params + 2;
  }
 console.log(funcName(2));
 //Using Arrow function
 var funcNameWithArrow = (params) => params + 2
 console.log(funcNameWithArrow(2));

 //*************************************************** */
const smartPhones = [
    { name:'iphone', price:649 },
    { name:'Galaxy S6', price:576 },
    { name:'Galaxy Note 5', price:489 }
  ];

  //regurlar function 
var prices = smartPhones.map(function(smartPhone) {
    return smartPhone.price;
  });
  
  console.log(prices); // [649, 576, 489]

  //using arrow function
const pricesWithArrow = smartPhones.map(smartPhone => smartPhone.price);
console.log(prices); // [649, 576, 489]