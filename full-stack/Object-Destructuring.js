//destructing object values to variables

let Thingstodo = {
	morning : "Work",
	afternoon : "eat ",
	evening : " play",
	night :["sleep","dream"]

}

let { morning,afternoon} = Thingstodo;
morning = 'run';
console.log(morning,'-', afternoon);