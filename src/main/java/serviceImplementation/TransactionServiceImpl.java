package serviceImplementation;

import dto.TransactionDto;
import lombok.AllArgsConstructor;
import model.Transaction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import repository.TransactionRepository;
import service.PersonUserService;
import service.StoreUserService;
import service.TransactionService;

import java.time.LocalDate;

@Service @AllArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;
    private final PersonUserService personUserService;
    private final StoreUserService storeUserService;

    @Override
    public ResponseEntity createTransaction(TransactionDto transactionDto) {
        Transaction transaction = new Transaction(null, transactionDto.getTransactionDate(),
                transactionDto.getIdSender(), transactionDto.getIdReceiver(),
                transactionDto.getReceiverType(), transactionDto.getValue());

        try{
            transactionRepository.save(transaction);
        }catch (Error error){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, error.getMessage(), error);
        }

        return null;
    }

    @Override @org.springframework.transaction.annotation.Transactional
    public ResponseEntity makeTransaction(TransactionDto transactionDto) {
        try{
            personUserService.subtractBalance(transactionDto.getIdSender(), transactionDto.getValue());

            if(transactionDto.getReceiverType().equals("Lojista")){
                storeUserService.addBalance(transactionDto.getIdReceiver(), transactionDto.getValue());
            }else{
                personUserService.addBalance(transactionDto.getIdReceiver(), transactionDto.getValue());
            }

            createTransaction(transactionDto);
            return ResponseEntity.ok(transactionDto);

        }catch (Error error){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, error.getMessage(), error);
        }
    }


}
