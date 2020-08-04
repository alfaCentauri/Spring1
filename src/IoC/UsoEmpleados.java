package IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		/*Empleados empleado1 = new JefeEmpleado();
		System.out.println(empleado1.getTareas());
		Empleados empleado2 = new SecretarioEmpleado();
		System.out.println(empleado2.getTareas());
		Empleados empleado3 = new DirectorEmpleado();
		System.out.println(empleado3.getTareas());*/
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		DirectorEmpleado Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		System.out.println("Email: " + Juan.getEmail());
		System.out.println("Empresa: " + Juan.getNombreEmpresa());
		Empleados Pedro = contexto.getBean("miEmpleado2", Empleados.class);
		System.out.println(Pedro.getTareas());
		System.out.println(Pedro.getInforme());
		SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInforme());
		System.out.println("Email: " + Maria.getEmail());
		System.out.println("Empresa: " + Maria.getNombreEmpresa());
		contexto.close();
	}

}
