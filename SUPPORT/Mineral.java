package forlenza.SUPPORT;

public enum Mineral {
	DILITHIUM (40,140),
	TRITANIUM (80,180),
	UNAMIUM (90,280);
	
	private final double mass;
	private final double strength;
	
	private Mineral(double mass, double strength) {
		this.mass = mass;
		this.strength = strength;
	}

	public double getMass() {
		return mass;
	}

	public double getStrength() {
		return strength;
	}
	
	

}
