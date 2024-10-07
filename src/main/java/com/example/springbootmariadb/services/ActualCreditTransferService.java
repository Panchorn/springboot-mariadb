package com.example.springbootmariadb.services;

import com.example.springbootmariadb.entities.ActualCreditTransfer;
import com.example.springbootmariadb.repositories.ActualCreditTransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActualCreditTransferService {

    @Autowired
    private ActualCreditTransferRepository repository;

    public List<ActualCreditTransfer> getAllTransfers() {
        return repository.findAll();
    }

    public ActualCreditTransfer saveTransfer(ActualCreditTransfer transfer) {
        return repository.save(transfer);
    }

    // Other service methods for handling logic
}