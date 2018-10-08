package com.axe749.enemyentities.baseenemies;

import com.axe749.enemyentities.*;

public class Zombie extends BaseEnemy {


	/** The zombie's decomposition rate */
	private float decompositionRate=0.5f;
	/** The Legendary zombie's starting anger level */
	protected float startingAngerLevel=0.0f;
	/** The zombie's anger level */
	protected float angerLevel;
	/** The zombie's minimum anger level */
	protected float minAngerLevel=0.0f;
	/** The zombie's maximum anger level */
	protected float maxAngerLevel=50.0f;
	/** The zombie's number of weapons */
	protected int numberOfWeapons=0;
	/** The number of weapons the zombie starts with */
	protected int startingNumberOfWeapons;
	/** The maximum number of weapons the zombie can have */
	private int maxNumberOfWeapons=2;
	/** The zombie's weapons */
	protected String weapon;

	/**
	The constructor.
	@param name The name of enemy.
	*/

	public Zombie(String name){
		super(name);
		super.setHealth();
		angerLevel();
		numberOfWeapons();
	}
	
	/**
	Gets the anger level.
	@return angerLevel The enemy's angerLevel.
	*/

	public float getAngerLevel(){
		return angerLevel;	
	}

	/**
	Gets the number of weapons.
	@return numberOfWeapons The enemy's number of weapons.
	*/

	public float getNumberOfWeapons(){
		return numberOfWeapons;	
	}

	/**
	Sets the anger level.
	*/

	public void angerLevel(){
		angerLevel=startingAngerLevel;
	}

	/**
	Sets the number of weapons.
	*/

	public void numberOfWeapons(){
		numberOfWeapons=startingNumberOfWeapons;
	}

	/**
	Increases the anger level.  
	@param angerLevel The amount the anger level will increased by.
	*/

	public void increaseAngerLevel(float angerLevel) {
		if(isDead()==false){		
			if(this.angerLevel+angerLevel<=maxAngerLevel)		
				this.angerLevel+=angerLevel;
			else
				this.angerLevel=maxAngerLevel;
		}
	}

	/**
	Decreases the anger level.  
	@param angerLevel The amount the anger level will decreased by.    
	*/

	public void decreaseAngerLevel(float angerLevel) {
		if(isDead()==false){		
			if(this.angerLevel-angerLevel>=minAngerLevel)		
				this.angerLevel-=angerLevel;
			else
				this.angerLevel=minAngerLevel;
		}
	}
	
	/**
	Applying the decomposition.  
	*/

	public void decomposition() {
		if(isDead()==false){
			health=health-decompositionRate;
		}
	}

	/**
	Adds a weapon.
	@param weapon The weapon that will be added.
	@return True if the Mutant can add the weapon, False if not.  
	*/

	public boolean addWeapon(String weapon){
		if(isDead()==false){
			if(numberOfWeapons==0){
				this.weapon= weapon;
				numberOfWeapons++;			
				return true;
			}
			else if(numberOfWeapons==1){
				this.weapon+= ", "+ weapon;
				numberOfWeapons++;			
				return true;
			}
			else 
				return false;
		}
		else
			return false;
	}


	/**
	Creates a String representation of the object.
	@return s the string form: the name and health and weapon and anger level.
	*/

	@Override
	public String toString() {
		String s = super.toString();
		s += "The zombies weapons: " + weapon + "\n";
		s += "The zombies angerLevel: " + angerLevel + "\n";
		return s;
	}
}
