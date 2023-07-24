void setup(){
    pinMode(3, OUTPUT);
    pinMode(4, INPUT_PULLUP);
}

void loop(){
    if(digitalRead(4) == 1){
        digitalWrite (3,1);
    }else{
    digitalWrite(3,0);
    }
    
    // digitalWrite(3,1);
    // delay(300);
    // digitalWrite(3,0);
    // delay(300);
}

//  int calcularSoma(int n1, int n2){
//     return n1 + n2
// 