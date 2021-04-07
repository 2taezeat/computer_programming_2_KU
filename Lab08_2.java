import java.util.Scanner;
public class Lab08_2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter list: ");
		int count = sc.nextInt();
		
	
int []arr= new int[count];

for(int i=0;i<count;i++)
{
	int num1 = sc.nextInt();
	arr[i]=num1;
}

if(issorted(arr)==false)
System.out.print("The list is not sorted");
if(issorted(arr)==true)
System.out.print("The list is already sorted");
	}
public static boolean issorted(int[] inst)
{
	
	for(int j=0;j<inst.length-1;j++)
	{
	if(inst[j]>inst[j+1])
		return false;
	
	}
return true;
}

}

