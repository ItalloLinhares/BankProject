package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data @Entity @AllArgsConstructor @NoArgsConstructor
public class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private LocalDate transactionDate;
    private Long idSender;
    private Long idReceiver;
    private String receiverType;
    private float value;
}
