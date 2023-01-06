package com.portfolio.back.servicios;

import com.portfolio.back.modelo.UsuarioRol;
import com.portfolio.back.modelo.Usuario;
import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}
