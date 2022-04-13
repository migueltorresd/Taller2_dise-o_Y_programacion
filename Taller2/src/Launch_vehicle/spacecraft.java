package Launch_vehicle;
/**
 * author Miguel Angel torres Diaz
 */
public abstract class spacecraft {
    String thrust1;
    String maximum_load1;
    String weight1;
    String height1;
    /**
     * Se crea metodo contructor
     * se inicializan los atributos usados por las dos naves para ete caso
     *
     * @param thrust
     * @param maximum_load
     * @param weight
     * @param height
     */
    public spacecraft(String thrust, String maximum_load, String weight, String height) {
        thrust1 = thrust;
        maximum_load1 = maximum_load;
        weight1 = weight;
        height1 = height;
    }

    /**
     * para los siguientes metodos se retorna los atributos se gun la eleccion del usuario
     *
     * @return
     */
    public String empuje() {return thrust1;}

    public String maximum_load() {
        return maximum_load1;
    }

    public String weight() {
        return weight1;
    }

    public String height() {
        return height1;
    }

    /**
     * metodo abstracto no se implemtenta en esta clase pero en las otras se crea lo que hay a dentro para este caso sera la nave
     * que selecciono el usuario y las especificaciones tecnicas
     *
     * @return
     */
    public abstract String ship();

    public abstract String specifications();


}
