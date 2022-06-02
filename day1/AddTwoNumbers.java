package javademo;

class BusinessLogic{
	void AddDemo() {
		int number1=25;
		int number2=30;
		int result=number1+number2;
		System.out.println("The answer is:"+result);
	}
}


public class AddTwoNumbers {
	public static void main(String[] args) {
		BusinessLogic b=new BusinessLogic();
		b.AddDemo();
	}

}
