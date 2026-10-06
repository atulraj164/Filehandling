package file;
import java.io.*;
public class FilewritterDemo {
	
    public static void main(String[] args) throws IOException {
	    FileWriter fw=new FileWriter("filehandling.txt");
	    fw.write(99);
	    fw.write("what the fuck is going on");
	    char[] ch= {'c','a'};
	    fw.write(ch);
	    fw.flush();
	    fw.close();
	    
  }
 
}
