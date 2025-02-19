package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		// rectangle 255 109 182 true 0.5 0.5 0.2 0.2
		
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		

		
		Color pretty = new Color(redComponent, greenComponent, blueComponent);
		StdDraw.setPenColor(pretty);
		
		if (shapeType.equals("rectangle")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
		StdDraw.rectangle(x,y,halfWidth,halfHeight);
		}
		
		
		if (shapeType.equals("triangle")) {
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double[] x = new double[x1, x2, x3];
			double[] y = new double[y1, y2, y3];
		
			StdDraw.polygon(x,y);


		
	}
}
