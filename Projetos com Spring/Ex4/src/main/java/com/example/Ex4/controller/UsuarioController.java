package com.example.Ex4.controller;

import com.example.Ex4.model.Usuario;
import com.example.Ex4.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> getusuario(){
        return usuarioRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Usuario> salvarusuario(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(usuario);
    }

}
