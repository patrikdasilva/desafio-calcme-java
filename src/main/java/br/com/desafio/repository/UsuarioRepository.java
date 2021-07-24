package br.com.desafio.repository;

import br.com.desafio.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository <Usuario, String>{

}
