package edu.esprit.sawet.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PoliticalPartyRecord
 *
 */
@Entity

public class PoliticalPartyRecord implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int Id;
	private String Name;
	private String Description;
	private String Value;
	private String Founder;
	private String ExclusiveOffice;
	private String ElectoralProgram;
	private static final long serialVersionUID = 1L;
    
	@OneToMany(mappedBy="l")
	private List<IndependantList> idl;
	public PoliticalPartyRecord() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}   
	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}   
	public String getValue() {
		return this.Value;
	}

	public void setValue(String Value) {
		this.Value = Value;
	}   
	public String getFounder() {
		return this.Founder;
	}

	public void setFounder(String Founder) {
		this.Founder = Founder;
	}   
	public String getExclusiveOffice() {
		return this.ExclusiveOffice;
	}

	public void setExclusiveOffice(String ExclusiveOffice) {
		this.ExclusiveOffice = ExclusiveOffice;
	}   
	public String getElectoralProgram() {
		return this.ElectoralProgram;
	}

	public void setElectoralProgram(String ElectoralProgram) {
		this.ElectoralProgram = ElectoralProgram;
	}
   
}
