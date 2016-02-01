void setup(){
size(640, 360, P3D);
}
void draw(){
  
  if (mousePressed){
    fill(0);
  } else{
    float fillcolor = random(300);
    float red = random(300);
    float green = random(300);
    float blue = random(300);
    fill(red,green,blue);
  }
  float x = random (60);
  float y = random (30);
  o(random(mouseX), random(mouseY), random(mouseX), random(mouseY), random(mouseX), random(mouseY));
}