package javalin.ufpb.wendel;
import io.javalin.Javalin;

public class Main {
public static void main(String[] args) {
    
    var app = Javalin.create()
    .get("/", ctx -> ctx.result("Primeiro programa"))
    .start(7070);
    
}
}
