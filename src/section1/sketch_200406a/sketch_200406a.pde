int position = 250;
int positionY = 250;
int speed = 1;
int ySpeed = 1;

void setup(){
     size(500, 500);
     
}
 
void draw() {
    background(230);

      speed = -speed;
  
  if (positionY > height) {
    ySpeed = -ySpeed;
  
   
   position += speed;
   positionY += ySpeed;
  }
   
  ellipse(position, positionY, 200, 200);
}
