package edu.esprit.sawet.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int Id;
	private String Name;
	private String Password;
	private String UserProfile;
	private boolean Bann;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="u")
    private List<Reclamation>Rec;
	@ManyToMany
	private List<ElectionSession>eS;
	public User() {
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
	public String getPassword() {
		return this.Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}   
	public String getUserProfile() {
		return this.UserProfile;
	}

	public void setUserProfile(String UserProfile) {
		this.UserProfile = UserProfile;
	}   
	public boolean getBann() {
		return this.Bann;
	}

	public void setBann(boolean Bann) {
		this.Bann = Bann;
	}
   
}
