function calculateTip(montant, avis) {
    const pourcentagesPourboire = {
        "terrible": 0,
        "poor": 5,
        "good": 10,
        "great": 15,
        "excellent": 20
    };

    avis = avis.toLowerCase();

    if (pourcentagesPourboire.hasOwnProperty(avis)) {
        const montantPourboire = Math.ceil(montant * (pourcentagesPourboire[avis] / 100));
        return montantPourboire;
    } else {
        return "Rating not recognised";
    }
}

console.log(calculateTip(20, "EXCELLENT"));
console.log(calculateTip(10, "good")); 
console.log(calculateTip(20, "hi"));