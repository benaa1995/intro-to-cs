public class Linear {
	public double a;
	public double b;

	public Linear(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public Linear(Linear lin) {
		this.a = lin.a;
		this.b = lin.b;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public String toString() {
		if (a == 0)
			return "y =" + b;
		if (b == 0)
			return "y =" + a + "x";
		else
			return "y =" + a + "x" + b;

		// y = 0 (a = 0, b = 0)
		// y = 7 (a = 0, b = 7)
		// y = 4x (a = 4, b = 0)
		// y = 4x + 7 (a = 4, b = 7)
	}

	public double assign(double x) {
		double assign = (this.a * x) + this.b;
		return assign;
	}

	public double solve(double y) {
		double solve = (y - this.b) / this.a;
		return solve;
	}

	public double getIntersection(Linear other) {
		// (this)ax+b = other(ax+b)
		double x = (this.b - other.b) / (this.a - other.a);
		return x;
	}

	public boolean isOnLine(double x, double y) {
		if (y == this.a * x + this.b)
			return true;
		else
			return false;
	}

	public boolean areParallel(Linear other) {
		if (this.a == other.a)
			return true;
		else
			return false;
	}

	public Linear createLinear(double x1, double y1, double x2, double y2) {
		double incline = (y1 - y2) / (x1 - x2);
		double b = y1 - (incline * x1);
		Linear scan = new Linear(incline, b);
		return scan;
	
	}

}
