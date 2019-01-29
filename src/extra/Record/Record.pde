PImage pic;
int rotate = 0;
void setup(){
  size(600,600);
  pic=loadImage("1-music-record-henrik-lehnerer.jpg");
  pic.resize(600,600);
}

void draw(){
  rotateImage(pic, rotate);
  image(pic, 0, 0);
  if(mousePressed==true){
    
    if(rotate>=360){
      rotate=0;
    }else{
      rotate+=5;
    }
  }
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}