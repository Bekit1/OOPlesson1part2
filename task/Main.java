package task;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(1, 10);
		Point b = new Point(4, 6);
		Point c = new Point(16, 8);
		Triangle tr = new Triangle(a, b, c);
		Shape tria = tr;

		Point d = new Point(1, 10);
		Point e = new Point(4, 6);
		Point f = new Point(16, 8);
		Point k = new Point(16, 28);
		Quadrangle qr = new Quadrangle(d, e, f, k);
		Shape quadr = qr;

		Point x1 = new Point(1, 10);
		Point x2 = new Point(5, 15);
		Circle cr = new Circle(x1, x2);
		Shape cl = cr;

		Desk desk = new Desk();
		desk.inputShape(tria);
		desk.inputShape(quadr);
		desk.inputShape(cr);
		desk.showInformation();

		desk.deleteShape(tria);
		desk.inputShape(tria);
		desk.showInformation();
	}

}
