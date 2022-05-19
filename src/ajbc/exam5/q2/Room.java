package ajbc.exam5.q2;

public class Room {
	private double width;
	private double lenght;
	private boolean hasAC;
	
	public Room(double width, double lenght, boolean hasAC) {
		super();
		this.width = width;
		this.lenght = lenght;
		this.hasAC = hasAC;
	}
	
	@Override
	public String toString() {
		return "Room [width=" + width + ", lenght=" + lenght + ", hasAC=" + hasAC + "]";
	}

}
