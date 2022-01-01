package com.portifolio.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.portifolio.userdept.entities.User;
import com.portifolio.userdept.repositories.UserRepository;

/**Bem estou criando essa classe controlado que na hora que eu 
 * digita localhost:808/usres bem vu fazer acesso a essa classe,
 * em especifico todos os métodos(end point) implementados nela  
 * */
@RestController
@RequestMapping(value = "/users")
public class UserController {
	
/*Para acessar o banco de dados utilizaremos o objeto UserRepository que nós criamos
 * nesse ponto iremos fazer uma coposição de componentes
 * vamos fazer uma notação para acessarmos o mecanismo de injeção de dependência contido 
 * no framework*/
	@Autowired
	private UserRepository repository;
	
	
	/*Criando um método que irá me retornar uma lista de todos os  usuários
	 * contidos no banco de dados*/
	@GetMapping
	public List<User> findAll(){
	List<User> result=repository.findAll();
	return result;
	}
	
	/*Criar um método (end point) que irá retornar um único usuário*/
	@GetMapping(value="/{id}")
	public User finByid(@PathVariable Long id){
	User result=repository.findById(id).get();
	return result;
	}
	

	/*Criar um método (end point) que irá retornar um único usuário*/
	@PostMapping
	public User insert(@RequestBody User user){
	User result=repository.save(user); 
	return result;
	}
	

}
