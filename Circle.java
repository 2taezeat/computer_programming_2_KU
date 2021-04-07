public class Circle extends Point {
double r;
Circle(double initx, double inity, double initr) {
super(initx,inity);
r = initr;
}
boolean isHit(Point p) {
	double dx = p.x - x;
	double dy = p.y - y;
	double d = Math.sqrt(dx*dx + dy*dy);
	return d < r;
}

boolean isHit(Circle c) {
	
	double dx = c.x - x;
	double dy = c.y - y;
	double d = Math.sqrt(dx*dx + dy*dy);
	
	return d < r + c.r;
	
}


}