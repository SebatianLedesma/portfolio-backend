package com.portfolio.back.servicios;

import com.portfolio.back.modelo.Educacion;
import java.util.Set;

public interface EducacionService {


    Educacion agregarEducacion(Educacion educacion);

    Educacion editarEducacion(Educacion educacion);

    Set<Educacion> obtenerEducaciones();

    Educacion obtenerEducacion(Long educacionId);

    void eliminarEducacion(Long educacionId);
}
