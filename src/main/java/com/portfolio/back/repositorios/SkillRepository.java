package com.portfolio.back.repositorios;

import com.portfolio.back.modelo.Educacion;
import com.portfolio.back.modelo.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill,Long> {
}
