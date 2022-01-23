package forlenza.GENERATOR;

import forlenza.PARTICLES.B_Particle;
import forlenza.PARTICLES.Particle;
import forlenza.SUPPORT.Location;

public class Part_BGenerator extends ParticleGenerator{
	public static final String PTYPE = "B_Particle";
	public static final int PCAPACITY = 180;
	public static int GENERATED_COUNT = 0;
	
	public Part_BGenerator(String pGeneratorID, Location pGeneratorPos) {
		super(pGeneratorID, pGeneratorPos);
	}

	@Override
	public Particle generateParticle() {
		GENERATED_COUNT += 1;
		B_Particle newAParticle = new B_Particle("B" + GENERATED_COUNT);
		return newAParticle;
	}

}
