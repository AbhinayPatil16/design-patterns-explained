package per.design.pattern.strategy;

import java.io.File;

public class StrategyPatternTest {
	
	public static void main(String[] args) {
		
		File file = new File("someFileURI");
		if(file.length() / (1024 * 1024)>10) {
			CompressionContext context = new CompressionContext(new LocalCompression());
			byte [] compressedFile = context.executeComression(file);
		}else {
			CompressionContext context = new CompressionContext(new ServerCompression());
			byte [] compressedFile = context.executeComression(file);
		}
		
	}

}
