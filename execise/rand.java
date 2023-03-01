package execise;

import java.util.Random;

public class rand {
public static void main(String[] args) {
	Random ab=new Random();
	System.out.println("random");
	for(int i=1;i<=5;i++)
	{
		System.out.println(ab.nextInt(100));
	}
}

}
