import java.math.*;
public class Point2D {
	double x,y;
	  Point2D(double x,double y)
	  {
	    this.x=x; this.y=y;
	  }
	 public double getx()
	 {
		    return x;
	 }  
	public double gety()
	{
		    return y;
	}
	
	public void move(double dx, double dy)
	{
	    x=x+dx; y=y+dy;
	}
	
	public double distance(double x, double y){
		return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
	}
	
	public double distance(Point2D other)
	{
	    return distance(other.getx(),other.gety());
	}
	
	Point2D()
	{
		x=0; y=0;
	}
	Point2D(Point2D other)
	{
	    x=other.x;
	    y=other.y;
	}
	
}
