public class Point {
double x,y;
Point(double initx, double inity) {
x = initx;
y = inity;
}

double distance(Point p){
	
	
	double dx = p.x - x;
	double dy = p.y - y;
	
	double d = Math.sqrt(dx*dx + dy*dy);
	return d;
}
}
