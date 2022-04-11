package Vehiculo_lanzedera;

public class nave1 extends spacecraft {
    private String name1;
    private String pais1;


    public nave1(String empuje, String cargamax, String peso, String altura, String name, String pais){
        super(empuje,cargamax, peso, altura);
        name1 = name;
        pais1 = pais;
    }


    @Override
    public String nave() {

        return "la nave que elejiste es: "+ name1 +" y fue construida en el pais de: "+ pais1;
    }
    }



