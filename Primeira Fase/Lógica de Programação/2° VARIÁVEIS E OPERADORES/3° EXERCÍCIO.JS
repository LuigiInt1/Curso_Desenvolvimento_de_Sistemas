/*3) Você é um amante da natureza e adora fazer trilhas. Criar um programa que calcule a velocidade média das trilhas que você realiza. Para isso,
devem ser digitados os dados de distância percorrida (quilômetros) e tempo que a trilha durou (horas). Fazer então o cálculo da velocidade média
e mostrar na tela a mensagem "Sua média de velocidade durante essa trilha foi de X km/h", sendo X a velocidade.*/

let distancia, tempo, velocidade


distancia = Number(prompt("Qual a distância percorrida?(quilometros)"))
tempo = Number(prompt("Qual o tempo de duração?(horas)"))

velocidade = distancia / tempo

alert(`Distancia percorrida: ${ velocidade}\nTempo de trilha: ${ tempo}\n Sua velociade média foi de ${velocidade}km/h`)
