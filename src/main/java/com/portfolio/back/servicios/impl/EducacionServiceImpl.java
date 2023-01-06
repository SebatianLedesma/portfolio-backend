package com.portfolio.back.servicios.impl;

import com.portfolio.back.modelo.Educacion;
import com.portfolio.back.repositorios.EducacionRepository;
import com.portfolio.back.servicios.EducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class EducacionServiceImpl implements EducacionService {

    @Autowired
    private EducacionRepository educacionRepository;

    @Override
    public Educacion agregarEducacion(Educacion educacion) {
        return educacionRepository.save(educacion);
    }

    @Override
    public Educacion editarEducacion(Educacion educacion) {
        return educacionRepository.save(educacion);
    }

    @Override
    public Set<Educacion> obtenerEducaciones() {
        return new LinkedHashSet<>(educacionRepository.findAll());
    }

    @Override
    public Educacion obtenerEducacion(Long educacionId) {
        return educacionRepository.findById(educacionId).get();
    }

    @Override
    public void eliminarEducacion(Long educacionId) {

        // Experiencia educacion = new Educacion();
        // educacion.setId(educacionId);
        // educacionRepository.delete(educacion);

        educacionRepository.deleteById(educacionId);
    }
}
