import co.com.hexagonal.servicio.ICrearUsuario;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crearUsuario")
public class CrearUsuarioControlador {


    ICrearUsuario iCrearUsuario;

    public CrearUsuarioControlador(ICrearUsuario iCrearUsuario) {
        this.iCrearUsuario = iCrearUsuario;
    }

    public String crearUsuario (@RequestBody String cedula){
        String usuario = iCrearUsuario.crearUsuario(cedula);
        return usuario;
    }

}
