public class Circle2D{
  Point2D center;
  double r;
  Circle2D(){
    center=new Point2D();
    r=1;
  }
  public Circle2D(Point2D center, double radius){
    this.center = new Point2D(center);
    this.r = radius;
}
  Point2D getPoint2D()
  {
   return center;
  }
  
  public double getr(){
    return r;
  }
  public void move(double dx,double dy){
    center.move(dx,dy);
  }
  
  public double getArea(){
    return r*r*Math.PI;
  }
  public double getPerimeter(){
    return 2*r*Math.PI;
  }
  public boolean contains(Point2D other){
    double dis=center.distance(other);
    if(dis<=r){
      return true;
    }
    else{
      return false;
    }
  }
  public boolean contains(double x, double y)
  {
    double dis=center.distance(x,y);
    if(dis<=r){
      return true;
    }
    else{
      return false;
    }
  }
  
  public boolean contains(Circle2D other)
  {
    double dis=center.distance(other.center);
    if(dis<r){
      if(dis+other.r<=r){return true;}
    }
    if(dis<other.r){
      if(dis+r<=other.r){return true;}
    }
    return false;
  }
  
  
  public boolean overlaps(Circle2D other)
  {
    double dis=center.distance(other.center);
    if(dis>r+other.r){return false;}
    return true;
  }
}