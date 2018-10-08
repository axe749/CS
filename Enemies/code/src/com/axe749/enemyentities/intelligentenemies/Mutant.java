package com.axe749.enemyentities.intelligentenemies;

import com.axe749.enemyentities.*;

public class Mutant extends IntelligentEnemy{

	/** The Mutant's intelligence */
	private float intelligence=25.0f;
	/** The Mutant's maximum intelligence */
	protected float maxIntelligence=50.0f;
	/** The Mutant's minimum intelligence */
	protected float minIntelligence=0.0f;
	/** The maximum number of weapons the zombie can have */
	protected int maxNumberOfWeapons=4;
	/** The number of weapons */
	protected int numberOfWeapons=0;
	/** The amount the intelligence can be increased or decreased */
	protected float intelligenceBoost=0.2f;
	/** The Mutant's weapons */
	protected String weapon;

	/**
	The constructor.
	@param name The name of enemy.
	*/

	public Mutant(String name) {
		super(name);
		super.setHealth();
		super.setIntelligence();
	}

	/**
	Gets the weapons.
	@return weapon The enemy's weapon.
	*/

	public String getWeapon(){
		return weapon;	
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
			else if(numberOfWeapons>=1 && numberOfWeapons<maxNumberOfWeapons){
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
	@return s the string form: name and health and intelligence and weapons.
	*/

	@Override
	public String toString() {
		String s = super.toString();
		s += "The zombies weapons: " + weapon + "\n";
		return s;
	}
	
}
