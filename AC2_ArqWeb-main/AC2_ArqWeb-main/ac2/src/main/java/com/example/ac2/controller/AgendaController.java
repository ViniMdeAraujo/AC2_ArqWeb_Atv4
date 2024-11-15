package com.example.ac2.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac2.dtos.AgendaDTO;
import com.example.ac2.dtos.TreinamentoDTO;
import com.example.ac2.models.Agenda;
import com.example.ac2.interfaces.AgendaService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/agenda")
@AllArgsConstructor
public class AgendaController {
  private AgendaService agendaImpl;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<Agenda> findAll() {
    return this.agendaImpl.findAll();
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Agenda findById(@PathVariable("id") Integer id) {
    return this.agendaImpl.findById(id);
  }

  @PostMapping()
  @ResponseStatus(HttpStatus.CREATED)
  public Agenda registerAgenda(@RequestBody AgendaDTO agenda) {
    return this.agendaImpl.store(agenda);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.GONE)
  public void delete(@PathVariable Integer id) {
    this.agendaImpl.delete(id);
  }

  @PatchMapping()
  @ResponseStatus(HttpStatus.OK)
  public Agenda setTreinamento(@RequestBody TreinamentoDTO treinamentoDTO) {
    return this.agendaImpl.setTreinamento(treinamentoDTO);
  }
}
