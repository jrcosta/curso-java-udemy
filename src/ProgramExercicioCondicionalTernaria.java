public class ProgramExercicioCondicionalTernaria {
    
    public static void main(String[] args) {
        var horas = System.currentTimeMillis() % 24;

        var mensagem = horas < 12 ? "Bom dia" : horas < 18 ? "Boa tarde" : "Boa noite";

        System.out.println(mensagem);
    }

}
