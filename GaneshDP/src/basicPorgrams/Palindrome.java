package basicPorgrams;

public class Palindrome {
	
	int a = 121;
	int b;
	int c= 0;
	int d=a;
	
	public void paDrome() {
		
		while(a!=0) {
			b=a%10;
			c=c*10+b;
			a=a/10;
			
			
			if(d==c) {
				System.out.println(c+" is a palindrome number");
				
			}
			else
			{
				System.out.println(c+" is not a palindrome number");
			}
			
		}
	
	}

	public static void main(String[] args) {
		
		Palindrome n = new Palindrome();
		n.paDrome();
	}
}
