import javax.swing.JOptionPane;

public class Procesos {

    ModeloDatos miModelo;


    public Procesos(String menu){
        miModelo= new ModeloDatos(menu);
        System.out.println("entra al es constructor");
        ConstruirMenu(menu);
    }

    private void ConstruirMenu(String menu) {
        // TODO Auto-generated method stub

        int cod=0;
        do {
            cod=Integer.parseInt(JOptionPane.showInputDialog(menu));
            LogicaMenu(cod);

        } while (cod!=6);


    }

    private void LogicaMenu(int cod) {
        // TODO Auto-generated method stub
        switch (cod) {
            case 1:
                String nombreRegistro=JOptionPane.showInputDialog("Ingrese el nombre de la persona que quiere registrar");
                miModelo.registrar(nombreRegistro);break;
            case 2:
                String nombreConsultar=JOptionPane.showInputDialog("Ingrese el nombre que quiere consultar");
                miModelo.consultaIndividual(nombreConsultar);break;
            case 3:
                miModelo.ConsultarLista();break;
            case 4:
                String nombreActualizar=JOptionPane.showInputDialog("Ingrese el nombre que quiere consultar");
                miModelo.Actualizar(nombreActualizar);break;
            case 5:
                String nombreEliminar=JOptionPane.showInputDialog("Ingrese el nombre que quiere consultar");
                miModelo.Eliminar(nombreEliminar);break;
            case 6: JOptionPane.showMessageDialog(null, "CHAO!!");;

            default:
                JOptionPane.showMessageDialog(null, "No existe la opcion");
                break;
        }
    }



}
