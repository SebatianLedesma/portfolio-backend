package com.portfolio.back.servicios.impl;

import com.portfolio.back.modelo.Experiencia;
import com.portfolio.back.repositorios.ExperienciaRepository;
import com.portfolio.back.servicios.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class ExperienciaServiceImpl implements ExperienciaService {

    @Autowired
    private ExperienciaRepository experienciaRepository;

    @Override
    public Experiencia agregarExperiencia(Experiencia experiencia) {

        return experienciaRepository.save(experiencia);
    }

    @Override
    public Experiencia editarExperiencia(Experiencia experiencia) {

        return experienciaRepository.save(experiencia);
    }

    @Override
    public Set<Experiencia> obtenerExperiencias() {

        return new LinkedHashSet<>(experienciaRepository.findAll());
    }

    @Override
    public Experiencia obtenerExperiencia(Long experienciaId) {

        return experienciaRepository.findById(experienciaId).get();
    }

    @Override
    public void eliminarExperiencia(Long experienciaId) {

       // Experiencia experiencia = new Experiencia();
       // experiencia.setId(experienciaId);
       // experienciaRepository.delete(experiencia);

        experienciaRepository.deleteById(experienciaId);
    }
}
