/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n7_cupiCava
 * Autor: Equipo Cupi2 2020
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.cupiCava.mundo;jkhkjh

/**
 * Clase que representa un vino almacenado en la Cupi-Cava.<br>
 * <b>inv: </b> <br>
 * TODO Parte1 PuntoA: Declare la invariante de la clase.
 */
public class Vino
{
    // -------------------------------------------------------------
    // Constantes
    // -------------------------------------------------------------

    /**
     * Constante que representa la presentación barril.
     */
    public final static String BARRIL = "Barril";

    /**
     * Constante que representa la presentación botella.
     */
    public final static String BOTELLA = "Botella";

    /**
     * Constante que representa el color tinto.
     */
    public final static String TINTO = "Tinto";

    /**
     * Constante que representa el color rosado.
     */
    public final static String ROSADO = "Rosado";

    /**
     * Constante que representa el color blanco.
     */
    public final static String BLANCO = "Blanco";

    /**
     * Constante que representa el tipo de vino seco.
     */
    public final static String SECO = "Seco";

    /**
     * Constante que representa el tipo de vino abocado.
     */
    public static final String ABOCADO = "Abocado";

    /**
     * Constante que representa el tipo de vino semi-seco.
     */
    public static final String SEMI_SECO = "Semi-seco";

    /**
     * Constante que representa el tipo de vino semi-dulce.
     */
    public static final String SEMI_DULCE = "Semi-dulce";

    /**
     * Constante que representa el tipo de vino dulce.
     */
    public static final String DULCE = "Dulce";

    // -------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------

    /**
     * Nombre del vino.
     */
    private String nombre;

    /**
     * Presentación del vino.
     */
    private String presentacion;

    /**
     * Año de elaboración del vino.
     */
    private int anhoElaboracion;

    /**
     * Contenido en azúcar del vino (gramos/litro).
     */
    private double contenidoAzucar;

    /**
     * Tipo del vino.
     */
    private String tipo;

    /**
     * Color del vino.
     */
    private String color;

    /**
     * Lugar de origen del vino.
     */
    private String lugarOrigen;

    /**
     * Ruta donde se encuentra la imagen del vino.
     */
    private String imagen;

    // -------------------------------------------------------------
    // Constructores
    // -------------------------------------------------------------

    /**
     * Inicializa el vino con la información dada por parámetro. <br>
     * <b>post: </b> El vino se inicializó con los valores de nombre, presentación, año elaboración, contenido en azúcar, tipo, color, lugar de origen e imagen dados por
     * parámetro.
     * @param pNombre Nombre del vino. pNombre != null && pNombre != "".
     * @param pPresentacion Presentación del vino. pPresentacion != null && pPresentacion != "" && (pPresentacion == BOTELLA || pPresentacion == BARRIL).
     * @param pAnhoElaboracion Año de elaboración del vino. pAnhoElaboracion > 0.
     * @param pContenidoAzucar Contenido en azúcar del vino. pContenidoAzucar >= 0
     * @param pTipo Tipo de vino de acuerdo a su contenido en azúcar. pTipo != null && pTipo != "" && (pTipo == SECO || pTipo == ABOCADO || pTipo == SEMI_SECO || pTipo ==
     *        SEMI_DULCE || pTipo == DULCE).
     * @param pColor Color del vino. pColor != null && pColor != "" && (pColor == TINTO || pColor == ROSADO || pColor == BLANCO).
     * @param pLugarOrigen Lugar de origen del vino. lugarElaboracion != null y lugarElaboracion != "".
     * @param pImagen Imagen del vino. pImagen != null && pImagen != "".
     */
    public Vino( String pNombre, String pPresentacion, int pAnhoElaboracion, double pContenidoAzucar, String pTipo, String pColor, String pLugarOrigen, String pImagen )
    {
        nombre = pNombre;
        presentacion = pPresentacion;
        anhoElaboracion = pAnhoElaboracion;
        contenidoAzucar = pContenidoAzucar;
        tipo = pTipo;
        color = pColor;
        lugarOrigen = pLugarOrigen;
        imagen = pImagen;

    }

    // -------------------------------------------------------------
    // Métodos
    // -------------------------------------------------------------

    /**
     * Retorna el nombre del vino.
     * @return Nombre del vino.
     */
    public String darNombre( )
    {
        return nombre;
    }

    /**
     * Retorna la presentación del vino.
     * @return Presentación del vino.
     */
    public String darPresentacion( )
    {
        return presentacion;
    }

    /**
     * Retorna el año de elaboración del vino.
     * @return Año de elaboración del vino.
     */
    public int darAnhoElaboracion( )
    {
        return anhoElaboracion;
    }

    /**
     * Retorna el contenido en azúcar del vino.
     * @return Contenido en azúcar del vino.
     */
    public double darContenidoAzucar( )
    {
        return contenidoAzucar;
    }

    /**
     * Retorna el tipo del vino.
     * @return Tipo del vino.
     */
    public String darTipo( )
    {
        return tipo;
    }

    /**
     * Retorna el color del vino.
     * @return Color del vino.
     */
    public String darColor( )
    {
        return color;
    }

    /**
     * Retorna el lugar de origen del vino.
     * @return Lugar de origen del vino.
     */
    public String darLugarOrigen( )
    {
        return lugarOrigen;
    }

    /**
     * Retorna la imagen del vino.
     * @return Imagen del vino.
     */
    public String darImagen( )
    {
        return imagen;
    }

    /**
     * Compara dos vinos según el nombre. <br>
     * @param pVino Vino contra el cual se está comparando. pVino !=null.
     * @return Retorna 0 si los vinos tienen el mismo nombre. <br>
     *         Retorna -1 si el vino pVino tiene un valor "MAYOR" para el nombre. <br>
     *         Retorna 1 si el vino pVino tiene un valor "MENOR" para el nombre. <br>
     */
    public int compararPorNombre( Vino pVino )
    {
    	 return nombre.compareToIgnoreCase(pVino.darNombre()); //(m)
    }

    /**
     * Compara dos vinos según la presentación. <br>
     * @param pVino Vino contra el cual se está comparando. pVino !=null.
     * @return Retorna 0 si los vinos tienen la misma presentación. <br>
     *         Retorna -1 si el vino pVino tiene un valor "MAYOR" para la presentación. <br>
     *         Retorna 1 si el vino pVino tiene un valor "MENOR" para la presentación. <br>
     */
    public int compararPorPresentacion( Vino pVino )
    {
   	  return presentacion.compareToIgnoreCase(pVino.darPresentacion()); //(m)
   }

    /**
     * Compara dos vinos según el año de elaboración. <br>
     * @param pVino Vino contra el cual se está comparando. pVino !=null.
     * @return Retorna 0 si los vinos tienen el mismo año de elaboración. <br>
     *         Retorna -1 si el vino pVino tiene un valor "MAYOR" para el año de elaboración. <br>
     *         Retorna 1 si el vino pVino tiene un valor "MENOR" para el año de elaboración. <br>
     */
    public int compararPorAnhoElaboracion( Vino pVino )
    {
   	 return Integer.compare(anhoElaboracion, pVino.darAnhoElaboracion()); //(m)
   }

    /**
     * Compara dos vinos según el contenido en azúcar. <br>
     * @param pVino Vino contra el cual se está comparando. pVino !=null.
     * @return Retorna 0 si los vinos tienen el mismo contenido en azúcar. <br>
     *         Retorna -1 si el vino pVino tiene un mayor contenido en azúcar. <br>
     *         Retorna 1 si el vino pVino tiene un menor contenido en azúcar. <br>
     */
    public int compararPorContenidoAzucar( Vino pVino )
    {
   	 return Double.compare(contenidoAzucar, pVino.darContenidoAzucar()); // (m)
   }

    /**
     * Compara dos vinos según el tipo de vino. <br>
     * @param pVino Vino contra el cual se está comparando. pVino !=null.
     * @return Retorna 0 si los vinos tienen el mismo tipo. <br>
     *         Retorna -1 si el vino pVino tiene un valor "MAYOR" para el tipo. <br>
     *         Retorna 1 si el vino pVino tiene un valor "MENOR" para el tipo. <br>
     */
    public int compararPorTipo( Vino pVino )
    {
   	 return tipo.compareToIgnoreCase(pVino.darTipo()); //(m)
   }

    /**
     * Compara dos vinos según el color. <br>
     * @param pVino Vino contra el cual se está comparando. pVino !=null.
     * @return Retorna 0 si los vinos tienen el mismo color. <br>
     *         Retorna -1 si el vino pVino tiene un valor "MAYOR" para el color. <br>
     *         Retorna 1 si el vino pVino tiene un valor "MENOR" para el color. <br>
     */
    public int compararPorColor( Vino pVino )
    {
   	 return color.compareToIgnoreCase(pVino.darColor()); // (m)
    }

    /**
     * Compara dos vinos según el lugar de origen. <br>
     * @param pVino Vino contra el cual se está comparando. pVino !=null.
     * @return Retorna 0 si los vinos tienen el mismo lugar de origen. <br>
     *         Retorna -1 si el vino pVino tiene un valor "MAYOR" para el lugar de origen. <br>
     *         Retorna 1 si el vino pVino tiene un valor "MENOR" para el lugar de origen. <br>
     */
    public int compararPorLugarOrigen( Vino pVino )
    {
   	return lugarOrigen.compareToIgnoreCase(pVino.darLugarOrigen()); // (m)
   }

    /**
     * Retorna una cadena con el nombre del vino.
     * @return Representación del vino en una cadena de caracteres.
     */
    public String toString( )
    {
        return nombre;
    }

    // -----------------------------------------------------------------
    // Invariante (m)
    // -----------------------------------------------------------------

   
    private void verificarInvariante()
    {
        assert nombre != null && !nombre.isEmpty() : "El nombre no puede ser nulo o vacío";
        assert presentacion != null && (presentacion.equals(BOTELLA) || presentacion.equals(BARRIL)) : "La presentación debe ser BOTELLA o BARRIL";
        assert anhoElaboracion > 0 : "El año de elaboración debe ser positivo";
        assert contenidoAzucar >= 0 : "El contenido en azúcar no puede ser negativo";
        assert tipo != null && (tipo.equals(SECO) || tipo.equals(ABOCADO) || tipo.equals(SEMI_SECO) || tipo.equals(SEMI_DULCE) || tipo.equals(DULCE)) : "El tipo debe ser uno de los valores válidos";
        assert color != null && (color.equals(TINTO) || color.equals(ROSADO) || color.equals(BLANCO)) : "El color debe ser uno de los valores válidos";
        assert lugarOrigen != null && !lugarOrigen.isEmpty() : "El lugar de origen no puede ser nulo o vacío";
        assert imagen != null && !imagen.isEmpty() : "La imagen no puede ser nula o vacía";
    }
}
