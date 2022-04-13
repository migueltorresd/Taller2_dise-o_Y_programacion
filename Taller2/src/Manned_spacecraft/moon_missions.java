package Manned_spacecraft;

/**
 * se crea extencion de la moon_missions la cual es la clase padre y se implementa la interface Iyear
 */
public class moon_missions extends model_ship implements Iyear {
       public String activo2;

    public moon_missions(String name, String activo) {
        super(name);

        activo2 = activo;
    }

    /**
     * se sobre escribe el siguiente metodo ship1
     *
     * @return nos retorna la informacion requerida por el usuario
     */

    @Override
    public String ship1() {
        return "La nave que elejiste es: " + name_ship  ;
    }

}