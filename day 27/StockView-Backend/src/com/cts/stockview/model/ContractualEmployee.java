package com.cts.stockview.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="contractual")
//@DiscriminatorValue(value="CE")
//@PrimaryKeyJoinColumn(name="emp_id")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column = @Column(name="name"))
})
public class ContractualEmployee extends Employee {
	private double payPerHour;
	private float contractperiod;
	public double getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(double payPerHour) {
		this.payPerHour = payPerHour;
	}
	public float getContractperiod() {
		return contractperiod;
	}
	public void setContractperiod(float contractperiod) {
		this.contractperiod = contractperiod;
	}
	
}
