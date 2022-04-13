package Launch_vehicle;

/**
 * se crea extencion de la clase Spacecraft la cual es la clase padre
 */
public class nave1 extends spacecraft {
    private String name1;
    private String country1;

    /**
     * se heredan los siguientes atributos de la clase padre
     *
     * @param thrust
     * @param maximum_load
     * @param weight
     * @param height
     * @param name
     * @param pais
     */
    public nave1(String thrust, String maximum_load, String weight, String height, String name, String pais) {
        super(thrust, maximum_load, weight, height);
        name1 = name;
        country1 = pais;
    }

    /**
     * se sobre escribe los siguientes metodos ship y specifications
     *
     * @return nos retorna la informacion requerida por el usuario
     */
    @Override
    public String ship() {

        return "La nave que elejiste es: " + name1 + " y fue construida en el pais de: " + country1;
    }

    @Override
    public String specifications() {
        return "Empuje: " + thrust1 + "\n" + "Peso de la nave: " + weight1 + "\n" + "carga maxima: " + maximum_load1 + "\n" + "Altura: " + height1;

    }

}



