import java.util.ArrayList;

//Andrew McMullen
public class BruteForce
{
	
	public static ArrayList<LinePair> generateAndCalculatePairs(int n)
	{
		ArrayList<LinePair> pairs = new ArrayList<LinePair>(2 * n);
		ArrayList<Line> vert = Generator.generateVerticalLines(n);
		ArrayList<Line> horiz = Generator.generateHorizontalLines(n);
		for(Line v: vert)
		{
			for(Line h: horiz)
			{
				if(LinePair.isPair(v, h))
				{
					pairs.add(new LinePair(v, h));
				}
			}
		}
		return pairs;
	}
	
	public static ArrayList<LinePair> calculatePairs(int n, ArrayList<Line> vert, ArrayList<Line> horiz)
	{
		ArrayList<LinePair> pairs = new ArrayList<LinePair>(2 * n);
		for(Line v: vert)
		{
			for(Line h: horiz)
			{
				if(LinePair.isPair(v, h))
				{
					pairs.add(new LinePair(v, h));
				}
			}
		}
		return pairs;
	}
}
