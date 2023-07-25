// C++ code
//
#include <Adafruit_LiquidCrystal.h>
Adafruit_LiquidCrystal lcd_1(0);

float temperatura;
int leitura;
int temperaturaMax = 28;
int temperaturaMin = 26;

void setup()
{
  lcd_1.begin(16,2);
  pinMode(A0, INPUT);
  pinMode(10, OUTPUT);
  pinMode(2, INPUT_PULLUP);
  pinMode(3, INPUT_PULLUP);
  pinMode(4, INPUT_PULLUP);
  pinMode(5, INPUT_PULLUP);
}

void loop()
{
    leitura = analogRead(A0);
    temperatura = (leitura - 100)/2;

    if(temperatura > temperaturaMax){
        digitalWrite(10, 1);
    }
    if(temperatura < temperaturaMax){
        digitalWrite(10, 0);
    }
    if(digitalRead(2) == 0){
        temperaturaMax ++;
    }
    



    lcd_1.setCursor(3,0);
    lcd_1.print("Temp:");
    lcd_1.print(temperatura);
    lcd_1.setCursor(1,1);
    lcd_1.print("Max:");
    lcd_1.print(temperaturaMax);
    lcd_1.print("  Min:");
    lcd_1.print(temperaturaMin);


    
    
    
    delay(100);

}
  