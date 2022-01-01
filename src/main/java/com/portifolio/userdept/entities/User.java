	package com.portifolio.userdept.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")

public class User {
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	
	//Um usuario pertence a um departamento nesse ponto iremos configurara 
	// relacionamento entre classes nesse caso de acordo com o projeto Muitos para Um
	// ou seja, um Usuário pertence a um único departamento
	
	@ManyToOne
	@JoinColumn(name = "departament_id")
	private Departament departament;
	
	//Explicitando o Constructor 
	public User() {}

	
	//Método gets e sets 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}
	
	
	
	 
	
}
