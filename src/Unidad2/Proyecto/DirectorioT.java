package Unidad2.Proyecto;

import java.util.ArrayList; //se necesita importar esta clase
import java.util.Scanner;

public class DirectorioT {
	// Sebastian A.
	final private ArrayList<Contacto> contactosArrayList = new ArrayList<>(); //Se crea una lista de arreglos.
	//esta lista de arreglos recibira el nombre de contactos arraylist, la cual esta creada basada en la clase
	//Contacto
	final private Scanner input = new Scanner(System.in);
	
	/*
		1. Se crea el primer metodo para imprimir todos los valores de la agenda
	 */
	// Brian
	public void imprimirContactos() {
		for (Contacto contacto : contactosArrayList) { //Se crea un objeto de la clase Contacto
			System.out.println(contacto); // recibe el nombre contacto y esta ligado al arreglo mediante el :
		}	
	}

	/*
		2. Imprimir todos los contactos en orden de tipo de telefono.
	 */
	// Brian
	public void imprimirContactoPorTipo() {
		System.out.println("== Movil ==");
		for (Contacto contacto : contactosArrayList) {
			//Se imprimen los objetos que tengan Movil en su tipo de telefono.
			if (contacto.getTipoDeTelefono().equals("Movil")) {
				System.out.println(contacto);
			}
		}

		System.out.println("\n== Casa ==");
		for (Contacto contacto : contactosArrayList) {
			//se imprimen los objetos que tengan Casa en su tipo de telefono
			if (contacto.getTipoDeTelefono().equals("Casa")) {
				System.out.println(contacto);
			}
		}

		System.out.println("\n== Oficina ==");
		for (Contacto contacto : contactosArrayList) {
			//Se imprimen los objetos que tengan Oficina en su tipo de telefono
			if (contacto.getTipoDeTelefono().equals("Oficina")) {
				System.out.println(contacto);
			}
		}
	}

	/*
		3. Agregar un Contacto
	 */
	// Sebastian A.
	public void agregarContacto() {
		int idContacto = 0, auxiliar = 0;
		String nombre="", apellido="", alias="", tipoDeTelefono="", numeroTelefonico="", email="";

		System.out.println("Ingrese el ID del Contacto");
		do { 	// Validar
			idContacto = input.nextInt();
		} while (elIdEsRepedito(idContacto));

		System.out.println("Ingrese el nombre del Contacto");
		nombre = input.next();

		System.out.println("Ingrese el apellio del contacto");
		apellido = input.next();

		System.out.println("Ingrese el alias el contacto");
		alias = input.next();

		System.out.println("Ingrese una opcion de Tipo de telefono || 1. Movil || 2. Casa || 3. Oficina");
		do {	// Validar
			auxiliar = input.nextInt();
			switch (auxiliar) {
			case 1:
				tipoDeTelefono ="Movil";
				break;
			case 2:
				tipoDeTelefono = "Casa";
				break;
			case 3:
				tipoDeTelefono ="Oficina";
				break;
			default:
				System.out.println("Ingrese un valor valido");
			}
		} while(!(auxiliar >= 1 && auxiliar <= 3)); //Se repite hasta que se elijan valores del 1 al 3
		
		do { 	// Validar
			System.out.println("Ingrese el numero telefonico del contacto con 10 digitos sin letras");
			numeroTelefonico = input.next();
		} while (numeroTelefonico.length() != 10 || telefonoTieneLetras(numeroTelefonico));

		System.out.println("Ingrese el email del contacto");
		email = input.next();
		contactosArrayList.add(new Contacto(idContacto,nombre, apellido, alias, tipoDeTelefono, numeroTelefonico, email));
		
	}

	// Emmanuel
	// Un metodo auxiliar para comprobar el telefono que no contenga caracteres alfabeticos o especiales
	protected boolean telefonoTieneLetras (String numeroTelefonico) {
		for (char c : numeroTelefonico.toCharArray()) {
			if (!(Character.isDigit(c))) {
				return true;
			}
		}
		return false;
	}

	// Sebastian A.
	protected boolean elIdEsRepedito (int id) {
		for (Contacto contacto : contactosArrayList) {
			if (contacto.getIdContacto() == id) {
				System.out.println("ID repetido");
				return true;
			}
		}
		return false;
	}

	/*
		4. Buscar contacto
	 */
	// Sebastian A.
	public void buscarContacto() { //Este metodo regresará un objeto tipo contacto.
		int opcion = 0;
		boolean contactoEncontrado = false;

		System.out.println("**Buscar contacto**");
		System.out.println("1. Buscar por ID");
		System.out.println("2. Buscar por nombre");
		System.out.print("Opcion: ");
		opcion = input.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Ingrese el ID del contacto");
			int idContacto = input.nextInt(); //Buscara un Contacto que tenga la misma id
			for (Contacto contacto : contactosArrayList) {
				if (contacto.getIdContacto() == idContacto) {
					System.out.println(contacto);
					contactoEncontrado = true;
				}
			}
			break;
		case 2: 
			System.out.println("Ingrese el nombre del contacto");
			String nombre = input.next(); //Buscara un Contacto que contenga el mismo nombre
			for (Contacto contacto: contactosArrayList) {
				if (contacto.getNombre().equalsIgnoreCase(nombre)) {
					System.out.println(contacto);
					contactoEncontrado = true;
				}
			}
			break;
		default:
			System.out.println("Opcion invalida");
		}
		if (!contactoEncontrado) {
			System.out.println("No se ha encontrado el contacto");
		}
		//pero este no fue capaz de encontrar un contacto con los mismos parametros.
	}

	/*
		5. eliminar contacto
	 */
	// Emmanuel
	public void eliminarContacto() {
		boolean contactoEncontrado = false;
		int opcion = 0;
		System.out.println("**Eliminar contacto**");
		System.out.println("1. Buscar por ID");
		System.out.println("2. Buscar por nombre");
		System.out.print("Opcion: ");
		opcion = input.nextInt();

		switch(opcion) {
		case 1:
			System.out.println("Ingrese el ID");
			int idContacto = input.nextInt();
			for(Contacto contacto : contactosArrayList) {
				System.out.println("Contacto eliminado");
				contactoEncontrado = eliminarContacto(idContacto);
				break;
			}
			break;
		case 2:
			System.out.println("Ingrese el nombre");
			String nombre = input.next();
			for(Contacto contacto : contactosArrayList) {
				if (contacto.getNombre().equalsIgnoreCase(nombre)) {
					System.out.println("Contacto eliminado");
					contactoEncontrado = eliminarContacto(nombre);
					break;
				}
				break;
			}
		default:
			System.out.println("Opcion invalida");
		}
	}

	//================METODOS AUXILIARES PARA eliminarContacto(); =======================
	// Emmanuel
	protected boolean eliminarContacto(int idContacto) {
		for (Contacto contacto: contactosArrayList) { //eliminara un contacto buscando por la id
			if (contacto.getIdContacto() == idContacto) {
				contactosArrayList.remove(contacto);
				System.out.println("**Contacto eliminado**");
				return true; //retornará un valor true al momento de eliminar
			}
		}

		System.out.println("Contacto no encontrado");
		return false; //en caso de no existir el contacto regresa un valor false.
	}

	// Emmanuel
	protected boolean eliminarContacto(String nombre) {
		for (Contacto contacto: contactosArrayList) { //eliminara un contacto buscando por su nombre
			if (contacto.getNombre().equalsIgnoreCase(nombre)) { //ignorará las mayúsculas
				contactosArrayList.remove(contacto);
				System.out.println("**Contacto eliminado**");
				return true; //retornará un valor true al momento de eliminar
			}
		}

		System.out.println("Contacto no encontrado");
		return false; //en caso de no existir el contacto regresa un valor false.
	}
	//===================================================================================

	/*
		6. Consultar contacto
	 */
	// Sebastian A.
	public void consultarContacto() {
        int opcion = 0;
		boolean contactoEncontrado = false;

        System.out.println("1. Buscar por ID");
        System.out.println("2. Bucar por nombre");
        System.out.println("3. Bucar por alias");
        System.out.println("4. Bucar por telefono");
        System.out.print("Opcion: ");

        opcion = input.nextInt();
        switch (opcion) {
            case 1:
                int idContacto = 0;
                System.out.println("Ingrese el ID");
                idContacto = input.nextInt();
                for (Contacto contacto : contactosArrayList) {
                    if (contacto.getIdContacto() == idContacto) {
						contactoEncontrado = true;
						System.out.println(contacto);
                    }
                }
                break;
            case 2:
                String nombre = "";
                System.out.println("Ingrese el nombre");
                nombre = input.next();
                for (Contacto contacto : contactosArrayList) {
                    if (contacto.getNombre().equalsIgnoreCase(nombre)) {
						contactoEncontrado = true;
						System.out.println(contacto);
                    }
                }
                break;
            case 3:
                String alias = "";
                System.out.println("Ingrese el alias");
                alias = input.next();
                for (Contacto contacto : contactosArrayList) {
                    if (contacto.getAlias().equalsIgnoreCase(alias)) {
						contactoEncontrado = true;
						System.out.println(contacto);
                    }
                }
                break;
            case 4:
                String telefono = "";
                System.out.println("Ingrese el telefono");
                telefono = input.next();
                for (Contacto contacto : contactosArrayList) {
                    if (contacto.getNumeroTelefonico().equals(telefono)) {
						contactoEncontrado = true;
						System.out.println(contacto);
                    }
                }
                break;
            default:
                System.out.println("Opcion invalida");
        }

		if (!contactoEncontrado) {
			System.out.println("Contacto no encontrado");
		}
	}
}