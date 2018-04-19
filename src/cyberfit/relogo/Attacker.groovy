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

class Attacker extends ReLogoTurtle {
	
	def skill = (random(50)*2)
	
	def step() {
		def x = random(100)
		if(x >= skill) {
			setColor(blue())
			
			def m = oneOf(machines())
			createConnectionTo(m)
			m.update(1)
		}
		else {
			setColor(scaleColor(pink(), random(255), 1, 255))
		}
	}
}
