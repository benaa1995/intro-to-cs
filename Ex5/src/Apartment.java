
public class Apartment {

	String family;
	int flat;
	Room firstRoom,secondRoom,thirdRoom;
	int numOfRooms;

	public Apartment(String name, int flat) {
		
		if (flat < 0)
			this.flat = 0;
		else
			this.flat = flat;
		this.family = name;
		numOfRooms = 0;
		firstRoom = null;
		secondRoom = null;
		thirdRoom = null;
	}

	public String getFamily() {
		return family;  
	}

	public int getFlat() {
		return flat; 
	}

	public Room getRoomByType(String type) {
		if (firstRoom != null && firstRoom.getType() == type)
			return new Room(firstRoom);
		if (secondRoom != null && secondRoom.getType() == type)
			return new Room(secondRoom);
		if (thirdRoom != null && thirdRoom.getType() == type)
			return new Room(thirdRoom);
		return null;
	}
	public void setRoom(Room r) {
		if (firstRoom == null) {
			firstRoom = new Room(r);
			numOfRooms++;
		}
		else if (secondRoom == null) {
			secondRoom = new Room(r);
			numOfRooms++;
		}
		else if (thirdRoom == null) {
			thirdRoom = new Room(r);
			numOfRooms++;
		}
	}

	public int getNumOfRooms() {
		return numOfRooms;
	}
	
	public double getTotalArea() {
		double sumArea = 0;
		if (firstRoom != null)
			sumArea += firstRoom.getArea();
		if (secondRoom != null)
			sumArea += secondRoom.getArea();
		if (thirdRoom != null)
			sumArea += thirdRoom.getArea();
		return sumArea;
	}
	
	public String toString() {
		return family + "'s apartment, flat " + flat + " has " + numOfRooms + " rooms"
				+ roomToString(firstRoom) + roomToString(secondRoom) + roomToString(thirdRoom); 
		
	}
	private static String roomToString(Room r) {
		if (r == null)
			return "";
		return "\n" + r.toString();
	}

}
		
 