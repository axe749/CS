package com.axe749.enemyentities.intelligentenemies;

import com.axe749.enemyentities.*;

public class RadioactiveGhoul extends Ghoul {

	/** The Radioactive Ghoul's maximum radioactivity */
	protected float maxRadioactivity=100.0f;
	/** The Radioactive Ghoul's minimum radioactivity */
	protected float minRadioactivity=0.0f;
	/** The Radioactive Ghoul's radioactivity */
	protected float radioactivity;
	/** The radioactivity it starts with */
	protected float startingRadioactivity=50.0f;

	/**
	The constructor.
	@param name The name of enemy.
	*/

	public RadioactiveGhoul(String name) {
		super(name);
		super.setHealth();
		super.setIntelligence();
		super.setPutridity();
		setRadioactivity();	
	}
	
	/**
	Gets the radioactivity.
	@return radioactivity The enemy's radioactivity.
	*/

	public float getRadioactivity(){
		return radioactivity;	
	}

	/**
	Sets the radioactivity.
	*/

	public void setRadioactivity(){
		radioactivity=startingRadioactivity;

	}

	/**
	Increases the radioactivity.
	@param radioactivity The amount the radioactivity will increased by.    
	*/

	public void increaseRadioactivity(float radioactivity){
		if(isDead()==false){
			if(this.radioactivity+radioactivity<=maxRadioactivity)		
				this.radioactivity+=radioactivity;
			else
				this.radioactivity=maxRadioactivity;
		}
	}

	/**
	Decreases the radioactivity.  
	@param radioactivity The amount the radioactivity will decreased by.    
	*/
	
	public void decreaseRadioactivity(float radioactivity) {
		if(isDead()==false){
			if(this.radioactivity-radioactivity>=minRadioactivity)		
				this.radioactivity-=radioactivity;
			else
				this.radioactivity=minRadioactivity;
		}
	}

	/**
	Creates a String representation of the object.
	@return s the string form: name and health and intelligence and putridity and radioactivity.
	*/

	@Override
	public String toString() {

		String s = super.toString();
		s += "The enemy's radioactivity: " + radioactivity + "\n";
		return s;

	}

}
