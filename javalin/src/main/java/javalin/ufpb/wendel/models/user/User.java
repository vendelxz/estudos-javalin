package javalin.ufpb.wendel.models.user;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String nome;

    private String email;

    private int idade;

    private Ocupacao ocupacao;

}
