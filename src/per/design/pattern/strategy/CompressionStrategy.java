package per.design.pattern.strategy;

import java.io.File;


/**
 * @author abhinaypatil
 *
 */
public interface CompressionStrategy {
	
	public byte[] doCompress(File file);

}
