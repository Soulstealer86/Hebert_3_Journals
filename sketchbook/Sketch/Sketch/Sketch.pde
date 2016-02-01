void setup(){
  size(640, 360, P3D);
}
void draw(){
  if (mousePressed){
  fill(0);
} else{
  float fillcolor = random(260);
  float red = random(260);
  float green = random(260);
  float blue = random(260);
  fill(red,green,blue);
}
float x = random (60);
float y = random (60);
triangle(random(mouseX), random(mouseY), random(mouseX), random(mouseY), random(mouseX), random(mouseY));
}