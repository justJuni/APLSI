import java.awt.Point;
import java.util.ArrayList;

/**
 * The brute force algorithm
 */
public class BruteForce extends SegmentIntersectionAlgorithm
{

    @Override
    public ArrayList<Point> solve(Line[] lines)
    {
        ArrayList<Point> answer = new ArrayList<Point>();
        for(int i = 0; i < lines.length; i++)
        {
            Line l1 = lines[i];
            for(int j = i + 1; j < lines.length; j++)
            {
                Line l2 = lines[j];
                if(l1.isVertical() ^ l2.isVertical())
                {
                    Point p = intersects(l1, l2);
                    if(p != null)
                    {
                        answer.add(p);
                    }
                }
            }
        }
        return answer;
    }

}
