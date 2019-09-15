package assignment2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;

import org.junit.Test;

public class ImageLabelReaderTest {
	 @Test public void testLabelFiles() throws FileNotFoundException {
		 ImageLabelReader ilr = new ImageLabelReader("C:\\Users\\misra\\dat240\\assignments\\assignment2\\data\\label_mapping.csv", "C:\\Users\\misra\\dat240\\assignments\\assignment2\\data\\image_mapping.csv");
		 String[] files = ilr.getImageFiles("goldfish");
		 assertNotNull(files);
		 assertEquals(files.length, 10);		 
	 }
	 
	 @Test public void testImageLabel() throws FileNotFoundException {
		 ImageLabelReader ilr = new ImageLabelReader("C:\\Users\\misra\\dat240\\assignments\\assignment2\\data\\label_mapping.csv", "C:\\Users\\misra\\dat240\\assignments\\assignment2\\data\\image_mapping.csv");
		 String label = ilr.getLabel("ILSVRC2012_val_00000090.JPEG");
		 assertNotNull(label);
		 assertEquals(label, "American alligator");		 
	 }
}
