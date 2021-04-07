import java.util.Scanner;

public class Lab06_3{
	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);

double num1=scan.nextDouble();
double num2=scan.nextDouble();

double num3=scan.nextDouble();
double num4=scan.nextDouble();

double num5=scan.nextDouble();
double num6=scan.nextDouble();

double a1;
double a2;
double a3;
double a4;
double a5;
double a6;


a1=Math.pow(num1-num3,2);
a2=Math.pow(num2-num4,2);


a3=Math.pow(num1-num5,2);
a4=Math.pow(num2-num6,2);

a5=Math.pow(num3-num5,2);
a6=Math.pow(num4-num6,2);

double side1,side2,side3;
double s,area;
side1=Math.sqrt(a1+a2);
side2=Math.sqrt(a3+a4);
side3=Math.sqrt(a5+a6);

s=(side1+side2+side3)/2;
area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
System.out.println("area="+area);

}
}