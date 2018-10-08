package com.axe749.enemyentities.baseenemies;

import com.axe749.enemyentities.*;

public class LegendaryZombie extends Zombie{

	/** The decomposition rate */
	private float decompositionRate=0.05f;
	/** The Legendary zombie's anger level */
	protected float angerLevel=50.0f;
	/** The Legendary zombie's maximum anger level */
	protected float maxAngerLevel=100.0f;
	/** The Legendary zombie's maximum health */
	protected float maxHealth=500.0f;


	/**
	The constructor.
	@param name The name of enemy.
	*/

	public LegendaryZombie(String name){
		super(name);
		super.setHealth();
		super.angerLevel();
		super.numberOfWeapons();
	}

	/**
	Mutating the legendary zombie.
	*/

	public void mutate(){
		if(isDead()==false){		
			angerLevel=maxAngerLevel;
			health=maxHealth;
		}
	}

	/**
	Applying the decomposition.  
	*/

	@Override
	public void decomposition() {
		if(isDead()==false){
			health=health-decompositionRate;
		}
	}

	/**
	Creates a String representation of the object.
	@return s the string form: the name and health and weapon and anger level.
	*/

	@Override
	public String toString() {
		String s = super.toString();
		return s;
	}

}
	
