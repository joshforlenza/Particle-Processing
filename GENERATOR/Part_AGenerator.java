package forlenza.GENERATOR;

import forlenza.PARTICLES.A_Particle;
import forlenza.PARTICLES.Particle;
import forlenza.SUPPORT.Location;

public class Part_AGenerator extends ParticleGenerator {
	public static final String PTYPE = "A_Particle";
	public static final int PCAPACITY = 100;
	public static int GENERATED_COUNT = 0;
	
	public Part_AGenerator(String pGeneratorID, Location pGeneratorPos) {
		super(pGeneratorID, pGeneratorPos);
	}

	@Override
	public Particle generateParticle() {
		GENERATED_COUNT += 1;
		A_Particle newAParticle = new A_Particle("A" + GENERATED_COUNT);
		return newAParticle;
	}
	

}
