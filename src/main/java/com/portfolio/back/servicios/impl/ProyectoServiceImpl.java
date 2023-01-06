package com.portfolio.back.servicios.impl;

import com.portfolio.back.modelo.Proyecto;
import com.portfolio.back.repositorios.ProyectoRepository;
import com.portfolio.back.servicios.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class ProyectoServiceImpl implements ProyectoService {

    @Autowired
    private ProyectoRepository proyectoRepository;

    @Override
    public Proyecto agregarProyecto(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    @Override
    public Proyecto editarProyecto(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    @Override
    public Set<Proyecto> obtenerProyectos() {

        return new LinkedHashSet<>(proyectoRepository.findAll());
        //return (Set<Proyecto>) proyectoRepository.findAll();

    }

    @Override
    public Proyecto obtenerProyecto(Long proyectoId) {
        return proyectoRepository.findById(proyectoId).get();
    }

    @Override
    public void eliminarProyecto(Long proyectoId) {
        proyectoRepository.deleteById(proyectoId);

    }
}
