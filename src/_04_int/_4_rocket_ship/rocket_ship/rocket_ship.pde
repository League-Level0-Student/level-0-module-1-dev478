int x = 400; 
int y = 600; 

void setup() {

    
    size(800, 800);

}

void draw() {
    background(0, 0, 40); 
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
y = y-1;
ellipse(150, 150, 300, 300);
fill(#484343);
ellipse(200, 200, 70, 70);
ellipse(100, 100, 100, 100);
ellipse(225, 90, 85, 85);
fill(255, 255, 255);
ellipse(600, 175, 15, 15);
ellipse(450, 200, 15, 15);
ellipse(750, 100, 15, 15);
ellipse(500, 300, 15, 15);
ellipse(650, 50, 15, 15);
ellipse(550, 350, 15, 15);
ellipse(400, 25, 15, 15);
ellipse(775, 75, 15, 15);
ellipse(525, 75, 15, 15);
ellipse(425, 125, 15, 15);
}
