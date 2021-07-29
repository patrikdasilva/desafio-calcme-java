package br.com.desafio.controller;

import br.com.desafio.model.Usuario;
import br.com.desafio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuarios")
    public Usuario criarUsuario(@RequestBody Usuario usuario){
        return usuarioService.criarUsuario(usuario);
    }

    @GetMapping("/usuarios/list")
    public List<Usuario> listarTodos(){
        return this.usuarioService.listarTodos();
    }

    @GetMapping("/{codigo}")
    public Usuario obterPorId(@PathVariable String codigo) {
        return this.usuarioService.obterPorId(codigo);
    }
}

