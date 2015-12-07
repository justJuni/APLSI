//Andrew McMullen
public class Line {
	public boolean isVertical;
	public int startX;
	public int startY;
	public int endX;
	public int endY;

	/**
	 * 
	 * @param vert
	 *            Is the line vertical?
	 * @param sX
	 *            Starting X coordinate.
	 * @precondition sX is less than (1,000,000 - 25)
	 * @param sY
	 *            Starting Y coordinate.
	 * @precondition sY is less than (1,000,000 - 25)
	 */
	public Line(boolean vert, int sX, int sY) {
		isVertical = vert;
		startX = sX;
		startY = sY;
		if (isVertical) 
		{
			endY = sY;
			startY = endY - 25;
			endX = startX;
		} 
		else 
		{
			endY = startY;
			endX = startX + 25;
		}
	}
}
