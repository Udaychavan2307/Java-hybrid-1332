package method;

public class Calculator {
	
	
	int Addition(int n1, int n2,int n3)
	{
       int sum=n2+ n2 +n3;
       return sum;
}
	void average(int a,int b,int c)
	{
		Calculator c1=new Calculator();
		int res=Addition(a,b,c);
		int avg=res/3;
		System.out.println(avg);
	}
}
