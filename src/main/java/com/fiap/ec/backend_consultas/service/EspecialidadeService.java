package com.fiap.ec.backend_consultas.service;
import com.fiap.ec.backend_consultas.model.Paciente;
import com.fiap.ec.backend_consultas.repository.EspecialidadeRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EspecialidadeService {
    private final EspecialidadeRepository repository;
    public EspecialidadeService(EspecialidadeRepository repository) {
        this.repository = repository;
    }
    public Paciente salvar(Paciente paciente) {
        return repository.save(paciente);
    }
    public List<Paciente> listar() {
        return repository.findAll();
    }
}