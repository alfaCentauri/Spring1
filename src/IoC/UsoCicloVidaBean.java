package IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		DirectorEmpleado Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		System.out.println("Email: " + Juan.getEmail());
		System.out.println("Empresa: " + Juan.getNombreEmpresa());
		contexto.close();
	}

}
