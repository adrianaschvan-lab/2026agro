const curiosidades = [
    "🌎 O Brasil está entre os maiores produtores de alimentos do mundo.",
    "💧 A irrigação eficiente ajuda a economizar milhões de litros de água.",
    "🌱 A rotação de culturas melhora a fertilidade do solo.",
    "🚜 Máquinas modernas utilizam GPS para aumentar a produtividade.",
    "🐝 As abelhas são essenciais para a polinização de muitas culturas agrícolas.",
    "🌳 Preservar matas ciliares ajuda a proteger rios e nascentes."
];

function mostrarCuriosidade() {
    const numeroAleatorio =
        Math.floor(Math.random() * curiosidades.length);

    document.getElementById("curiosidade").innerHTML =
        curiosidades[numeroAleatorio];
}
