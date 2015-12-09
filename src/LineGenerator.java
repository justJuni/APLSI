import java.util.Random;

/**
 * Generates lines
 */
public class LineGenerator
{
    
    /**
     * Generates random line segments
     * @param numLines The number of lines to generate
     * @param m The max coordinate
     * @return The generated lines
     */
    public static Line[] generateLines(int numLines, int m)
    {
        int max = m - Line.LENGTH;
        Line[] lines = new Line[numLines];
        Random r = new Random();
        int numVert = numLines / 2;
        int numHor = numLines / 2;
        for(int i = 0; i < numLines; i++)
        {
            if(numVert == 0)
            {
                for(int j = 0; j < numHor; j++)
                {
                    lines[i + j] = new Line(r.nextInt(max), r.nextInt(max), false);
                }
                break;
            }
            if(numHor == 0)
            {
                for(int j = 0; j < numVert; j++)
                {
                    lines[i + j] = new Line(r.nextInt(max), r.nextInt(max), true);
                }
                break;
            }
            
            if(r.nextInt(2) == 0)
            {
                numVert--;
                lines[i] = new Line(r.nextInt(max), r.nextInt(max), true);
            }
            else
            {
                numHor--;
                lines[i] = new Line(r.nextInt(max), r.nextInt(max), false);
            }
        }
        return lines;
    }
}
