package IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Pedro = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(Maria);		
		System.out.println(Pedro);
		if(Maria == Pedro)
			System.out.println("Apuntan al mismo objeto.");
		else
			System.out.println("Apuntan a objetos diferentes.");
		
		contexto.close();
	}

}
