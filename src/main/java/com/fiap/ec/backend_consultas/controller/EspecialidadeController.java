package com.fiap.ec.backend_consultas.controller;
import com.fiap.ec.backend_consultas.model.Paciente;
import com.fiap.ec.backend_consultas.service.PacienteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/especialidades")
@CrossOrigin
public class EspecialidadeController {
    private final PacienteService service;
    public EspecialidadeController(PacienteService service) {
        this.service = service;
    }
    @PostMapping
    public Paciente criar(@RequestBody Paciente paciente) {
        return service.salvar(paciente);
    }
    @GetMapping
    public List<Paciente> listar() {
        return service.listar();
    }
}