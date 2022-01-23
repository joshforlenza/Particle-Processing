package forlenza.SUPPORT;

public class Location {
	private String name;
	private int X;
	private int Y;
	
	public Location(String name, int x, int y) {
		this.name = name;
		this.X = x;
		this.Y = y;
	}
	
	public double euclidiandistance(Location L) {
		double distance = Math.sqrt(Math.pow((L.X-this.X),2) + Math.pow((L.Y-this.Y),2));
		
		return distance;
	}
	
	public String toString() {
		String location = this.name + " " + this.X + "," + this.Y;
		
		return location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

}
