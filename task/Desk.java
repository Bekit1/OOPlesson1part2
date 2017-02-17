package task;

import java.util.Arrays;
import java.util.Scanner;

public class Desk {
	private Shape[] parts = new Shape[4];

	public Desk(Shape[] parts) {
		super();
		this.parts = parts;
	}

	public Desk() {
		super();
	}

	public Shape[] getParts() {
		return parts;
	}

	public void setParts(Shape[] parts) {
		this.parts = parts;
	}

	public void inputShape(Shape shape) {
		Scanner sc = new Scanner(System.in);
		System.out.println("In which part of desk you wanna input your shape?");
		int part = sc.nextInt();
		parts[part - 1] = shape;

	}

	public void deleteShape(Shape shape) {
		for (int i = 0; i <= parts.length; i++) {
			if (parts[i] == shape) {
				parts[i] = null;
				break;
			}
		}

	}

	public void showInformation() {
		System.out.println("In part 1 are " + parts[0]);
		System.out.println();
		System.out.println("In part 2 are " + parts[1]);
		System.out.println();
		System.out.println("In part 3 are " + parts[2]);
		System.out.println();
		System.out.println("In part 4 are " + parts[3]);
		System.out.println();
		double s = 0;
		for (int i = 0; i < parts.length; i++) {
			if (parts[i] != null) {
				s = s + parts[i].calculateArea();
			}
		}
		System.out.println("Sum of squares of shapes on the desk is: "+s);
	}

	@Override
	public String toString() {
		return "Desk [parts=" + Arrays.toString(parts) + "" + "" + "]";
	}

}
