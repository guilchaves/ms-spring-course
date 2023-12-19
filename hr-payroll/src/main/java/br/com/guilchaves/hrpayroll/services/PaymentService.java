package br.com.guilchaves.hrpayroll.services;

import br.com.guilchaves.hrpayroll.dto.PaymentDTO;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDTO getPayment(long workerId, int days) {
        return new PaymentDTO("Bob", 200.0, days);
    }

}
