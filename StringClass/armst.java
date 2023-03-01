package StringClass;

public class armst {
	public static void main(String[] args) {
		int a=370;
		int r=0;
		int sum=0;
		int n=a;
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			
			
		}
		if(sum==a) {
			System.out.println("arm");
		}
		else
		{
			System.out.println("not arm");
			
		}
		
	}}