package com.tomas.demo.controladores;

import com.tomas.demo.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Raúl Gómez
 */
@Controller
@RequestMapping("/usuario")
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/registrar")
    public String registrar() {
        return "index";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, @RequestParam String apellido,
            @RequestParam String nombreUsuario, @RequestParam String ciudad, @RequestParam String provincia,
            @RequestParam String codigoPostal, @RequestParam String comentario, ModelMap model) {
        usuarioServicio.crearUsuario(nombre, apellido, nombreUsuario, ciudad, provincia, codigoPostal, comentario);
        
        return "index";
    }

}
