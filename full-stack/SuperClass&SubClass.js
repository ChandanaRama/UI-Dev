//super class 

class Holiday{
	constructor(destination,days){
		this.destination = destination;
		this.days = days;
	}

	info(){
		console.log(`${this.destination}in${this.days}`);

	}
}

// subclass

class expedition extends Holiday {
	constructor(destination,days,gear){
		super(destination,days);
		this.gear = gear;
	}
	info(){
		super.info();
		console.log(`bring your${this.gear.join("and your")}`)
	}
}
const trip = new expedition('nepal',30,['sunglass','boost']);
trip.info();