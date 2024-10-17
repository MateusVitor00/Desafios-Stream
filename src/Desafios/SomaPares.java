package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SomaPares {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numPares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        int soma = numPares.stream().reduce(0, Integer::sum);
        System.out.println(soma);
    }
}
