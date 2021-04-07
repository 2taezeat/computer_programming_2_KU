import java.util.Scanner;
public class Lab06_4{
	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);

double a=scan.nextDouble();

double b=scan.nextDouble();

double c=scan.nextDouble();

double num1;

num1=Math.pow(b,2)-4*a*c;
if(num1==0)
{
double r;
r=-b/2*a;
System.out.println("r="+r);
}

if(num1>0)
{
double r1,r2;

num1=Math.pow(b,2)-4*a*c;

double sqrt1;

sqrt1=Math.sqrt(num1);

r1=(-b+sqrt1)/2*a;
r2=(-b-sqrt1)/2*a;
System.out.println("r1="+r1);
System.out.println("r2="+r2);
}


else
System.out.println("No answer");
}
}