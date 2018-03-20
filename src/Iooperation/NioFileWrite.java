package Iooperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NioFileWrite {

	public static void main(String[] args) throws IOException {
		String fileData="rohini";
		Files.write(Paths.get("filename.txt"),fileData.getBytes());

	}

}
