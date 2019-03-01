package fileReaderoperator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RedeFile {

	public static void main(String[] args) {
		FileReader red = null;
		BufferedReader buf = null;
        String path ="D:\\testing\\quiz/quiz 6.txt";
        try {
        	red = new FileReader(path);
        	buf = new BufferedReader(red);//use bufferedReader to read what's in FileReader
        	}catch (FileNotFoundException e) {
        		e.printStackTrace();// print message in case the file not found using FileNotFoundException.
        	}
        String str ="";
        try {
        	while ((str=buf.readLine()) != null){
        		System.out.println(str);// read str who is not null
        	}
        }catch(IOException e) {// declare and import IOException
        	e.printStackTrace();
        }finally{
        if (red!=null) {
        	red=null;
        }if (buf!=null) {
        	buf=null;
        }
        }
	}

}
