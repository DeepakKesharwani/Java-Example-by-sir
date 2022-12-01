class Y{
	Y(){ System.out.println("W");	}
	{ System.out.println("M");	}
	static{ System.out.println("S");	}
}

class I extends Y{	
	{ System.out.println("T");	}	
	
	static{ System.out.println("U");	}
	
	I(){  System.out.println("R");	}

	public static void main(String[] args){
		I w = new I();
		Y x = new Y();
	}
}