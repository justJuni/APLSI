//Andrew McMullen
public class LinePair {

	public Line line1;
	public Line line2;
	
	public LinePair(Line l1, Line l2)
	{
		line1 = l1;
		line2 = l2;
	}
	
	public static boolean isPair(Line l1, Line l2)
	{
		if(l1.isVertical && l2.isVertical)
		{
			return false;
		}
		if(!l1.isVertical && !l2.isVertical)
		{
			return false;
		}
		else
		{
			if(l2.isVertical)
			{
				if(l2.startX >= l1.startX && l2.startX <= l1.endX && l2.startY <= l1.startY && l2.endY >= l1.startY)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				if(l1.startX >= l2.startX && l1.startX <= l2.endX && l1.startY <= l2.startY && l1.endY <= l2.endY)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
	}
}
