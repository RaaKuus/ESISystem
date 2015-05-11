package esi.system.controller;

import esi.system.model.Login;
import esi.system.service.LoginService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Bruno
 */

@Controller
public class LoginController {
    
    @Autowired
    private LoginService loginService;

    @RequestMapping(value="/autenticacao/login.action", method=RequestMethod.POST)
    public @ResponseBody Map<String, ? extends Object> login(
            @RequestParam("username") String cpf,
            @RequestParam("password") String senha){
        HashMap<String, Object> map = new HashMap<>();
        try{
            List<Login> logins = loginService.findLogins(cpf);
            if(logins.size() < 1){
                map.put("success", false);
                map.put("message", "CPF não encontrado.");
                return map;
            }
            Login login = logins.get(0);
            boolean senhaValida = login.autenticar(senha);
            if(senhaValida){
                map.put("success", true);
                map.put("message", "Logado com sucesso!");
                map.put("permissoes", login.getPermissoes());
            } else {
                map.put("success", false);
                map.put("message", "Senha errada!");
            } 
            return map;
        }catch(Exception e){
            map.put("success", false);
            map.put("message", "Erro no banco de dados!");
            return map;
        }
    }
}
