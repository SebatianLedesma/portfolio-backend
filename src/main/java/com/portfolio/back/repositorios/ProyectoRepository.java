package com.portfolio.back.repositorios;

import com.portfolio.back.modelo.Educacion;
import com.portfolio.back.modelo.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepository extends JpaRepository<Proyecto,Long> {
}
