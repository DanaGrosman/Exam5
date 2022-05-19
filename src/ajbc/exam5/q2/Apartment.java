package ajbc.exam5.q2;

import java.util.Arrays;

public class Apartment {
	private Address address;
	private Room[] rooms;
	private boolean hasYard;
	private boolean hasBasement;
	private double area;

	public Apartment(Address address, Room[] rooms, boolean hasYard, boolean hasBasement, double area) {
		super();
		this.address = address;
		this.rooms = rooms;
		this.hasYard = hasYard;
		this.hasBasement = hasBasement;
		this.area = area;
	}

	@Override
	public String toString() {
		return "Apartment [address=" + address + ", rooms=" + Arrays.toString(rooms) + ", hasYard=" + hasYard
				+ ", hasBasement=" + hasBasement + ", area=" + area + "]";
	}

}
