package com.portfolio.back.servicios;

import com.portfolio.back.modelo.Experiencia;
import java.util.Set;

public interface ExperienciaService {

    Experiencia agregarExperiencia(Experiencia experiencia);

    Experiencia editarExperiencia(Experiencia experiencia);

    Set<Experiencia> obtenerExperiencias();

    Experiencia obtenerExperiencia(Long experienciaId);

    void eliminarExperiencia(Long experienciaId);
}
