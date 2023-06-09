package week1;

public class Day1 {
	
	int i = 10;
	static String s1 = "sudheer";
	
	public String method1(int i)
	{
		String s2 = "anju";
		
		return s2;
	}

	public static void main(String[] args) {
		Day1 d1 = new Day1();
		System.out.println("req o/p:"+d1.i);
		System.out.println("req string :"+Day1.s1);
		System.out.println(d1.method1(10));
		

	}

}
