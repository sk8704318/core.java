package method;

public class calling {
	public static void main(String[] args) {
		bank a=new bank();
		a.sum();
        a.depo(100);//object throw call the method
        bank.interest(100, 200);//not use object direct call the class for method
        a.max(10,20);
	}
}
