public class Lab07_2{
public static void main(String[] args){
double x;
double sum1 = 0;
double sum2 = 0;



for(double cnt1=1; cnt1<50001 ;cnt1++)
{sum1=sum1+1/cnt1;}
System.out.println("sum1 = "+sum1);

for(double cnt2=50000; cnt2>0; cnt2--)
{sum2=sum2+1/cnt2;}
System.out.println("sum2 = "+sum2);


}
}