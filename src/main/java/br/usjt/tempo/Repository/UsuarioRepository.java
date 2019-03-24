package br.usjt.tempo.Repository;

import br.usjt.tempo.Model.Bean.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public Usuario findOneByLoginAndSenha(String login, String senha);
    }
