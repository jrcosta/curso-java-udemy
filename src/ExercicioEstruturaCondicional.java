public class ExercicioEstruturaCondicional {
    
    public static void main(String[] args) {
        var horas = System.currentTimeMillis() % 24;

        if (horas < 12) {
            System.out.println("Bom dia");
        } else if (horas < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }

}
