import java.util.Date;

import entities.ClasseExercicioOrderEnum;
import entities.enums.ExercicioOrderEnum;

public class ProgramExercicioOrderEnums {
    
    public static void main(String[] args) {
        
        ClasseExercicioOrderEnum order = new ClasseExercicioOrderEnum(1080, new Date(), ExercicioOrderEnum.PEDING_PAYMENT);

        System.out.println(order);

        ExercicioOrderEnum order2 = ExercicioOrderEnum.valueOf("DELIVERED");

        System.out.println(order2);
    }

}
