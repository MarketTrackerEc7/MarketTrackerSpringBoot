package br.fesa.ec7.markettracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.fesa.ec7.markettracker.models.Usuario;
import br.fesa.ec7.markettracker.repository.UsuarioRepository;

@Controller
public class IndexController {

	@Autowired
	UsuarioRepository userRepo;

	@GetMapping("/")
	public String index(final Model model) {

		model.addAttribute(new Usuario());
		return "index";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute Usuario usuario, ModelMap model) {

		Usuario usuarioDtb = userRepo.findByEmail(usuario.getNome());

		if (usuarioDtb == null)
			usuarioDtb = userRepo.findByNome(usuario.getNome());

		if (usuarioDtb != null) {
			String senhaDtb = usuarioDtb.getSenha();
			String senhaInput = usuario.getSenha();

			if (senhaDtb.equals(senhaInput))
				return "redirect:/selecaoBusca";
		}

		model.addAttribute("ErrorMessage", "Usuário e/ou senha inválidos!");
		return "index";
	}

}
