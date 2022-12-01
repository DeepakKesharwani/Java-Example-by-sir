import java.io.File;

class x4{

	public static void deleteDirectory(File path){
		if(path == null)
			return;
		if(path.exists()){
			for(File f : path.listFiles()){
				if(f.isDirectory()){
					System.out.println(f+"#############1");
					deleteDirectory(f);
					System.out.println(f+"@@@@@@@@@@@@@2");
					f.delete();
				}else{
					f.delete();
					System.out.println(f+"###########3");
				}
				System.out.println(f+"###########4");	
			}
			path.delete();
		}
	}

	public static void main(String[] args){
		File file = new File("a");

		deleteDirectory(file);
	}
}