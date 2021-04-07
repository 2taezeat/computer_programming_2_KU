import java.util.Scanner;
public class Lab08_3 {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of rows in the matrix: ");
	int row = sc.nextInt();
	System.out.println("Enter the matrix row by row: ");
	int [][]arr = new int[row][row];
	for(int i =0;i<row;i++)
		for(int j=0;j<row;j++)
		{
			int num1 = sc.nextInt();
			arr[i][j]=num1;
		}
	int []answer = findlargeblock(arr);
	if(answer[2]==0){
		System.out.print("Can not find element 1 in the matrix");
	}
	else{
	System.out.printf
	("The maximum square submatrix is at (%d, %d), with size %d",answer[0],answer[1],answer[2]);}

}

public static int[] findlargeblock(int[][] ary1)
{
int i,j,k,m;

int[]a = new int[3];
int max_x=0,max_y=0,max_size=0;

for(i=0;i<ary1.length;i++)
{
	for(j=0;j<ary1.length;j++)
	{
		m = i > j ? i : j;
		for(k=1;k<=(ary1.length-m);k++)
		{
			if(judge(ary1,i,j,k)==true)
			{
					if(k>max_size)
					{
						max_x=i;
						max_y=j;
						max_size=k;
					}
		
			}
			
		}
	}
}
if(max_size==0){;}
a[0]=max_x;
a[1]=max_y;
a[2]=max_size;
return a;
}
public static boolean judge(int[][] ary2,int x, int y, int size)
{
int i,j;
int s1=ary2.length;

	for(i=x;i<x+size;i++)
	{
		for(j=y;j<y+size;j++)
		{
			
			if(ary2[i][j]==0)
			{
				return false;
			}
			
		}
		
	}
	
	
	
	return true;	
}
}
