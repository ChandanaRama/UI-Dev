//function taking object as argument

let unistudent = student => {
	let {name,university} = student;
	console.log(`${name}of the ${university}`);
}

unistudent ({
	name:'ryan',
	university:'university of syden'
});