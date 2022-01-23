package forlenza.PARTICLES;

import forlenza.SUPPORT.Mineral;

public class B_Particle extends Particle{
	
	public static int BParticleCount = 0;
	
	public B_Particle(String retrievalCode) {
		this.setRetrievalCode(retrievalCode);
		this.setpDiameter(1.7);
		this.setpVolume(396);
		this.setpSurfaceArea(18);
		this.setpComposition(Mineral.TRITANIUM);
		this.setRefined(false);
		BParticleCount += 1;
	}



	public static int getBParticleCount() {
		return BParticleCount;
	}

	public static void setBParticleCount(int bParticleCount) {
		BParticleCount = bParticleCount;
	}



	@Override
	public double scatterlight() {
		double lightScatteringValue = (this.getpComposition().getStrength()) * Math.sqrt(10);
		return lightScatteringValue;
	}

}
