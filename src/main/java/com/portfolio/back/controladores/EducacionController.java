package com.portfolio.back.controladores;

import com.portfolio.back.modelo.Educacion;
import com.portfolio.back.servicios.EducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/educacion")
//@CrossOrigin("*")
@CrossOrigin("https://portfolio-frontend-bfcaf.web.app")
public class EducacionController {

    @Autowired
    private EducacionService educacionService;

    @PostMapping("/")
    public ResponseEntity<Educacion> guardarEducacion(@RequestBody Educacion educacion){
        Educacion educacionNueva = educacionService.agregarEducacion(educacion);
        return ResponseEntity.ok(educacionNueva);
    }

    @GetMapping("/{educacionId}")
    public Educacion listarEducacionPorId(@PathVariable("educacionId") Long educacionId){
        return educacionService.obtenerEducacion(educacionId);
    }

    @GetMapping("/")
    public ResponseEntity<?> listarEducaciones(){
        return ResponseEntity.ok(educacionService.obtenerEducaciones());
    }

    @PutMapping("/")
    public Educacion editarEducacion(@RequestBody Educacion educacion){
        return educacionService.editarEducacion(educacion);
    }

    @DeleteMapping("/{educacionId}")
    public void eliminarEducacion(@PathVariable("educacionId") Long educacionId){
        educacionService.eliminarEducacion(educacionId);
    }

}
