package edu.esprit.sawet.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: OtherElection
 *
 */
@Entity

public class OtherElection extends ElectionSession implements Serializable {

	   
	
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//private int Id;
	private String ElectionType;
	@ManyToMany
	private List<IndependantList>iL;
	private static final long serialVersionUID = 1L;

	public OtherElection() {
		super();
	}   
		public String getElectionType() {
		return this.ElectionType;
	}

	public void setElectionType(String ElectionType) {
		this.ElectionType = ElectionType;
	}
   
}
