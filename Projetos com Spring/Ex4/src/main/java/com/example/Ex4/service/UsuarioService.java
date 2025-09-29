package com.example.Ex4.service;

import com.example.Ex4.model.Usuario;
import com.example.Ex4.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

//    Consultar o banco de dados
    public List<Usuario> getusuario(){
        return usuarioRepository.findAll();
    }

    public Usuario salvarUsuario(Usuario usuario){
//        Verifica se o usuario enviado ja existe no banco de dados
        if(usuarioRepository.findByEmail(usuario.getEmail()).isPresent()){
            throw new RuntimeException("Usuario ja existe");
        }
    }

}
