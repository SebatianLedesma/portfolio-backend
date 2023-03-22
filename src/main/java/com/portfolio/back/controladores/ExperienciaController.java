package com.portfolio.back.controladores;

import com.portfolio.back.modelo.Experiencia;
import com.portfolio.back.servicios.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/experiencia")
@CrossOrigin("*")
public class ExperienciaController {
    @Autowired
    private ExperienciaService experienciaService;

    @PostMapping("/")
    public ResponseEntity<Experiencia> guardarExperiencia(@RequestBody Experiencia experiencia){
        Experiencia experienciaNueva = experienciaService.agregarExperiencia(experiencia);
        return ResponseEntity.ok(experienciaNueva);
    }

    @GetMapping("/{experienciaId}")
    public Experiencia listarExperienciaPorId(@PathVariable("experienciaId") Long experienciaId){
        return experienciaService.obtenerExperiencia(experienciaId);
    }

    @GetMapping("/")
    public ResponseEntity<?> listarExperiencias(){
        return ResponseEntity.ok(experienciaService.obtenerExperiencias());
    }

    @PutMapping("/")
    public Experiencia editarExperiencia(@RequestBody Experiencia experiencia){
        return experienciaService.editarExperiencia(experiencia);
    }

    @DeleteMapping("/{eperienciaId}")
    public void eliminarExperiencia(@PathVariable("experienciaId") Long experienciaId){
        experienciaService.eliminarExperiencia(experienciaId);
    }
}


