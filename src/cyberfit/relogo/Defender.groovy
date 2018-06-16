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

class Defender extends Force {
	
	def setup() {
		this.type = "dco"
	}
	
	def step() {
		def x = new Random().nextInt(100) + 1
		if(x >= skill) {
			setColor(blue())
			
			def m = oneOf(machines())
			createInteractionTo(m)
			m.update(0)
		}
		else {
			setColor(scaleColor(green(), new Random().nextInt(255) + 1, 1, 255))
		}
	}
}
