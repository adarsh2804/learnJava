public class pattern4{

public static void main(String args[]){
/*
    *                i=0,j<4,k=1
   ***               i=1,j<3,k=3
  *****              i=2,j<2,k=5
 *******             i=3,j<1,k=7
*********            i=4,j<0,k=9
 *******             i=5,j<1,k=7
  *****              i=6,j<2,k=5
   ***               i=7,j<3,k=3
    *                i=8,j<4,k=1      */

for(int i=0;i<5;i++)
{	for(int j=0;j<(4-i);j++)
	{	System.out.print(' ');
	}
	for(int k=0;k<(2*i+1);k++)
	{
		System.out.print('*');
	}
		System.out.println();
}

for(int i=0;i<4;i++)
{	for(int j=0;j<=i;j++)
	{	System.out.print(' ');
	}
	for(int k=0;k<(7-2*i);k++)
	{
		System.out.print('*');
	}
		System.out.println();
}}}