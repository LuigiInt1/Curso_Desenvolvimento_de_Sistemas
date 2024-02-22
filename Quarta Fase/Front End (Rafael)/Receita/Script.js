
function CriarReceita(){
    const receitas = document.getElementById("DivReceita");

    const divTitulo = document.createElement("div");
    const inputTitulo = document.createElement("input");

    const divIngrediente = document.createElement("div");
    const inputNome = document.createElement("input");
    const inputQntd = document.createElement("input");
    const inputUnid = document.createElement("input");
    
   
/*--------------------------------------------- */
    divTitulo.id = "divTitulo";
    receitas.appendChild(divTitulo);

    inputTitulo.placeholder = "Título da Receita";
    inputTitulo.id = "inputTitulo"
    divTitulo.appendChild(inputTitulo);
/*--------------------------------------------- */
    divIngrediente.id = "divIngrediente";
    receitas.appendChild(divIngrediente);

    
}
document.getElementById("BotaoCriarReceita").disabled=true
