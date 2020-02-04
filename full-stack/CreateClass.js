class Holiday{
	constructor(destination,days){
		this.destination = destination;
		this.days = days;
	}

	info(){
		console.log(`${this.destination}in${this.days}`);

	}
}

const trip = new Holiday ('nepal', 30);

console.log(trip.info());
