import java.awt.Point;
import java.util.ArrayList;

/**
 * Abstract class that represents an algorithm that the solve the line segment
 * intersection problem.
 */
public abstract class SegmentIntersectionAlgorithm
{
    /**
     * Solves the line segment intersection problem.
     * 
     * @param lines
     *            The lines to check.
     * @return All the intersection points.
     */
    public abstract ArrayList<Point> solve(Line[] lines);


    /**
     * Checks if two line segments intersect
     * 
     * @param l1
     * @param l2
     * @return The point where they intersect, null if they don't
     */
    public Point intersects(Line l1, Line l2)
    {
        Line vert, hor;
        if (l1.isVertical())
        {
            vert = l1;
            hor = l2;
        }
        else
        {
            hor = l1;
            vert = l2;
        }
        int vertX = vert.point1().x();
        int horY = hor.point1().y();
        boolean x = vertX >= hor.point1().x() && vertX <= hor.point2().x();
        boolean y = horY >= vert.point1().y() && horY <= vert.point2().y();
        if (x && y)
        {
            return new Point(vertX, horY);
        }
        return null;
    }
}
