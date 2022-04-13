package Manned_spacecraft;

/**
 * se crea clase hija la cual heredara algunos metodos y atributos de la clase padre
 */
public class experimentation extends model_ship {
    public String description;

    /**
     * se heredan los siguientes atributos de la clase padre
     *
     * @param name
     * @param des
     */
    public experimentation(String name, String des) {
        super(name);
        description = des;
        /**
         * se sobre escribe el siguiente metodo ship1
         *
         * @return nos retorna la informacion requerida por el usuario
         */
    }

    @Override
    public String ship1() {
        return "La nave que elejiste es: " + name_ship;
    }
}
