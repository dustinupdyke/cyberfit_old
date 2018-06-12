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

class Terrain extends UserTurtle {

	def status = 0
	def type = 1 //1 - routing, 2 - server, 3 - user
	def isCompromised = false
	def vulns = [] //array of vulnerability ids
	def missionsSupported = []
	def confidentiality = -1
	def integrity = 	-1
	def availability = -1
	
	def setup() {
	
		System.out.println("Happiness Changed");
		loadBaseTerrain()
	
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
	
	def update(int s){
		this.status = s

		if(this.status != 0) {
			this.setColor(orange())
		} else {
			this.setColor(brown())
		}
	}
	
	def getVulns() {
		def o = []
		for(item in this.vulns) {
			o.add(item.name)
		}
		return o
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