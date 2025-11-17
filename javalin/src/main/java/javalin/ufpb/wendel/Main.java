package javalin.ufpb.wendel;
import java.util.ArrayList;
import java.util.List;

import io.javalin.Javalin;
import javalin.ufpb.wendel.models.user.User;

public class Main {
    
public static void main(String[] args) {

    //Todo: criar um banco de dados em memória para armazenar Users
    List<User> userDATABASE = new ArrayList<>();
    
    var app = Javalin.create()
    .get("/users", ctx -> ctx.result("Primeiro programa"))
    .start(7070);

    //Criar um endpoint POST para criar Users

    app.post("/users/new", ctx -> {
        User newUser = ctx.bodyAsClass(User.class);
        userDATABASE.add(newUser);
        ctx.json(newUser);

        System.out.println("User criado - Nome: "+ newUser.getNome());
        System.out.println("Email: "+ newUser.getEmail());
        System.out.println("Idade: "+ newUser.getIdade());
        System.out.println("Ocupação: "+ newUser.getOcupacao());

        ctx.status(201); //Created
    });

    //GET para listar os Users criados
    app.get("/users/all", ctx -> {
        ctx.json(userDATABASE);
    });

    app.get("/user/{nome}", ctx ->{
        //TODO: Fazer para retornar um usuário pelo nome...

    });


}


}

