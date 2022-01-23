package forlenza.PARTICLES;

import forlenza.PARTICLES.Scatterable;
import forlenza.SUPPORT.Mineral;

public abstract class Particle implements Scatterable {
	private String retrievalCode;
	private double pDiameter;
	private double pVolume;
	private double pSurfaceArea;
	private Mineral pComposition;
	private boolean isRefined;
	
	public static int particleCount = 0;
	
	public Particle() {
		
	}
	
	public Particle(String retrievalCode, double pDiameter, double pVolume, double pSurfaceArea, Mineral pComposition) {
		this.retrievalCode = retrievalCode;
		this.pDiameter = pDiameter;
		this.pVolume = pVolume;
		this.pSurfaceArea = pSurfaceArea;
		this.pComposition = pComposition;
		particleCount += 1;
	}
	
	public void displayParticleInfo(){
		System.out.println("Particle Retrieval Code: " + this.retrievalCode);
		System.out.println("Particle Diameter: " + this.pDiameter);
		System.out.println("Particle Volume: " + this.pVolume);
		System.out.println("Particle Surface Area: " + this.pSurfaceArea);
		System.out.println("Particle Composiiton: " + this.pComposition);
		if(this.isRefined==true) {
			System.out.println("Particle Is Refined");
		}
		else {
			System.out.println("Particle Is Not Refined");
		}
		System.out.println();
		
	}

	public String getRetrievalCode() {
		return retrievalCode;
	}

	public void setRetrievalCode(String retrievalCode) {
		this.retrievalCode = retrievalCode;
	}

	public double getpDiameter() {
		return pDiameter;
	}

	public void setpDiameter(double pDiameter) {
		this.pDiameter = pDiameter;
	}

	public double getpVolume() {
		return pVolume;
	}

	public void setpVolume(double pVolume) {
		this.pVolume = pVolume;
	}

	public double getpSurfaceArea() {
		return pSurfaceArea;
	}

	public void setpSurfaceArea(double pSurfaceArea) {
		this.pSurfaceArea = pSurfaceArea;
	}

	public Mineral getpComposition() {
		return pComposition;
	}

	public void setpComposition(Mineral pComposition) {
		this.pComposition = pComposition;
	}

	public boolean isRefined() {
		return isRefined;
	}

	public void setRefined(boolean isRefined) {
		this.isRefined = isRefined;
	}

	public static int getParticleCount() {
		return particleCount;
	}

	public static void setParticleCount(int particleCount) {
		Particle.particleCount = particleCount;
	}


}
