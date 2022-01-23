package forlenza.REFINERY;

import forlenza.PARTICLES.A_Particle;
import forlenza.PARTICLES.B_Particle;
import forlenza.PARTICLES.C_Particle;

public interface Refinable {
	public abstract A_Particle refineAParticle(A_Particle p);
	public abstract B_Particle refineBParticle(B_Particle p);
	public abstract C_Particle refineCParticle(C_Particle p);
}
