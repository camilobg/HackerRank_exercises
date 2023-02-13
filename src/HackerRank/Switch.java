package HackerRank;//package com.example;

public class Switch {

    public static void main(String[] args) {
        String weather="sunny";
        switch(weather){
            case "Sunny":
                System.out.println("El tiempo es soleado");
                break;
            case "Cloudy":
                System.out.println("El tiempo es nublado");
                break;
            default:
                System.out.println("No se ha encontrado");
                break;

        }
    }
}

