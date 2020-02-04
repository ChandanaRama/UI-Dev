let nepal ={
	//add property
	mountains:['everest','anapurna','fish - tail'],
	//add method
	printwithdash: function(){
		
		setTimeout(() => console.log(this.mountains.join(' - ')),3000);

		}
	
};
nepal.printwithdash();