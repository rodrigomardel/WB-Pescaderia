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
	}

	/**
	 * Incrementa en uno el turno, si el número de ticket es anterior o está en uso
	 * genera un mensaje.
	 * 
	 * @throws TicketException si el dato no es válido
	 */
	public void avanzarTurno() throws TicketException {
		if (turno <= ticket) {
			throw new TicketException("Ticket anterior o actualmente en uso");
		}
		turno++;
	}

	/**
	 * Incremento en uno la numeración del ticket.
	 * 
	 * @return ticket correspondiente
	 */
	public int tirarTicket() {
		if (ticket == 99) {
			ticket = 0;
		}
		ticket++;
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
	 * Reinica el tanto la numeración del ticket como el número de contador a cero.
	 */
	public void restablecer() {
		ticket = 0;
		turno = 0;

	}
}
