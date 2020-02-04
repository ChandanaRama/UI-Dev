let fname = 'Ryan';

let lname = 'D';

let age = prompt("guess ryan's age....");

//old way

//let result = fname + ' ' + lname + ' ' + 'is' + ' ' + age + ' ' + 'years old';

//alert (result);

//Using tempalte string

let result = `${fname} ${lname} is ${age} years old`;

alert(result);