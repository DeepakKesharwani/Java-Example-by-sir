class Y{
	Y(boolean e){ System.out.println("W");	}
	{ System.out.println("M");	}
	static{ System.out.println("S");	}
}

class H{	
	{ System.out.println("T");	}	
	
	static{ System.out.println("U");	}
	
	H(){  System.out.println("R");	}

	public static void main(String[] args){
		H w = new H();
		Y x = new Y(12<13);
	}
}