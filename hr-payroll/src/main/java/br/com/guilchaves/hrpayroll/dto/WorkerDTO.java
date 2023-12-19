package br.com.guilchaves.hrpayroll.dto;

import br.com.guilchaves.hrpayroll.entities.Worker;

public class WorkerDTO {

    private Long id;
    private String name;
    private Double dailyIncome;

    public WorkerDTO(Long id, String name, Double dailyIncome) {
        this.id = id;
        this.name = name;
        this.dailyIncome = dailyIncome;
    }

    public WorkerDTO(Worker entity) {
        id = entity.getId();
        name = entity.getName();
        dailyIncome = entity.getDailyIncome();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }
}
