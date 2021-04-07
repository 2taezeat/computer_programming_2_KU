import java.util.Scanner;
public class Lab06_5{
	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);

double a=scan.nextDouble();

double b=scan.nextDouble();

double c=scan.nextDouble();



if(a<b && b<c) System.out.println(a+","+b+","+c);
if(a<c && c<b) System.out.println(a+","+c+","+b);
if(b<a && a<c) System.out.println(b+","+a+","+c);
if(b<c && c<a) System.out.println(b+","+c+","+a);
if(c<a && a<b) System.out.println(c+","+a+","+b);
if(c<b && b<c) System.out.println(c+","+b+","+a);

}
}