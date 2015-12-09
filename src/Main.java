import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		long bruteStart, bruteEnd, smartStart, smartEnd;
		
		ArrayList<Line> vert = Generator.generateVerticalLines(10), horiz = Generator.generateHorizontalLines(10);
		ArrayList<LinePair> bruteLines, smartLines;
		
		bruteStart = System.nanoTime();
		bruteLines = BruteForce.calculatePairs(10, vert, horiz);
		bruteEnd = System.nanoTime();
		System.out.println("Brute force ran in: " + (bruteEnd - bruteStart) + " nanoseconds for 20 elements");
		
		smartStart = System.nanoTime();
		//Run our code here.
		smartEnd = System.nanoTime();
		System.out.println("Smart implementation ran in: " + (smartEnd - smartStart) + " nanoseconds for 20 elements");
		
		
		vert = Generator.generateVerticalLines(100);
		horiz = Generator.generateHorizontalLines(100);
		
		bruteStart = System.nanoTime();
		bruteLines = BruteForce.calculatePairs(100, vert, horiz);
		bruteEnd = System.nanoTime();
		System.out.println("Brute force ran in: " + (bruteEnd - bruteStart) + " nanoseconds for 100 elements");
		
		smartStart = System.nanoTime();
		//Run our code here.
		smartEnd = System.nanoTime();
		System.out.println("Smart implementation ran in: " + (smartEnd - smartStart) + " nanoseconds for 100 elements");
		
		vert = Generator.generateVerticalLines(500);
		horiz = Generator.generateHorizontalLines(500);
		
		bruteStart = System.nanoTime();
		bruteLines = BruteForce.calculatePairs(500, vert, horiz);
		bruteEnd = System.nanoTime();
		System.out.println("Brute force ran in: " + (bruteEnd - bruteStart) + " nanoseconds for 500 elements");
		
		smartStart = System.nanoTime();
		//Run our code here.
		smartEnd = System.nanoTime();
		System.out.println("Smart implementation ran in: " + (smartEnd - smartStart) + " nanoseconds for 500 elements");
		
		vert = Generator.generateVerticalLines(1000);
		horiz = Generator.generateHorizontalLines(1000);
		
		bruteStart = System.nanoTime();
		bruteLines = BruteForce.calculatePairs(1000, vert, horiz);
		bruteEnd = System.nanoTime();
		System.out.println("Brute force ran in: " + (bruteEnd - bruteStart) + " nanoseconds for 1000 elements");
		
		smartStart = System.nanoTime();
		//Run our code here.
		smartEnd = System.nanoTime();
		System.out.println("Smart implementation ran in: " + (smartEnd - smartStart) + " nanoseconds for 1000 elements");
		
		vert = Generator.generateVerticalLines(2000);
		horiz = Generator.generateHorizontalLines(2000);
		
		bruteStart = System.nanoTime();
		bruteLines = BruteForce.calculatePairs(2000, vert, horiz);
		bruteEnd = System.nanoTime();
		System.out.println("Brute force ran in: " + (bruteEnd - bruteStart) + " nanoseconds for 2000 elements");
		
		smartStart = System.nanoTime();
		//Run our code here.
		smartEnd = System.nanoTime();
		System.out.println("Smart implementation ran in: " + (smartEnd - smartStart) + " nanoseconds for 2000 elements");
		
		vert = Generator.generateVerticalLines(10000);
		horiz = Generator.generateHorizontalLines(10000);
		
		bruteStart = System.nanoTime();
		bruteLines = BruteForce.calculatePairs(10000, vert, horiz);
		bruteEnd = System.nanoTime();
		System.out.println("Brute force ran in: " + (bruteEnd - bruteStart) + " nanoseconds for 10000 elements");
		
		smartStart = System.nanoTime();
		//Run our code here.
		smartEnd = System.nanoTime();
		System.out.println("Smart implementation ran in: " + (smartEnd - smartStart) + " nanoseconds for 10000 elements");
		
		vert = Generator.generateVerticalLines(20000);
		horiz = Generator.generateHorizontalLines(20000);
		
		bruteStart = System.nanoTime();
		bruteLines = BruteForce.calculatePairs(20000, vert, horiz);
		bruteEnd = System.nanoTime();
		System.out.println("Brute force ran in: " + (bruteEnd - bruteStart) + " nanoseconds for 20000 elements");
		
		smartStart = System.nanoTime();
		//Run our code here.
		smartEnd = System.nanoTime();
		System.out.println("Smart implementation ran in: " + (smartEnd - smartStart) + " nanoseconds for 20000 elements");	
	}
}
