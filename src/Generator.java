import java.util.Random;

/**
 * class to generate lines
 */
public class Generator
{
    
    /**
     * Generates random line segments
     * @param n biggest coordinate
     * @param number how many lines you want to generate
     * @return The generated lines
     */
    public static Line[] generate(int n, int number)
    {
        Line[] lines = new Line[number];
        int vert = number / 2;
        int horiz = number / 2;
        int max = n - Line.LENGTH;
        Random rand = new Random();
        for(int k = 0; k < number; k++)
        {
        	//create the vertical lines
            if(vert == 0)
            {
                for(int j = 0; j < horiz; j++)
                {
                    lines[k + j] = new Line(rand.nextInt(max), rand.nextInt(max), false);
                }
                break;
            }
            //create the horizontal lines
            if(horiz == 0)
            {
                for(int j = 0; j < vert; j++)
                {
                    lines[k + j] = new Line(rand.nextInt(max), rand.nextInt(max), true);
                }
                break;
            }
            
            if(rand.nextInt(2) == 0)
            {
                vert--;
                lines[k] = new Line(rand.nextInt(max), rand.nextInt(max), true);
            }
            else
            {
                horiz--;
                lines[k] = new Line(rand.nextInt(max), rand.nextInt(max), false);
            }
        }
        return lines;
    }
}
