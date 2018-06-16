package cyberfit;

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import groovy.lang.Closure;
import repast.simphony.relogo.*;
import repast.simphony.relogo.ast.Diffusible;
import repast.simphony.relogo.builder.GeneratedByReLogoBuilder;
import repast.simphony.relogo.builder.ReLogoBuilderGeneratedFor;
import repast.simphony.space.SpatialException;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoPatch extends BasePatch{

	/**
	 * Sprouts (makes) a number of new attackers and then executes a set of commands on the
	 * created attackers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created attackers
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Attacker")
	public AgentSet<cyberfit.relogo.Attacker> sproutAttackers(int number, Closure closure) {
		AgentSet<cyberfit.relogo.Attacker> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.sprout(number,closure,"Attacker");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.Attacker){
				result.add((cyberfit.relogo.Attacker)t);
			}
		} 
		return result;
	}

	/**
	 * Sprouts (makes) a number of new attackers and then executes a set of commands on the
	 * created attackers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created attackers
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Attacker")
	public AgentSet<cyberfit.relogo.Attacker> sproutAttackers(int number) {
		return sproutAttackers(number,null);
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
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getGridLocationAsNdPoint(),displacement,getMyObserver());
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
	 * Sprouts (makes) a number of new defenders and then executes a set of commands on the
	 * created defenders.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created defenders
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Defender")
	public AgentSet<cyberfit.relogo.Defender> sproutDefenders(int number, Closure closure) {
		AgentSet<cyberfit.relogo.Defender> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.sprout(number,closure,"Defender");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.Defender){
				result.add((cyberfit.relogo.Defender)t);
			}
		} 
		return result;
	}

	/**
	 * Sprouts (makes) a number of new defenders and then executes a set of commands on the
	 * created defenders.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created defenders
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Defender")
	public AgentSet<cyberfit.relogo.Defender> sproutDefenders(int number) {
		return sproutDefenders(number,null);
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
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getGridLocationAsNdPoint(),displacement,getMyObserver());
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
	 * Sprouts (makes) a number of new forces and then executes a set of commands on the
	 * created forces.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created forces
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Force")
	public AgentSet<cyberfit.relogo.Force> sproutForces(int number, Closure closure) {
		AgentSet<cyberfit.relogo.Force> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.sprout(number,closure,"Force");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.Force){
				result.add((cyberfit.relogo.Force)t);
			}
		} 
		return result;
	}

	/**
	 * Sprouts (makes) a number of new forces and then executes a set of commands on the
	 * created forces.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created forces
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Force")
	public AgentSet<cyberfit.relogo.Force> sproutForces(int number) {
		return sproutForces(number,null);
	}

	/**
	 * Returns an agentset of forces from the patch of the caller.
	 * 
	 * @return agentset of forces from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Force")
	public AgentSet<cyberfit.relogo.Force> forcesHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<cyberfit.relogo.Force> result = new AgentSet<cyberfit.relogo.Force>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"force")){
			if (t instanceof cyberfit.relogo.Force)
			result.add((cyberfit.relogo.Force)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of forces on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of forces at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Force")
	public AgentSet<cyberfit.relogo.Force> forcesAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getGridLocationAsNdPoint(),displacement,getMyObserver());
		AgentSet<cyberfit.relogo.Force> result = new AgentSet<cyberfit.relogo.Force>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"force")){
			if (t instanceof cyberfit.relogo.Force)
			result.add((cyberfit.relogo.Force)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<cyberfit.relogo.Force>();
		}
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
	 * Sprouts (makes) a number of new machines and then executes a set of commands on the
	 * created machines.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created machines
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Machine")
	public AgentSet<cyberfit.relogo.Machine> sproutMachines(int number, Closure closure) {
		AgentSet<cyberfit.relogo.Machine> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.sprout(number,closure,"Machine");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.Machine){
				result.add((cyberfit.relogo.Machine)t);
			}
		} 
		return result;
	}

	/**
	 * Sprouts (makes) a number of new machines and then executes a set of commands on the
	 * created machines.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created machines
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Machine")
	public AgentSet<cyberfit.relogo.Machine> sproutMachines(int number) {
		return sproutMachines(number,null);
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
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getGridLocationAsNdPoint(),displacement,getMyObserver());
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
	 * Sprouts (makes) a number of new userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserTurtle")
	public AgentSet<cyberfit.relogo.UserTurtle> sproutUserTurtles(int number, Closure closure) {
		AgentSet<cyberfit.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.sprout(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.UserTurtle){
				result.add((cyberfit.relogo.UserTurtle)t);
			}
		} 
		return result;
	}

	/**
	 * Sprouts (makes) a number of new userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserTurtle")
	public AgentSet<cyberfit.relogo.UserTurtle> sproutUserTurtles(int number) {
		return sproutUserTurtles(number,null);
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
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getGridLocationAsNdPoint(),displacement,getMyObserver());
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