package org.user.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8341109488407902654L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "user_id")
	private Long userId;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "additional_info")
	private String additionalInfo;
	
	@Column(name = "created_date")
	private LocalDateTime createdDate;
	
	@OneToMany(targetEntity = Players.class, mappedBy = "users", cascade = CascadeType.ALL)
	private Set<Players> players = new HashSet<>();
	
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}


	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	
	public Set<Players> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Players> players) {
		this.players = players;
	}
	
	
	public void addChildren(Players player){
        players.add(player);
    }
	

}
