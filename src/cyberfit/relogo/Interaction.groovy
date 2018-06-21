package cyberfit.relogo

import static repast.simphony.relogo.Utility.*
import static repast.simphony.relogo.UtilityG.*

import cyberfit.ReLogoLink
import repast.simphony.relogo.Plural
import repast.simphony.relogo.Stop
import repast.simphony.relogo.Utility
import repast.simphony.relogo.UtilityG
import repast.simphony.relogo.schedule.Go
import repast.simphony.relogo.schedule.Setup

class Interaction extends ReLogoLink {
	def Type = InteractionTypes.FTI
	
	def Interaction() {
		Type = InteractionTypes.FTI
	}
}

enum InteractionTypes
{
	FTI(10), //force to terrain
	FFI(20), //force to force
	TTI(30)  //terrain to terrain
}