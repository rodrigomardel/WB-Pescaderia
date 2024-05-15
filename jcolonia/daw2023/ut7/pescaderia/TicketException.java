package jcolonia.daw2023.ut7.pescaderia;

/**
 * Excepción usada en la aplicación «WBPescadería». Alerta generalmente de datos
 * incorrectos no válidos.
 * 
 * @version 1.1 (20240515)
 * @author Rodrigo Martínez Delgado &lt;rodrigo.mardel.daw@gmail.com&gt;
 */
public class TicketException extends Exception {
	/**
	 * Número de serie, asociado a la versión de la clase.
	 */
	private static final long serialVersionUID = 20240515000L;
	
	
	/**
	 * Crea una nueva excepción sin ninguna información adicional. No contiene
	 * ningún texto descriptivo.
	 * 
	 * @see Exception#Exception()
	 */
	public TicketException() {
	}
	
	/**
	 * Crea una nueva excepción con un texto descriptivo.
	 * 
	 * @param mensaje el texto correspondiente.
	 * @see Exception#Exception(String)
	 */
	public TicketException(String mensaje) {
		super(mensaje);
	}
	
	/**
	 * Crea una excepción secundaria almacenando otra excepción de referencia –o
	 * cualquier {@link Throwable}. Emplea como texto descriptivo el de la excepción
	 * encapsulada.
	 * 
	 * @param causa la excepción –o {@link Throwable}– correspondiente
	 * @see Exception#Exception(Throwable)
	 */
	public TicketException(Throwable causa) {
		super(causa);
	}
	
	/**
	 * Crea una excepción secundaria almacenando otra excepción de referencia –o
	 * cualquier {@link Throwable}– y un texto descriptivo personalizado. El texto
	 * descriptivo puede así ser diferente al de la excepción contenida.
	 * 
	 * @param mensaje el texto correspondiente
	 * @param causa   la excepción –o {@link Throwable}– correspondiente
	 * @see Exception#Exception(String, Throwable)
	 */
	public TicketException(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}
	
	/**
	 * Crea una excepción secundaria almacenando otra excepción de referencia –o
	 * cualquier {@link Throwable}– y un texto descriptivo personalizado; con
	 * posibilidad de habilitar o deshabilitar la supresión o la edición de pila.
	 * 
	 * @param mensaje            el texto descriptivo a incorporar
	 * @param causa              la excepción a incorporar
	 * @param habilitarSupresión si la supresión está habilitada o no
	 * @param trazaPilaEditable  si la edición de pila está habilitada o no
	 * @see Exception#Exception(String, Throwable, boolean, boolean)
	 * @see Throwable#fillInStackTrace()
	 * @see Throwable#addSuppressed(Throwable)
	 */
	public TicketException(String mensaje, Throwable causa, boolean habilitarSupresión, boolean trazaPilaEditable) {
		super(mensaje, causa, habilitarSupresión, trazaPilaEditable);
	}

}
