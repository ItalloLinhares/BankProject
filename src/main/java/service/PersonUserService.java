package service;

import dto.PersonUserDto;
import org.springframework.http.ResponseEntity;

public interface PersonUserService {
    public ResponseEntity createPersonUser(PersonUserDto personUserDto);
    public ResponseEntity addBalance(Long idReceiver, Float value);
    public ResponseEntity subtractBalance(Long idSender, Float value);

}
