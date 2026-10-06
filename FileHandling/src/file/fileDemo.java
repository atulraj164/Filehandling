package file;

import java.io.File;

public class fileDemo {

	public static void main(String[] args) throws Exception{
		File file=new File("c://javafile","filehandling.txt");
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println(file.exists());
		System.out.println(file.isFile());
		String[] str=file.list();
		
		for(String s:str) {
			System.out.println(s);
		}
	}
}
