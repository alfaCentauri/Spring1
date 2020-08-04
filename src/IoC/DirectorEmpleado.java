package IoC;

public class DirectorEmpleado implements Empleados {
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
			
	/**Constructor con inyección de dependencias.
	 * @param informeNuevo Tipo CreacionInformes.
	 * */
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		return "Gestionar la plantilla de la empresa.";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el director: " + informeNuevo.getInforme();
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	/**
	 * Método init, ejecuta tareas antes de que el bean este disponible.
	 **/
	public void iniciar() {
		System.out.println("Dentro del método init. Se ejecuta antes de que el bean este listo.");
	}
	
	/**
	 * Método destroy, ejecuta tareas después de que el bean sea utilizado.
	 **/
	public void finalizar() {
		System.out.println("Dentro del método destory. Se ejecutan tareas después de que el bean sea utilizado.");
	}
		
}
