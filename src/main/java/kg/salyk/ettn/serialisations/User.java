package kg.salyk.ettn.serialisations;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@Builder // Добавьте эту аннотацию для поддержки билдера
@AllArgsConstructor
@NoArgsConstructor
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)


public class User {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonIgnore // Игнорирует это поле при десериализации
    private Integer id;
    private String name;
    private String email;
    private String gender;
    private String status;



}
