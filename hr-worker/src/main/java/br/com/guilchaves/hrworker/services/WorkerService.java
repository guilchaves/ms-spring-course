package br.com.guilchaves.hrworker.services;

import br.com.guilchaves.hrworker.dto.WorkerDTO;
import br.com.guilchaves.hrworker.entities.Worker;
import br.com.guilchaves.hrworker.repositories.WorkerRepository;
import br.com.guilchaves.hrworker.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository repository;


    public List<WorkerDTO> findAll() {
        List<Worker> list = repository.findAll();
        return list.stream().map(WorkerDTO::new).collect(Collectors.toList());
    }

    public WorkerDTO findById(Long id) {
        Worker worker = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Resource not found")
        );
        return new WorkerDTO(worker);
    }
}
