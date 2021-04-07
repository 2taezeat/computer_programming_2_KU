public class LinearEquation {
private double a,b,c,e,d,f;
LinearEquation(double a, double b, double c,
double d, double e, double f) {
this.a=a;
this.b=b;
this.c=c;
this.d=d;
this.e=e;
this.f=f;
}
double getA(double a) { return a; }
double getB(double b) { return b; }
double getC(double c) { return c; }
double getD(double d) { return d; }
double getE(double e) { return e; }
double getF(double f) { return f; }
boolean isSolvable() {
	if(a*d-b*c != 0)
return true;
	else
		return false;
}
double getX() {
	double x;
	
x=(e*d-b*f)/(a*d-b*c);
return x;
}
double getY() {
	double y;
	y=(a*f-e*c)/(a*d-b*c);
return y;
}
}