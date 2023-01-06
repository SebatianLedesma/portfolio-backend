package com.portfolio.back.servicios.impl;

import com.portfolio.back.modelo.Skill;
import com.portfolio.back.repositorios.SkillRepository;
import com.portfolio.back.servicios.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Override
    public Skill agregarSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public Skill editarSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public Set<Skill> obtenerSkills() {
        return new LinkedHashSet<>(skillRepository.findAll());
    }

    @Override
    public Skill obtenerSkill(Long skillId) {
        return skillRepository.findById(skillId).get();
    }

    @Override
    public void eliminarSkill(Long skillId) {
        skillRepository.deleteById(skillId);

    }
}
