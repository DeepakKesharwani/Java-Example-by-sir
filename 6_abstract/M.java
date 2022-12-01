abstract class X{

}

abstract class Y extends X{

}


class M extends Y{
	public static void main(String[] args){
		X x = new M();

		Y y = (Y)x; //type cast into wider class
	}
}