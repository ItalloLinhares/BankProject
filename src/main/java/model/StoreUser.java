package model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class StoreUser{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @NotBlank
    @CNPJ
    private String numberDocument;
    @NotBlank
    private String userType;
    @NotBlank
    private String name;
    @NotNull
    private float balance;
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
