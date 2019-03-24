package br.usjt.tempo.Service;

import br.usjt.tempo.Model.Bean.Previsao;
import br.usjt.tempo.Model.Bean.Usuario;
import br.usjt.tempo.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
   private UsuarioRepository usuarioRepo;


    public boolean logar (Usuario usuario) {
        return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(),
                usuario.getSenha()) != null;
    }


}
