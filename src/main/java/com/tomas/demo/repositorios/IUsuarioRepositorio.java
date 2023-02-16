package com.tomas.demo.repositorios;

import com.tomas.demo.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Raúl Gómez
 */

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, String>{

}
