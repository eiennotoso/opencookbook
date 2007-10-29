package org.ocobo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlType;

/**
 * Type of the ingredient.
 */
@Entity
@XmlType
public class IngredientType {

	private int id;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private Text name;

	@ManyToOne
	public Text getName() {
		return name;
	}

	public void setName(Text name) {
		this.name = name;
	}

	private Text description;

	@ManyToOne
	public Text getDescription() {
		return description;
	}

	public void setDescription(Text description) {
		this.description = description;
	}
}