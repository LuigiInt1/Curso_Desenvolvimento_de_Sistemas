
int luz = 1;


void setup() {
 pinMode(14, INPUT);
 Serial. begin(9600);
}

void loop() {
  luz = digitalRead(14);
  Serial.println(luz);
  digitalRead(14);
  delay(500);
}