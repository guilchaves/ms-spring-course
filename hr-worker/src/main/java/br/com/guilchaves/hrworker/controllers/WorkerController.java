package br.com.guilchaves.hrworker.controllers;

import br.com.guilchaves.hrworker.dto.WorkerDTO;
import br.com.guilchaves.hrworker.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

    @Autowired
    private WorkerService service;

    @GetMapping
    public ResponseEntity<List<WorkerDTO>> findAll(){
        List<WorkerDTO> dto = service.findAll();
        return ResponseEntity.ok(dto);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<WorkerDTO> findById(@PathVariable Long id){
        WorkerDTO dto = service.findById(id);
        return ResponseEntity.ok(dto);
    }

}
