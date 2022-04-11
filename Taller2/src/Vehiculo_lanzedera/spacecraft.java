package Vehiculo_lanzedera;

public abstract class spacecraft {
    String empuje1;
    String cargamax1;
    String peso1;
    String altura1;

    //contructor
    public spacecraft(String empuje, String cargamax, String peso, String altura) {
        empuje1 = empuje;
        cargamax1 = cargamax;
        peso1 = peso;
        altura1 = altura;
    }

    public String empuje() {
        return empuje1;
    }

    public String cargamax() {
        return cargamax1;
    }
    public String peso() {
        return peso1;
    }

    public String altura() {
        return altura1;
    }

    //metodo abstracto no se implemtenta
    public abstract String nave();
}
