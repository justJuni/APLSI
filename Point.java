/*
 * class that represents a point on a 2d plane
 * @author Kyle Jeffries 12/8/2015
 */
public class Point {
	int xCord;
	int yCord;
	
	/*
	 * constructor for a point
	 * @param x, x coordinate
	 * @param y, y coordinate
	 */
	public Point(int x, int y) {
		xCord = x;
		yCord = y;
	}
	
	/*
	 * getter function for the xCord
	 */
	private int getX()
	{
		return xCord;
	}
	
	/*
	 * getter function for the yCord
	 */
	private int getY()
	{
		return yCord;
	}
	
}
