package ioopperation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class Fileoutputstreamexample {

	public static void main(String[] args)throws IOException   {
		// TODO Auto-generated method stub
		OutputStream outobj=null;
		
		 outobj=new FileOutputStream("myoutfile.txt");
			outobj.write(70);
			outobj.write(65);
			outobj.write(78);
			outobj.close();
		

	}

}
