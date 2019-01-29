int y = 0;
int randX = 50;
int score = 0;
void setup(){
  size(400,400);
    background(#61B1DB);
}

void draw(){
  background(#61B1DB);
  fill(0, 0, 255);
  ellipse(randX, y, 30, 30);
  fill(#ABB1B4);
  rect(mouseX, 380, 50, 20);
  y+=5;
  if(y>=380){
    boolean b = checkCatch(randX);
    if (b==true){
      randX = (int) random(width);
      y=0;
    }else{
      y=0;
      randX = (int) random(width);
    }
  }
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);

}

boolean checkCatch(int x){
     if (x > mouseX && x < mouseX+100){
          score++;
          println("Your score is now: " + score); 
          return true;
     }else if (score > 0) {
          score--;
          println("Your score is now: " + score); 
          return false;
     }else{
       return false;
     }
    
   }