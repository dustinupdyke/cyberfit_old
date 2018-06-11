package cyberfit.relogo

import repast.simphony.relogo.factories.AbstractReLogoGlobalsAndPanelFactory

public class UserGlobalsAndPanelFactory extends AbstractReLogoGlobalsAndPanelFactory{
	public void addGlobalsAndPanelComponents(){
		
		addSliderWL("numAttackers", "Number of Attackers", 1, 1, 5000, 1)
		addSliderWL("numDefenders", "Number of Defenders", 1, 1, 5000, 5)
		addButtonWL("test b", 0)
		addChooserWL("typeEnvironment", "Environment", ["Base","Tactical","Industrial"], 0)
	}
}