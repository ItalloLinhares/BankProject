package dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;
@AllArgsConstructor @NoArgsConstructor @Data
public class StoreUserDto {
    @NotBlank @CNPJ
    private String numberDocument;
    @NotBlank
    private String userType;
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
