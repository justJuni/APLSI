/**
 * Represents line segment
 */
public class Line
{
    private boolean isVert;
    private EndPoint endPoint1, endPoint2;
    /**Length of the line segment*/
    public static final int LENGTH = 25;
    
    /**
     * @param x The x coordinate of end point 1.
     * @param y The x coordinate of end point 1.
     * @param isVertical Whether it is a vertical.
     */
    public Line(int x, int y , boolean isVertical)
    {
        endPoint1 = new EndPoint(this, x, y, false);
        isVert = isVertical;
        if(isVert)
        {
            endPoint2 = new EndPoint(this, x, y + LENGTH, true);
        }
        else
        {
            endPoint2 = new EndPoint(this, x + LENGTH, y, true);
        }        
    }
    
    /**
     * @return The orientation of the line
     */
    public boolean isVertical()
    {
        return isVert;
    }
    
    /**
     * @return The left or bottom end point
     */
    public EndPoint point1()
    {
        return endPoint1;
    }
    
    /**
     * @return The right or top end point
     */
    public EndPoint point2()
    {
        return endPoint2;
    }
    
    public String toString()
    {
        return endPoint1.toString()+"\t"+endPoint2.toString();
    }
}
