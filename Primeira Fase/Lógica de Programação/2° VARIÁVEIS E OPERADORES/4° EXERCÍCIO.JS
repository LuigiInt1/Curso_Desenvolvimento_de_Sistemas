/*4) Desenvolva uma programação que peça ao usuário para digitar o ano do seu nascimento no formato (YYYY) e o ano atual também no formato
(YYYY). Em seguida mostre na tela qual a idade do usuário em anos, em meses, em dias e em semanas. */

let nascimento
const atual = 2023

nascimento = Number(prompt("Qual o ano de seu nascimento?"))

let ano = 2023 - nascimento
let mes = ano * 12
let semana = ano * 52
let dias = ano * 365

alert(`Você tem:\n${ano} anos\n${mes} meses \n${semana} semanas\n${dias} dias `)