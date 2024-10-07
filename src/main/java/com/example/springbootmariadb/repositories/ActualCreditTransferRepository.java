package com.example.springbootmariadb.repositories;

import com.example.springbootmariadb.entities.ActualCreditTransfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActualCreditTransferRepository extends JpaRepository<ActualCreditTransfer, Long> {
}
