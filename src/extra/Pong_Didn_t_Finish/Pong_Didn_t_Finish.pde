int ballX = 0;
int ballY = 0; 
void setup(){
  size(600,600);

}

void draw(){
  background(0, 0, 0);
  fill(255, 255, 255);
  stroke(255, 255, 255);
  ellipse(ballX, 300, 20, 20);
  ballX+=3;
}