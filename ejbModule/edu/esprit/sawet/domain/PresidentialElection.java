package edu.esprit.sawet.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PresidentialElection
 *
 */
@Entity
public class PresidentialElection extends ElectionSession implements Serializable {


	
	@ManyToMany
	private List<Candidat>ca;
	private static final long serialVersionUID = 1L;

	public PresidentialElection() {
		super();
	}

	

}
