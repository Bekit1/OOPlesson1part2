package task;

public class Circle extends Shape {
	private Point x;
	private Point y;

	public Circle(Point x, Point y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Circle() {
		super();
	}

	public Point getX() {
		return x;
	}

	public void setX(Point x) {
		this.x = x;
	}

	public Point getY() {
		return y;
	}

	public void setY(Point y) {
		this.y = y;
	}

	@Override
	double calculatePerimetr() {
		// TODO Auto-generated method stub
		double ab = Math
				.sqrt((x.getX() - y.getX()) * (x.getX() - y.getX()) + (x.getY() - y.getY()) * (x.getY() - y.getY()));
		double p = 2 * ab * Math.PI;
		return p;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		double ab = Math
				.sqrt((x.getX() - y.getX()) * (x.getX() - y.getX()) + (x.getY() - y.getY()) * (x.getY() - y.getY()));
		double s = ab * ab * Math.PI;
		return s;
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + "]";
	}

}
