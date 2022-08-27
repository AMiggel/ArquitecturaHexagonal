package co.com.hexagonal.servicio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrearUsuarioImpl implements ICrearUsuario{


    @Autowired
    Usuario usuario;

    @Override
    public String crearUsuario(String identificacion) {

        System.out.println(identificacion);
        return "Usuario Creado" + usuario.getNombre() ;
    }
}
