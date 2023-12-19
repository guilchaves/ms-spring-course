package br.com.guilchaves.hrpayroll.controllers;

import br.com.guilchaves.hrpayroll.dto.PaymentDTO;
import br.com.guilchaves.hrpayroll.services.PaymentService;
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

    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<PaymentDTO> getPayment(@PathVariable long workerId, @PathVariable int days) {
        PaymentDTO dto = service.getPayment(workerId, days);
        return ResponseEntity.ok(dto);
    }

}
