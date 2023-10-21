package PracticaCasaTema2;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseDeDatosPapa {
	
	    public static void main(String[] args) {
	    	
	    	
	    	
	        Scanner scan = new Scanner(System.in);
	        ArrayList<Registro> registros = new ArrayList<>();
	        boolean salir = false;

	        while (!salir) {
	            System.out.println("----------|MENÚ|----------" +
	                    "\n1. Introducir datos: " +
	                    "\n2. Visualizar datos: " +
	                    "\n0. Salir" +
	                    "\n--------------------------");
	            System.out.println("\nIntroduce uno de los números para continuar.");

	            int opcion = scan.nextInt();
	            scan.nextLine(); // Consume la línea en blanco

	            switch (opcion) {
	                case 1:
	                    Registro nuevoRegistro = new Registro();

	                    System.out.println("Introduce el código indicador: ");
	                    nuevoRegistro.setCodigo(scan.nextInt());
	                    scan.nextLine(); // Consume la línea en blanco

	                    System.out.println("Introduce el cliente: ");
	                    nuevoRegistro.setCliente(scan.nextLine());

	                    System.out.println("Introduce la dirección del trabajo: ");
	                    nuevoRegistro.setDireccion(scan.nextLine());

	                    System.out.println("Introduce la fecha de realización del trabajo: ");
	                    nuevoRegistro.setFecha(scan.nextLine());

	                    registros.add(nuevoRegistro);
	                    break;

	                case 2:
	                    if (!registros.isEmpty()) {
	                        System.out.println("Registros almacenados:");
	                        for (Registro registro : registros) {
	                            System.out.println("Código: " + registro.getCodigo());
	                            System.out.println("Cliente: " + registro.getCliente());
	                            System.out.println("Dirección: " + registro.getDireccion());
	                            System.out.println("Fecha: " + registro.getFecha());
	                            System.out.println("---------------");
	                        }
	                    } else {
	                        System.out.println("No se han ingresado datos todavía.");
	                    }
	                    break;

	                case 0:
	                    salir = true;
	                    break;

	                default:
	                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
	                    break;
	            }
	        }

	        scan.close();
	    }
	}

	class Registro {
	    private int codigo;
	    private String cliente;
	    private String direccion;
	    private String fecha;

	    // Getters and setters for each field
	    public int getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }

	    public String getCliente() {
	        return cliente;
	    }

	    public void setCliente(String cliente) {
	        this.cliente = cliente;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public void setDireccion(String direccion) {
	        this.direccion = direccion;
	    }

	    public String getFecha() {
	        return fecha;
	    }

	    public void setFecha(String fecha) {
	        this.fecha = fecha;
	    }
	}



