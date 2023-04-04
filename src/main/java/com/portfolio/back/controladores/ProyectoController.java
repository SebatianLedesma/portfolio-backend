package com.portfolio.back.controladores;

import com.portfolio.back.modelo.Proyecto;
import com.portfolio.back.servicios.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/proyecto")
//@CrossOrigin("*")
@CrossOrigin("https://portfolio-frontend-bfcaf.web.app/")
public class ProyectoController {

    @Autowired
    private ProyectoService proyectoService;

    @PostMapping("/")
    public ResponseEntity<Proyecto> guardarProyecto(@RequestBody Proyecto proyecto){
        Proyecto proyectoNuevo = proyectoService.agregarProyecto(proyecto);
        return ResponseEntity.ok(proyectoNuevo);
    }

    @GetMapping("/{proyectoId}")
    public Proyecto listarProyectoPorId(@PathVariable("proyectoId") Long proyectoId){
        return proyectoService.obtenerProyecto(proyectoId);
    }

    @GetMapping("/")
    public ResponseEntity<?> listarProyectos(){
        return ResponseEntity.ok(proyectoService.obtenerProyectos());
    }

    @PutMapping("/")
    public Proyecto editarProyecto(@RequestBody Proyecto proyecto){
        return proyectoService.editarProyecto(proyecto);
    }

    @DeleteMapping("/{proyectoId}")
    public void eliminarProyecto(@PathVariable("proyectoId") Long proyectoId){
        proyectoService.eliminarProyecto(proyectoId);
    }
}
