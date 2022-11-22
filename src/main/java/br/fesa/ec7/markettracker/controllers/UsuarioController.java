package br.fesa.ec7.markettracker.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.fesa.ec7.markettracker.models.Usuario;
import br.fesa.ec7.markettracker.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	
	@Autowired
	UsuarioRepository userRepo;
	
	@RequestMapping("/CadastrarNovoUsuario")
	public String form() {
		return "formCadastroUsuario";
	}
	
	@RequestMapping(value="/cadastrarUsuario/{nome}/{email}/{senha}", method = RequestMethod.POST)
	public void cadastrarUsuario(@PathVariable(value="nome") String nome,
							@PathVariable(value="email") String email, 
							@PathVariable(value="senha") String senha,						   
    					   Usuario usuario,			                   
                           HttpSession session) {	 
		
	usuario.setNome(nome);
	usuario.setEmail(email);
	usuario.setSenha(senha);
		
	userRepo.save(usuario);
	 
	return;	  

	}
	
	@RequestMapping(value="/cadastrarUsuario2", method = RequestMethod.POST)
	public String cadastrarUsuario2(@RequestParam String nome,
							@RequestParam String email, 
							@RequestParam String senha,						   
    					    Usuario usuario,			                   
                            HttpSession session) {	 
		
	usuario.setNome(nome);
	usuario.setEmail(email);
	usuario.setSenha(senha);
		
	userRepo.save(usuario);
	 
	return "index";	   

	}
}
