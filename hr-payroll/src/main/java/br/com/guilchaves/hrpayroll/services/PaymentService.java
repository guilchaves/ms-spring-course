package br.com.guilchaves.hrpayroll.services;

import br.com.guilchaves.hrpayroll.dto.PaymentDTO;
import br.com.guilchaves.hrpayroll.entities.Worker;
import br.com.guilchaves.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public PaymentDTO getPayment(long workerId, int days) {
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new PaymentDTO(worker.getName(), worker.getDailyIncome(), days);
    }

}
