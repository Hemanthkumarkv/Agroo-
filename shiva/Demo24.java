class Demo24
{
double area()
	{
	double pi = 3.142;
	int    r = 2;
	double c = pi*r*r;
	return c;
	}
public static void main (String[]args)
	{
	double x = new Demo24().area();
	System.out.println(x);
	}
}