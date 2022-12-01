import javax.swing.*;
import java.util.ArrayList;

public class ModeloDatos {

    ArrayList<String> listaPersonas;

    public ModeloDatos(String nombre) {
        listaPersonas= new ArrayList<String>();
    }




    public void Eliminar(String nombre) {
        if (consultar(nombre)==true) {
            listaPersonas.remove(nombre);
            JOptionPane.showMessageDialog(null, "Se elimino el usuario "+nombre);

        }
        System.out.println();
        ConsultarLista();
    }
    public void Actualizar(String nombre) {
        if (consultar(nombre)==true) {
            int pos = listaPersonas.indexOf(nombre);
            String nuevoNombre= JOptionPane.showInputDialog("Ingrese el nuevo nombre");
            listaPersonas.set(pos, nuevoNombre);
        }

    }

    public void ConsultarLista() {
        if (listaPersonas.isEmpty()==false) {
            for (int i = 0; i < listaPersonas.size(); i++) {
                System.out.println(listaPersonas.get(i));
            }
        }else {
            System.out.println("No hay personas registradas");
        }


        System.out.println("****************");
    }

    public void consultaIndividual(String nombre) {

        System.out.println("Consultar Usuario "+nombre);
        if (consultar(nombre)==true) {

        }
        System.out.println();

    }

    public void registrar(String nombre) {
        System.out.println("Registra usuario");
        listaPersonas.add(nombre);
        System.out.println("usuario "+nombre+" Registrado");
        System.out.println("Cantidad de usuarios: "+listaPersonas.size());
        System.out.println();
        System.out.println("***************");
    }

    public boolean consultar(String nombre) {
        boolean busqueda = false;
        // TODO Auto-generated method stub
        if (listaPersonas.contains(nombre)) {
            System.out.println(nombre + " Si se encuentra registrado");
            return true;
        } else {
            System.out.println(nombre + " No se encuentra registrado");
           return false;
        }


}
}
