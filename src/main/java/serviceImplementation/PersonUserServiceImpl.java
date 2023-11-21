package serviceImplementation;

import dto.PersonUserDto;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import model.PersonUser;
import model.Transaction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import repository.PersonUserRepository;
import service.PersonUserService;
import service.StoreUserService;
import service.TransactionService;

import java.time.LocalDate;

@Service @AllArgsConstructor
public class PersonUserServiceImpl implements PersonUserService {
    private final PersonUserRepository personUserRepository;
    private final PersonUserService personUserService;
    private final StoreUserService storeUserService;
    private final TransactionService transactionService;

    @Override
    public ResponseEntity createPersonUser(PersonUserDto personUserDto){
        PersonUser personUser = new PersonUser(null,
                personUserDto.getNumberDocument(),
                personUserDto.getUserType(),
                personUserDto.getName(),
                (float) 0,
                personUserDto.getEmail(),
                personUserDto.getPassword());
        try{
            personUserRepository.save(personUser);
        }catch (Error error){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, error.getMessage(), error);
        }

        return ResponseEntity.ok(personUser);
    }



    @Override
    public ResponseEntity addBalance(Long idReceiver, Float value) {
        return null;
    }

    @Override
    public ResponseEntity subtractBalance(Long idSender, Float value) {
        return null;
    }

    ;

}
