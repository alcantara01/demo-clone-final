package com.s2daw.demo.controllers;

import com.s2daw.demo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Cristina");
        usuario.setApellido("Alcantara");
        usuario.setEmail("alumno.668286@ies-azarquiel.es");
        usuario.setTelefono("234234234");
        return usuario;
    }

    @RequestMapping(value="usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(234L);
        usuario.setNombre("Cristina");
        usuario.setApellido("Alcantara");
        usuario.setEmail("alumno.668286@ies-azarquiel.es");
        usuario.setTelefono("234234234");


        Usuario usuario2 = new Usuario();
        usuario2.setId(345L);
        usuario2.setNombre("Marcos");
        usuario2.setApellido("Baena");
        usuario2.setEmail("marcos.ba@hotmail.com");
        usuario2.setTelefono("345345345");


        Usuario usuario3 = new Usuario();
        usuario3.setId(11L);
        usuario3.setNombre("María");
        usuario3.setApellido("Gonzalez");
        usuario3.setEmail("maria.gon@hotmail.com");
        usuario3.setTelefono("456456456");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }

    @RequestMapping(value="usuario45")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristina");
        usuario.setApellido("Alcantara");
        usuario.setEmail("alumno.668286@ies-azarquiel.es");
        usuario.setTelefono("234234234");
        return usuario;
    }

    @RequestMapping(value="usuario343")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristina");
        usuario.setApellido("Alcantara");
        usuario.setEmail("alumno.668286@ies-azarquiel.es");
        usuario.setTelefono("234234234");
        return usuario;
    }

    @RequestMapping(value="usuario123")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristina");
        usuario.setApellido("Alcantara");
        usuario.setEmail("alumno.668286@ies-azarquiel.es");
        usuario.setTelefono("234234234");
        return usuario;
    }
}
