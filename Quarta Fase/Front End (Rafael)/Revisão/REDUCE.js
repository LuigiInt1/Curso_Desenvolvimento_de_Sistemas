/*O método reduce() em JavaScript é usado para reduzir um array a um único valor, aplicando uma função de redução a cada elemento do array, do início ([0]) até o fim ([array.length]). Ele acumula um resultado enquanto percorre o array e retorna o valor acumulado no final. */

/*Aqui está a sintaxe básica do `reduce()`:

const resultado = arrayOriginal.reduce(funcaoDeReducao, valorInicial);

- `arrayOriginal`: O array que você deseja reduzir.
- `funcaoDeReducao`: Uma função que será chamada para cada elemento do array, recebendo quatro  argumentos: o valor acumulado (ou anterior), o valor atual, o índice atual e o array original.
- `valorInicial`: Um valor inicial opcional que será usado como o primeiro argumento da primeira chamada da função de redução. Se não for fornecido, o primeiro elemento do array será usado como valor inicial e a redução começará a partir do segundo elemento. */

// Array de objetos contaPagar
const contasPagar = [
    { nome: "Aluguel", data: "2024-02-10", valor: 1500, situacao: "pendente" },
    { nome: "Energia", data: "2024-02-15", valor: 200, situacao: "pendente" },
    { nome: "Internet", data: "2024-02-20", valor: 100, situacao: "pendente" },
    { nome: "Água", data: "2024-02-25", valor: 80, situacao: "pendente" }
];

// Usando reduce para somar o valor de todas as contas a pagar
const totalAPagar = contasPagar.reduce(function(acumulador, conta) {
    return acumulador + conta.valor;
}, 0);

console.log(totalAPagar); // Saída: 1880