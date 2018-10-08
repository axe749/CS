package com.axe749.enemyentities;
 
public class BaseEnemy {

	/** The Base enemy's name */
	protected String name;
	/** The Base enemy's health */
	protected float health;
	/** The Base enemy's maximum health */
	protected float maxHealth=100.0f;
	/** The Base enemy's minimum health */
	protected float minHealth=0.0f;

	/**
	The constructor.
	@param name The name of enemy.
	*/

	public BaseEnemy(String name) {
		this.name=name;
		setHealth();
	}
	
	/**
	Gets the name.
	@return name The enemy's name.
	*/

	public String getName(){
		return name;	
	}


	/**
	Gets the health.
	@return health The enemy's health.
	*/

	public float getHealth(){
		return health;	
	}

	/**
	Sets the health.
	*/

	protected void setHealth(){
		health=maxHealth;
	}


	/**
	Increases the health.
	@param health increases the health by the given number.
	*/

	public void increaseHealth(float health) {
		if(isDead()==false){		
			if(this.health+health<=maxHealth)		
				this.health+=health;
			else	 
				this.health=maxHealth;
		}
	}

	/**
	Decreases the health.
	@param health decreases the health by the given number.
	*/

	public void decreaseHealth(float health) {
		if(isDead()==false){		
			if(this.health-health>=minHealth)		
				this.health-=health;
			else
				this.health=minHealth;
		}
	}

	/**
	Checks if it's dead.
	@return True if it's alive, False if it's not.
	*/

	public boolean isDead(){
		if(health<=0)
			return true;
		else
			return false;
	}

	/**
	Creates a String representation of the object.
	@return s the string form: the name and health.
	*/

	public String toString() {
		String s = "";
		s += "The enemy's name is: " + name + "\n";
		s += "The enemy's health: " + health + "\n";
		return s;
	}

}
