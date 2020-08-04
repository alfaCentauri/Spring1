package IoC;

public class SecretarioEmpleado implements Empleados {
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;

	@Override
	public String getInforme() {
		return "Informe presentado por el secretario: " + informeNuevo.getInforme();
	}

	@Override
	public String getTareas() {
		return "Gestionar la agenda de los Jefes.";
	}

	/**
	 * Inyección de dependencias por metodo setter.
	 * @param informeNuevo the informeNuevo to set
	 */
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
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
