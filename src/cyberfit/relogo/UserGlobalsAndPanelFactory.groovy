package cyberfit.relogo

import repast.simphony.relogo.factories.AbstractReLogoGlobalsAndPanelFactory

public class UserGlobalsAndPanelFactory extends AbstractReLogoGlobalsAndPanelFactory{
	public void addGlobalsAndPanelComponents(){
		
		addSliderWL("numAttackers", "Number of Attackers", 1, 1, 5000, 1)
		addSliderWL("numDefenders", "Number of Defenders", 1, 1, 5000, 5)
		addChooserWL("team1Deploy", "CPT 1 Deployment", ["N","T","M1","M2","M3","M4","M5","M6","M7","M8","M9"], 0)
	}
}