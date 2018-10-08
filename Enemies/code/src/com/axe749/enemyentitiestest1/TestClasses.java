package com.axe749.enemyentitiestest1;

import com.axe749.enemyentities.*;

import com.axe749.enemyentities.baseenemies.*;

import com.axe749.enemyentities.intelligentenemies.*;

public class TestClasses {
	public static void main (String[] args) {

	Weapon w= new Weapon("Weapon");	

	if(w.getType()!="Weapon")
		System.out.println("Error: Weapon class not set correctly");

	BaseEnemy b= new BaseEnemy("BaseEnemy");	

	if(b.getName()!="BaseEnemy")
		System.out.println("Error: BaseEnemy class not set correctly");

	if(b.getHealth()!=100)
		System.out.println("Error: BaseEnemy class not set correctly");
	
	b.decreaseHealth(200);
	if(b.getHealth()!=0 && b.isDead()==true)
		System.out.println("Error: BaseEnemy class not set correctly");

	IntelligentEnemy i= new IntelligentEnemy("IntelligentEnemy");

	i.increaseIntelligence(5);

	if(i.getIntelligence()!=30)
		System.out.println("Error: IntelligentEnemy class not set correctly");	
	
	i.decreaseHealth(10);
	
	if(i.getHealth()!=90 || i.getIntelligence()!=29.9f)
		System.out.println("Error: IntelligentEnemy class not set correctly");	

	i.decreaseHealth(110);

	if(i.getHealth()!=0)
		System.out.println("Error: IntelligentEnemy class not set correctly");	

	i.increaseHealth(50);

	if(i.getHealth()!=0)
		System.out.println("Error: IntelligentEnemy class not set correctly");	

	IntelligentEnemy i2= new IntelligentEnemy("IntelligentEnemy i2");

	i2.increaseIntelligence(100);

	if(i2.getIntelligence()!=50)
		System.out.println("Error: IntelligentEnemy class not set correctly");

	Ghoul g= new Ghoul("Ghoul");	

	g.increasePutridity();

	if(g.getHealth()!=150 || g.getIntelligence()!=25.0f || g.getPutridity()!=0.1f)
		System.out.println("Error: Ghoul class not set correctly1 ");	

	g.decreaseHealth(5);
	if(g.getHealth()!=145)
		System.out.println("Error: Ghoul class not set correctly ");
		
	for(int q=0;q<=15;q++)
		g.increasePutridity();

	if(g.getPutridity()!=1.0f || g.getHealth()!=150)
		System.out.println("Error: Ghoul class not set correctly ");	

	RadioactiveGhoul r= new RadioactiveGhoul("RadioactiveGhoul");	
	
	if(r.getRadioactivity()!=50.0f || r.getIntelligence()!=25.0f)
		System.out.println("Error: RadioactiveGhoul class not set correctly");	

	r.increaseRadioactivity(7);

	if(r.getRadioactivity()!=57.0f)
		System.out.println("Error: RadioactiveGhoul class not set correctly");	

	Mutant m= new Mutant("Mutant");	

	m.addWeapon("Weapon1");

	if(!m.getWeapon().equals("Weapon1"))
		System.out.println("Error: Mutant class not set correctly");	

	m.addWeapon("Weapon2");

	if(!m.getWeapon().equals("Weapon1, Weapon2"))
		System.out.println("Error: Mutant class not set correctly");	

	Zombie z= new Zombie("Zombie");	

	z.increaseHealth(45);

	if(z.getHealth()!=100.0f || z.getAngerLevel()!=0.0f)
		System.out.println("Error: Zombie class not set correctly");

	z.decomposition();
	z.increaseAngerLevel(10);

	if(z.getHealth()!=99.5f || z.getAngerLevel()!=10)
		System.out.println("Error: Zombie class not set correctly");


	LegendaryZombie l= new LegendaryZombie("LegendaryZombie");	

	l.decomposition();

	if(l.getHealth()!=99.95f)
		System.out.println("Error: LegendaryZombie class not set correctly");

	l.mutate();

	if(l.getHealth()!=500.0f && l.getAngerLevel()!=100.0f)
		System.out.println("Error: LegendaryZombie class not set correctly");
}

}
