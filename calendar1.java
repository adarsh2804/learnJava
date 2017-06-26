
public class calendar1{
	public static void main(String args[]){
		int d1,d2=0,m1,m2=0,y1,y2;
		d1=Integer.parseInt(args[0]);		
		m1=Integer.parseInt(args[1]);
		y1=Integer.parseInt(args[2]);
		//System.out.println(d1);
		if(m1==3)
		{
			if(d1>=1&&d1<31)
			d2=d1++;
			else if(d1==31)
			{d2=1;m2=4;}
		}
		System.out.println(d2);
		System.out.println(m2);
		System.out.println(y1);
}}
	