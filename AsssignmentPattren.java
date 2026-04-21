package day6;

public class AsssignmentPattren {

	public static void main(String[] args) {
	
/*----pattern1---*/
        
        for (int i=0; i<=6;i+=2)
        {
        	for(int k=1;k<=5-i;k++)
        	{
        		System.out.print(" ");
        	}
        	for(int j=1;j<=i+1;j++)
        	{
        		System.out.print("*");
        		System.out.print(" ");
        	}
        	System.out.println( );
        }
        
        /*----pattern2---*/
        for (int i = 1; i <= 4; i++)
        {
        	for(int k=1;k<=4-i;k++)
        	{
        		System.out.print(" ");
        	}
        	for(int j = 1 ;j <= 2*i-1 ;j++)
        	{
        		if(j == 1 || j == 2*i-1 || i == 4)
        		{
        			System.out.print("*");
        		}
        		else {
        			System.out.print(" ");
        		}
        		
        	}
        	System.out.println( );
        }
        
        /*----pattern3---*/
        
        for (int i=1; i<=3;i++)
        {
        	for(int k=1;k<=3-i;k++)
        	{
        		System.out.print(" ");
        	}
        	for(int j=1;j<=2*i-1;j++)
        	{
        		if(j == 1 || j == 2*i-1 )
        		{
        			System.out.print("*");
        		}
        		else {
        			System.out.print(" ");
        		}
        		
        	}
        	System.out.println( );
        }
        
        
        for (int i=3-1; i>=1;i--)
        {
        	for(int k=1;k<=3-i;k++)
        	{
        		System.out.print(" ");
        	}
        	for(int j=1;j<=2*i-1;j++)
        	{
        		if(j == 1 || j == 2*i-1 )
        		{
        			System.out.print("*");
        		}
        		else {
        			System.out.print(" ");
        		}
        		
        	}
        	System.out.println( );
        }
        
	}

}


