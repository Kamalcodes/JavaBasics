package myPackage;

public class BreakStatementInnerLoop 
{
//	public static void main(String args[])
//	{
//		for(int x=1;x<=4;x++)
//		{
//			for(int y=1;y<=4;y++)
//			{
//				if(x==2 && y==2)
//				{
//					System.out.println("value of x is "+x+" and value of y is "+y);
//					break;
//				}
//				System.out.println(x);
//				//System.out.println(y);
//			}
//		}
//	}
	
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=3;j++)
				{
					if(i==2 && j==2)
					{
						break;
					}
				
				System.out.println(j);				
				}
			System.out.println(i);
		}
	}
}
