package forlenza.REFINERY;

import java.util.ArrayList;

import forlenza.PARTICLES.A_Particle;
import forlenza.PARTICLES.B_Particle;
import forlenza.PARTICLES.C_Particle;
import forlenza.PARTICLES.Particle;
import forlenza.SUPPORT.Location;
import forlenza.SUPPORT.Mineral;

public class ParticleRefiner implements Refinable{
	private String refinerID;
	private String refinerName;
	private Location refinerPos;
	private ArrayList<Particle> pStorage = new ArrayList<>();
	private ArrayList<A_Particle> Refined_AStorage = new ArrayList<>();
	private ArrayList<B_Particle> Refined_BStorage = new ArrayList<>();
	private ArrayList<C_Particle> Refined_CStorage = new ArrayList<>();
	
	public ParticleRefiner(String refinerID, String refinerName, Location refinerPos) {
		this.refinerID = refinerID;
		this.refinerName = refinerName;
		this.refinerPos = refinerPos;
		this.pStorage = pStorage;
		this.Refined_AStorage = Refined_AStorage;
		this.Refined_BStorage = Refined_BStorage;
		this.Refined_CStorage = Refined_CStorage;
	}

	@Override
	public A_Particle refineAParticle(A_Particle p) {
		p.setRefined(true);
		return p;
	}

	@Override
	public B_Particle refineBParticle(B_Particle p) {
		p.setRefined(true);
		return p;
	}

	@Override
	public C_Particle refineCParticle(C_Particle p) {
		p.setRefined(true);
		return p;
	}
	
	public boolean emptyExtractor(ParticleExtractor pe) {
		for (Particle p: pe.getExtractorPool()) {
			this.pStorage.add(p);
		}
		
		for (Particle p: this.pStorage) {
			if (p.getpComposition().equals(Mineral.DILITHIUM)) {
				refineAParticle((A_Particle) p);
				this.Refined_AStorage.add((A_Particle) p);
				
				
			}
			else if (p.getpComposition().equals(Mineral.TRITANIUM)) {
				refineBParticle((B_Particle) p);
				this.Refined_BStorage.add((B_Particle) p);
				
			}
			else if (p.getpComposition().equals(Mineral.UNAMIUM)) {
				refineCParticle((C_Particle) p);
				this.Refined_CStorage.add((C_Particle) p);
				
			}
		}
		
		return true;
	}
	
	public void sampleParticles(int count) {
		int counter = 0;
		for (Particle p: this.pStorage) {
			p.displayParticleInfo();
			counter += 1;
			if (counter>=count) {
				break;
			}
		}
	}
	
	public void displayInfo() {
		System.out.println("Particle Refiner ID: " + this.refinerID);
		System.out.println("Particle Refiner Name: " + this.refinerName);
		System.out.println("Particle Refiner Location: " + this.refinerPos.toString());
		System.out.println("Number of particles in Particle Refiner Storage: " + this.pStorage.size());
		System.out.println("Number of Refined A Particles: " + this.Refined_AStorage.size());
		System.out.println("Number of Refined B Particles: " + this.Refined_BStorage.size());
		System.out.println("Number of Refined C Particles: " + this.Refined_CStorage.size());
	}

	public String getRefinerID() {
		return refinerID;
	}

	public void setRefinerID(String refinerID) {
		this.refinerID = refinerID;
	}

	public String getRefinerName() {
		return refinerName;
	}

	public void setRefinerName(String refinerName) {
		this.refinerName = refinerName;
	}

	public Location getRefinerPos() {
		return refinerPos;
	}

	public void setRefinerPos(Location refinerPos) {
		this.refinerPos = refinerPos;
	}

	public ArrayList<Particle> getpStorage() {
		return pStorage;
	}

	public void setpStorage(ArrayList<Particle> pStorage) {
		this.pStorage = pStorage;
	}

	public ArrayList<A_Particle> getRefined_AStorage() {
		return Refined_AStorage;
	}

	public void setRefined_AStorage(ArrayList<A_Particle> refined_AStorage) {
		this.Refined_AStorage = refined_AStorage;
	}

	public ArrayList<B_Particle> getRefined_BStorage() {
		return Refined_BStorage;
	}

	public void setRefined_BStorage(ArrayList<B_Particle> refined_BStorage) {
		this.Refined_BStorage = refined_BStorage;
	}

	public ArrayList<C_Particle> getRefined_CStorage() {
		return Refined_CStorage;
	}

	public void setRefined_CStorage(ArrayList<C_Particle> refined_CStorage) {
		this.Refined_CStorage = refined_CStorage;
	}
	

}
