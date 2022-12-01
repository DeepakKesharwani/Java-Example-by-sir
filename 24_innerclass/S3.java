class S3 {
	public static void main(String[] args) {
		Yy u = new Yy();
		u.process(new Xx(){
						public void go(){
							System.out.println("Hello..."+this);
						}
					});
	}
}

interface Xx{
	void go();
}

class Yy{
	void process(Xx i){
		i.go();
	}
}
