function longestWord(phrase) {
    
    const mots = phrase.split(" ");

    const motLePlusLong = mots.reduce((motLePlusLong, motCourant) => {
        if (motCourant.length >= motLePlusLong.length) {
            return motCourant;
        } else {
            return motLePlusLong;
        }
    });

    return motLePlusLong;
}

console.log(longestWord('a b c d e fgh'));
console.log(longestWord('one two three'));
console.log(longestWord('red blue grey'));