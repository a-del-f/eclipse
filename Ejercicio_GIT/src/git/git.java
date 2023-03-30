package git;

public class git {
public static void main(String[] args) {
	System.out.println("Listado de alumnos 1º DAW");
	System.out.println("alumno 1:");
	Alumno aa=new Alumno("pepe","perez","32423424Y");
}
class Alumno{
	private String nombre;
	private String apellido;
	private String dni;
	
	Alumno(String nombre,String apellido,String dni){
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
	}
	@Override
	public String toString() {
		
		
		return "El nombre es"+this.nombre+" el apellido es "+this.apellido+"el dni es "+this.dni;
		
	}
}
}
