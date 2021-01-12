package per.design.pattern.strategy;

import java.io.File;



/**
 * @author abhinaypatil
 *
 */
public class ServerCompression implements CompressionStrategy{

	@Override
	public byte[] doCompress(File file) {
		/*
		 *  1. File to be scanned
		 *  2. File to sent to server for comression via API 
		 *  3. Recive the file and return it to caller.
		 */	
		System.out.println("Server did the compression.");
		return null;
	}

}
