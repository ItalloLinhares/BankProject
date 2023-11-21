package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data @AllArgsConstructor @NoArgsConstructor
public class TransactionDto {
    private LocalDate transactionDate;
    private Long idSender;
    private Long idReceiver;
    private String receiverType;
    private Float value;
}
