package builder.dto;

import java.util.ArrayList;
import java.util.List;

import builder.IBuilder;

/**
 * La clae Employee es la clase más interesante de este programa, ya que además
 * de represntar el objeto al que nos estamos enfocando y que queremos
 * construir, tambien tiene una inner class llmada EmployeeBuilder que
 * implementa el patrón de diseño Builder, esta clase tine la particularidad de
 * ser una clase static lo que hace que sea total mente independiente de una
 * instancia de la clase Employee.
 * 
 * La clase EmployeeBuilder tiene un conjunto de métodos que nos permite
 * establecer las propiedades del empleadoe incluso sus relaciones con otros
 * objetos, estos métodos deben retornar a si misma como ya lo habíamos
 * comentado, esta característica será escencial. Finalmente, podemos observar
 * que la clase implementa la interface IBuilder y define como tipo genérico la
 * clase Employee lo que la obliga a definir el método build con el mismo tipo
 * de retorno.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class Employee {

	private String name;
	private String gender;
	private int age;
	private Address address;
	private List<Phone> phones = new ArrayList<Phone>();
	private List<Contact> contacs = new ArrayList<Contact>();

	public Employee(String name, String gender, int age, Address address, List<Phone> phones, List<Contact> contacs) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.phones = phones;
		this.contacs = contacs;
	}

	public Employee(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public List<Contact> getContacs() {
		return contacs;
	}

	public void setContacs(List<Contact> contacs) {
		this.contacs = contacs;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address + ", phones="
				+ phones + ", contacs=" + contacs + "]";
	}


	public static class EmployeeBuilder implements IBuilder<Employee> {

		private String name;
		private String gender;
		private int age;
		private Address address;
		private List<Phone> phones = new ArrayList<Phone>();
		private List<Contact> contacs = new ArrayList<Contact>();

		public EmployeeBuilder() {
		}

		public EmployeeBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public EmployeeBuilder setGender(String gender) {
			this.gender = gender;
			return this;
		}

		public EmployeeBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public EmployeeBuilder setAddress(String address, String city, String country, String cp) {
			this.address = new Address(address, city, country, cp);
			return this;
		}

		public EmployeeBuilder addPhones(String phoneNumber, String ext, String phoneType) {
			phones.add(new Phone(phoneNumber, ext, phoneType));
			return this;
		}

		public EmployeeBuilder addContacts(String name, String phoneNumber, String ext, String phoneType,
				String address, String city, String country, String cp) {
			contacs.add(
					new Contact(name, new Phone(phoneNumber, ext, phoneType), new Address(address, city, country, cp)));
			return this;
		}

		public EmployeeBuilder addContacts(String name, String phoneNumber, String ext, String phoneType) {
			contacs.add(new Contact(name, new Phone(phoneNumber, ext, phoneType)));
			return this;
		}

		public Employee build() {
			return new Employee(name, gender, age, address, phones, contacs);
		}

	}

}
