package forlenza.REFINERY;

import java.util.ArrayList;

import forlenza.COLLECTOR.ParticleCollector;
import forlenza.PARTICLES.Particle;
import forlenza.SUPPORT.Location;

public class ParticleExtractor {

	private String extractorID;
	private Location extractorPOS;
	private ArrayList<Particle> extractorPool = new ArrayList<>();
	
	public static final int EXTRACTOR_CAPACITY = 500;
	
	public ParticleExtractor(String extractorID, Location extractorPOS) {
		this.extractorID = extractorID;
		this.extractorPOS = extractorPOS;
		this.extractorPool = extractorPool;
	}
	
	public boolean extractParticles(ParticleCollector pc) {
		if ((pc.getCollectorPool().size())+(this.extractorPool.size()) < EXTRACTOR_CAPACITY) {
			for (Particle p: pc.getCollectorPool()) {
				this.extractorPool.add(p);
			}
			return true;
		}
		else {
			System.out.println("Extractor Pool does not have sufficient capacity");
			return false;
		}
	}

	public String getExtractorID() {
		return extractorID;
	}

	public void setExtractorID(String extractorID) {
		this.extractorID = extractorID;
	}

	public Location getExtractorPOS() {
		return extractorPOS;
	}

	public void setExtractorPOS(Location extractorPOS) {
		this.extractorPOS = extractorPOS;
	}

	public ArrayList<Particle> getExtractorPool() {
		return extractorPool;
	}

	public void setExtractorPool(ArrayList<Particle> extractorPool) {
		this.extractorPool = extractorPool;
	}

	public static int getExtractorCapacity() {
		return EXTRACTOR_CAPACITY;
	}
	

}
