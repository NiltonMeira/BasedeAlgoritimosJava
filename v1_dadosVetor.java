import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class v1_dadosVetor {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        List list = new ArrayList<>();

        Integer valor;
        Integer count = 0;

        for (int i = 0; i < 7; i++) {
            valor = ThreadLocalRandom.current().nextInt(0, 6);
            System.out.println(valor);

            list.add(valor);
        }

        for (int i = 0; i < 7; i++) {
            count = 0;
            for (int j = 0; j < 7; j++) {
                if ((Integer) list.get(j) == i) {
                    count++;
                }

            }
            System.out.println("The number " + i + " was sorted " + count + " times");
        }
    }
}
