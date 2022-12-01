class Friend
{
	static void gift(){
		System.out.println("Gift in Valintine");
	}
}
class BoyFriend extends Friend
{
	static void gift(){
		System.out.println("Rose Gift in Valintine");
	}
}

class GirlFriend extends Friend
{
	static void gift(){
		System.out.println("Watch gift in Valintine");
	}
}

class K
{
	public static void main(String[] args){
		/*Friend fr = new GirlFriend();
		fr.gift();
		Friend fr1 = new BoyFriend();
		fr.gift();
		BoyFriend bfr = new BoyFriend();
		bfr.gift();
		GirlFriend gfr = new GirlFriend();
		gfr.gift();*/
		BoyFriend bfr = new Friend();
		bfr.gift();
	}
}