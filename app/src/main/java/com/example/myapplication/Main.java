package com.example.myapplication;

public interface Main {
     interface View{
         public void mostrarResultado(String resultado);


    }


     interface Presentador {
         void mostrarResultado(String resultado);
         void calcularPromedio(int nota1, int nota2, int nota3);

        }


        interface Modelo {
         void calcularPromedio(int nota1, int nota2, int nota3);



            }
   }
