package com.axe749.enemyentitiestest1;

import com.axe749.enemyentities.*;

import com.axe749.enemyentities.baseenemies.*;

import com.axe749.enemyentities.intelligentenemies.*;

public class TestToString {
	public static void main (String[] args) {

	Weapon w= new Weapon("Weapon");	

	System.out.println(w.toString());

	BaseEnemy b= new BaseEnemy("BaseEnemy");	

	System.out.println(b.toString());

	IntelligentEnemy i= new IntelligentEnemy("IntelligentEnemy");	

	System.out.println(i.toString());

	Ghoul g= new Ghoul("Ghoul");	

	System.out.println(g.toString());

	RadioactiveGhoul r= new RadioactiveGhoul("RadioactiveGhoul");	

	System.out.println(r.toString());

	Mutant m= new Mutant("Mutant");	

	System.out.println(m.toString());

	Zombie z= new Zombie("Zombie");	

	System.out.println(z.toString());

	LegendaryZombie l= new LegendaryZombie("LegendaryZombie");	

	System.out.println(l.toString());
}

}
