package com.example.springbootmariadb.controllers;

import com.example.springbootmariadb.entities.ActualCreditTransfer;
import com.example.springbootmariadb.services.ActualCreditTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transfers")
public class ActualCreditTransferController {

    @Autowired
    private ActualCreditTransferService service;

    @GetMapping
    public List<ActualCreditTransfer> getAllTransfers() {
        return service.getAllTransfers();
    }

    @PostMapping
    public ActualCreditTransfer createTransfer(@RequestBody ActualCreditTransfer transfer) {
        return service.saveTransfer(transfer);
    }
}