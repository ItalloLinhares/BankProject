package service;

import dto.StoreUserDto;
import org.springframework.http.ResponseEntity;

public interface StoreUserService {
    public ResponseEntity createStoreUser(StoreUserDto storeUserDto);
    public ResponseEntity addBalance(Long idReceiver, Float value);
}
