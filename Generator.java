import java.util.ArrayList;
import java.util.Random;

//Andrew McMullen
public class Generator 
{
	//Random actually has to be instantiated. Just a consequence of using random.
	static Random rand = new Random();
	
	/**
	 * Generate a list of n horizontal lines.
	 * @param n How many lines to generate.
	 * @return An arraylist of horizontal lines.
	 */
	public static ArrayList<Line> generateHorizontalLines(int n)
	{
		ArrayList<Line> lines = new ArrayList<Line>(n);
		for(int i = 0; i < n; i++)
		{
			lines.add(new Line(false, rand.nextInt(1000000 - 25) + 1, rand.nextInt(1000000 - 25) + 1));
		}
		return lines;
	}
	
	/**
	 * Generate a list of n vertical lines.
	 * @param n How many lines to generate.
	 * @return An arraylist of vertical lines.
	 */
	public static ArrayList<Line> generateVerticalLines(int n)
	{
		ArrayList<Line> lines = new ArrayList<Line>(n);
		for(int i = 0; i < n; i++)
		{
			lines.add(new Line(true, rand.nextInt(1000000 - 25) + 1, rand.nextInt(1000000 - 25) + 1));
		}
		return lines;
	}
	
}
