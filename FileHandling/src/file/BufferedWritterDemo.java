package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritterDemo {
       public static void main(String[] args) throws IOException {
		BufferedWriter bf=new BufferedWriter(new FileWriter("filehandling.txt"));
		bf.write("whats up pepole");
		bf.newLine();
		bf.write("it tiger");
		bf.flush();
		bf.close();
		
	}
}
