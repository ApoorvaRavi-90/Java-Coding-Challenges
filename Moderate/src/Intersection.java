
public class Intersection {


class Point
{
	double x,y;
	public Point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	void setlocation(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
}
class Line
{
	double slope,yintercept;
	Line(Point start,Point  end)
	{
		double deltaX= end.x-start.x;
		double deltaY=end.y -start.y;
		slope =deltaY/deltaX;
		yintercept= end.y-slope*end.x;
	}
	
}
void swap(Point one,Point two)
{
	double x=one.x;
	double y=one.y;
	one.setlocation(two.x, two.y);
	two.setlocation(x, y);
}
Point intercetion(Point start1, Point end1, Point start2,Point end2)
{
	if(start1.x>end1.x)
	{
		swap(start1,end1);
	}
	if(start2.x>end2.x)
	{
		swap(start2,end2);
	}
	if(start1.x>start2.x)
	{
		swap(start1,start2);
		swap(end1,end2);
	}
	Line l1= new Line(start1, end1);
	Line l2=new Line(start2,end2);
	
	if(l1.slope ==l2.slope)//lines are paralell
	{
		if (l1.yintercept==l2.yintercept && isbetween(start1,start2,end1))
		{
			return start2;
		}
	    return null;
	}
	
	double x= (l2.yintercept-l1.yintercept)/(l1.slope-l2.slope);
	double y= x*l1.slope+l1.yintercept;
	Point intercet = new Point(x,y);
	if(isbetween(start1,intercet, end1)&& isbetween(start2,intercet, end2))
	{
		return intercet;
	}
	return null;
	
}
boolean isbetween(double start,double  middle, double end )
{
	if (start>end)
	{
		return middle<=start && middle>=end;
	}
	else
	{
		return middle>=start && middle <= end;
	}
}
boolean isbetween(Point start, Point middle, Point end)
{
	return isbetween(start.x,middle.x,end.x)&& isbetween(start.y,middle.y,end.y);
}
}

