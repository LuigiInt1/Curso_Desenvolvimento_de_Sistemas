/*5) Programar a conversão de uma temperatura digitada pelo usuário em graus Celsius para Fahrenheit. Mostrar o resultado na tela. */

let temperaturaC

temperaturaC = Number(prompt("Digite a temperatura"))
let conversao = (temperaturaC * 1.80) + 32

alert(`${temperaturaC}°C = ${conversao}°F`)