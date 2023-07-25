// C++ code
//
#include <Adafruit_LiquidCrystal.h>
Adafruit_LiquidCrystal lcd_1(0);

int leitura;
double inverso;

void setup()
{
  pinMode(1, OUTPUT);
  
  lcd_1.begin(16, 2);
  pinMode(A0, INPUT);
  lcd_1.clear();
  lcd_1.print("Voltimetro:");
  lcd_1.setCursor(0,1);
  lcd_1.print("Tensao:");
}

void loop()
{
  leitura = analogRead(A0);
  inverso = leitura * 0.0048875855327468;
  if(inverso > 4){
    digitalWrite(1,1);
    

  }
  else{
    digitalWrite(1,0);
  lcd_1.setCursor(12,0);
  lcd_1.print(leitura);
  lcd_1.print("   ");
  lcd_1.setCursor(8,1);
  lcd_1.print(inverso);
  lcd_1.print("V");
  delay(500);
  }
  
}