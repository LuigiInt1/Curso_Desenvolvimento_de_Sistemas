
let entradaAnalogica, entradaDigital
const tAtualizacao = 500;
// Armazena a url onde roda a aplicação
url = "http://192.168.0.214"


// Igual a anterior, só que o valor retornado é "on" ou "off" (simulando valor digital)
function recebeDigital() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      entradaDigital = this.responseText;
      document.getElementById("entradaDigital").innerHTML = entradaDigital;
      console.log(`ED: ${entradaDigital}`);
    }
  };
  xhttp.open("GET", url + "/entradaDigital", true);
  xhttp.send();
}

setInterval(recebeDigital, tAtualizacao); // chama a função de leitura a cada tAtualizacao milissegundos


//----------------------------------------------//
function recebeAnalogica() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      entradaAnalogica = this.responseText;
      document.getElementById("entradaAnalogica").innerHTML = entradaAnalogica;
      console.log(`EA: ${entradaAnalogica}`);
    }
  };
  xhttp.open("GET", url + "/entradaAnalogica", true);
  xhttp.send();
}
setInterval(recebeAnalogica, tAtualizacao); // chama a função de leitura a cada tAtualizacao milissegundos
