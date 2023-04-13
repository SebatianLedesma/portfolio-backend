package com.portfolio.back.controladores;

import com.portfolio.back.modelo.Skill;
import com.portfolio.back.servicios.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/skill")
//@CrossOrigin("*")
@CrossOrigin("https://portfolio-frontend-bfcaf.web.app")
public class SkillController {
    @Autowired
    private SkillService skillService;

    @PostMapping("/")
    public ResponseEntity<Skill> guardarSkill(@RequestBody Skill skill){
        Skill skillNueva = skillService.agregarSkill(skill);
        return ResponseEntity.ok(skillNueva);
    }

    @GetMapping("/{skillId}")
    public Skill listarSkillPorId(@PathVariable("skillId") Long skillId){

        return skillService.obtenerSkill(skillId);
    }

    @GetMapping("/")
    public ResponseEntity<?> listarSkills(){

        return ResponseEntity.ok(skillService.obtenerSkills());
    }

    @PutMapping("/")
    public Skill editarSkill(@RequestBody Skill skill){

        return skillService.editarSkill(skill);
    }

    @DeleteMapping("/{skillId}")
    public void eliminarSkill(@PathVariable("skillId") Long skillId){

        skillService.eliminarSkill(skillId);
    }
}
