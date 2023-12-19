package br.com.guilchaves.hrworker.repositories;

import br.com.guilchaves.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
