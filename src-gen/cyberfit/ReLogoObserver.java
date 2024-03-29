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
public class ReLogoObserver extends BaseObserver{

	/**
	 * Makes a number of randomly oriented attackers and then executes a set of commands on the
	 * created attackers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created attackers
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Attacker")
	public AgentSet<cyberfit.relogo.Attacker> createAttackers(int number, Closure closure) {
		AgentSet<cyberfit.relogo.Attacker> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.crt(number,closure,"Attacker");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.Attacker){
				result.add((cyberfit.relogo.Attacker)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of randomly oriented attackers and then executes a set of commands on the
	 * created attackers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created attackers
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Attacker")
	public AgentSet<cyberfit.relogo.Attacker> createAttackers(int number) {
		return createAttackers(number,null);
	}

	/**
	 * Makes a number of uniformly fanned attackers and then executes a set of commands on the
	 * created attackers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created attackers
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Attacker")
	public AgentSet<cyberfit.relogo.Attacker> createOrderedAttackers(int number, Closure closure) {
		AgentSet<cyberfit.relogo.Attacker> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.cro(number,closure,"Attacker");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.Attacker){
				result.add((cyberfit.relogo.Attacker)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of uniformly fanned attackers and then executes a set of commands on the
	 * created attackers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created attackers
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Attacker")
	public AgentSet<cyberfit.relogo.Attacker> createOrderedAttackers(int number) {
		return createOrderedAttackers(number,null);
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
		for (Object e : this.getContext().getObjects(cyberfit.relogo.Attacker.class)) {
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
		Turtle turtle = Utility.turtleU(number.intValue(), this);
		if (turtle instanceof cyberfit.relogo.Attacker)
			return (cyberfit.relogo.Attacker) turtle;
		return null;
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
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),this,"attacker")){
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
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),this,"attacker")){
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
	 * Makes a number of randomly oriented defenders and then executes a set of commands on the
	 * created defenders.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created defenders
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Defender")
	public AgentSet<cyberfit.relogo.Defender> createDefenders(int number, Closure closure) {
		AgentSet<cyberfit.relogo.Defender> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.crt(number,closure,"Defender");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.Defender){
				result.add((cyberfit.relogo.Defender)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of randomly oriented defenders and then executes a set of commands on the
	 * created defenders.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created defenders
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Defender")
	public AgentSet<cyberfit.relogo.Defender> createDefenders(int number) {
		return createDefenders(number,null);
	}

	/**
	 * Makes a number of uniformly fanned defenders and then executes a set of commands on the
	 * created defenders.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created defenders
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Defender")
	public AgentSet<cyberfit.relogo.Defender> createOrderedDefenders(int number, Closure closure) {
		AgentSet<cyberfit.relogo.Defender> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.cro(number,closure,"Defender");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.Defender){
				result.add((cyberfit.relogo.Defender)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of uniformly fanned defenders and then executes a set of commands on the
	 * created defenders.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created defenders
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Defender")
	public AgentSet<cyberfit.relogo.Defender> createOrderedDefenders(int number) {
		return createOrderedDefenders(number,null);
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
		for (Object e : this.getContext().getObjects(cyberfit.relogo.Defender.class)) {
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
		Turtle turtle = Utility.turtleU(number.intValue(), this);
		if (turtle instanceof cyberfit.relogo.Defender)
			return (cyberfit.relogo.Defender) turtle;
		return null;
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
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),this,"defender")){
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
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),this,"defender")){
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
	 * Makes a number of randomly oriented friendlys and then executes a set of commands on the
	 * created friendlys.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created friendlys
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Friendly")
	public AgentSet<cyberfit.relogo.Friendly> createFriendlys(int number, Closure closure) {
		AgentSet<cyberfit.relogo.Friendly> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.crt(number,closure,"Friendly");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.Friendly){
				result.add((cyberfit.relogo.Friendly)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of randomly oriented friendlys and then executes a set of commands on the
	 * created friendlys.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created friendlys
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Friendly")
	public AgentSet<cyberfit.relogo.Friendly> createFriendlys(int number) {
		return createFriendlys(number,null);
	}

	/**
	 * Makes a number of uniformly fanned friendlys and then executes a set of commands on the
	 * created friendlys.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created friendlys
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Friendly")
	public AgentSet<cyberfit.relogo.Friendly> createOrderedFriendlys(int number, Closure closure) {
		AgentSet<cyberfit.relogo.Friendly> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.cro(number,closure,"Friendly");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.Friendly){
				result.add((cyberfit.relogo.Friendly)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of uniformly fanned friendlys and then executes a set of commands on the
	 * created friendlys.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created friendlys
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Friendly")
	public AgentSet<cyberfit.relogo.Friendly> createOrderedFriendlys(int number) {
		return createOrderedFriendlys(number,null);
	}

	/**
	 * Queries if object is a friendly.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a friendly
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Friendly")
	public boolean isFriendlyQ(Object o){
		return (o instanceof cyberfit.relogo.Friendly);
	}

	/**
	 * Returns an agentset containing all friendlys.
	 * 
	 * @return agentset of all friendlys
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Friendly")
	public AgentSet<cyberfit.relogo.Friendly> friendlys(){
		AgentSet<cyberfit.relogo.Friendly> a = new AgentSet<cyberfit.relogo.Friendly>();
		for (Object e : this.getContext().getObjects(cyberfit.relogo.Friendly.class)) {
			if (e instanceof cyberfit.relogo.Friendly){
				a.add((cyberfit.relogo.Friendly)e);
			}
		}
		return a;
	}

	/**
	 * Returns the friendly with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Friendly")
	public cyberfit.relogo.Friendly friendly(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), this);
		if (turtle instanceof cyberfit.relogo.Friendly)
			return (cyberfit.relogo.Friendly) turtle;
		return null;
	}

	/**
	 * Returns an agentset of friendlys on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of friendlys on patch p
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Friendly")
	public AgentSet<cyberfit.relogo.Friendly> friendlysOn(Patch p){
		AgentSet<cyberfit.relogo.Friendly> result = new AgentSet<cyberfit.relogo.Friendly>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),this,"friendly")){
			if (t instanceof cyberfit.relogo.Friendly)
			result.add((cyberfit.relogo.Friendly)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of friendlys on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of friendlys on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Friendly")
	public AgentSet<cyberfit.relogo.Friendly> friendlysOn(Turtle t){
		AgentSet<cyberfit.relogo.Friendly> result = new AgentSet<cyberfit.relogo.Friendly>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),this,"friendly")){
			if (tt instanceof cyberfit.relogo.Friendly)
			result.add((cyberfit.relogo.Friendly)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of friendlys on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of friendlys on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Friendly")
	public AgentSet<cyberfit.relogo.Friendly> friendlysOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<cyberfit.relogo.Friendly>();
		}

		Set<cyberfit.relogo.Friendly> total = new HashSet<cyberfit.relogo.Friendly>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(friendlysOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(friendlysOn(p));
				}
			}
		}
		return new AgentSet<cyberfit.relogo.Friendly>(total);
	}

	/**
	 * Makes a number of randomly oriented terrains and then executes a set of commands on the
	 * created terrains.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created terrains
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Terrain")
	public AgentSet<cyberfit.relogo.Terrain> createTerrains(int number, Closure closure) {
		AgentSet<cyberfit.relogo.Terrain> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.crt(number,closure,"Terrain");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.Terrain){
				result.add((cyberfit.relogo.Terrain)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of randomly oriented terrains and then executes a set of commands on the
	 * created terrains.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created terrains
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Terrain")
	public AgentSet<cyberfit.relogo.Terrain> createTerrains(int number) {
		return createTerrains(number,null);
	}

	/**
	 * Makes a number of uniformly fanned terrains and then executes a set of commands on the
	 * created terrains.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created terrains
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Terrain")
	public AgentSet<cyberfit.relogo.Terrain> createOrderedTerrains(int number, Closure closure) {
		AgentSet<cyberfit.relogo.Terrain> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.cro(number,closure,"Terrain");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.Terrain){
				result.add((cyberfit.relogo.Terrain)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of uniformly fanned terrains and then executes a set of commands on the
	 * created terrains.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created terrains
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Terrain")
	public AgentSet<cyberfit.relogo.Terrain> createOrderedTerrains(int number) {
		return createOrderedTerrains(number,null);
	}

	/**
	 * Queries if object is a terrain.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a terrain
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Terrain")
	public boolean isTerrainQ(Object o){
		return (o instanceof cyberfit.relogo.Terrain);
	}

	/**
	 * Returns an agentset containing all terrains.
	 * 
	 * @return agentset of all terrains
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Terrain")
	public AgentSet<cyberfit.relogo.Terrain> terrains(){
		AgentSet<cyberfit.relogo.Terrain> a = new AgentSet<cyberfit.relogo.Terrain>();
		for (Object e : this.getContext().getObjects(cyberfit.relogo.Terrain.class)) {
			if (e instanceof cyberfit.relogo.Terrain){
				a.add((cyberfit.relogo.Terrain)e);
			}
		}
		return a;
	}

	/**
	 * Returns the terrain with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Terrain")
	public cyberfit.relogo.Terrain terrain(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), this);
		if (turtle instanceof cyberfit.relogo.Terrain)
			return (cyberfit.relogo.Terrain) turtle;
		return null;
	}

	/**
	 * Returns an agentset of terrains on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of terrains on patch p
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Terrain")
	public AgentSet<cyberfit.relogo.Terrain> terrainsOn(Patch p){
		AgentSet<cyberfit.relogo.Terrain> result = new AgentSet<cyberfit.relogo.Terrain>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),this,"terrain")){
			if (t instanceof cyberfit.relogo.Terrain)
			result.add((cyberfit.relogo.Terrain)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of terrains on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of terrains on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Terrain")
	public AgentSet<cyberfit.relogo.Terrain> terrainsOn(Turtle t){
		AgentSet<cyberfit.relogo.Terrain> result = new AgentSet<cyberfit.relogo.Terrain>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),this,"terrain")){
			if (tt instanceof cyberfit.relogo.Terrain)
			result.add((cyberfit.relogo.Terrain)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of terrains on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of terrains on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.Terrain")
	public AgentSet<cyberfit.relogo.Terrain> terrainsOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<cyberfit.relogo.Terrain>();
		}

		Set<cyberfit.relogo.Terrain> total = new HashSet<cyberfit.relogo.Terrain>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(terrainsOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(terrainsOn(p));
				}
			}
		}
		return new AgentSet<cyberfit.relogo.Terrain>(total);
	}

	/**
	 * Makes a number of randomly oriented userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserTurtle")
	public AgentSet<cyberfit.relogo.UserTurtle> createUserTurtles(int number, Closure closure) {
		AgentSet<cyberfit.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.crt(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.UserTurtle){
				result.add((cyberfit.relogo.UserTurtle)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of randomly oriented userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserTurtle")
	public AgentSet<cyberfit.relogo.UserTurtle> createUserTurtles(int number) {
		return createUserTurtles(number,null);
	}

	/**
	 * Makes a number of uniformly fanned userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserTurtle")
	public AgentSet<cyberfit.relogo.UserTurtle> createOrderedUserTurtles(int number, Closure closure) {
		AgentSet<cyberfit.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.cro(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof cyberfit.relogo.UserTurtle){
				result.add((cyberfit.relogo.UserTurtle)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of uniformly fanned userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("cyberfit.relogo.UserTurtle")
	public AgentSet<cyberfit.relogo.UserTurtle> createOrderedUserTurtles(int number) {
		return createOrderedUserTurtles(number,null);
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
		for (Object e : this.getContext().getObjects(cyberfit.relogo.UserTurtle.class)) {
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
		Turtle turtle = Utility.turtleU(number.intValue(), this);
		if (turtle instanceof cyberfit.relogo.UserTurtle)
			return (cyberfit.relogo.UserTurtle) turtle;
		return null;
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
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),this,"userTurtle")){
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
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),this,"userTurtle")){
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
		for (Object e : this.getContext().getObjects(cyberfit.relogo.Interaction.class)) {
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
		return (cyberfit.relogo.Interaction)(this.getNetwork("Interaction").getEdge(turtle(oneEnd),turtle(otherEnd)));
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
		for (Object e : this.getContext().getObjects(cyberfit.relogo.UserLink.class)) {
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
		return (cyberfit.relogo.UserLink)(this.getNetwork("UserLink").getEdge(turtle(oneEnd),turtle(otherEnd)));
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


}