package br.com.desafio.service;

import br.com.desafio.model.Usuario;

import java.util.List;


public interface UsuarioService {
    public Usuario criarUsuario(Usuario usuario);
    public List<Usuario> listarTodos();
    public Usuario obterPorId(String codigo);
}
