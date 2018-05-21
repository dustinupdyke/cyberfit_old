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
	def vulns = [] //array of vulnerability ids
	def missionsSupported = []
	
	def confidentiality = -1
	def integrity = 	-1
	def availability = -1

	def update(int s){
		this.status = s

		if(this.status != 0) {
			this.setColor(orange())
		} else {
			this.setColor(brown())
		}
	}
	
	def step() {
		//is there a new vuln this machine should expose?
		def r = new Random()
		def x = r.nextInt(100) + 1
		if(x >= 90) {
			if(UserObserver.global_vulns != null) {
				this.vulns.add(UserObserver.global_vulns[r.nextInt(UserObserver.global_vulns.size())])
			}
		}
	}
	
	def getVulns() {
		def o = []
		for(item in this.vulns) {
			o.add(item.name)
		}
		return o
	}
}