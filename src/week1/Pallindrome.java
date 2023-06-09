package week1;

public class Pallindrome {

	public static void main(String[] args) {
		String s1 = "repaper";
		String s2 = "";
		for(int i = 0; i<=s1.length()-1;i++)
		{
			char s3 = s1.charAt(i);
			s2 = s2 + s3;
			
		}
		System.out.println("required string:"+s2);
		if(s1.equals(s2))
		{
			System.out.println("it is a pallindrome");
		}
		

	}

}
