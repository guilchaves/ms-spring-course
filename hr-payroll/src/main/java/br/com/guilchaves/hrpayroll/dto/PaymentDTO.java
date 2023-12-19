package br.com.guilchaves.hrpayroll.dto;

import br.com.guilchaves.hrpayroll.entities.Payment;

public class PaymentDTO {

    private String name;
    private Double dailyIncome;
    private Integer days;

    public PaymentDTO(String name, Double dailyIncome, Integer days) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    public PaymentDTO(Payment entity) {
        this.name = entity.getName();
        this.dailyIncome = entity.getDailyIncome();
        this.days = entity.getDays();
    }

    public String getName() {
        return name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public Integer getDays() {
        return days;
    }

    public Double getTotal(){
        return dailyIncome * days;
    }
}
