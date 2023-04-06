package lambda2;

interface getSum{
	void sumation();
}

public class lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getSum lambda=()->{System.out.println("hello world");};
	lambda.sumation();

}}
