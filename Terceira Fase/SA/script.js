// Variável para controlar a troca de imagem
let variavel = 1;

// Função para trocar a imagem
function trocarImagem() {
    const imagem = document.getElementById("imagemCima");

    if (variavel === 0) {
        imagem.src = "Imagens/prateleira Branca.png"; // Mude o caminho para a segunda imagem
        imagem.alt = "Imagem 2";
        variavel = 1;
    } else {
        imagem.src = "Imagens/prateleira Preta.png"; // Mude o caminho para a primeira imagem
        imagem.alt = "Imagem 1";
        variavel = 0;
    }
}

// Intervalo para trocar automaticamente a imagem a cada 2 segundos
setInterval(trocarImagem, 2000); // 2000 milissegundos (2 segundos)






