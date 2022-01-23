package forlenza.MAIN;

import forlenza.COLLECTOR.ParticleCollector;
import forlenza.GENERATOR.Part_AGenerator;
import forlenza.GENERATOR.Part_BGenerator;
import forlenza.GENERATOR.Part_CGenerator;
import forlenza.REFINERY.ParticleExtractor;
import forlenza.REFINERY.ParticleRefiner;
import forlenza.SUPPORT.Location;

public class ParticleProcessing {
	
	public static void processParticles() {
		Part_AGenerator aGen = new Part_AGenerator("AGEN-1",new Location("Alpha",10,10));
		Part_BGenerator bGen = new Part_BGenerator("BGEN-1",new Location("Beta",30,20));
		Part_CGenerator cGen = new Part_CGenerator("CGEN-1",new Location("Gamma",50,30));
		ParticleCollector pCol = new ParticleCollector("PCOLLECT", new Location("Lambda",70,40));
		ParticleExtractor pExt = new ParticleExtractor("PECTRACT", new Location("Sigma",90,50));
		ParticleRefiner pRef = new ParticleRefiner("PREFINE", "PX", new Location("Tau",120,60));
		for(int i = 0; i < 10; i++) {
			pCol.collectParticle(aGen.generateParticle());
			pCol.collectParticle(bGen.generateParticle());
			pCol.collectParticle(cGen.generateParticle());
		}
		pExt.extractParticles(pCol);
		pRef.emptyExtractor(pExt);
		pRef.displayInfo();
		System.out.println();
		pRef.sampleParticles(3);
	}
	
	public static void main(String[] args) {
		processParticles();
	}
	

}


