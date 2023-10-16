

//exemplo base
//referência: https://raw.githubusercontent.com/vinicius0082/esp32-tagoIO/main/exemplos/mpu_esp32_mqtt_tagoIO


//Envio de Dados para tagoIO via MQTT

#include <ArduinoJson.h>
#include "EspMQTTClient.h"

//pinos de entrada e saída
const int pino_sensor_preto= 25; //input_pullup
const int pino_sensor_vermelho = 26; // input_pullup
const int pino_sensor_azul = 14;  // input_pullup

//variáveis para Json
char json_btn[100];
char json_p[100];
char json_v[100];
char json_a[100];

//variáveis internas
int valor_preto;
int valor_vermelho;
int valor_azul;

// int valor_led;  -- variavel que recebe a transformação da sting do msg

//configurações da conexão MQTT
EspMQTTClient client( "FIESC_IOT", "C6qnM4ag81", "mqtt.tago.io",   "Token",   "726d988b-a9c3-4502-b1a2-df961d16f17f",   "TestClient",      1883             );

//configuração dos pinos
void setup()
{
  Serial.begin(115200);
  //configurações dos pinos
  pinMode(pino_sensor_preto, INPUT); //configura o pino como entrada
  pinMode(pino_sensor_vermelho, INPUT); //configura o pino como entrada
  pinMode(pino_sensor_azul, INPUT); //configura o pino como entrada
}



void leitura_sinais()
{

  valor_preto = digitalRead(pino_sensor_preto);
  valor_vermelho = digitalRead(pino_sensor_vermelho);
  valor_azul = digitalRead(pino_sensor_azul);
 
}

void converte_json()
{
  StaticJsonDocument<300> sjson_btn;
  
  
  
  StaticJsonDocument<300> sjson_p;
  sjson_p["variable"] = "sensorPreto";
  sjson_p["value"] = valor_preto;
  serializeJson(sjson_p, json_p);

  StaticJsonDocument<300> sjson_v;
  sjson_v["variable"] = "sensorVermelho";
  sjson_v["value"] = valor_vermelho;
  serializeJson(sjson_v, json_v);

  StaticJsonDocument<300> sjson_a;
  sjson_a["variable"] = "sensorAzul";
  sjson_a["value"] = valor_azul;
  serializeJson(sjson_a, json_a);
  
  
  
}

void envia_msg()
{
  client.publish("/botao", json_p); // You can activate the retain flag by setting the third parameter to true
  client.publish("/botao", json_v); // You can activate the retain flag by setting the third parameter to true
  client.publish("/botao", json_a); // You can activate the retain flag by setting the third parameter to true
}

//loop do programa
void loop()
{
  leitura_sinais();
  converte_json();
  envia_msg();

  delay(1000);

  client.loop();
}

/*
void processa_msg(const String payload)
{
  StaticJsonDocument<300> msg;

  DeserializationError err = deserializeJson(msg, payload);
  if (err) {
    Serial.print(F("deserializeJson() failed with code "));
    Serial.println(err.f_str());
  }
  Serial.print("var:");  
  String var = msg["variable"];
  Serial.println(var);
  if(var == "led")
  {
    Serial.print("value:");
    String val = msg["value"];
    Serial.println(val);
    if(val == "false")
      digitalWrite(pino_led, LOW);
    else
      digitalWrite(pino_led, HIGH);
   

  }
 
}
*/
// This function is called once everything is connected (Wifi and MQTT)
// WARNING : YOU MUST IMPLEMENT IT IF YOU USE EspMQTTClient
void onConnectionEstablished()
{
   client.subscribe("node/status", [] (const String &payload)  {
   //  Serial.println(payload);
  //  processa_msg(payload);
  });
}