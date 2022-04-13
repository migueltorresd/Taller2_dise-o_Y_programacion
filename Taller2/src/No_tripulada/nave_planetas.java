package No_tripulada;
/**
 * se crea extencion de la nave_planetas la cual es la clase padre y se implementa la interface Iyear
 */

public class nave_planetas extends unmanned_ship {
    public String activo2;

    public nave_planetas(String name, String activo) {
        super(name);

        activo2 = activo;
    }
    /**
     * se sobre escribe el siguiente metodo ship1
     *
     * @return nos retorna la informacion requerida por el usuario
     */

    @Override
    public String ship2() {
        return "La nave que elejiste es: " + name_ship + " Actualmente la nave se encuentra en: " + activo2;
    }

}

