
/**
 * An end point of a line
 */
public class EndPoint
{
    private Line line;
    private int  x, y;
    private boolean isEnd;

    /**
     * @param l The line this end point belongs to.
     * @param x The x-coordinate
     * @param y The y-coordinate
     * @param isEnd Whether or not it is the second end point
     */
    public EndPoint(Line l, int x, int y, boolean isEnd)
    {
        line = l;
        this.x = x;
        this.y = y;
        this.isEnd = isEnd;
    }


    /**
     * @return The line
     */
    public Line line()
    {
        return line;
    }


    /**
     * @return x
     */
    public int x()
    {
        return x;
    }


    /**
     * @return y
     */
    public int y()
    {
        return y;
    }
    
    /**
     * @return Whether it is the second end point
     */
    public boolean isEnd()
    {
        return isEnd;
    }
    
    public String toString()
    {
        return "("+x+","+y+")";
    }
}
