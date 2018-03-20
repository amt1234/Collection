//If you want to create a new file and at the same time write some data into it,
package Iooperation;


import java.io.FileOutputStream;


public class FileOutput {
	public static void main(String args[]) throws Exception
	{
	String fileData = "abciii";
	FileOutputStream fos = new FileOutputStream("name.txt");
	fos.write(fileData.getBytes());
	fos.flush();
	fos.close();
}
}
