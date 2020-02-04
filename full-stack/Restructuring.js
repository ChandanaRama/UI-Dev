// varible converting into object

//var name = 'everest';
// var height = 85 ;

 // object method with restructuring
 //var output = function (){
 	//console.log(`mt.${name}is${height}`)
 //}
 
 //var AdventureClimbing = {name, height, output};
 //AdventureClimbing.output( );


var AdventureClimbing = {
 name :'everest',
 height: 85 ,
 output(){
 	console.log(`mt.${this.name}is${this.height}`)
 }
};      
 AdventureClimbing.output( );