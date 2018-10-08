package com.axe749.enemyentities;

public class IntelligentEnemy extends BaseEnemy{

	/** The intelligence it starts with */
	protected float startingIntelligence=25.0f;
	/** The Intelligent enemy's maximum intelligence */
	protected float maxIntelligence=50.0f;
	/** The Intelligent enemy's minimum intelligence */
	protected float minIntelligence=0.0f;
	/** The amount the intelligence can be increased or decreased */
	protected float intelligenceBoost=0.1f;
	/** The intelligence */
	protected float intelligence;

	/**
	The constructor.
	@param name The name of enemy.
	*/

	public IntelligentEnemy(String name) {
		super(name);
		super.setHealth();
		setIntelligence();
	}

	/**
	Gets the intelligence.
	@return intelligence The enemy's intelligence.
	*/

	public float getIntelligence(){
		return intelligence;	
	}

	/**
	Sets the intelligence.
	*/

	public void setIntelligence(){
		intelligence=startingIntelligence;;
	}
	
	/**
    Increases the health.
	@param health The amount the health will increased by. 
	*/

	@Override
	public void increaseHealth(float health) {
		super.increaseHealth(health);
		if(intelligence<=maxIntelligence)
			intelligence+=intelligenceBoost;
		else 
			intelligence=maxIntelligence;
	}

	/**
    Decreases the health.
	@param health The amount the health will decreased by. 
	*/

	@Override
	public void decreaseHealth(float health) {
		super.decreaseHealth(health);
		if(intelligence>=intelligenceBoost)
			intelligence-=intelligenceBoost;
		else 
			intelligence=minIntelligence;
	}

	/**
    Increases the intelligence.
	@param intelligence The amount the intelligence will increased by. 
	*/

	public void increaseIntelligence(float intelligence) {
		if(isDead()==false){		
			if(this.intelligence+intelligence>maxIntelligence)		
				this.intelligence=maxIntelligence;
			else 
				this.intelligence+=intelligence;	
		}
	}

	/**
    Decreases the intelligence.
	@param intelligence The amount the intelligence will decreased by. 
	*/

	public void decreaseIntelligence(float intelligence) {
		if(isDead()==false){	
			if(this.intelligence-intelligence>=0.0f)		
				this.intelligence-=intelligence;
			else
				this.intelligence=0.0f;
		}
	}

	/**
	Creates a String representation of the object.
	@return s the string form: the name, heslth and intelligence.
	*/

	@Override
	public String toString() {
		String s = super.toString();
		s += "The enemy's intelligence: " + intelligence + "\n";
		return s;
	}
}
