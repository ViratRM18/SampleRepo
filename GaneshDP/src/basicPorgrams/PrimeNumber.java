package basicPorgrams;

public class PrimeNumber {
	
	int a = 8;
	int b = 0;
	int c = 0;
	int d = 0;
	
	public void prime() {
		for(int i=2;i<a;i++) {
			b=a%i;
			
			if(b==0) {
				System.out.println(a+" is not a prime number");
				c=c+1;
				break;
			}
			
		}
		
		if(c==0) {
			System.out.println(a+" is a prime number");
		}
	}
	
	public static void main(String[] args) {
		PrimeNumber p = new PrimeNumber();
		p.prime();
	}

}
