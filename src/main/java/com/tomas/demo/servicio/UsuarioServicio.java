package com.tomas.demo.servicio;

import com.tomas.demo.entidades.Usuario;
import com.tomas.demo.repositorios.IUsuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Raúl Gómez
 */

@Service
public class UsuarioServicio {

    
    @Autowired
    private IUsuarioRepositorio usuarioRepositorio;
    
    public Usuario crearUsuario(String nombre, String apellido, 
            String nombreUsuario, String ciudad, String provincia, 
            String codigoPostal,String comentario){
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setNombreUsuario(nombreUsuario);
        usuario.setCiudad(ciudad);
        usuario.setProvincia(provincia);
        usuario.setCodigoPostal(codigoPostal);
        usuario.setComentario(comentario);
        
        usuarioRepositorio.save(usuario);
        
        return usuario;
    }
    
    public List<Usuario> usuarios(){
        return usuarioRepositorio.findAll();
    }
    
    
}
