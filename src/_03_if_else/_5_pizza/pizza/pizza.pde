PImage pepperoni;
void setup() {
  pepperoni = loadImage("pepperoni.png");
    size(1000, 1000);
    fill(#B5651D);
    ellipse(500, 500, 300, 300);
    fill(#F6FF00);
    ellipse(500, 500, 250, 250);
  
    
}
void draw() {
    image(pepperoni, 500, 500);
   
}
