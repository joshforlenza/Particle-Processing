package forlenza.PARTICLES;

import forlenza.SUPPORT.Mineral;

public class A_Particle extends Particle {
	
	public static int AParticleCount = 0;
	
	public A_Particle(String retrievalCode) {
		this.setRetrievalCode(retrievalCode);
		this.setpDiameter(1.3);
		this.setpVolume(124);
		this.setpSurfaceArea(7);
		this.setpComposition(Mineral.DILITHIUM);
		this.setRefined(false);
		AParticleCount += 1;
	}



	public static int getAParticleCount() {
		return AParticleCount;
	}

	public static void setAParticleCount(int aParticleCount) {
		AParticleCount = aParticleCount;
	}



	@Override
	public double scatterlight() {
		double lightScatteringValue = (this.getpComposition().getStrength()) * Math.sqrt(10) * 0.28 * (this.getpComposition().getMass());
		return lightScatteringValue;
	}

}
