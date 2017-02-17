package task;

public class Quadrangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	private Point d;

	public Quadrangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Quadrangle() {
		super();
	}

	@Override
	double calculatePerimetr() {
		// TODO Auto-generated method stub
		double ab = Math
				.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY()));
		double bc = Math
				.sqrt((c.getX() - b.getX()) * (c.getX() - b.getX()) + (c.getY() - b.getY()) * (c.getY() - b.getY()));
		double ac = Math
				.sqrt((c.getX() - a.getX()) * (c.getX() - a.getX()) + (c.getY() - a.getY()) * (c.getY() - a.getY()));
		double cd = Math
				.sqrt((d.getX() - c.getX()) * (d.getX() - c.getX()) + (d.getY() - c.getY()) * (d.getY() - c.getY()));
		double p = ab + bc + ac + cd;
		return p;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		double ab = Math
				.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY()));
		double bc = Math
				.sqrt((c.getX() - b.getX()) * (c.getX() - b.getX()) + (c.getY() - b.getY()) * (c.getY() - b.getY()));
		double ac = Math
				.sqrt((c.getX() - a.getX()) * (c.getX() - a.getX()) + (c.getY() - a.getY()) * (c.getY() - a.getY()));
		double cd = Math
				.sqrt((d.getX() - c.getX()) * (d.getX() - c.getX()) + (d.getY() - c.getY()) * (d.getY() - c.getY()));
		double p = ab + bc + ac + cd;
		double per = p / 2;
		double s = Math.sqrt((per - ab) * (per - bc) * (per - cd) * (per - ac));
		return s;
	}

	@Override
	public String toString() {
		return "Quadrangle [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

}
