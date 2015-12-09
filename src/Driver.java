import java.awt.Point;
import java.util.ArrayList;

/**
 * The driver for the project
 * @author Julius Phu
 */
public class Driver
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Line[] lines = LineGenerator.generateLines(10, 50);
//        lines[0] = new Line(9,21, true);
//        lines[1] = new Line(12,8, true);
//        lines[2] = new Line(6,11, true);
//        lines[3] = new Line(20,1, true);
//        lines[4] = new Line(3,4, true);
//        lines[5] = new Line(9,20,false);
//        lines[6] = new Line(21,6,false);
//        lines[7] = new Line(12,24,false);
//        lines[8] = new Line(10,24,false);
//        lines[9] = new Line(20,16,false);
        for(Line l : lines)
        {
            System.out.println(l);
        }
        ArrayList<Point> bruteAnswer = new BruteForce().solve(lines);  
        System.out.print("Length: "+bruteAnswer.size()+"\n");
        for(Point p : bruteAnswer)
        {
            printPoint(p);
        }
        
        ArrayList<Point> sweepAnswer = new SweepLine().solve(lines);
        System.out.print("Length: "+sweepAnswer.size()+"\n");
        for(Point p : sweepAnswer)
        {
            printPoint(p);
        }
    }
    
    private static void printPoint(Point p)
    {
        System.out.println("("+p.getX()+","+p.getY()+")");
    }

}
