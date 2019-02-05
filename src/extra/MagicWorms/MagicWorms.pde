float x=0;
float y=0;
void setup() {
  size(400,400);
  background(#C1B9B9);
}

void draw(){
  for (int i=0; i<1000; i++){
    x=getWormX(i);
    y=getWormY(i);
    //fill(#13C5F0);
    ellipse(x,y,20,20);
  }
}

float frequency = 10;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}