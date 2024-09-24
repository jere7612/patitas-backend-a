package pe.edu.cibertec.patitas_backend_a.service;

import pe.edu.cibertec.patitas_backend_a.dto.LoginRequestDTO;

public interface AutenticacionService {

    String[] validarUsuario(LoginRequestDTO loginRequestDTO) throws Exception;

}
