function holiday(destination,days){
	this.destination = destination;
	this.days = days;
}

holiday.prototype.info = function (){

	console.log(this.destination + '|' + this.days);
}

var nepal = new holiday ('nepal', 30);

console.log(nepal.info());
