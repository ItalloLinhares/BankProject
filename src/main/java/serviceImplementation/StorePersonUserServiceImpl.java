package serviceImplementation;

import dto.StoreUserDto;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import model.StoreUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import repository.StoreUserRepository;
import service.StoreUserService;

@Service @AllArgsConstructor
public class StorePersonUserServiceImpl implements StoreUserService {
    StoreUserRepository storeUserRepository;
    @Override
    public ResponseEntity createStoreUser(StoreUserDto storeUserDto){
        StoreUser storeUser = new StoreUser(null, storeUserDto.getNumberDocument(), storeUserDto.getUserType(), storeUserDto.getName(), (float) 0, storeUserDto.getEmail(), storeUserDto.getPassword());

        try{
            storeUserRepository.save(storeUser);
            return ResponseEntity.ok(storeUser);
        }catch (Error error){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, error.getMessage(), error);
        }


    }

    @Override
    public ResponseEntity addBalance(Long idReceiver, Float value) {
        return null;
    }


}
