package service;


import dto.TransactionDto;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;

public interface TransactionService {
    public ResponseEntity createTransaction(TransactionDto transactionDto);
    public ResponseEntity makeTransaction(TransactionDto transactionDto);
}
