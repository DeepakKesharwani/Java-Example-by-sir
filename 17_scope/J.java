import java.awt.Dimension;

class J{
	static void process(Dimension y){
		y.height = y.height + 1;
	}

	public static void main(String[] args){
		Dimension x = new Dimension(12,10);

		process(x);

		System.out.println(x.height);
	}
}