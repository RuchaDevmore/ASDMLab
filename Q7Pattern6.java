
/*       ABCDEEDCBA
         ABCD  DCBA
         ABC    CBA
         AB      BA
         A        A   */
// not solved

public class Q7Pattern6 {

	public static void main(String[] args) {
		char k='A';
        int space=0;
		 for( int i=1;i<=5;i++)
		 {
			
			 for(int j=5;j>=i;j--)		 	 System.out.print(k++);		 
			 
		     for(int u=1;u<=space;u++)       System.out.print(" ");
			 
			 for(int j=5;j>=i;j--)		 	 System.out.print(--k);		
			 
			 space=space+2;
			 
			 System.out.println();
		 }
//		int n=5;
//		 for (int i = 0; i < n; i++) 
//		    {
//		        for (int j = 'A'; j < 'A' + (2 * n) - 1; j++) 
//		        {
//		            if (j >= ('A' + n - 1) + i)
//		                System.out.print((char)(('A' + n - 1) - 
//	                               (j % ('A' + n - 1)))); 
//		            else if (j <= ('A' + n - 1) - i)
//		               System.out.print((char)j);
//		            else
//		               System.out.print(" "); 
//		        }
//		       System.out.println();
//		    }
		}

	}

