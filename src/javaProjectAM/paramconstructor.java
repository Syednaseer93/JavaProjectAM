package javaProjectAM;

public class paramconstructor {
	int x;
	int y;
	paramconstructor(int a,int b)
	{
		x=a;
		y=b;
		}
	void display() {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		paramconstructor param=new paramconstructor(201,299);
		param.display();

	}

}
