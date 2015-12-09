import java.awt.Point;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 * My sweep line algorithm.
 */
public class SweepLine
    extends SegmentIntersectionAlgorithm
{
    private PriorityQueue<EndPoint> eventQueue;
    private ArrayList<Point>        answer;


    @Override
    public ArrayList<Point> solve(Line[] lines)
    {
        answer = new ArrayList<Point>();
        createQueue(lines);            
        processQueue();
        return answer;
    }


    private void createQueue(Line[] lines)
    {
        int capacity = 3 * lines.length / 2;
        eventQueue =
            new PriorityQueue<EndPoint>(capacity, new HorizontalComparator());
        for (Line l : lines)
        {
            if (l.isVertical())
            {
                eventQueue.add(l.point1());
            }
            else
            {
                eventQueue.add(l.point1());
                eventQueue.add(l.point2());
            }
        }
//        while (!eventQueue.isEmpty())
//        {
//            System.out.println(eventQueue.poll());
//        }
    }


    private void processQueue()
    {
        TreeSet<Line> tree = new TreeSet<Line>(new VerticalComparator());
        while(!eventQueue.isEmpty())
        {
            EndPoint p = eventQueue.poll();
            if(!p.line().isVertical())
            {
                if(!p.isEnd())
                {
                    tree.add(p.line());
                }
                else
                {
                    tree.remove(p.line());
                }
            }
            else
            {
                Line l = p.line();
                Line lowerbound = new Line(0, l.point1().y(), false);
                Line upperbound = new Line(0, l.point2().y(), false);
                NavigableSet<Line> intersects = tree.subSet(lowerbound, true, upperbound, true);
                for(Line i : intersects)
                {
                    answer.add(new Point(l.point1().x(), i.point1().y()));
                }
            }
        }
    }


    private class VerticalComparator implements Comparator<Line>
    {
        @Override
        public int compare(Line l1, Line l2)
        {
            if(l1.point1().y() < l2.point1().y())
                return -1;
            if(l1.point1().y() > l2.point1().y())
                return 1;
            
            return -1;
            
        }
        
    }
    private class HorizontalComparator
        implements Comparator<EndPoint>
    {
        @Override
        public int compare(EndPoint p1, EndPoint p2)
        {
            if (p1.x() < p2.x())
                return -1;
            if (p1.x() > p2.x())
                return 1;
            if (!p1.line().isVertical())
            {
                if(!p1.isEnd())
                    return -1;
                return 1;
            }
            else
            {
                if(!p2.isEnd())
                    return 1;
                return -1;
            }            
        }
    }

}
