package cyberfit;

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import groovy.lang.Closure;
import repast.simphony.relogo.*;
import repast.simphony.relogo.builder.GeneratedByReLogoBuilder;
import repast.simphony.relogo.builder.ReLogoBuilderGeneratedFor;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoLink<T> extends BaseLink<T>	{

	/**
	 * Returns an agentset of attackers on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of attackers on patch p
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Attacker")
	public AgentSet<cyberfit.relogo.Attacker> attackersOn(Patch p){
		AgentSet<cyberfit.relogo.Attacker> result = new AgentSet<cyberfit.relogo.Attacker>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"attacker")){
			if (t instanceof cyberfit.relogo.Attacker)
			result.add((cyberfit.relogo.Attacker)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of attackers on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of attackers on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Attacker")
	public AgentSet<cyberfit.relogo.Attacker> attackersOn(Turtle t){
		AgentSet<cyberfit.relogo.Attacker> result = new AgentSet<cyberfit.relogo.Attacker>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"attacker")){
			if (tt instanceof cyberfit.relogo.Attacker)
			result.add((cyberfit.relogo.Attacker)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of attackers on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of attackers on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Attacker")
	public AgentSet<cyberfit.relogo.Attacker> attackersOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<cyberfit.relogo.Attacker>();
		}

		Set<cyberfit.relogo.Attacker> total = new HashSet<cyberfit.relogo.Attacker>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(attackersOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(attackersOn(p));
				}
			}
		}
		return new AgentSet<cyberfit.relogo.Attacker>(total);
	}

	/**
	 * Queries if object is a attacker.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a attacker
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Attacker")
	public boolean isAttackerQ(Object o){
		return (o instanceof cyberfit.relogo.Attacker);
	}

	/**
	 * Returns the attacker with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Attacker")
	public cyberfit.relogo.Attacker attacker(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof cyberfit.relogo.Attacker)
			return (cyberfit.relogo.Attacker) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all attackers.
	 * 
	 * @return agentset of all attackers
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Attacker")
	public AgentSet<cyberfit.relogo.Attacker> attackers(){
		AgentSet<cyberfit.relogo.Attacker> a = new AgentSet<cyberfit.relogo.Attacker>();
		for (Object e : this.getMyObserver().getContext().getObjects(cyberfit.relogo.Attacker.class)) {
			if (e instanceof cyberfit.relogo.Attacker){
				a.add((cyberfit.relogo.Attacker)e);
			}
		}
		return a;
	}

	/**
	 * Returns an agentset of defenders on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of defenders on patch p
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Defender")
	public AgentSet<cyberfit.relogo.Defender> defendersOn(Patch p){
		AgentSet<cyberfit.relogo.Defender> result = new AgentSet<cyberfit.relogo.Defender>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"defender")){
			if (t instanceof cyberfit.relogo.Defender)
			result.add((cyberfit.relogo.Defender)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of defenders on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of defenders on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Defender")
	public AgentSet<cyberfit.relogo.Defender> defendersOn(Turtle t){
		AgentSet<cyberfit.relogo.Defender> result = new AgentSet<cyberfit.relogo.Defender>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"defender")){
			if (tt instanceof cyberfit.relogo.Defender)
			result.add((cyberfit.relogo.Defender)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of defenders on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of defenders on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Defender")
	public AgentSet<cyberfit.relogo.Defender> defendersOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<cyberfit.relogo.Defender>();
		}

		Set<cyberfit.relogo.Defender> total = new HashSet<cyberfit.relogo.Defender>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(defendersOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(defendersOn(p));
				}
			}
		}
		return new AgentSet<cyberfit.relogo.Defender>(total);
	}

	/**
	 * Queries if object is a defender.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a defender
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Defender")
	public boolean isDefenderQ(Object o){
		return (o instanceof cyberfit.relogo.Defender);
	}

	/**
	 * Returns the defender with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Defender")
	public cyberfit.relogo.Defender defender(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof cyberfit.relogo.Defender)
			return (cyberfit.relogo.Defender) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all defenders.
	 * 
	 * @return agentset of all defenders
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Defender")
	public AgentSet<cyberfit.relogo.Defender> defenders(){
		AgentSet<cyberfit.relogo.Defender> a = new AgentSet<cyberfit.relogo.Defender>();
		for (Object e : this.getMyObserver().getContext().getObjects(cyberfit.relogo.Defender.class)) {
			if (e instanceof cyberfit.relogo.Defender){
				a.add((cyberfit.relogo.Defender)e);
			}
		}
		return a;
	}

	/**
	 * Returns an agentset of forces on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of forces on patch p
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Force")
	public AgentSet<cyberfit.relogo.Force> forcesOn(Patch p){
		AgentSet<cyberfit.relogo.Force> result = new AgentSet<cyberfit.relogo.Force>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"force")){
			if (t instanceof cyberfit.relogo.Force)
			result.add((cyberfit.relogo.Force)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of forces on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of forces on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Force")
	public AgentSet<cyberfit.relogo.Force> forcesOn(Turtle t){
		AgentSet<cyberfit.relogo.Force> result = new AgentSet<cyberfit.relogo.Force>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"force")){
			if (tt instanceof cyberfit.relogo.Force)
			result.add((cyberfit.relogo.Force)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of forces on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of forces on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Force")
	public AgentSet<cyberfit.relogo.Force> forcesOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<cyberfit.relogo.Force>();
		}

		Set<cyberfit.relogo.Force> total = new HashSet<cyberfit.relogo.Force>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(forcesOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(forcesOn(p));
				}
			}
		}
		return new AgentSet<cyberfit.relogo.Force>(total);
	}

	/**
	 * Queries if object is a force.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a force
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Force")
	public boolean isForceQ(Object o){
		return (o instanceof cyberfit.relogo.Force);
	}

	/**
	 * Returns the force with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Force")
	public cyberfit.relogo.Force force(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof cyberfit.relogo.Force)
			return (cyberfit.relogo.Force) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all forces.
	 * 
	 * @return agentset of all forces
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Force")
	public AgentSet<cyberfit.relogo.Force> forces(){
		AgentSet<cyberfit.relogo.Force> a = new AgentSet<cyberfit.relogo.Force>();
		for (Object e : this.getMyObserver().getContext().getObjects(cyberfit.relogo.Force.class)) {
			if (e instanceof cyberfit.relogo.Force){
				a.add((cyberfit.relogo.Force)e);
			}
		}
		return a;
	}

	/**
	 * Returns an agentset of machines on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of machines on patch p
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Machine")
	public AgentSet<cyberfit.relogo.Machine> machinesOn(Patch p){
		AgentSet<cyberfit.relogo.Machine> result = new AgentSet<cyberfit.relogo.Machine>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"machine")){
			if (t instanceof cyberfit.relogo.Machine)
			result.add((cyberfit.relogo.Machine)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of machines on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of machines on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Machine")
	public AgentSet<cyberfit.relogo.Machine> machinesOn(Turtle t){
		AgentSet<cyberfit.relogo.Machine> result = new AgentSet<cyberfit.relogo.Machine>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"machine")){
			if (tt instanceof cyberfit.relogo.Machine)
			result.add((cyberfit.relogo.Machine)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of machines on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of machines on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Machine")
	public AgentSet<cyberfit.relogo.Machine> machinesOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<cyberfit.relogo.Machine>();
		}

		Set<cyberfit.relogo.Machine> total = new HashSet<cyberfit.relogo.Machine>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(machinesOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(machinesOn(p));
				}
			}
		}
		return new AgentSet<cyberfit.relogo.Machine>(total);
	}

	/**
	 * Queries if object is a machine.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a machine
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Machine")
	public boolean isMachineQ(Object o){
		return (o instanceof cyberfit.relogo.Machine);
	}

	/**
	 * Returns the machine with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Machine")
	public cyberfit.relogo.Machine machine(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof cyberfit.relogo.Machine)
			return (cyberfit.relogo.Machine) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all machines.
	 * 
	 * @return agentset of all machines
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Machine")
	public AgentSet<cyberfit.relogo.Machine> machines(){
		AgentSet<cyberfit.relogo.Machine> a = new AgentSet<cyberfit.relogo.Machine>();
		for (Object e : this.getMyObserver().getContext().getObjects(cyberfit.relogo.Machine.class)) {
			if (e instanceof cyberfit.relogo.Machine){
				a.add((cyberfit.relogo.Machine)e);
			}
		}
		return a;
	}

	/**
	 * Returns an agentset of userTurtles on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of userTurtles on patch p
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserTurtle")
	public AgentSet<cyberfit.relogo.UserTurtle> userTurtlesOn(Patch p){
		AgentSet<cyberfit.relogo.UserTurtle> result = new AgentSet<cyberfit.relogo.UserTurtle>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"userTurtle")){
			if (t instanceof cyberfit.relogo.UserTurtle)
			result.add((cyberfit.relogo.UserTurtle)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of userTurtles on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserTurtle")
	public AgentSet<cyberfit.relogo.UserTurtle> userTurtlesOn(Turtle t){
		AgentSet<cyberfit.relogo.UserTurtle> result = new AgentSet<cyberfit.relogo.UserTurtle>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"userTurtle")){
			if (tt instanceof cyberfit.relogo.UserTurtle)
			result.add((cyberfit.relogo.UserTurtle)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of userTurtles on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserTurtle")
	public AgentSet<cyberfit.relogo.UserTurtle> userTurtlesOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<cyberfit.relogo.UserTurtle>();
		}

		Set<cyberfit.relogo.UserTurtle> total = new HashSet<cyberfit.relogo.UserTurtle>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(userTurtlesOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(userTurtlesOn(p));
				}
			}
		}
		return new AgentSet<cyberfit.relogo.UserTurtle>(total);
	}

	/**
	 * Queries if object is a userTurtle.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userTurtle
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserTurtle")
	public boolean isUserTurtleQ(Object o){
		return (o instanceof cyberfit.relogo.UserTurtle);
	}

	/**
	 * Returns the userTurtle with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserTurtle")
	public cyberfit.relogo.UserTurtle userTurtle(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof cyberfit.relogo.UserTurtle)
			return (cyberfit.relogo.UserTurtle) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all userTurtles.
	 * 
	 * @return agentset of all userTurtles
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserTurtle")
	public AgentSet<cyberfit.relogo.UserTurtle> userTurtles(){
		AgentSet<cyberfit.relogo.UserTurtle> a = new AgentSet<cyberfit.relogo.UserTurtle>();
		for (Object e : this.getMyObserver().getContext().getObjects(cyberfit.relogo.UserTurtle.class)) {
			if (e instanceof cyberfit.relogo.UserTurtle){
				a.add((cyberfit.relogo.UserTurtle)e);
			}
		}
		return a;
	}

	/**
	 * Queries if object is a connection.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a connection
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public boolean isConnectionQ(Object o){
		return (o instanceof cyberfit.relogo.Connection);
	}

	/**
	 * Returns an agentset containing all connections.
	 * 
	 * @return agentset of all connections
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public AgentSet<cyberfit.relogo.Connection> connections(){
		AgentSet<cyberfit.relogo.Connection> a = new AgentSet<cyberfit.relogo.Connection>();
		for (Object e : this.getMyObserver().getContext().getObjects(cyberfit.relogo.Connection.class)) {
			if (e instanceof cyberfit.relogo.Connection){
				a.add((cyberfit.relogo.Connection)e);
			}
		}
		return a;
	}

	/**
	 * Returns the connection between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return connection between two turtles
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public cyberfit.relogo.Connection connection(Number oneEnd, Number otherEnd) {
		return (cyberfit.relogo.Connection)(this.getMyObserver().getNetwork("Connection").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the connection between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return connection between two turtles
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public cyberfit.relogo.Connection connection(Turtle oneEnd, Turtle otherEnd) {
		return connection(oneEnd.getWho(), otherEnd.getWho());
	}

	/**
	 * Queries if object is a interaction.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a interaction
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Interaction")
	public boolean isInteractionQ(Object o){
		return (o instanceof cyberfit.relogo.Interaction);
	}

	/**
	 * Returns an agentset containing all interactions.
	 * 
	 * @return agentset of all interactions
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Interaction")
	public AgentSet<cyberfit.relogo.Interaction> interactions(){
		AgentSet<cyberfit.relogo.Interaction> a = new AgentSet<cyberfit.relogo.Interaction>();
		for (Object e : this.getMyObserver().getContext().getObjects(cyberfit.relogo.Interaction.class)) {
			if (e instanceof cyberfit.relogo.Interaction){
				a.add((cyberfit.relogo.Interaction)e);
			}
		}
		return a;
	}

	/**
	 * Returns the interaction between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return interaction between two turtles
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Interaction")
	public cyberfit.relogo.Interaction interaction(Number oneEnd, Number otherEnd) {
		return (cyberfit.relogo.Interaction)(this.getMyObserver().getNetwork("Interaction").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the interaction between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return interaction between two turtles
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Interaction")
	public cyberfit.relogo.Interaction interaction(Turtle oneEnd, Turtle otherEnd) {
		return interaction(oneEnd.getWho(), otherEnd.getWho());
	}

	/**
	 * Queries if object is a userLink.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userLink
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public boolean isUserLinkQ(Object o){
		return (o instanceof cyberfit.relogo.UserLink);
	}

	/**
	 * Returns an agentset containing all userLinks.
	 * 
	 * @return agentset of all userLinks
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public AgentSet<cyberfit.relogo.UserLink> userLinks(){
		AgentSet<cyberfit.relogo.UserLink> a = new AgentSet<cyberfit.relogo.UserLink>();
		for (Object e : this.getMyObserver().getContext().getObjects(cyberfit.relogo.UserLink.class)) {
			if (e instanceof cyberfit.relogo.UserLink){
				a.add((cyberfit.relogo.UserLink)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public cyberfit.relogo.UserLink userLink(Number oneEnd, Number otherEnd) {
		return (cyberfit.relogo.UserLink)(this.getMyObserver().getNetwork("UserLink").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public cyberfit.relogo.UserLink userLink(Turtle oneEnd, Turtle otherEnd) {
		return userLink(oneEnd.getWho(), otherEnd.getWho());
	}

	/**
	 * Returns the value of the global variable numAttackers.
	 *
	 * @return the value of the global variable numAttackers
	 */
	@ReLogoBuilderGeneratedFor("global: numAttackers")
	public Object getNumAttackers(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numAttackers");
	}

	/**
	 * Sets the value of the global variable numAttackers.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numAttackers")
	public void setNumAttackers(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numAttackers",value);
	}

	/**
	 * Returns the value of the global variable numDefenders.
	 *
	 * @return the value of the global variable numDefenders
	 */
	@ReLogoBuilderGeneratedFor("global: numDefenders")
	public Object getNumDefenders(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numDefenders");
	}

	/**
	 * Sets the value of the global variable numDefenders.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numDefenders")
	public void setNumDefenders(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numDefenders",value);
	}

	/**
	 * Returns the value of the global variable typeEnvironment.
	 *
	 * @return the value of the global variable typeEnvironment
	 */
	@ReLogoBuilderGeneratedFor("global: typeEnvironment")
	public Object getTypeEnvironment(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("typeEnvironment");
	}

	/**
	 * Sets the value of the global variable typeEnvironment.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: typeEnvironment")
	public void setTypeEnvironment(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("typeEnvironment",value);
	}


}