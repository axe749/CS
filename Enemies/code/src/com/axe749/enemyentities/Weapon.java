package com.axe749.enemyentities;

public class Weapon{
	
	/** The weapon */
	protected String type;
	
	/**
	The constructor.
	@param type The type of weapon.
	*/

	public Weapon(String type) {
		this.type = type;
	}

	/**
	The type of weapon.
	@return type The type of weapon.
	*/

	public String getType() {
		return type;
	}

	/**
	Creates a String representation of the object.
	@return s the string form: the type of weapon.
	*/

	public String toString() {
		String s = "";
		s += "The type of weapon: " + type + "\n";
		return s;
	}
}
