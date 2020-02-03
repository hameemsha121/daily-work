package com.cts.stockview.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="employee_type",discriminatorType = DiscriminatorType.STRING,length = 2)
//@DiscriminatorValue(value="E")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name="workers")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)//will get automatically created
	private int id;
	private String Name;
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name="emails")//-------this is the table created
	private Set<String> emails;
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Set<String> getEmails() {
		return emails;
	}
	public void setEmails(Set<String> emails) {
		this.emails = emails;
	}
	
	

}
