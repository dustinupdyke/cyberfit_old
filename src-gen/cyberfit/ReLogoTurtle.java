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
import repast.simphony.space.SpatialException;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoTurtle extends BaseTurtle{

	/**
	 * Makes a number of new attackers and then executes a set of commands on the
	 * created attackers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created attackers
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Attacker")
	public AgentSet<cyberfit.relogo.Attacker> hatchAttackers(int number, Closure closure) {
		AgentSet<cyberfit.relogo.Attacker> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.hatch(number,closure,"Attacker");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.Attacker){
				result.add((cyberfit.relogo.Attacker)t);
			}
		} 
		return result;
	}

	/**
	 * Makes a number of new attackers and then executes a set of commands on the
	 * created attackers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created attackers
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Attacker")
	public AgentSet<cyberfit.relogo.Attacker> hatchAttackers(int number) {
		return hatchAttackers(number,null);
	}

	/**
	 * Returns an agentset of attackers from the patch of the caller.
	 * 
	 * @return agentset of attackers from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Attacker")
	public AgentSet<cyberfit.relogo.Attacker> attackersHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<cyberfit.relogo.Attacker> result = new AgentSet<cyberfit.relogo.Attacker>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"attacker")){
			if (t instanceof cyberfit.relogo.Attacker)
			result.add((cyberfit.relogo.Attacker)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of attackers on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of attackers at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Attacker")
	public AgentSet<cyberfit.relogo.Attacker> attackersAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getTurtleLocation(),displacement,getMyObserver());
		AgentSet<cyberfit.relogo.Attacker> result = new AgentSet<cyberfit.relogo.Attacker>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"attacker")){
			if (t instanceof cyberfit.relogo.Attacker)
			result.add((cyberfit.relogo.Attacker)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<cyberfit.relogo.Attacker>();
		}
	}

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
	 * Makes a number of new defenders and then executes a set of commands on the
	 * created defenders.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created defenders
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Defender")
	public AgentSet<cyberfit.relogo.Defender> hatchDefenders(int number, Closure closure) {
		AgentSet<cyberfit.relogo.Defender> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.hatch(number,closure,"Defender");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.Defender){
				result.add((cyberfit.relogo.Defender)t);
			}
		} 
		return result;
	}

	/**
	 * Makes a number of new defenders and then executes a set of commands on the
	 * created defenders.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created defenders
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Defender")
	public AgentSet<cyberfit.relogo.Defender> hatchDefenders(int number) {
		return hatchDefenders(number,null);
	}

	/**
	 * Returns an agentset of defenders from the patch of the caller.
	 * 
	 * @return agentset of defenders from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Defender")
	public AgentSet<cyberfit.relogo.Defender> defendersHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<cyberfit.relogo.Defender> result = new AgentSet<cyberfit.relogo.Defender>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"defender")){
			if (t instanceof cyberfit.relogo.Defender)
			result.add((cyberfit.relogo.Defender)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of defenders on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of defenders at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Defender")
	public AgentSet<cyberfit.relogo.Defender> defendersAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getTurtleLocation(),displacement,getMyObserver());
		AgentSet<cyberfit.relogo.Defender> result = new AgentSet<cyberfit.relogo.Defender>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"defender")){
			if (t instanceof cyberfit.relogo.Defender)
			result.add((cyberfit.relogo.Defender)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<cyberfit.relogo.Defender>();
		}
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
	 * Makes a number of new machines and then executes a set of commands on the
	 * created machines.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created machines
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Machine")
	public AgentSet<cyberfit.relogo.Machine> hatchMachines(int number, Closure closure) {
		AgentSet<cyberfit.relogo.Machine> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.hatch(number,closure,"Machine");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.Machine){
				result.add((cyberfit.relogo.Machine)t);
			}
		} 
		return result;
	}

	/**
	 * Makes a number of new machines and then executes a set of commands on the
	 * created machines.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created machines
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Machine")
	public AgentSet<cyberfit.relogo.Machine> hatchMachines(int number) {
		return hatchMachines(number,null);
	}

	/**
	 * Returns an agentset of machines from the patch of the caller.
	 * 
	 * @return agentset of machines from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Machine")
	public AgentSet<cyberfit.relogo.Machine> machinesHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<cyberfit.relogo.Machine> result = new AgentSet<cyberfit.relogo.Machine>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"machine")){
			if (t instanceof cyberfit.relogo.Machine)
			result.add((cyberfit.relogo.Machine)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of machines on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of machines at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Machine")
	public AgentSet<cyberfit.relogo.Machine> machinesAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getTurtleLocation(),displacement,getMyObserver());
		AgentSet<cyberfit.relogo.Machine> result = new AgentSet<cyberfit.relogo.Machine>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"machine")){
			if (t instanceof cyberfit.relogo.Machine)
			result.add((cyberfit.relogo.Machine)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<cyberfit.relogo.Machine>();
		}
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
	 * Makes a number of new userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserTurtle")
	public AgentSet<cyberfit.relogo.UserTurtle> hatchUserTurtles(int number, Closure closure) {
		AgentSet<cyberfit.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.hatch(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.UserTurtle){
				result.add((cyberfit.relogo.UserTurtle)t);
			}
		} 
		return result;
	}

	/**
	 * Makes a number of new userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserTurtle")
	public AgentSet<cyberfit.relogo.UserTurtle> hatchUserTurtles(int number) {
		return hatchUserTurtles(number,null);
	}

	/**
	 * Returns an agentset of userTurtles from the patch of the caller.
	 * 
	 * @return agentset of userTurtles from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserTurtle")
	public AgentSet<cyberfit.relogo.UserTurtle> userTurtlesHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<cyberfit.relogo.UserTurtle> result = new AgentSet<cyberfit.relogo.UserTurtle>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"userTurtle")){
			if (t instanceof cyberfit.relogo.UserTurtle)
			result.add((cyberfit.relogo.UserTurtle)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of userTurtles on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of userTurtles at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserTurtle")
	public AgentSet<cyberfit.relogo.UserTurtle> userTurtlesAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getTurtleLocation(),displacement,getMyObserver());
		AgentSet<cyberfit.relogo.UserTurtle> result = new AgentSet<cyberfit.relogo.UserTurtle>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"userTurtle")){
			if (t instanceof cyberfit.relogo.UserTurtle)
			result.add((cyberfit.relogo.UserTurtle)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<cyberfit.relogo.UserTurtle>();
		}
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
	 * Makes a directed connection from a turtle to the caller then executes a set of
	 * commands on the created connection.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created connection
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public cyberfit.relogo.Connection createConnectionFrom(Turtle t, Closure closure){
		cyberfit.relogo.Connection link = (cyberfit.relogo.Connection)this.getMyObserver().getNetwork("Connection").addEdge(t,this);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed connection from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created connection
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public cyberfit.relogo.Connection createConnectionFrom(Turtle t){
			return createConnectionFrom(t,null);
	}

	/**
	 * Makes directed connections from a collection to the caller then executes a set
	 * of commands on the created connections.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created connections
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public AgentSet<cyberfit.relogo.Connection> createConnectionsFrom(Collection<? extends Turtle> a, Closure closure){
		AgentSet<cyberfit.relogo.Connection> links = new AgentSet<cyberfit.relogo.Connection>();
		for(Turtle t : a){
			links.add((cyberfit.relogo.Connection)this.getMyObserver().getNetwork("Connection").addEdge(t,this));
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed connections from a collection to the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created connections
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public AgentSet<cyberfit.relogo.Connection> createConnectionsFrom(Collection<? extends Turtle> a){
		return createConnectionsFrom(a,null);
	}

	/**
	 * Makes a directed connection to a turtle from the caller then executes a set of
	 * commands on the created connection.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created connection
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public cyberfit.relogo.Connection createConnectionTo(Turtle t, Closure closure){
		cyberfit.relogo.Connection link = (cyberfit.relogo.Connection)this.getMyObserver().getNetwork("Connection").addEdge(this,t);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed connection to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created connection
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public cyberfit.relogo.Connection createConnectionTo(Turtle t){
			return createConnectionTo(t,null);
	}

	/**
	 * Makes directed connections to a collection from the caller then executes a set
	 * of commands on the created connections.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created connections
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public AgentSet<cyberfit.relogo.Connection> createConnectionsTo(Collection<? extends Turtle> a, Closure closure){
		AgentSet<cyberfit.relogo.Connection> links = new AgentSet<cyberfit.relogo.Connection>();
		for(Object t : a){
			if (t instanceof Turtle){
				links.add((cyberfit.relogo.Connection)this.getMyObserver().getNetwork("Connection").addEdge(this,(Turtle)t));
			}
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed connections to a collection from the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created connections
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public AgentSet<cyberfit.relogo.Connection> createConnectionsTo(Collection<? extends Turtle> a){
		return createConnectionsTo(a,null);
	}

	/**
	 * Queries if there is a directed connection from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed connection from
	 *         turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public boolean inConnectionNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("Connection").isPredecessor(t, this);
	}

	/**
	 * Returns the agentset with directed connections to the caller.
	 * 
	 * @return agentset with directed connections to the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public AgentSet inConnectionNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("Connection").getPredecessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed connection from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed connection from turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public cyberfit.relogo.Connection inConnectionFrom(Turtle t){
		return (cyberfit.relogo.Connection)this.getMyObserver().getNetwork("Connection").getEdge(t,this);
	}

	/**
	 * Returns an agentset of directed connections from other turtles to the caller.
	 * 
	 * @return agentset of directed connections from other turtles to the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public AgentSet<cyberfit.relogo.Connection> myInConnections(){
		AgentSet<cyberfit.relogo.Connection> result = new AgentSet<cyberfit.relogo.Connection>();
		for(Object o :  this.getMyObserver().getNetwork("Connection").getInEdges(this)){
			if (o instanceof cyberfit.relogo.Connection){
				result.add((cyberfit.relogo.Connection) o);
			}
		}
		return result;
	}

	/**
	 * Returns an agentset of directed connections to other turtles from the caller.
	 * 
	 * @return agentset of directed connections to other turtles from the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public AgentSet<cyberfit.relogo.Connection> myOutConnections(){
		AgentSet<cyberfit.relogo.Connection> result = new AgentSet<cyberfit.relogo.Connection>();
		for(Object o :  this.getMyObserver().getNetwork("Connection").getOutEdges(this)){
			if (o instanceof cyberfit.relogo.Connection){
				result.add((cyberfit.relogo.Connection) o);
			}
		}
		return result;
	}

	/**
	 * Queries if there is a directed connection to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed connection to
	 *         turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public boolean outConnectionNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("Connection").isPredecessor(this, t);
	}

	/**
	 * Returns the agentset with directed connections from the caller.
	 * 
	 * @return agentset with directed connections from the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public AgentSet outConnectionNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("Connection").getSuccessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed connection to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed connection to turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public cyberfit.relogo.Connection outConnectionTo(Turtle t){
		return (cyberfit.relogo.Connection)this.getMyObserver().getNetwork("Connection").getEdge(this, t);
	}

	/**
	 * Reports true if there is a connection connecting t and the caller.
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public boolean connectionNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("Connection").isAdjacent(this, t);
	}

	/**
	 * Returns the agentset of all turtles found at the other end of
	 * connections connected to the calling turtle.
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public AgentSet connectionNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("Connection").getAdjacent(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns an agentset of the caller's connections.
	 * 
	 * @return agentset of the caller's connections
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Connection")
	public AgentSet<cyberfit.relogo.Connection> myConnections(){
		AgentSet<cyberfit.relogo.Connection> result = new AgentSet<cyberfit.relogo.Connection>();
		for(Object o : this.getMyObserver().getNetwork("Connection").getEdges(this)){
			if (o instanceof cyberfit.relogo.Connection){
				result.add((cyberfit.relogo.Connection)o);
			}
		}
		return result;
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
	 * Makes a directed userLink from a turtle to the caller then executes a set of
	 * commands on the created userLink.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public cyberfit.relogo.UserLink createUserLinkFrom(Turtle t, Closure closure){
		cyberfit.relogo.UserLink link = (cyberfit.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(t,this);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed userLink from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public cyberfit.relogo.UserLink createUserLinkFrom(Turtle t){
			return createUserLinkFrom(t,null);
	}

	/**
	 * Makes directed userLinks from a collection to the caller then executes a set
	 * of commands on the created userLinks.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public AgentSet<cyberfit.relogo.UserLink> createUserLinksFrom(Collection<? extends Turtle> a, Closure closure){
		AgentSet<cyberfit.relogo.UserLink> links = new AgentSet<cyberfit.relogo.UserLink>();
		for(Turtle t : a){
			links.add((cyberfit.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(t,this));
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed userLinks from a collection to the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public AgentSet<cyberfit.relogo.UserLink> createUserLinksFrom(Collection<? extends Turtle> a){
		return createUserLinksFrom(a,null);
	}

	/**
	 * Makes a directed userLink to a turtle from the caller then executes a set of
	 * commands on the created userLink.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public cyberfit.relogo.UserLink createUserLinkTo(Turtle t, Closure closure){
		cyberfit.relogo.UserLink link = (cyberfit.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(this,t);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed userLink to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public cyberfit.relogo.UserLink createUserLinkTo(Turtle t){
			return createUserLinkTo(t,null);
	}

	/**
	 * Makes directed userLinks to a collection from the caller then executes a set
	 * of commands on the created userLinks.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public AgentSet<cyberfit.relogo.UserLink> createUserLinksTo(Collection<? extends Turtle> a, Closure closure){
		AgentSet<cyberfit.relogo.UserLink> links = new AgentSet<cyberfit.relogo.UserLink>();
		for(Object t : a){
			if (t instanceof Turtle){
				links.add((cyberfit.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(this,(Turtle)t));
			}
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed userLinks to a collection from the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public AgentSet<cyberfit.relogo.UserLink> createUserLinksTo(Collection<? extends Turtle> a){
		return createUserLinksTo(a,null);
	}

	/**
	 * Queries if there is a directed userLink from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed userLink from
	 *         turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public boolean inUserLinkNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("UserLink").isPredecessor(t, this);
	}

	/**
	 * Returns the agentset with directed userLinks to the caller.
	 * 
	 * @return agentset with directed userLinks to the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public AgentSet inUserLinkNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getPredecessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed userLink from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed userLink from turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public cyberfit.relogo.UserLink inUserLinkFrom(Turtle t){
		return (cyberfit.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").getEdge(t,this);
	}

	/**
	 * Returns an agentset of directed userLinks from other turtles to the caller.
	 * 
	 * @return agentset of directed userLinks from other turtles to the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public AgentSet<cyberfit.relogo.UserLink> myInUserLinks(){
		AgentSet<cyberfit.relogo.UserLink> result = new AgentSet<cyberfit.relogo.UserLink>();
		for(Object o :  this.getMyObserver().getNetwork("UserLink").getInEdges(this)){
			if (o instanceof cyberfit.relogo.UserLink){
				result.add((cyberfit.relogo.UserLink) o);
			}
		}
		return result;
	}

	/**
	 * Returns an agentset of directed userLinks to other turtles from the caller.
	 * 
	 * @return agentset of directed userLinks to other turtles from the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public AgentSet<cyberfit.relogo.UserLink> myOutUserLinks(){
		AgentSet<cyberfit.relogo.UserLink> result = new AgentSet<cyberfit.relogo.UserLink>();
		for(Object o :  this.getMyObserver().getNetwork("UserLink").getOutEdges(this)){
			if (o instanceof cyberfit.relogo.UserLink){
				result.add((cyberfit.relogo.UserLink) o);
			}
		}
		return result;
	}

	/**
	 * Queries if there is a directed userLink to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed userLink to
	 *         turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public boolean outUserLinkNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("UserLink").isPredecessor(this, t);
	}

	/**
	 * Returns the agentset with directed userLinks from the caller.
	 * 
	 * @return agentset with directed userLinks from the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public AgentSet outUserLinkNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getSuccessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed userLink to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed userLink to turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public cyberfit.relogo.UserLink outUserLinkTo(Turtle t){
		return (cyberfit.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").getEdge(this, t);
	}

	/**
	 * Reports true if there is a userLink connecting t and the caller.
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public boolean userLinkNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("UserLink").isAdjacent(this, t);
	}

	/**
	 * Returns the agentset of all turtles found at the other end of
	 * userLinks connected to the calling turtle.
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public AgentSet userLinkNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getAdjacent(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns an agentset of the caller's userLinks.
	 * 
	 * @return agentset of the caller's userLinks
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserLink")
	public AgentSet<cyberfit.relogo.UserLink> myUserLinks(){
		AgentSet<cyberfit.relogo.UserLink> result = new AgentSet<cyberfit.relogo.UserLink>();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getEdges(this)){
			if (o instanceof cyberfit.relogo.UserLink){
				result.add((cyberfit.relogo.UserLink)o);
			}
		}
		return result;
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