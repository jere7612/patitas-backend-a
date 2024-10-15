package pe.edu.cibertec.patitas_backend_a.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.patitas_backend_a.dto.LoginRequestDTO;
import pe.edu.cibertec.patitas_backend_a.dto.LoginResponseDTO;
<<<<<<< HEAD
import pe.edu.cibertec.patitas_backend_a.dto.SignOutRequestDTO;
import pe.edu.cibertec.patitas_backend_a.dto.SignOutResponseDTO;
=======
>>>>>>> 85898a901402d457f624d743735d574219c7ae58
import pe.edu.cibertec.patitas_backend_a.service.AutenticacionService;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;

@RestController
@RequestMapping("/autenticacion")
public class AutenticacionController {

    @Autowired
    AutenticacionService autenticacionService;

    @PostMapping("/login")
    public LoginResponseDTO login(@RequestBody LoginRequestDTO loginRequestDTO) {

        try {
<<<<<<< HEAD
            //Thread.sleep(Duration.ofSeconds(5));
=======
            Thread.sleep(Duration.ofSeconds(5));
>>>>>>> 85898a901402d457f624d743735d574219c7ae58
            String[] datosUsuario = autenticacionService.validarUsuario(loginRequestDTO);
            System.out.println("Resultado: " + Arrays.toString(datosUsuario));
            if (datosUsuario == null) {
                return new LoginResponseDTO("01", "Error: Usuario no entrado", "", "");

            }
            return new LoginResponseDTO("00", "", datosUsuario[0], datosUsuario[1]);

        } catch (Exception e) {
            return new LoginResponseDTO("99", "Error: Ocurrio un problema", "", "");


        }
    }
<<<<<<< HEAD
    @PostMapping("/signout")
    public SignOutResponseDTO CierreSesion(@RequestBody SignOutRequestDTO signOutRequestDTO){
        try {
            String codigo = autenticacionService.CierreSesion(signOutRequestDTO);

            if (codigo == null){
                return new SignOutResponseDTO("99","Error : No se pudo guardar el registro");
            }

            return new SignOutResponseDTO(codigo, "Se guardó el registro de cierre de sesión");
        }
        catch (Exception e ) {
            System.out.println(e.getMessage().toString());
            return new SignOutResponseDTO("99", "Error");
        }
    }
=======
>>>>>>> 85898a901402d457f624d743735d574219c7ae58
}