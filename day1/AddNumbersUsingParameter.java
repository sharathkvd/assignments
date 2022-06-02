package javademo;

class ParameterDemo{
	void AddNumberParameter(int number1,int number2) {
		int result=number1+number2;
		System.out.println("The result is:"+result);
	}
}

public class AddNumbersUsingParameter {
	public static void main(String[] args) {
	ParameterDemo b=new ParameterDemo();
	b.AddNumberParameter(35,67);

}
}