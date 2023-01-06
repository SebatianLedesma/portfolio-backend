package com.portfolio.back.servicios;


import com.portfolio.back.modelo.Skill;

import java.util.Set;

public interface SkillService {

    Skill agregarSkill(Skill skill);

    Skill editarSkill(Skill skill);

    Set<Skill> obtenerSkills();

    Skill obtenerSkill(Long skillId);

    void eliminarSkill(Long skillId);
}
