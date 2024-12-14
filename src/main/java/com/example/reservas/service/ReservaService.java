package com.example.reservas.service;

import com.example.reservas.model.Reserva;
import com.example.reservas.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository repository;

    public List<Reserva> listarTodas() {
        return repository.findAll();
    }

    public void guardar(Reserva reserva) {
        repository.save(reserva);
    }

    public Optional<Reserva> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
