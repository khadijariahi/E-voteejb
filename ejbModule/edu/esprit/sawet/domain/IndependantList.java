package edu.esprit.sawet.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: IndependantList
 *
 */
@Entity

public class IndependantList implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int Id;
	private String Leader;
	@ManyToMany
	private List<OtherElection>Ot;
	@OneToMany(mappedBy="list")
	private List<Candidat>ca;
	@ManyToOne
	private PoliticalPartyRecord l;
	private static final long serialVersionUID = 1L;

	public IndependantList() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getLeader() {
		return this.Leader;
	}

	public void setLeader(String Leader) {
		this.Leader = Leader;
	}
   
}
