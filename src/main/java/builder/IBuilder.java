package builder;

/**
 * La Interface IBUilder la utilizaremos para tener un interface en común entre
 * todos los Builder que creemos en la aplicación, esta interface es opcional y
 * no es necesaria crearla, sin embargo, la creamos pensando en que prodriamos
 * tener más clases Builder para crear otros objetos. Podemos aprecia que la
 * interface tiene un tipo genérico T, el qcual reemplazaremos por el tipo de
 * objeto que queremos construir, el genérico también lo utilizamos en el método
 * build, el cual regresa un objeto de tipo T, este método será el que
 * finalmente construya el Empleado.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 * @param <T>
 */
public interface IBuilder<T> {

	public T build();
}
