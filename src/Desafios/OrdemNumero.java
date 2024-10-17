package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrdemNumero {
    public static void main(String [] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros
                .stream()//Converte a lista em um fluxo(Stream)
                .sorted()//Responsavel por ordenar em ordem crescente os numeros
                .forEach(System.out::println);//Percorre os elementos e imprime cada um no console


    }
}
