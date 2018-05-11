package cyberfit.relogo

import static repast.simphony.relogo.Utility.*
import static repast.simphony.relogo.UtilityG.*

import cyberfit.ReLogoTurtle
import repast.simphony.relogo.Plural
import repast.simphony.relogo.Stop
import repast.simphony.relogo.Utility
import repast.simphony.relogo.UtilityG
import repast.simphony.relogo.ast.Diffusible
import repast.simphony.relogo.schedule.Go
import repast.simphony.relogo.schedule.Setup

class Machine extends UserTurtle {
	
	def status = 0
	def type = "server" //router|server|user
	def isCompromised = false
	def vulnerabilities = [] //array of vulnerability ids
	def missionsSupported = []
	
	def update(int s){
		this.status = s
		
		if(this.status != 0) {
			this.setColor(orange())
		} else {
			this.setColor(brown())
		}
		
	}
	
}
