package com.example.myapplication;

public class PromedioModelo implements  Main.Modelo{
    private Main.Presentador promedioPresentador;

    public PromedioModelo(Main.Presentador promedioPresentador) {
        this.promedioPresentador= promedioPresentador;
    }

    @Override
     public void calcularPromedio(int nota1, int nota2, int nota3){
     int promedio= (nota1+nota2+nota3)/3;
     promedioPresentador.mostrarResultado(String.valueOf(promedio));
     }
    }
