import java.util.Scanner;
public class Lab08_1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int line1 = sc.nextInt();
		int space=line1-1;
		int i,j,m,n;
		int k=1;
		
		
		for(i=1;i<=line1;i++)
		{
				while(k<=space)
				{System.out.print("  ");
				k++;
				}
				
				for(m=0;m<i;m++)
					{
					n=i-m;
				System.out.print(n+" ");}
				
				for(m=2;m<=i;m++)
				{
			System.out.print(m+" ");
				}
						
			
			System.out.print("\n");
			k=1;
			n=0;
			space--;
		}
	}
}