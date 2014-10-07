package edu.esprit.sawet.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Candidat
 *
 */
@Entity
public class Candidat implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int Id;
	private String FirstName;
	private String LastName;
	private String FatherName;
	private String MotherName;
	private String Email;
	private String address;
	private String CIN;
	private String Occupation;
	private String FatherCin;
	private String MotherCin;
	private String TypeCandidate;
	private String TypeElection;
	private String Tel;
    @ManyToMany
    private List<PresidentialElection>PE;
    @ManyToOne
    private IndependantList list;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

	public Candidat() {
		super();
	}

	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getFirstName() {
		return this.FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getLastName() {
		return this.LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public String getFatherName() {
		return this.FatherName;
	}

	public void setFatherName(String FatherName) {
		this.FatherName = FatherName;
	}

	public String getMotherName() {
		return this.MotherName;
	}

	public void setMotherName(String MotherName) {
		this.MotherName = MotherName;
	}

	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCIN() {
		return this.CIN;
	}

	public void setCIN(String CIN) {
		this.CIN = CIN;
	}

	public String getOccupation() {
		return this.Occupation;
	}

	public void setOccupation(String Occupation) {
		this.Occupation = Occupation;
	}

	public String getFatherCin() {
		return FatherCin;
	}

	public void setFatherCin(String fatherCin) {
		FatherCin = fatherCin;
	}

	public String getMotherCin() {
		return MotherCin;
	}

	public void setMotherCin(String motherCin) {
		MotherCin = motherCin;
	}

	public String getTypeCandidate() {
		return TypeCandidate;
	}

	public void setTypeCandidate(String typeCandidate) {
		TypeCandidate = typeCandidate;
	}

	public String getTypeElection() {
		return TypeElection;
	}

	public void setTypeElection(String typeElection) {
		TypeElection = typeElection;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

}
