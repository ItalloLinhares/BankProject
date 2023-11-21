package controller;


import dto.PersonUserDto;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PersonUserService;

@RestController @AllArgsConstructor
public class IndexController {
    private final PersonUserService personUserService;

    @RequestMapping("/")
    public String teste(){
        return "Funcionando!";
    }
    @PostMapping("/create/PersonUser")
    public ResponseEntity createPersonUser(@Valid @RequestBody PersonUserDto personUserDto){
       return personUserService.createPersonUser(personUserDto);
    };

    @PostMapping("/create/StoreUser")
    public void createStoreUser(){

    };
}
