
public class FibonacciSequence {
	
	public static void fibonacciSequence()
	{
		int p1=0, p2=0, sum=0;
		for (int i = 0; i < 10 ; i++ )
		{
			if (i==0)
				p1 = 1;
			if (i==1)
				p2 = 1;
			
			sum = p1 + p2;
			p1 = p2;
			p2 = sum;
			System.out.println(sum + "\t");
			
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacciSequence();
	}

}
