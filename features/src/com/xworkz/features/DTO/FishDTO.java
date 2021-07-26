package com.xworkz.features.DTO;

import java.io.Serializable;

public class FishDTO implements Serializable{

	private String name;
	private String color;
	private FishType type;
	private int lifeSpan;
	private int cost;
	private String gender;

	public FishDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + cost;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + lifeSpan;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FishDTO other = (FishDTO) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (cost != other.cost)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (lifeSpan != other.lifeSpan)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

public FishDTO(String name, String color, FishType type, int lifeSpan, int cost, String gender) {
	super();
	this.name = name;
	this.color = color;
	this.type = type;
	this.lifeSpan = lifeSpan;
	this.cost = cost;
	this.gender = gender;
}
@Override
public String toString() {
	return "FishDTO [name=" + name + ", color=" + color + ", type=" + type + ", lifeSpan=" + lifeSpan + ", cost="
			+ cost + ", gender=" + gender + "]";
}


public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public FishType getType() {
		return type;
	}

	public void setType(FishType type) {
		this.type = type;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
