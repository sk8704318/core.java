package method;

public class calculate {
	public static void main(String[] args) {
		int ab=1;
		//int ad=2;
		int bc=10;
		int cd=20;
		
		switch(ab) {
		case 1:
			System.out.println(bc+cd);
			//break;
		case 2:
			System.out.println(bc-cd);
			//break;
		case 3:
			System.out.println(bc*cd);
			//break;
		case 4:
			System.out.println(cd/bc);
			break;
			default:
				System.out.println("error");
			
		
		}
	}

}
