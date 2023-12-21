package br.com.guilchaves.hrpayroll.controllers;

import br.com.guilchaves.hrpayroll.dto.PaymentDTO;
import br.com.guilchaves.hrpayroll.services.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @HystrixCommand(fallbackMethod = "getPaymentAlternative")
    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<PaymentDTO> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
        PaymentDTO dto = service.getPayment(workerId, days);
        return ResponseEntity.ok(dto);
    }

    public ResponseEntity<PaymentDTO> getPaymentAlternative(Long workerId, Integer days){
        PaymentDTO dto = new PaymentDTO("Brann", 400.0, days);
        return ResponseEntity.ok(dto);
    }

}
