package per.design.pattern.strategy;

import java.io.File;


/**
 * @author abhinaypatil
 *
 */
public class LocalCompression implements CompressionStrategy{

	@Override
	public byte[] doCompress(File file) {
		// Code for local compression of file goes here...
		System.out.println("File Locally compressed.");
		return null;
	}

}
