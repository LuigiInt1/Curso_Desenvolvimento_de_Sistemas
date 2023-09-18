/*
  Alterado por: Fernando Costenaro Silva 
  Baseado no exemplo de:
 
  Rui Santos
  Complete project details at https://RandomNerdTutorials.com
  
  Permission is hereby granted, free of charge, to any person obtaining a copy
  of this software and associated documentation files.
  
  The above copyright notice and this permission notice shall be included in all
  copies or substantial portions of the Software.
*/

// Importa as bibliotecas necessarias
// #include <ESP8266WiFi.h>
// #include <ESPAsyncTCP.h>
// #include <ESPAsyncWebServer.h>

#include <WiFi.h>
#include <AsyncTCP.h>
#include <ESPAsyncWebServer.h>


// Substitua com as credenciais da sua rede
const char* ssid     = "ARDUINO";
const char* password = "12345678";

// Seu endereço de IP estático (será atribuido à placa)
IPAddress local_IP(192, 168, 0, 214);
// O endereço do gateway
IPAddress gateway(192, 168, 0, 1);

IPAddress subnet(255, 255, 255, 0);
IPAddress primaryDNS(8, 8, 8, 8);   //opcional
IPAddress secondaryDNS(8, 8, 4, 4); //opcional


const int Sensor1 = 12;//D0; //d0 4        //9; GPIO4 -> D2
const int Sensor2 = 13;//D0; //d0 4        //9; GPIO4 -> D2
const int Sensor3 = 14;//D0; //d0 4        //9; GPIO4 -> D2


String strValorDigital;

const char* PARAM_INPUT_1 = "input1"; //armazena parametro recebido


int valorDigital = 0;




// Cria um objeto AsyncWebServer na porta 80
AsyncWebServer server(80);


  
String getValorDigitalSensor1() {
  int valorDigital = digitalRead(Sensor1);
  if(valorDigital == LOW){ // LOW ou HIGH depende da ligação do circuito
    strValorDigital = "ON";
  }
  else{
    strValorDigital = "OFF";
  }
  Serial.println("valor digital lido: " + String(valorDigital) + " " + strValorDigital);
  return String(strValorDigital);
}

String getValorDigitalSensor2() {
  int valorDigital = digitalRead(Sensor2);
  if(valorDigital == LOW){ // LOW ou HIGH depende da ligação do circuito
    strValorDigital = "ON";
  }
  else{
    strValorDigital = "OFF";
  }
  Serial.println("valor digital lido: " + String(valorDigital) + " " + strValorDigital);
  return String(strValorDigital);
}

String getValorDigitalSensor3() {
  int valorDigital = digitalRead(Sensor3);
  if(valorDigital == LOW){ // LOW ou HIGH depende da ligação do circuito
    strValorDigital = "ON";
  }
  else{
    strValorDigital = "OFF";
  }
  Serial.println("valor digital lido: " + String(valorDigital) + " " + strValorDigital);
  return String(strValorDigital);
}




void setup(){
  // Porta Serial para debug
  Serial.begin(115200);

  pinMode(Sensor1, INPUT_PULLUP); //entrada digital
  pinMode(Sensor2, INPUT_PULLUP); //entrada digital
  pinMode(Sensor3, INPUT_PULLUP); //entrada digital
  //entrada analógica já vem configurada no pino A0

  // Configura o endereço IP estático
  if (!WiFi.config(local_IP, gateway, subnet, primaryDNS, secondaryDNS)) {
    Serial.println("Falha ao configurar em modo Station (STA)");
  }

  // Conecta na rede Wi-Fi com o SSID e senha (password)
  Serial.print("Connecting to ");
  Serial.println(ssid);
  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }
  // Imprime pela serial o endereço de IP e inicia o servidor web
  Serial.println("");
  Serial.println("WiFi connected.");
  Serial.println("IP address: ");
  Serial.println(WiFi.localIP());

 
  // Rota para ler a entrada digital


 server.on("/lerSensor1", HTTP_GET, [](AsyncWebServerRequest *request){
    request->send_P(200, "text/plain", getValorDigitalSensor1().c_str());
  });

  server.on("/lerSensor2", HTTP_GET, [](AsyncWebServerRequest *request){
    request->send_P(200, "text/plain", getValorDigitalSensor2().c_str());
  });

 server.on("/lerSensor3", HTTP_GET, [](AsyncWebServerRequest *request){
    request->send_P(200, "text/plain", getValorDigitalSensor3().c_str());
  });





  // Adiciona no cabeçalho para evitar erro de acesso do CORS
  DefaultHeaders::Instance().addHeader("Access-Control-Allow-Origin", "*");
  // Inicia o servidor
  server.begin();
}

void loop(){
  
}

