import java.time.LocalDate;
import java.util.Locale;
import java.time.format.DateTimeFormatter;

public class ProgramExercicioDatas {
    public static void main(String[] args) {

        LocalDate data = LocalDate.of(1992, 5, 16);
        Locale locale = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy", locale);        

        System.out.println("Data: " + data.format(formatter));
        System.out.println("Adicionado 4 dias a data: " + data.plusDays(4).format(formatter));
        System.out.println("Adicionado 2 meses a data: " + data.plusMonths(2).format(formatter));
        System.out.println("Adicionado 4 anos a data: " + data.plusYears(4).format(formatter));
        System.out.println("Subtraido 2 dias da data: " + data.minusDays(2).format(formatter));
        System.out.println("Subtraido 1 mês da data: " + data.minusMonths(1).format(formatter));
        System.out.println("Subtraido 2 anos da data: " + data.minusYears(2).format(formatter));
        System.out.println("Dia da semana: " + data.getDayOfWeek());
        System.out.println("Dia do mês: " + data.getDayOfMonth());
        System.out.println("Dia do ano: " + data.getDayOfYear());
        System.out.println("Mês: " + data.getMonth());
        System.out.println("Valor do mês: " + data.getMonthValue());
        System.out.println("Ano: " + data.getYear());
        System.out.println("Ano bissexto: " + data.isLeapYear());
        System.out.println("Quantidade de dias do mês: " + data.lengthOfMonth());
        System.out.println("Quantidade de dias do ano: " + data.lengthOfYear());
        System.out.println("Alterar o dia do mês: " + data.withDayOfMonth(15).format(formatter));
        System.out.println("Alterar o dia do ano: " + data.withDayOfYear(365).format(formatter));
        System.out.println("Alterar o mês: " + data.withMonth(12).format(formatter));
        System.out.println("Alterar o ano: " + data.withYear(2022).format(formatter));
    }
}