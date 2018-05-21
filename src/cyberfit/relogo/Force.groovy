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

class Force extends UserTurtle {

	def type = "oco" //or dco
	def subType = "" //nationState|hacktivist|other
	def specialty = ""
	def experienceYrs = 0
	def rank = "e9" //e1 to e9
	def csa = [0,0] //cyber Situational Awareness 2d graph array   terrainid|confidentiality|integrity|availability 
	def missionId = 0
	def skill = 0
	def phase = 0 //1-7 
	def attacks = [] //array of Attack
	
	def setup(){
		// this.attacks.add(new Attack {id=1,name="Phishing")
		//Random.CreateUniform();
		skill = new Random().nextInt(100) + 1
	}
	
	def step() {
		
	}
}
