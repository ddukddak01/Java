class Circle
{
	int r;
	public Circle(int r)
	{
		this.r=r;
		
	}
	public double getArea()
	{
		return r*r*3.14;
	}	
}
public class D2 {

	public static void main(String[] args) {
		Circle[] c= new Circle[5];
		for (int i=0; i<c.length;i++)
		{
			c[i]=new Circle(i);
	
		}
		for(Circle obj : c)	
			System.out.println(obj.getArea());
	}

}