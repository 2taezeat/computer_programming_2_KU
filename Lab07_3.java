public class Lab07_3{
public static void main(String[] args){
double x;
double num1 = 1;

double num2 = 1;
double sum1 = 1;
double sum2 = 1;


for(double cnt1=1; cnt1<201 ;cnt1++)
{
num1*=(1/cnt1);


sum1=sum1+num1;
}




System.out.println("sum1 = "+sum1);




for(double cnt2=1; cnt2<50000; cnt2++)
{num2*=(1/cnt2);

sum2= sum2+num2;
}


System.out.println("sum2 = "+sum2);

}
}