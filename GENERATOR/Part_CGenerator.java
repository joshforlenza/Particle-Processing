package forlenza.GENERATOR;

import forlenza.PARTICLES.C_Particle;
import forlenza.PARTICLES.Particle;
import forlenza.SUPPORT.Location;

public class Part_CGenerator extends ParticleGenerator{
	public static final String PTYPE = "C_Particle";
	public static final int PCAPACITY = 210;
	public static int GENERATED_COUNT = 0;
	
	public Part_CGenerator(String pGeneratorID, Location pGeneratorPos) {
		super(pGeneratorID, pGeneratorPos);
	}

	@Override
	public Particle generateParticle() {
		GENERATED_COUNT += 1;
		C_Particle newAParticle = new C_Particle("C" + GENERATED_COUNT);
		return newAParticle;
	}

}
