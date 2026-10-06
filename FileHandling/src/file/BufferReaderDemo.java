package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
 public static void main(String[] args) throws IOException
 {
	 BufferedReader br=new BufferedReader(new FileReader("filehandling.txt"));
	 //newline method avl in bufferreader
	 String line="";
    while(line!=null) {
    	System.out.println(line);
    	line=br.readLine();
    }
	 
} 
}
