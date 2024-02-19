/*O método filter() em JavaScript é usado para filtrar elementos de um array com base em uma condição especificada e retorna um novo array contendo apenas os elementos que satisfazem essa condição.*/

/*Aqui está a sintaxe básica do `filter()`:

const novoArray = arrayOriginal.filter(funcaoDeFiltro);

- `arrayOriginal`: O array que você deseja filtrar.
- `funcaoDeFiltro`: Uma função que será chamada para cada elemento do array. Ela deve retornar true se o elemento deve ser incluído no novo array e false caso contrário. */

// Definindo a classe Pessoa
class Pessoa {
    constructor(nome, idade, profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }
}

// Criando um array de objetos Pessoa
const pessoas = [
    new Pessoa("Maria", 25, "Engenheira"),
    new Pessoa("João", 17, "Estudante"),
    new Pessoa("Ana", 30, "Professor"),
    new Pessoa("Pedro", 22, "Designer")
];

// Filtrando apenas as pessoas com idade igual ou superior a 18 anos
const pessoasMaioresDeIdade = pessoas.filter(function(pessoa) {
    return pessoa.idade >= 18;
});

console.log(pessoasMaioresDeIdade);