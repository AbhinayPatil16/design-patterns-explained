package per.design.pattern.strategy;

import java.io.File;



/**
 * @author abhinaypatil
 * @implNote This class is the glue between strategy and caller who needs the runtime behaviour of the object.
 *
 */
public class CompressionContext {

	private CompressionStrategy strategy;
	
	public CompressionContext(CompressionStrategy strategy) {
		this.strategy = strategy;
	}
	
	public byte[] executeComression(File file) {
		return strategy.doCompress(file);
	}
	
}
