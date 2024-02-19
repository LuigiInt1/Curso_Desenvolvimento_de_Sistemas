/*O método `forEach()` em JavaScript é usado para iterar sobre os elementos de um array e executar uma função de callback para cada elemento. Ele não retorna um novo array e não altera o array original. Em vez disso, é usado principalmente quando você deseja executar uma determinada ação para cada elemento do array, como exibir os elementos em uma interface de usuário, realizar operações de log, entre outros.

Aqui está a sintaxe básica do `forEach()`:

arrayOriginal.forEach(funcaoDeCallback);

- `arrayOriginal`: O array que você deseja iterar.
- `funcaoDeCallback`: Uma função que será chamada para cada elemento do array. Ela pode receber até três argumentos: o valor do elemento atual, o índice desse elemento e o array original. */

const numeros = [1, 2, 3, 4, 5];

numeros.forEach(function(numero) {
    console.log(numero);
});