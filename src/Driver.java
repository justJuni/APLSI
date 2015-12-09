

import java.awt.Point;
import java.util.ArrayList;

/**
 * The driver for the project
 */
public class Driver
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
    	long bruteStart;
		long bruteEnd;
		long smartStart;
		long smartEnd;
    	
        Line[] lines = LineGenerator.generateLines(10, 100);
        Line[] lines1 = LineGenerator.generateLines(100, 100);
        Line[] lines2 = LineGenerator.generateLines(500, 100);
        Line[] lines3 = LineGenerator.generateLines(1000, 100);
        Line[] lines4 = LineGenerator.generateLines(2000, 100);
        Line[] lines5 = LineGenerator.generateLines(10000, 100);
        Line[] lines6 = LineGenerator.generateLines(20000, 100);
        
        //10 lines
        bruteStart = System.nanoTime();
        ArrayList<Point> bruteAnswer = new BruteForce().solve(lines); 
		bruteEnd = System.nanoTime();
		System.out.println("Brute force ran in: " + (bruteEnd - bruteStart) + " nanoseconds for 10 lines");
   
		smartStart = System.nanoTime();
		ArrayList<Point> sweepAnswer = new SweepLine().solve(lines);
		smartEnd = System.nanoTime();
		System.out.println("Smart implementation ran in: " + (smartEnd - smartStart) + " nanoseconds for 10 lines");
       
		//100 lines
        bruteStart = System.nanoTime();
        ArrayList<Point> bruteAnswer1 = new BruteForce().solve(lines1); 
		bruteEnd = System.nanoTime();
		System.out.println("Brute force ran in: " + (bruteEnd - bruteStart) + " nanoseconds for 100 lines");
   
		smartStart = System.nanoTime();
		ArrayList<Point> sweepAnswer1 = new SweepLine().solve(lines1);
		smartEnd = System.nanoTime();
		System.out.println("Smart implementation ran in: " + (smartEnd - smartStart) + " nanoseconds for 100 lines");
		
		//500 lines
		bruteStart = System.nanoTime();
        ArrayList<Point> bruteAnswer2 = new BruteForce().solve(lines2); 
		bruteEnd = System.nanoTime();
		System.out.println("Brute force ran in: " + (bruteEnd - bruteStart) + " nanoseconds for 500 lines");
   
		smartStart = System.nanoTime();
		ArrayList<Point> sweepAnswer2 = new SweepLine().solve(lines2);
		smartEnd = System.nanoTime();
		System.out.println("Smart implementation ran in: " + (smartEnd - smartStart) + " nanoseconds for 500 lines");
		
		//1000 lines
		bruteStart = System.nanoTime();
        ArrayList<Point> bruteAnswer3 = new BruteForce().solve(lines3); 
		bruteEnd = System.nanoTime();
		System.out.println("Brute force ran in: " + (bruteEnd - bruteStart) + " nanoseconds for 1000 lines");
   
		smartStart = System.nanoTime();
		ArrayList<Point> sweepAnswer3 = new SweepLine().solve(lines3);
		smartEnd = System.nanoTime();
		System.out.println("Smart implementation ran in: " + (smartEnd - smartStart) + " nanoseconds for 1000 lines");
		
		//2000 lines
		bruteStart = System.nanoTime();
        ArrayList<Point> bruteAnswer4 = new BruteForce().solve(lines4); 
		bruteEnd = System.nanoTime();
		System.out.println("Brute force ran in: " + (bruteEnd - bruteStart) + " nanoseconds for 2000 lines");
   
		smartStart = System.nanoTime();
		ArrayList<Point> sweepAnswer4 = new SweepLine().solve(lines4);
		smartEnd = System.nanoTime();
		System.out.println("Smart implementation ran in: " + (smartEnd - smartStart) + " nanoseconds for 2000 lines");
		
		//10000 lines
		bruteStart = System.nanoTime();
        ArrayList<Point> bruteAnswer5 = new BruteForce().solve(lines5); 
		bruteEnd = System.nanoTime();
		System.out.println("Brute force ran in: " + (bruteEnd - bruteStart) + " nanoseconds for 10000 lines");
   
		smartStart = System.nanoTime();
		ArrayList<Point> sweepAnswer5 = new SweepLine().solve(lines5);
		smartEnd = System.nanoTime();
		System.out.println("Smart implementation ran in: " + (smartEnd - smartStart) + " nanoseconds for 10000 lines");
		
		//20000 lines
		bruteStart = System.nanoTime();
        ArrayList<Point> bruteAnswer6 = new BruteForce().solve(lines6); 
		bruteEnd = System.nanoTime();
		System.out.println("Brute force ran in: " + (bruteEnd - bruteStart) + " nanoseconds for 20000 lines");
   
		smartStart = System.nanoTime();
		ArrayList<Point> sweepAnswer6 = new SweepLine().solve(lines6);
		smartEnd = System.nanoTime();
		System.out.println("Smart implementation ran in: " + (smartEnd - smartStart) + " nanoseconds for 20000 lines");
    
    }
    
    private static void printPoint(Point p)
    {
        System.out.println("("+p.getX()+","+p.getY()+")");
    }

}
