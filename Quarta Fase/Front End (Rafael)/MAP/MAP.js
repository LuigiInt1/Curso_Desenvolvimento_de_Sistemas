/*MAP*/ 
//Utilizando o map para renderização dinâmica de um array de objetos

document.addEventListener("DOMContentLoaded", function() {
    // Array de objetos pessoa
    const pessoas = [
        { nome: "Maria", idade: 30, profissao: "Engenheira" },
        { nome: "João", idade: 25, profissao: "Designer" },
        { nome: "Ana", idade: 35, profissao: "Professor" }
    ];

    // Selecionando a div
    const divPessoas = document.getElementById("divPessoas");

    // Mapeando e exibindo os objetos pessoa na div
    pessoas.map(function(pessoa) {
        // Criando um elemento de parágrafo para exibir os detalhes da pessoa
        const p = document.createElement("p");
        p.textContent = `Nome: ${pessoa.nome}, Idade: ${pessoa.idade}, Profissão: ${pessoa.profissao}`;

        // Adicionando o parágrafo à div
        divPessoas.appendChild(p);
    });
});


