package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="objects_TZD")
public class ObjectModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long object_id;
	
	@Column(name="object_name") 
	private String object_name;
	
	@Column(name="object_damage") 
	private int damage;
	
	@Column(name="object_armor") 
	private int armor;
	
	@Column(name="object_life")
	private int life;
	
	@Column(name="object_speed")
	private int object_speed;
	
	@Column(name="object_coins")
	private int coins;
	
	@Column(name="object_description")
	private String description;
	
	
	public ObjectModel(int i, String s) {
		
	}
	
	public ObjectModel(long object_id, String object_name, int damage, int armor, int life, int object_speed, int coins,
			String description) {
		super();
		this.object_id = object_id;
		this.object_name = object_name;
		this.damage = damage;
		this.armor = armor;
		this.life = life;
		this.object_speed = object_speed;
		this.coins = coins;
		this.description = description;
	}



	public long getObject_id() {
		return object_id;
	}


	public void setObject_id(long object_id) {
		this.object_id = object_id;
	}


	public String getObject_name() {
		return object_name;
	}


	public void setObject_name(String object_name) {
		this.object_name = object_name;
	}


	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public int getArmor() {
		return armor;
	}


	public void setArmor(int armor) {
		this.armor = armor;
	}


	public int getLife() {
		return life;
	}


	public void setLife(int life) {
		this.life = life;
	}


	public int getObject_speed() {
		return object_speed;
	}


	public void setObject_speed(int object_speed) {
		this.object_speed = object_speed;
	}


	public int getCoins() {
		return coins;
	}


	public void setCoins(int coins) {
		this.coins = coins;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

}
