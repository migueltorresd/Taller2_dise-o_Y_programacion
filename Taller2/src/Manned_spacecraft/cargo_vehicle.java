package Manned_spacecraft;

/**
 * se crea extencion de la cargo_vehicle la cual es la clase padre y se implementa la interface Icountry
 */
public class cargo_vehicle extends model_ship implements Icountry {
    public String description1;
    public String year1;

    /**
     * se heredan los siguientes atributos de la clase padre
     *
     * @param name
     * @param desc
     * @param years
     */

    public cargo_vehicle(String name, String desc, String years) {
        super(name);
        description1 = desc;
        year1 = years;
    }

    /**
     * se sobre escribe el siguiente metodo ship1
     *
     * @return nos retorna la informacion requerida por el usuario
     */
    @Override
    public String ship1() {
        return "La nave que elejiste es: " + name_ship;
    }


}
