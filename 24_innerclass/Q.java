import java.io.*;

class Q {
	public static void main(String[] args) 
	{
		Q o = new Q();
		o.go();
	}

	void go(){
		final int a = 90;
		//int a = 90;

		class R{
			void process(){
				System.out.println(a);
			}
		}

		R p = new R();
		p.process();
	}
}
