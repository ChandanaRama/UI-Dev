let createblog = (title,body) => {
	if(!title){

		throw new error('Tittle required');
	}
	if(!body){
		throw new error ('Body required');

	}

	return alert(`${title} - ${body}`);


}
createblog ('blog title','blog body');

