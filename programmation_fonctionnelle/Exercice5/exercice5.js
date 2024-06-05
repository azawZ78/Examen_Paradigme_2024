function carreChiffre(nombre) {
    const nombreStr = nombre.toString();
    const chiffres = nombreStr.split("");

    const chiffresCarres = chiffres.map(chiffre => {
        const chiffreNombre = Number(chiffre);
        return (chiffreNombre * chiffreNombre).toString();
    });

    const nombreCarresStr = chiffresCarres.join("");

    return Number(nombreCarresStr);
}

// Tests
console.log(carreChiffre(9119));
console.log(carreChiffre(22));
console.log(carreChiffre(0));
