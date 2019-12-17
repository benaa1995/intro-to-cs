
public class Room {

	String type;
	double area;

	public Room(String type, double area) {
		this.type = type;
		if (area > 0)
			this.area = area;
		else
			this.area = 0;
	}

	public Room(Room other) {
		this.area = other.area;
		this.type = other.type;
	}

	public String getType() {
		return type;
	}

	public double getArea() {
		return area;
	}

	public void setType(String name) {
		this.type = name;
	}

	public String toString() {
		return "Room type: " + type + ", Area: " + area;
	}
}
