package forlenza.COLLECTOR;

import java.util.ArrayList;

import forlenza.PARTICLES.Particle;
import forlenza.SUPPORT.Location;

public class ParticleCollector {
	private String collectorID;
	private Location collectorPOS;
	private ArrayList<Particle> collectorPool = new ArrayList<>();
	
	public static final int COLLECTOR_CAPACTIY = 500;
	
	public ParticleCollector(String collectorID, Location collectorPOS) {
		this.collectorID = collectorID;
		this.collectorPOS = collectorPOS;
		this.collectorPool = collectorPool;
	}
	
	public boolean collectParticle(Particle p) {
		if (this.collectorPool.size()<COLLECTOR_CAPACTIY) {
			this.collectorPool.add(p);
			return true;
		}
		else {
			return false;
		}
		
	}

	public String getCollectorID() {
		return collectorID;
	}

	public void setCollectorID(String collectorID) {
		this.collectorID = collectorID;
	}

	public Location getCollectorPOS() {
		return collectorPOS;
	}

	public void setCollectorPOS(Location collectorPOS) {
		this.collectorPOS = collectorPOS;
	}

	public ArrayList<Particle> getCollectorPool() {
		return collectorPool;
	}

	public void setCollectorPool(ArrayList<Particle> collectorPool) {
		this.collectorPool = collectorPool;
	}
	
	

}
