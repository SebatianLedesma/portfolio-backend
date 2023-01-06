package com.portfolio.back.repositorios;

import com.portfolio.back.modelo.Educacion;
import com.portfolio.back.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducacionRepository extends JpaRepository<Educacion,Long> {
}
