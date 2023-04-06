package lambda2;

interface getSum2{
	void sumation(int x,int y);
}

public class lmbda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getSum2 lambda=(int p,int q)->{
			System.out.println("hello world"+(p+q));
			
		};
	lambda.sumation(9,8);

}}
