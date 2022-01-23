package forlenza.PARTICLES;

import forlenza.SUPPORT.Mineral;

public class C_Particle extends Particle{
	
	public static int CParticleCount = 0;
	
	public C_Particle(String retrievalCode) {
		this.setRetrievalCode(retrievalCode);
		this.setpDiameter(2.1);
		this.setpVolume(518);
		this.setpSurfaceArea(24);
		this.setpComposition(Mineral.UNAMIUM);
		this.setRefined(false);
		CParticleCount += 1;
	}



	public static int getCParticleCount() {
		return CParticleCount;
	}

	public static void setCParticleCount(int cParticleCount) {
		CParticleCount = cParticleCount;
	}



	@Override
	public double scatterlight() {
		double lightScatteringValue = (this.getpComposition().getMass()) * 10;
		return lightScatteringValue;
	}

}
