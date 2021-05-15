/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_juanmembreño;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Lab4P2_JuanMembreño {

    static Scanner leer = new Scanner(System.in);
    //no PUDE hacer los sueldos me confundi todo

    public static void main(String[] args) {
        try {
            int op = 0;
            ArrayList<personaslogin> ensistema = new ArrayList();
            ArrayList<Desarrolladores> listades = new ArrayList();
            ArrayList<directores> listadir = new ArrayList();
            ArrayList<Consultores> listac = new ArrayList();
            ArrayList<projectos> listap = new ArrayList();
            Desarrolladores a=new Desarrolladores();
            while (op != 3) {
                System.out.println("1)Ingresar nuevo usuario");
                System.out.println("2)Login");
                System.out.println("3)salir");
                op = leer.nextInt();

                switch (op) {
                    case 1: {
                        System.out.println("Ingrese su pocision en la empresa(Desarrollador,Consultor,Director)");
                        String pos = leer.nextLine();
                        pos = leer.nextLine();
                        pos = pos.toLowerCase();
                        System.out.println("Ingrese su usuario");
                        String usuario = leer.nextLine();
                        System.out.println("Ingrese su contraseña");
                        String contraseña = leer.nextLine();
                        ensistema.add(new personaslogin(pos, usuario, contraseña));
                        if (pos.equalsIgnoreCase("Desarrollador")) {
                            System.out.println("Ingrese su nombre");
                            String nombre = leer.nextLine();
                            System.out.println("Ingrese apellido");
                            String apellido = leer.nextLine();
                            System.out.println("Ingrese ID");
                            int id = leer.nextInt();
                            System.out.println("Ingrese nacionalidad");
                            String nacionalida = leer.nextLine();
                            System.out.println("Cantidad de proyectos realizados");
                            int proyectosrea = leer.nextInt();
                            System.out.println("Ingrese cantidad de años de experiencia");
                            int cantexxper = leer.nextInt();
                            System.out.println("Ingrese cantidad de años de contarto");
                            int cantaños = leer.nextInt();
                            System.out.println("Lenguaje favorito");
                            String lengu = leer.nextLine();
                            System.out.println("horas tarabajadas diarias");
                            int horastrab = leer.nextInt();
                            System.out.println("Ingrese cantidad de proyectos asignados");
                            int projectasig = leer.nextInt();
                            a.sueldomensual(proyectosrea, projectasig, cantaños);
                            //listades.add(new Desarrolladores(proyectosrea, cantexxper, cantaños, lengu, horastrab, nombre, apellido, id, nacionalida, projectasig));
                            listades.add(new Desarrolladores(proyectosrea, cantexxper, cantaños, lengu, horastrab, nombre, apellido, id, nacionalida));
                        } else if (pos.equalsIgnoreCase("Director")) {
                            System.out.println("Ingrese su nombre");
                            String nombre = leer.nextLine();
                            System.out.println("Ingrese apellido");
                            String apellido = leer.nextLine();
                            System.out.println("Ingrese ID");
                            int id = leer.nextInt();
                            System.out.println("Ingrese nacionalidad");
                            String nacionalida = leer.nextLine();
                            System.out.println("Ingrese cantidad de años de en el puesto");
                            int cantexxper = leer.nextInt();
                            System.out.println("Ingrese cantidad de años de contrato");
                            int cantaños = leer.nextInt();
                            System.out.println("Ingrese cantidad de desarrolladores asignados");
                            int desaasignados = leer.nextInt();
                            System.out.println("Cantidad de proyectos realizados");
                            int proyectosrea = leer.nextInt();
                            listadir.add(new directores(cantexxper, cantaños, desaasignados, proyectosrea, nombre, apellido, id, nacionalida));
                        } else if (pos.equalsIgnoreCase("consultor")) {
                            System.out.println("Ingrese su nombre");
                            String nombre = leer.nextLine();
                            System.out.println("Ingrese apellido");
                            String apellido = leer.nextLine();
                            System.out.println("Ingrese ID");
                            int id = leer.nextInt();
                            System.out.println("Ingrese nacionalidad");
                            String nacionalida = leer.nextLine();
                            System.out.println("Cantidad de proyectos realizados");
                            int proyectosrea = leer.nextInt();
                            System.out.println("Ingrese cantidad de años de contrato");
                            int cantaños = leer.nextInt();
                            System.out.println("campo principal");
                            String campo = leer.nextLine();
                            System.out.println("Ingrese tiempo de duracion de la consultorias");
                            int tiempo = leer.nextInt();
                            listac.add(new Consultores(cantaños, proyectosrea, campo, tiempo, nombre, apellido, id, nacionalida));
                        }else{
                            System.out.println("Pocision no validad");
                            break;
                        }

                    }
                    break;
                    case 2: {
                        int esta = 0;
                        String pos = "";
                        System.out.println("Ingrese su usuario");
                        String usuario = leer.nextLine();
                        usuario = leer.nextLine();
                        System.out.println("Ingrese su contraseña");
                        String contraseña = leer.nextLine();

                        for (int i = 0; i < ensistema.size(); i++) {
                            if (ensistema.get(i).getUsuario().equalsIgnoreCase(usuario) & ensistema.get(i).getContraseña().equalsIgnoreCase(contraseña)) {
                                esta = 1;
                                pos = ensistema.get(i).getPos();
                            }
                        }
                        if (usuario.equalsIgnoreCase("admin") & contraseña.equalsIgnoreCase("1234")) {
                            System.out.println("1)Proyectos");
                            System.out.println("2)Desarrolladores");
                            System.out.println("3)Directores");
                            System.out.println("4)Consultores");
                            int op2 = leer.nextInt();
                            switch (op2) {
                                case 1: {
                                    System.out.println("1)Crear Projectos");
                                    System.out.println("2)Modificar Projectos");
                                    System.out.println("3)Eliminar Projectos");
                                    System.out.println("4)Listar Projectos");
                                    int op3 = leer.nextInt();
                                    switch (op3) {
                                        case 1: {
                                            System.out.println("Ingrese nombre del proyecto");
                                            String nombre = leer.nextLine();
                                            System.out.println("Ingrese nombre de la empresa que solicito el proyecto");
                                            String nombreempresa = leer.nextLine();
                                            System.out.println("Descripcion del proyecto");
                                            String proyecto = leer.nextLine();
                                            System.out.println("Ingrese cantidad de años en duracion");
                                            int canta = leer.nextInt();
                                            System.out.println("Ingrese estado actual(iniciado,en desarrollo o terminado");
                                            String estado = leer.nextLine();
                                            while (!estado.equalsIgnoreCase("iniciado") & !estado.equalsIgnoreCase("en desarollo") & !estado.equalsIgnoreCase("terminado")) {
                                                System.out.println("Ingrese estado valido");
                                                estado = leer.nextLine();
                                            }
                                            System.out.println("Ingrese cantidad de directores engarcados");
                                            int cantdirec = leer.nextInt();
                                            while (cantdirec > 2) {
                                                System.out.println("no pueden ser mas de dos");
                                                cantdirec = leer.nextInt();
                                            }
                                            System.out.println("Ingrese cantidad de desarrolladores");
                                            int cantdesa = leer.nextInt();
                                            while (cantdesa > 5) {
                                                System.out.println("no pueden ser mas de cinco");
                                                cantdesa = leer.nextInt();

                                            }
                                            System.out.println("Ingrese cantidad de consultores");
                                            int cantconsul = leer.nextInt();
                                            while (cantconsul > 3) {
                                                System.out.println("no pueden ser mas de tres");
                                                cantconsul = leer.nextInt();
                                            }
                                            listap.add(new projectos(nombre, nombreempresa, proyecto, canta, estado, cantdirec, cantdesa, cantconsul));
                                        }
                                        case 2: {
                                            String salida2 = "";
                                            for (Object t : listap) {
                                                if (t instanceof projectos) {
                                                    salida2 += listap.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Projectos");
                                            System.out.println(salida2);
                                            salida2 = "";
                                            System.out.println("Ingrese el indice del proyecto a modificar");
                                            int ind = leer.nextInt();
                                            System.out.println("para modificar ingrese");
                                            System.out.println("Ingrese nombre del proyecto");
                                            String nombre = leer.nextLine();
                                            System.out.println("Ingrese nombre de la empresa que solicito el proyecto");
                                            String nombreempresa = leer.nextLine();
                                            System.out.println("Descripcion del proyecto");
                                            String proyecto = leer.nextLine();
                                            System.out.println("Ingrese cantidad de años en duracion");
                                            int canta = leer.nextInt();
                                            System.out.println("Ingrese estado actual(iniciado,en desarrollo o terminado");
                                            String estado = leer.nextLine();
                                            while (!estado.equalsIgnoreCase("iniciado") & !estado.equalsIgnoreCase("en desarollo") & !estado.equalsIgnoreCase("terminado")) {
                                                System.out.println("Ingrese estado valido");
                                                estado = leer.nextLine();
                                            }
                                            System.out.println("Ingrese cantidad de directores engarcados");
                                            int cantdirec = leer.nextInt();
                                            while (cantdirec > 2) {
                                                System.out.println("no pueden ser mas de dos");
                                                cantdirec = leer.nextInt();
                                            }
                                            System.out.println("Ingrese cantidad de desarrolladores");
                                            int cantdesa = leer.nextInt();
                                            while (cantdesa > 5) {
                                                System.out.println("no pueden ser mas de cinco");
                                                cantdesa = leer.nextInt();

                                            }
                                            System.out.println("Ingrese cantidad de consultores");
                                            int cantconsul = leer.nextInt();
                                            while (cantconsul > 3) {
                                                System.out.println("no pueden ser mas de tres");
                                                cantconsul = leer.nextInt();
                                            }
                                            listap.add(ind, new projectos(nombre, nombreempresa, proyecto, canta, estado, cantdirec, cantdesa, cantconsul));
                                            listap.remove(ind + 1);
                                            System.out.println("modificado...");
                                            for (Object t : listap) {
                                                if (t instanceof projectos) {
                                                    salida2 += listap.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Projectos");
                                            System.out.println(salida2);
                                        }
                                        break;
                                        case 3: {
                                            String salida2 = "";
                                            for (Object t : listap) {
                                                if (t instanceof projectos) {
                                                    salida2 += listap.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Projectos");
                                            System.out.println(salida2);
                                            System.out.println("Ingrese el indice del proyecto a eliminar");
                                            int ind = leer.nextInt();
                                            listap.remove(ind);
                                            System.out.println("eliminado...");
                                            salida2 = "";
                                            for (Object t : listap) {
                                                if (t instanceof projectos) {
                                                    salida2 += listap.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Projectos");
                                            System.out.println(salida2);
                                        }
                                        case 4: {
                                            String salida2 = "";
                                            for (Object t : listap) {
                                                if (t instanceof projectos) {
                                                    salida2 += listap.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Projectos");
                                            System.out.println(salida2);
                                        }
                                        break;
                                    }
                                }
                                break;

                                case 2: {
                                    System.out.println("1)Crear desarrolladores");
                                    System.out.println("2)Modificar desarrolladores");
                                    System.out.println("3)Eliminar  desarrolladores");
                                    System.out.println("4)Listar  desarrolladores");
                                    int op4 = leer.nextInt();
                                    switch (op4) {
                                        case 1: {
                                            System.out.println("para crear desarroladores ingrese ....");
                                            System.out.println("Ingrese su nombre");
                                            String nombre = leer.nextLine();
                                            System.out.println("Ingrese apellido");
                                            String apellido = leer.nextLine();
                                            System.out.println("Ingrese ID");
                                            int id = leer.nextInt();
                                            System.out.println("Ingrese nacionalidad");
                                            String nacionalida = leer.nextLine();
                                            System.out.println("Cantidad de proyectos realizados");
                                            int proyectosrea = leer.nextInt();
                                            System.out.println("Ingrese cantidad de años de experiencia");
                                            int cantexxper = leer.nextInt();
                                            System.out.println("Ingrese cantidad de años de contarto");
                                            int cantaños = leer.nextInt();
                                            System.out.println("Lenguaje favorito");
                                            String lengu = leer.nextLine();
                                            System.out.println("horas tarabajadas diarias");
                                            int horastrab = leer.nextInt();
                                            System.out.println("Ingrese cantidad de proyectos asignados");
                                            int projectasig = leer.nextInt();
                                             a.sueldomensual(proyectosrea, projectasig, cantaños);
                                          // listades.add(new Desarrolladores(proyectosrea, cantexxper, cantaños, lengu, horastrab, nombre, apellido, id, nacionalida, projectasig));
                                            listades.add(new Desarrolladores(proyectosrea, cantexxper, cantaños, lengu, horastrab, nombre, apellido, id, nacionalida));
                                        }
                                        break;
                                        case 2: {
                                            String salida2 = "";
                                            for (Object t : listades) {
                                                if (t instanceof Desarrolladores) {
                                                    salida2 += listades.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Desarrolladores");
                                            System.out.println(salida2);
                                            salida2 = "";
                                            System.out.println("Ingrese el indice del desarollador a modificar");
                                            int ind = leer.nextInt();
                                            System.out.println("para modifiacrlo ingrese....");
                                            System.out.println("Ingrese su nombre");
                                            String nombre = leer.nextLine();
                                            System.out.println("Ingrese apellido");
                                            String apellido = leer.nextLine();
                                            System.out.println("Ingrese ID");
                                            int id = leer.nextInt();
                                            System.out.println("Ingrese nacionalidad");
                                            String nacionalida = leer.nextLine();
                                            System.out.println("Cantidad de proyectos realizados");
                                            int proyectosrea = leer.nextInt();
                                            System.out.println("Ingrese cantidad de años de experiencia");
                                            int cantexxper = leer.nextInt();
                                            System.out.println("Ingrese cantidad de años de contarto");
                                            int cantaños = leer.nextInt();
                                            System.out.println("Lenguaje favorito");
                                            String lengu = leer.nextLine();
                                            System.out.println("horas tarabajadas diarias");
                                            int horastrab = leer.nextInt();
                                            System.out.println("Ingrese cantidad de proyectos asignados");
                                            int projectasig = leer.nextInt();
                                             a.sueldomensual(proyectosrea, projectasig, cantaños);
                                            //listades.add(ind, new Desarrolladores(proyectosrea, cantexxper, cantaños, lengu, horastrab, nombre, apellido, id, nacionalida, projectasig));
                                            listades.add(ind, new Desarrolladores(proyectosrea, cantexxper, cantaños, lengu, horastrab, nombre, apellido, id, nacionalida));
                                            listades.remove(ind + 1);
                                            System.out.println("modificado...");
                                            for (Object t : listades) {
                                                if (t instanceof Desarrolladores) {
                                                    salida2 += listades.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Desarrolladores");
                                            System.out.println(salida2);
                                        }
                                        break;
                                        case 3: {
                                            String salida2 = "";
                                            for (Object t : listades) {
                                                if (t instanceof Desarrolladores) {
                                                    salida2 += listades.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Desarrolladores");
                                            System.out.println(salida2);
                                            salida2 = "";
                                            System.out.println("Ingrese el indice del desarollador a eliminar");
                                            int ind = leer.nextInt();
                                            listades.remove(ind);
                                        }
                                        break;
                                        case 4: {
                                            String salida2 = "";
                                            for (Object t : listades) {
                                                if (t instanceof Desarrolladores) {
                                                    salida2 += listades.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Desarrolladores");
                                            System.out.println(salida2);
                                            salida2 = "";
                                        }
                                        break;
                                    }
                                }
                                break;
                                case 3: {
                                    System.out.println("1)Crear Directores");
                                    System.out.println("2)Modificar Directores");
                                    System.out.println("3)Eliminar Directores");
                                    System.out.println("4)Listar Directores");
                                    int op3 = leer.nextInt();
                                    switch (op3) {
                                        case 1: {
                                            System.out.println("Para crear directores ingrese");
                                            System.out.println("Ingrese su nombre");
                                            String nombre = leer.nextLine();
                                            System.out.println("Ingrese apellido");
                                            String apellido = leer.nextLine();
                                            System.out.println("Ingrese ID");
                                            int id = leer.nextInt();
                                            System.out.println("Ingrese nacionalidad");
                                            String nacionalida = leer.nextLine();
                                            System.out.println("Ingrese cantidad de años de en el puesto");
                                            int cantexxper = leer.nextInt();
                                            System.out.println("Ingrese cantidad de años de contrato");
                                            int cantaños = leer.nextInt();
                                            System.out.println("Ingrese cantidad de desarrolladores asignados");
                                            int desaasignados = leer.nextInt();
                                            System.out.println("Cantidad de proyectos realizados");
                                            int proyectosrea = leer.nextInt();
                                            listadir.add(new directores(cantexxper, cantaños, desaasignados, proyectosrea, nombre, apellido, id, nacionalida));
                                        }
                                        break;
                                        case 2: {
                                            String salida2 = "";
                                            for (Object t : listadir) {
                                                if (t instanceof directores) {
                                                    salida2 += listadir.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Directores");
                                            System.out.println(salida2);
                                            System.out.println("Ingrese el indice del director a editar");
                                            int ind = leer.nextInt();
                                            System.out.println("para modificar ingrese ");
                                            System.out.println("Para crear directores ingrese");
                                            System.out.println("Ingrese su nombre");
                                            String nombre = leer.nextLine();
                                            System.out.println("Ingrese apellido");
                                            String apellido = leer.nextLine();
                                            System.out.println("Ingrese ID");
                                            int id = leer.nextInt();
                                            System.out.println("Ingrese nacionalidad");
                                            String nacionalida = leer.nextLine();
                                            System.out.println("Ingrese cantidad de años de en el puesto");
                                            int cantexxper = leer.nextInt();
                                            System.out.println("Ingrese cantidad de años de contrato");
                                            int cantaños = leer.nextInt();
                                            System.out.println("Ingrese cantidad de desarrolladores asignados");
                                            int desaasignados = leer.nextInt();
                                            System.out.println("Cantidad de proyectos realizados");
                                            int proyectosrea = leer.nextInt();
                                            listadir.add(ind, new directores(cantexxper, cantaños, desaasignados, proyectosrea, nombre, apellido, id, nacionalida));
                                            listadir.remove(ind + 1);
                                            System.out.println("Modificado...");
                                            salida2 = "";
                                            for (Object t : listadir) {
                                                if (t instanceof directores) {
                                                    salida2 += listadir.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Directores");
                                            System.out.println(salida2);
                                        }
                                        break;
                                        case 3: {
                                            String salida2 = "";
                                            for (Object t : listadir) {
                                                if (t instanceof directores) {
                                                    salida2 += listadir.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Directores");
                                            System.out.println(salida2);
                                            System.out.println("Ingrese el indice del director a modificar");
                                            int ind = leer.nextInt();
                                            listadir.remove(ind);
                                            System.out.println("eliminado...");
                                            salida2 = "";
                                            for (Object t : listadir) {
                                                if (t instanceof directores) {
                                                    salida2 += listadir.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Directores");
                                            System.out.println(salida2);
                                        }
                                        break;
                                        case 4: {
                                            String salida2 = "";
                                            for (Object t : listadir) {
                                                if (t instanceof directores) {
                                                    salida2 += listadir.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Directores");
                                            System.out.println(salida2);
                                        }
                                        break;
                                    }
                                }
                                break;
                                case 4: {
                                    System.out.println("1)Crear Consultor");
                                    System.out.println("2)Modificar Consultor");
                                    System.out.println("3)Eliminar Consultor");
                                    System.out.println("4)Listar Consultor");
                                    int op3 = leer.nextInt();
                                    switch (op3) {
                                        case 1: {
                                            System.out.println("para añadir consultor ingrese el....");
                                            System.out.println("Ingrese su nombre");
                                            String nombre = leer.nextLine();
                                            System.out.println("Ingrese apellido");
                                            String apellido = leer.nextLine();
                                            System.out.println("Ingrese ID");
                                            int id = leer.nextInt();
                                            System.out.println("Ingrese nacionalidad");
                                            String nacionalida = leer.nextLine();
                                            System.out.println("Cantidad de proyectos realizados");
                                            int proyectosrea = leer.nextInt();
                                            System.out.println("Ingrese cantidad de años de contrato");
                                            int cantaños = leer.nextInt();
                                            System.out.println("campo principal");
                                            String campo = leer.nextLine();
                                            System.out.println("Ingrese tiempo de duracion de la consultorias");
                                            int tiempo = leer.nextInt();
                                            listac.add(new Consultores(cantaños, proyectosrea, campo, tiempo, nombre, apellido, id, nacionalida));
                                        }
                                        break;
                                        case 2: {
                                            String salida2 = "";
                                            for (Object t : listac) {
                                                if (t instanceof Consultores) {
                                                    salida2 += listac.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Consultores");
                                            System.out.println(salida2);
                                            System.out.println("Ingrese el indice del consultor a editar");
                                            int ind = leer.nextInt();
                                            System.out.println("para modificar ingrese ....");
                                            System.out.println("Ingrese su nombre");
                                            String nombre = leer.nextLine();
                                            System.out.println("Ingrese apellido");
                                            String apellido = leer.nextLine();
                                            System.out.println("Ingrese ID");
                                            int id = leer.nextInt();
                                            System.out.println("Ingrese nacionalidad");
                                            String nacionalida = leer.nextLine();
                                            System.out.println("Cantidad de proyectos realizados");
                                            int proyectosrea = leer.nextInt();
                                            System.out.println("Ingrese cantidad de años de contrato");
                                            int cantaños = leer.nextInt();
                                            System.out.println("campo principal");
                                            String campo = leer.nextLine();
                                            System.out.println("Ingrese tiempo de duracion de la consultorias");
                                            int tiempo = leer.nextInt();
                                            listac.add(ind, new Consultores(cantaños, proyectosrea, campo, tiempo, nombre, apellido, id, nacionalida));
                                            listac.remove(ind + 1);
                                            System.out.println("Modificado...");
                                            salida2 = "";
                                            for (Object t : listac) {
                                                if (t instanceof Consultores) {
                                                    salida2 += listac.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Consultores");
                                            System.out.println(salida2);
                                        }
                                        break;
                                        case 3: {
                                            String salida2 = "";
                                            for (Object t : listac) {
                                                if (t instanceof Consultores) {
                                                    salida2 += listac.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Consultores");
                                            System.out.println(salida2);
                                            System.out.println("Ingrese el indice del consultor a eliminar");
                                            int ind = leer.nextInt();
                                            listac.remove(ind);
                                            System.out.println("Eliminado...");
                                            salida2 = "";
                                            for (Object t : listac) {
                                                if (t instanceof Consultores) {
                                                    salida2 += listac.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Consultores");
                                            System.out.println(salida2);
                                        }
                                        break;
                                        case 4: {
                                            String salida2 = "";
                                            for (Object t : listac) {
                                                if (t instanceof Consultores) {
                                                    salida2 += listac.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Consultores");
                                            System.out.println(salida2);
                                        }
                                        break;
                                    }
                                }
                                break;

                            }
                        } else if (esta == 1 & pos.equalsIgnoreCase("Desarrollador")) {
                            System.out.println("1)ver informacion");
                            System.out.println("2)eliminar cuenta");
                            System.out.println("3)cantidad proyectos asignados");
                            int op2 = leer.nextInt();
                            switch (op2) {
                                case 1: {
                                    for (int i = 0; i < ensistema.size(); i++) {
                                        if (ensistema.get(i).getUsuario().equals(usuario) & ensistema.get(i).getContraseña().equals(contraseña)) {
                                            System.out.println("Su informacion es:");
                                            System.out.println(listades.get(i));
                                        }
                                    }
                                }
                                break;
                                case 2: {
                                    for (int i = 0; i < ensistema.size(); i++) {
                                        if (ensistema.get(i).getUsuario().equals(usuario) & ensistema.get(i).getContraseña().equals(contraseña)) {
                                            listades.remove(i);
                                            ensistema.remove(i);
                                            System.out.println("Eliminada");
                                            //System.out.println(listades.get(i));
                                        }
                                    }
                                }
                                break;
                                case 3: {
                                    for (int i = 0; i < ensistema.size(); i++) {
                                        if (ensistema.get(i).getUsuario().equals(usuario) & ensistema.get(i).getContraseña().equals(contraseña)) {
                                            System.out.println("Su cantidad de proyectos asignados  es:");
                                            System.out.println(listades.get(i).getCantpro());
                                        }
                                    }
                                }
                                break;
                            }
                        } else if (esta == 1 & pos.equalsIgnoreCase("consultor")) {
                            System.out.println("1)ver informacion");
                            System.out.println("2)eliminar cuenta");
                            System.out.println("3)Cantidad de proyectos asignados");
                            int op3 = leer.nextInt();
                            switch (op3) {
                                case 1: {
                                    for (int i = 0; i < ensistema.size(); i++) {
                                        if (ensistema.get(i).getUsuario().equals(usuario) & ensistema.get(i).getContraseña().equals(contraseña)) {
                                            System.out.println("Su informacion es:");
                                            System.out.println(listac.get(i));
                                        }
                                    }
                                }
                                break;
                                case 2: {
                                    for (int i = 0; i < ensistema.size(); i++) {
                                        if (ensistema.get(i).getUsuario().equals(usuario) & ensistema.get(i).getContraseña().equals(contraseña)) {
                                            listac.remove(i);
                                            listac.remove(i);
                                            System.out.println("Eliminada");
                                            //System.out.println(listades.get(i));
                                        }
                                    }
                                }
                                break;
                                case 3: {
                                    for (int i = 0; i < ensistema.size(); i++) {
                                        if (ensistema.get(i).getUsuario().equals(usuario) & ensistema.get(i).getContraseña().equals(contraseña)) {
                                            System.out.println("Su cantidad de proyectos asignados  es:");
                                            System.out.println(listac.get(i).getCantpro());
                                        }
                                    }
                                }
                                break;

                            }
                        } else if (esta == 1 & pos.equalsIgnoreCase("director")) {
                            System.out.println("1)Desarrolladores");
                            System.out.println("2)Consultores");
                            System.out.println("3)ver proyectos asignados");
                            System.out.println("4)ver todos los proyectos");
                            int op5 = leer.nextInt();
                            switch (op5) {
                                case 1: {
                                    System.out.println("1)Crear desarrolladores");
                                    System.out.println("2)Modificar desarrolladores");
                                    System.out.println("3)Eliminar  desarrolladores");
                                    System.out.println("4)Listar  desarrolladores");
                                    int op4 = leer.nextInt();
                                    switch (op4) {
                                        case 1: {
                                            System.out.println("para crear desarroladores ingrese ....");
                                            System.out.println("Ingrese su nombre");
                                            String nombre = leer.nextLine();
                                            System.out.println("Ingrese apellido");
                                            String apellido = leer.nextLine();
                                            System.out.println("Ingrese ID");
                                            int id = leer.nextInt();
                                            System.out.println("Ingrese nacionalidad");
                                            String nacionalida = leer.nextLine();
                                            System.out.println("Cantidad de proyectos realizados");
                                            int proyectosrea = leer.nextInt();
                                            System.out.println("Ingrese cantidad de años de experiencia");
                                            int cantexxper = leer.nextInt();
                                            System.out.println("Ingrese cantidad de años de contarto");
                                            int cantaños = leer.nextInt();
                                            System.out.println("Lenguaje favorito");
                                            String lengu = leer.nextLine();
                                            System.out.println("horas tarabajadas diarias");
                                            int horastrab = leer.nextInt();
                                            System.out.println("Ingrese cantidad de proyectos asignados");
                                            int projectasig = leer.nextInt();
                                             a.sueldomensual(proyectosrea, projectasig, cantaños);
                                            //listades.add(new Desarrolladores(proyectosrea, cantexxper, cantaños, lengu, horastrab, nombre, apellido, id, nacionalida, projectasig));
                                            listades.add(new Desarrolladores(proyectosrea, cantexxper, cantaños, lengu, horastrab, nombre, apellido, id, nacionalida));
                                        }
                                        break;
                                        case 2: {
                                            String salida2 = "";
                                            for (Object t : listades) {
                                                if (t instanceof Desarrolladores) {
                                                    salida2 += listades.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Desarrolladores");
                                            System.out.println(salida2);
                                            salida2 = "";
                                            System.out.println("Ingrese el indice del desarollador a modificar");
                                            int ind = leer.nextInt();
                                            System.out.println("para modifiacrlo ingrese....");
                                            System.out.println("Ingrese su nombre");
                                            String nombre = leer.nextLine();
                                            System.out.println("Ingrese apellido");
                                            String apellido = leer.nextLine();
                                            System.out.println("Ingrese ID");
                                            int id = leer.nextInt();
                                            System.out.println("Ingrese nacionalidad");
                                            String nacionalida = leer.nextLine();
                                            System.out.println("Cantidad de proyectos realizados");
                                            int proyectosrea = leer.nextInt();
                                            System.out.println("Ingrese cantidad de años de experiencia");
                                            int cantexxper = leer.nextInt();
                                            System.out.println("Ingrese cantidad de años de contarto");
                                            int cantaños = leer.nextInt();
                                            System.out.println("Lenguaje favorito");
                                            String lengu = leer.nextLine();
                                            System.out.println("horas tarabajadas diarias");
                                            int horastrab = leer.nextInt();
                                            System.out.println("Ingrese cantidad de proyectos asignados");
                                            int projectasig = leer.nextInt();
                                             a.sueldomensual(proyectosrea, projectasig, cantaños);
                                            //listades.add(ind,new Desarrolladores(proyectosrea, cantexxper, cantaños, lengu, horastrab, nombre, apellido, id, nacionalida, projectasig));
                                            listades.add(ind, new Desarrolladores(proyectosrea, cantexxper, cantaños, lengu, horastrab, nombre, apellido, id, nacionalida));
                                            listades.remove(ind + 1);
                                            System.out.println("modificado...");
                                            for (Object t : listades) {
                                                if (t instanceof Desarrolladores) {
                                                    salida2 += listades.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Desarrolladores");
                                            System.out.println(salida2);
                                        }
                                        break;
                                        case 3: {
                                            String salida2 = "";
                                            for (Object t : listades) {
                                                if (t instanceof Desarrolladores) {
                                                    salida2 += listades.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Desarrolladores");
                                            System.out.println(salida2);
                                            salida2 = "";
                                            System.out.println("Ingrese el indice del desarollador a eliminar");
                                            int ind = leer.nextInt();
                                            listades.remove(ind);
                                        }
                                        break;
                                        case 4: {
                                            String salida2 = "";
                                            for (Object t : listades) {
                                                if (t instanceof Desarrolladores) {
                                                    salida2 += listades.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Desarrolladores");
                                            System.out.println(salida2);
                                            salida2 = "";
                                        }
                                        break;
                                    }

                                }
                                break;
                                case 2: {
                                    System.out.println("1)Crear Consultor");
                                    System.out.println("2)Modificar Consultor");
                                    System.out.println("3)Eliminar Consultor");
                                    System.out.println("4)Listar Consultor");
                                    int op3 = leer.nextInt();
                                    switch (op3) {
                                        case 1: {
                                            System.out.println("para añadir consultor ingrese el....");
                                            System.out.println("Ingrese su nombre");
                                            String nombre = leer.nextLine();
                                            System.out.println("Ingrese apellido");
                                            String apellido = leer.nextLine();
                                            System.out.println("Ingrese ID");
                                            int id = leer.nextInt();
                                            System.out.println("Ingrese nacionalidad");
                                            String nacionalida = leer.nextLine();
                                            System.out.println("Cantidad de proyectos realizados");
                                            int proyectosrea = leer.nextInt();
                                            System.out.println("Ingrese cantidad de años de contrato");
                                            int cantaños = leer.nextInt();
                                            System.out.println("campo principal");
                                            String campo = leer.nextLine();
                                            System.out.println("Ingrese tiempo de duracion de la consultorias");
                                            int tiempo = leer.nextInt();
                                            listac.add(new Consultores(cantaños, proyectosrea, campo, tiempo, nombre, apellido, id, nacionalida));
                                        }
                                        break;
                                        case 2: {
                                            String salida2 = "";
                                            for (Object t : listac) {
                                                if (t instanceof Consultores) {
                                                    salida2 += listac.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Consultores");
                                            System.out.println(salida2);
                                            System.out.println("Ingrese el indice del consultor a editar");
                                            int ind = leer.nextInt();
                                            System.out.println("para modificar ingrese ....");
                                            System.out.println("Ingrese su nombre");
                                            String nombre = leer.nextLine();
                                            System.out.println("Ingrese apellido");
                                            String apellido = leer.nextLine();
                                            System.out.println("Ingrese ID");
                                            int id = leer.nextInt();
                                            System.out.println("Ingrese nacionalidad");
                                            String nacionalida = leer.nextLine();
                                            System.out.println("Cantidad de proyectos realizados");
                                            int proyectosrea = leer.nextInt();
                                            System.out.println("Ingrese cantidad de años de contrato");
                                            int cantaños = leer.nextInt();
                                            System.out.println("campo principal");
                                            String campo = leer.nextLine();
                                            System.out.println("Ingrese tiempo de duracion de la consultorias");
                                            int tiempo = leer.nextInt();
                                            listac.add(ind, new Consultores(cantaños, proyectosrea, campo, tiempo, nombre, apellido, id, nacionalida));
                                            listac.remove(ind + 1);
                                            System.out.println("Modificado...");
                                            salida2 = "";
                                            for (Object t : listac) {
                                                if (t instanceof Consultores) {
                                                    salida2 += listac.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Consultores");
                                            System.out.println(salida2);
                                        }
                                        break;
                                        case 3: {
                                            String salida2 = "";
                                            for (Object t : listac) {
                                                if (t instanceof Consultores) {
                                                    salida2 += listac.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Consultores");
                                            System.out.println(salida2);
                                            System.out.println("Ingrese el indice del consultor a eliminar");
                                            int ind = leer.nextInt();
                                            listac.remove(ind);
                                            System.out.println("Eliminado...");
                                            salida2 = "";
                                            for (Object t : listac) {
                                                if (t instanceof Consultores) {
                                                    salida2 += listac.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Consultores");
                                            System.out.println(salida2);
                                        }
                                        break;
                                        case 4: {
                                            String salida2 = "";
                                            for (Object t : listac) {
                                                if (t instanceof Consultores) {
                                                    salida2 += listac.indexOf(t) + "- " + t + "\n";
                                                }
                                            }
                                            System.out.println("Consultores");
                                            System.out.println(salida2);
                                        }
                                        break;
                                    }
                                }
                                break;
                                case 3: {
                                    for (int i = 0; i < ensistema.size(); i++) {
                                        if (ensistema.get(i).getUsuario().equals(usuario) & ensistema.get(i).getContraseña().equals(contraseña)) {
                                            System.out.println("Su cantidad de proyectos asignados  es:");
                                            System.out.println(listadir.get(i).getCantpro());
                                        }
                                    }
                                }
                                break;
                                case 4: {
                                    String salida2 = "";
                                    for (Object t : listap) {
                                        if (t instanceof projectos) {
                                            salida2 += listap.indexOf(t) + "- " + t + "\n";
                                        }
                                    }
                                    System.out.println("Projectos");
                                    System.out.println(salida2);
                                }
                                break;
                            }
                        }
                    }
                    break;

                    case 3: {
                        System.out.println("Se salio del menu de  entrada");
                    }
                    break;
                    default:
                        System.out.println("Opcion no valida");
                }
                // }catch(Exception InputMismatchException ){
                //    System.out.println("Lo que ingreso es incompatible con lo solicitado");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ingreso un tipo diferente al que se le solicito");
        }
    }
}
