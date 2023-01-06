package com.portfolio.back.servicios;

import com.portfolio.back.modelo.Proyecto;
import java.util.Set;

public interface ProyectoService {

    Proyecto agregarProyecto(Proyecto proyecto);

    Proyecto editarProyecto(Proyecto proyecto);

    Set<Proyecto> obtenerProyectos();

    Proyecto obtenerProyecto(Long proyectoId);

    void eliminarProyecto(Long proyectoId);
}
