package com.axe749.enemyentities.intelligentenemies;

import com.axe749.enemyentities.*;

public class Ghoul extends IntelligentEnemy{

	/** The Ghoul's maximum putridity */
	protected float maxPutridity=1.0f;
	/** The Ghoul's putridity */
	protected float putridity;
	/** The Ghoul's starting putridity */
	protected float startingPutridity=0.0f;
	/** The putridity the Ghoul can increase by */
	protected float putridityIncrease=0.1f;
	/** The Ghoul's maximum health */
	protected float maxHealth=150.0f;
	/** The boolean to check if the one-off increase can apply */
	protected boolean oneOff=true;

	/**
	The constructor.
	@param name The name of enemy.
	*/

	public Ghoul(String name) {
		super(name);
		setHealth();
		super.setIntelligence();
		setPutridity();
	}
	
	/**
	Gets the putridity.
	@return putridity The enemy's putridity.
	*/

	public float getPutridity(){
		return putridity;	
	}

	/**
	Sets the putridity.
	*/

	public void setPutridity(){
		putridity=startingPutridity;
	}

	/**
	Sets the health.
	*/

	@Override
	protected void setHealth(){
		health=maxHealth;
	}

	/**
	Increases the putridity.
	@return True if the putridity can be increased, False if not.  
	*/
	
	public boolean increasePutridity(){
		if(isDead()==false){
			if(putridity==maxPutridity && oneOff==true){
				health=maxHealth;
				oneOff=false;
			}
			else if(putridity>maxPutridity)
					 putridity=maxPutridity;
			else if(putridity<maxPutridity)
				putridity+=putridityIncrease;
			
			return oneOff;
		}
		else
			return false;
	}

	/**
	Creates a String representation of the object.
	@return s the string form: name and health and intelligence and putridity.
	*/

	@Override
	public String toString() {

		String s = super.toString();
		s += "The enemy's putridity: " + putridity + "\n";
		return s;

	}

}
