
/*    ABCDEEDCBA
	  ABCD  DCBA
	  ABC    CBA
	  AB      BA
	  A        A   */
public class ReverseTrianglepattern {
	
	public static void main(String[] args) {
		char k ='A';
		int space =0;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(k++);
			}
			for(int n=1;n<=space;n++)
			{
				System.out.print(" ");
			}
			for(int m=5;m>=i;m--)
			{
				System.out.print(--k);
			}
			space =space +2;
			System.out.println();
		}
	}

}
