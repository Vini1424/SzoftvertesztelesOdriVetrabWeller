package detector;

public class Position {

	private int x;
	
	private int y;
	
	public Position()
	{
		x = 0;
		y = 0;
	}
	
	public Position(int x, int y)
	{
		setPosition(x,y);
	}
	
	public Position(double x, double y)
	{
		this.x = (int)x;
		this.y = (int)y;
	}
	
	public void setPosition(int x, int y)
	{
		setX(x);
		setY(y);
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
}
