package cyberfit.relogo

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import repast.simphony.relogo.Stop;
import repast.simphony.relogo.Utility;
import repast.simphony.relogo.UtilityG;
import repast.simphony.relogo.schedule.Go;
import repast.simphony.relogo.schedule.Setup;
import cyberfit.ReLogoObserver;

class UserObserver extends ReLogoObserver {

	static def global_vulns = []
	
	@Setup
	def setup(){
		clearAll()
		
		print "starttt"
		
		global_vulns = new Vulns().Items
		
		setDefaultShape(Terrain,"box")
		setDefaultShape(Attacker,"person")
		setDefaultShape(Defender,"person")
		
		def i = 0
		def direction = 1
		
		createAttackers(numAttackers){
			if(direction == 1) {
				i = i + 5
				if(i > 1000) {
					direction = 0
					i = 0
				}
			} else {
				i = i - 5
				if(i < -1000) {
					direction = 1
					i = 2
				}
			}
			[
				setxy(i,-1000),
				setColor(pink())
			]
		}
		
		i = 0
		direction = 1
		
		print direction
		
		createDefenders(numDefenders){
			if(direction == 1) {
				i = i + 5
				if(i > 1000) {
					direction = 0
					i = 0
				}
			} else {
				i = i - 5
				if(i < -1000) {
					direction = 1
					i = 2
				}
			}
			[
				setxy(i,1000),
				setColor(green())
			]
		}

			createTerrains(1){ [setxy(0,-200), setColor(brown())] }
			createTerrains(1){ [setxy(200,-200), setColor(brown())] }
			createTerrains(1){ [setxy(400,-200), setColor(brown())] }
			createTerrains(1){ [setxy(-200,-200), setColor(brown())] }
			createTerrains(1){ [setxy(-400,-200), setColor(brown())] }
						
	}
		
	@Go
	def go(){
		
		ask(interactions()){
			die()
		}
		ask(terrains()){
			step()
		}
		ask(attackers()){
			step()				
		}
		ask(defenders()){
			step()
		}
		
	}

	def loadBaseTerrain() {
		def i = 0
		
		//Load the basic cyber terrain that provides minimal connectivity in an austere location
		
		//load type 1: 10 routing systems
		while(i < 10) {
			Terrain t1 = new Terrain()
			t1.setColor(green())
			t1.availability = 1
			t1.confidentiality = 1
			t1.integrity = 1
			t1.isCompromised = false
			i++
		}
		
		//load type 2: 20 server systems
		
		//load type 3: 40 user systems
	}
}

