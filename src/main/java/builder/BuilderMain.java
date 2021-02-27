package builder;

import builder.dto.Employee;

/**
 * Ésta clase es una clase ejecutable que intenta demostrar el uso del Builder
 * al crear una instancia de la clase Employee.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class BuilderMain {

	public static void main(String[] args) {
		Employee emp = new Employee.EmployeeBuilder()
				.setName("Victor Hugo Aguilar Aguilar")
				.setAge(35)
				.setGender("Masculino")
				.setAddress("Calle Diosa Tanit", "Alicante", "España", "03016")
				.addPhones("627100491", "0034", "Móvil")
				.addContacts("Paula Valeria", "666555444", "0034", "Móvil")
				.build();
		System.out.println(emp);
	}
}
