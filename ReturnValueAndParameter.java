package method;

public class ReturnValueAndParameter {
	String printString(String val)
	{
		return "Hello "+val;
	}
	public static void main(String[] args) {
		ReturnValueAndParameter obj = new ReturnValueAndParameter();
		String val="Satish";
		System.out.println(obj.printString(val));
		

	}

}
