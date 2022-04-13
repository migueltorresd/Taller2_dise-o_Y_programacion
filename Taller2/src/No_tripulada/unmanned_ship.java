package No_tripulada;

public abstract class unmanned_ship {
    String name_ship;
    /**
     * Se crea metodo contructor
     * se inicializan los atributos usados por las dos naves para este caso
     */

    public unmanned_ship(String name1) {
        name_ship = name1;
    }
    /**
     * para el siguiente metodo se retorna los atributos segun la eleccion del usuario
     *
     * @return
     */
    public String name1() {
        return name_ship;
    }
    /**
     * metodo abstracto no se implemtenta en esta clase pero en las otras se crea lo que hay a dentro para este caso sera la nave
     * que selecciono el usuario y las especificaciones tecnicas
     *
     * @return
     */
    public abstract String ship2();

    public String ship_for_planet(String planet1) {
        return "Esta nave tiene como destino:  " + planet1;
    }
}
