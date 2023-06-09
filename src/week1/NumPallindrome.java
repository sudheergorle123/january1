package week1;

public class NumPallindrome {

	public static void main(String[] args) {
		int i = 1232;
		int count = 0;
		int temp = i;
		int r;
		int sum =0;
		
		while(i>0)
			
		{
			r = i%10;
			sum = (sum *10)+r;
			i = i/10;
			
			
			
		}
		
		
		if(temp == sum)
		{
			System.out.println("it is a pallindrome");
		}
		else
		{
			System.out.println("it si not a pallindrome");
		}

	}

}
