package com.example.reservas.controller;

import com.example.reservas.model.Reserva;
import com.example.reservas.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;

    @GetMapping
    public String listarReservas(Model model) {
        List<Reserva> reservas = reservaRepository.findAll();
        model.addAttribute("reservas", reservas);
        return "reservas";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioReserva(Model model) {
        model.addAttribute("reserva", new Reserva());
        return "formularioReserva";
    }

    @PostMapping
    public String guardarReserva(@ModelAttribute Reserva reserva) {
        reservaRepository.save(reserva);
        return "redirect:/reservas";
    }

    @GetMapping("/editar/{id}")
    public String editarReserva(@PathVariable Long id, Model model) {
        Reserva reserva = reservaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Reserva no encontrada"));
        model.addAttribute("reserva", reserva);
        return "formularioReserva";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarReserva(@PathVariable Long id) {
        reservaRepository.deleteById(id);
        return "redirect:/reservas";
    }
}
