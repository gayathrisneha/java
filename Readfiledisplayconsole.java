package ioopperation;
import java.io.BufferedReader;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Readfiledisplayconsole {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("myinfo.txt");
	       BufferedReader br=new BufferedReader(new InputStreamReader(fis));
	       String ln;
	       while((ln=br.readLine())!=null) {
	    	   System.out.println(ln);
	       }
	       
	    	  fis.close();
	    	  br.close();

	}

}
