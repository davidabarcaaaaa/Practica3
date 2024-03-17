package mates;

import java.util.function.IntToDoubleFunction;
import java.util.stream.IntStream;

public class Matematicas {

    public static double generarNumeroPiLambda(int pasos) {
        IntToDoubleFunction funcionMonteCarlo = (int i) -> {
            double x = Math.random();
            double y = Math.random();
            return (x * x + y * y) <= 1.0 ? 1 : 0;
        };

        double dentroDelCirculo = IntStream.range(0, pasos)
                                           .mapToDouble(funcionMonteCarlo)
                                           .sum();

        return (dentroDelCirculo / pasos) * 4;
    }
}
