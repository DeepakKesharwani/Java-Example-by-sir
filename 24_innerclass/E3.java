
//cyclic inheritance

//Case 1:
/*
class E3 extends E3.F3 //----x Not possible
{

	class F3{
		
	}

}*/

//Case 2:
/*
class a extends c
{
}
class c extends a
{
}*/	

//Case 3:

class E3 {

	/*static*/ class F3{
		
	}

}

class Z extends E3.F3{
	
}







