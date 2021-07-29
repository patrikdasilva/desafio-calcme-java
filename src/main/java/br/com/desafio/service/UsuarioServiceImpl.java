package br.com.desafio.service;

import br.com.desafio.model.Usuario;
import br.com.desafio.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario criarUsuario(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> listarTodos() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public Usuario obterPorId(String codigo) {
        return this.usuarioRepository
                .findById(codigo)
                .orElseThrow(() -> new IllegalArgumentException(("Usuario nao existe")));
    }

}
