package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CalculoMaiorCinco {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosMaiorCinco =numeros
                .stream()
                .filter(n -> n >= 5).collect(Collectors.toList());

        int soma = numerosMaiorCinco.stream().reduce(0, Integer::sum);

        System.out.println(soma);
    }
}
