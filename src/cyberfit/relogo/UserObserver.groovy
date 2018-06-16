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
		
		global_vulns = new Vulns().Items
		
		setDefaultShape(Machine,"box")
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

		if(typeEnvironment == "Tactical") {
			createMachines(1){ [setxy(0,-200), setColor(white())] }
		}
		else if (typeEnvironment == "Industrial") {
			createMachines(1){ [setxy(0,-200), setColor(yellow())] }
		}
		else {
			createMachines(1){ [setxy(0,-200), setColor(brown())] }
			createMachines(1){ [setxy(200,-200), setColor(brown())] }
			createMachines(1){ [setxy(400,-200), setColor(brown())] }
			createMachines(1){ [setxy(-200,-200), setColor(brown())] }
			createMachines(1){ [setxy(-400,-200), setColor(brown())] }
						
			createMachines(1){ [setxy(0,0), setColor(brown())] }
			createMachines(1){ [setxy(200,0), setColor(brown())] }
			createMachines(1){ [setxy(400,0), setColor(brown())] }
			createMachines(1){ [setxy(600,0), setColor(brown())] }
			createMachines(1){ [setxy(-200,0), setColor(brown())] }
			createMachines(1){ [setxy(-400,0), setColor(brown())] }
			createMachines(1){ [setxy(-600,0), setColor(brown())] }
			
			createMachines(1){ [setxy(0,200), setColor(brown())] }
			createMachines(1){ [setxy(200,200), setColor(brown())] }
			createMachines(1){ [setxy(400,200), setColor(brown())] }
			createMachines(1){ [setxy(-200,200), setColor(brown())] }
			createMachines(1){ [setxy(-400,200), setColor(brown())] }
		}
	}
		
	@Go
	def go(){
		
		ask(interactions()){
			die()
		}
		
		ask(attackers()){
			step()				
		}
		
		ask(defenders()){
			step()
		}
		
		ask(machines()){
			step()
		}
	}
}