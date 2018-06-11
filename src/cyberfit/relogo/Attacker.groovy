package cyberfit.relogo

import static repast.simphony.relogo.Utility.*
import static repast.simphony.relogo.UtilityG.*

import cyberfit.ReLogoTurtle
import repast.simphony.relogo.Plural
import repast.simphony.relogo.Stop
import repast.simphony.relogo.Utility
import repast.simphony.relogo.UtilityG
import repast.simphony.relogo.schedule.Go
import repast.simphony.relogo.schedule.Setup

class Attacker extends UserTurtle {

	def tier = 1 // 1 - 6 based on DSB
	def phase = 0 //1-7
	def attacks = [] //array of Attacks
	
	def setup(){
		// this.attacks.add(new Attack {id=1,name="Phishing")
		//Random.CreateUniform();
		skill = new Random().nextInt(100) + 1
	}

	def step() {
		def x = new Random().nextInt(100) + 1
		if(x >= skill) {
			setColor(blue())

			def m = oneOf(machines())
			createConnectionTo(m)
			m.update(1)
		}
		else {
			setColor(scaleColor(pink(), new Random().nextInt(255) + 1, 1, 255))
		}
	}
}
