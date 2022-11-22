package br.fesa.ec7.markettracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.fesa.ec7.markettracker.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
	//@Query("SELECT u FROM USUARIO u WHERE (EMAIL = :nameOrEmail or NOME = :nameOrEmail) and SENHA = :senha")
	//Usuario findUsuarioByNomeOrEmailAndSenha(@Param("nameOrEmail") String nameOrEmail, @Param("senha") String senha);
	
	//Usuario findByUsuarioSender(Usuario usuario);
	Usuario findByEmail(String email);
	Usuario findByNome(String email);
	Usuario findById(int id);
}
