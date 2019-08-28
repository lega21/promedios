package com.example.myapplication;

public class PromedioPresentador implements Main.Presentador {
    private Main.Modelo promedioModelo;
    private Main.View promedioVista;
    public PromedioPresentador (Main.View view){
    this.promedioVista=view;
    promedioModelo= new PromedioModelo(this);
    }

    @Override
    public void mostrarResultado(String resultado) {
        if (promedioVista!= null) {
            int promedio = Integer.parseInt(resultado);

            if (17<= promedio && promedio <=20 ){
                resultado+="Logro destacado";

            }else  if (14<= promedio && promedio <=17){
                resultado+="Logro medio";

            }else  if (12.5<= promedio && promedio <=14){
                resultado+="Logro Bajo";

            }else  if (12.5 > promedio)
                resultado+="No logrado";

            promedioVista.mostrarResultado(resultado);
        }

    }

    @Override
    public void calcularPromedio(int nota1, int nota2, int nota3) {
        if(promedioVista!=null){
            promedioModelo.calcularPromedio(nota1,nota2, nota3);{

            }
        }

    }


}
