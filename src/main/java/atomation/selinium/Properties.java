package atomation.selinium;

public class Properties {
	
	public void readproperty() throws IOException
	{
		File F =new file(filepath);
		FileInputSteam FS=new FileInputSteam(F);
	    Properties p=new properties();
	    p.load(FS);
	    string actualName=p.get(properties)("name");
	    System.out.println(actualName);
	    System.out.println(p.getproperties("age"));
	    p.setproperties("course","testing");
	    System.out.println(p.getproperty());
	    
		}

	public static void main(String[] args) {
		

	}

}
