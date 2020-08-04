package IoC;

public class JefeEmpleado implements Empleados{
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
	/**Constructor con inyección de dependencias.
	 * @param informeNuevo Tipo CreacionInformes.
	 * */
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de sección.";
	}

	@Override
	public String getInforme() {
		return "Informe presentado por el Jefe con revisiones: " + informeNuevo.getInforme();
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
	
}
