var mountains = ['anapurna','star','fish-tail'];

var japanMountains = ['fuji'];

var Allmountains = [...mountains,...japanMountains];

console.log(Allmountains);

// Spread operator on object

var day = { breakfast:'cerals', lunch:'rice' };

var night = { dinner: ' soup'};

var Allday = {...day,...night};

console.log(Allday);
