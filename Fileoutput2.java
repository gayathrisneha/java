package ioopperation;
import java.io.FileOutputStream;
import java.io.IOException;
public class Fileoutput2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("myinfo.txt");
		String str="Learn Java Programming";
		//You can ask user what information user wants to write
         fos.write(str.getBytes());
         fos.close();
	}

}
