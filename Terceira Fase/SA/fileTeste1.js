
let entradaAnalogica, entradaDigital
const tAtualizacao = 500;
// Armazena a url onde roda a aplicação
url = "http://192.168.0.214"

function recebeSensor1() {
  var sensor1 = new XMLHttpRequest();
  sensor1.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      // entradaDigital = this.responseText;
      // document.getElementById("entradaDigital").innerHTML = entradaDigital;
      // console.log(`ED: ${entradaDigital}`);
    }
  };
  sensor1.open("GET", url + "/lerSensor1", true);
  sensor1.send();
}

function recebeSensor2() {
  var sensor2 = new XMLHttpRequest();
  sensor2.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      // entradaDigital = this.responseText;
      // document.getElementById("entradaDigital").innerHTML = entradaDigital;
      // console.log(`ED: ${entradaDigital}`);
    }
  };
  sensor2.open("GET", url + "/lerSensor2", true);
  sensor2.send();
}

function recebeSensor3() {
  var sensor3 = new XMLHttpRequest();
  sensor3.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      // entradaDigital = this.responseText;
      // document.getElementById("entradaDigital").innerHTML = entradaDigital;
      // console.log(`ED: ${entradaDigital}`);
    }
  };
  sensor3.open("GET", url + "/lerSensor3", true);
  sensor3.send();
}




function setintervalFunction() {
  recebeSensor1()
  recebeSensor2()
  recebeSensor3()
}
setInterval( setintervalFunction, tAtualizacao );