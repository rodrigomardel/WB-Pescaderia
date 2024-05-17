package jcolonia.daw2023.ut7.pescaderia;

/**
 * Agrupación de características principales de elemento ticket.
 * 
 * @author Rodrigo Martínez Delgado &lt;rodrigo.mardel.daw@gmail.com&gt;
 * @version 1.0 (20240513)
 */
public class Ticket {

	/** Número de ticket. */
	private int ticket;
	/** Turno actual. */
	private int turno;
	/** Nombre del ticket. */
	private String nombre;

	/** Inicializa y asigna el nombre al elemento. */
	public Ticket(String nombre) {
		this.nombre = nombre;
		turno = 0;
		ticket = 0;
	}

	/**
	 * Incrementa en uno el turno, si el número de ticket es anterior o está en uso
	 * genera un mensaje.
	 * 
	 * @throws TicketException si el dato no es válido
	 */
	public void avanzarTurno() throws TicketException {
		if (turno >= ticket) {
			throw new TicketException("¡No hay tickets activos!");
		}
		turno++;
	}

	/**
	 * Incrementa en uno la numeración del ticket.
	 * 
	 * @return ticket correspondiente
	 * @throws TicketException si el ticket está fuera de rango
	 */
	public int tirarTicket() throws TicketException {
		if (ticket > 99 || ticket < 0) {
			throw new TicketException("** Número de ticket inválido **");
		}
		if (ticket == 99) {
			ticket = 0;
		} else {
			ticket++;
		}
		return ticket;
	}

	/**
	 * Consulta el turno actual.
	 * 
	 * @return el turno correspondiente
	 */
	public int getTurno() {
		return turno;
	}
	
	/**
	 * Consulta el ticket actual.
	 * 
	 * @return el turno correspondiente
	 */
	public int getTicket() {
		return ticket;
	}
	
	/**
	 * Reinica tanto la numeración del ticket como el número de contador a cero.
	 */
	public void restablecer() {
		ticket = 0;
		turno = 0;
	}
	
	/**
	 * Crea un texto con los tres elementos del ticket.<div>
	 * 
	 * <pre>
	 * Pescados Delgado | Ticket: 12 | Turno: 2
	 * </pre>
	 * 
	 * </div>
	 * 
	 * @return texto correspondiente
	 */
	@Override
	public String toString() {
		String texto;
		texto = String.format("(%s,Ticket: %d, Turno: %d%n)", nombre, turno, ticket);
		return texto;

	}
	
}
