package com.kh.hsw;

public class Character {
	String name;
	String job;
	int strength;
	int dexterity;
	int intelligence;
	int lucky;

	public Character() {
	}

	public Character(String name, String job, int strength, int dexterity, int intelligence, int lucky) {
		this.name = name;
		this.job = job;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.lucky = lucky;
	}

	public String getName() {
		return this.name;
	}

	public String getJob() {
		return this.job;
	}

	public int getStrength() {
		return this.strength;
	}

	public int getDexterity() {
		return this.dexterity;
	}

	public int getIntelligence() {
		return this.intelligence;
	}

	public int getLucky() {
		return this.lucky;
	}

	
	
	//set
	public void setName(String name) {
		this.name = name;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public void setLucky(int lucky) {
		this.lucky = lucky;
	}

}
