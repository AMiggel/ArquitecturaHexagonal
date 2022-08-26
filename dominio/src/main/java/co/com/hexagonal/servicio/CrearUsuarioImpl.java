package co.com.hexagonal.servicio;

public class CrearUsuarioImpl implements ICrearUsuario{

    @Override
    public String crearUsuario(String cedula) {

        System.out.println(cedula);
        return "Usuario Creado";
    }
}
