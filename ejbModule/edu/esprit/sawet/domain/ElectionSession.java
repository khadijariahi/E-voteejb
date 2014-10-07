package edu.esprit.sawet.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ElectionSession
 *
 */
@Entity

public class ElectionSession implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int Id;
	private String OpenigDate;
	private String ClosingDate;
	private String BallotBox;
	@ManyToMany
	private List<User>us;
	private static final long serialVersionUID = 1L;

	public ElectionSession() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getOpenigDate() {
		return this.OpenigDate;
	}

	public void setOpenigDate(String OpenigDate) {
		this.OpenigDate = OpenigDate;
	}   
	public String getClosingDate() {
		return this.ClosingDate;
	}

	public void setClosingDate(String ClosingDate) {
		this.ClosingDate = ClosingDate;
	}   
	public String getBallotBox() {
		return this.BallotBox;
	}

	public void setBallotBox(String BallotBox) {
		this.BallotBox = BallotBox;
	}
   
}
