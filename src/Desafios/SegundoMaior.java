package Desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SegundoMaior {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> penultimo = numeros
                .stream()
                .distinct()//REMOVE DUPLICIDADES
                .sorted(Comparator.reverseOrder())//ORDENAÇÃO INVERSA
                .skip(1)
                .findFirst();//ENCONTRA O SEGUNDO MAIOR NUMERO


        System.out.println(penultimo.get());

    }
}
