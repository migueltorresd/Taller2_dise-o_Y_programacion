
/**
 * author Miguel Angel torres Diaz
 */
package Manned_spacecraft;

public abstract class model_ship {
    String name_ship;

    /**
     * Se crea metodo contructor
     * se inicializan los atributos usados por las dos naves para este caso
     */

    public model_ship(String name) {
        name_ship = name;

    }

    /**
     * para el siguiente metodo se retorna los atributos segun la eleccion del usuario
     *
     * @return
     */
    public String name() {
        return name_ship;
    }

    /**
     * metodo abstracto no se implemtenta en esta clase pero en las otras se crea lo que hay a dentro para este caso sera la nave
     * que selecciono el usuario y las especificaciones tecnicas
     *
     * @return
     */
    public abstract String ship1();

    public String year_of_activity(String years) {
        return "los años de actividad fueron: " + "\n" + years;
    }

    public String country_of_manufacture(String country) {
        return "El pais donde la construyeron fue: " + country;
    }


}