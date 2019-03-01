package fileReaderoperator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRederExample {


	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		String path = "D:\\readerrr.txt";
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
		}catch (FileNotFoundException e) {// use exceptions if the file is not found.
			e.printStackTrace();
		}
		String st = "";
		try {//use the loop to read the file.
			while((st = br.readLine())!= null) {
				System.out.println(st);
			}
		}catch(IOException e) {//handling exception 
			e.printStackTrace();
		}finally {//to stop the process of  reading
			if(fr != null) {
				fr = null;
			}
			if(br !=null) {
				br = null;
			}
		}
		

	}

}
