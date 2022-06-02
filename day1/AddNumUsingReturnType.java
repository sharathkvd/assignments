package javademo;


class ReturnType{
	int ReturnDemo(int number1,int number2) {
		int result=number1+number2;
		return result;
	}
}

public class AddNumUsingReturnType{
	public static void main(String args[]) {
		ReturnType b=new ReturnType();
		int result=b.ReturnDemo(24,34);
		System.out.println("The result is= "+result);
	}

}
