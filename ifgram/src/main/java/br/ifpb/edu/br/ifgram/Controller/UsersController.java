package br.ifpb.edu.br.ifgram.Controller;

import br.ifpb.edu.br.ifgram.Service.UsersService;
import br.ifpb.edu.br.ifgram.dto.UserRequest;
import br.ifpb.edu.br.ifgram.dto.UserResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ryks")
public class UsersController {

    public final UsersService service;

    public UsersController(UsersService service){
        this.service = service;
    }

    @GetMapping
    public String getUser(){
        return "Olá meu vulgo é kekel";
    }

    @PostMapping
    public String postUser(){
        return "Chamei o endpoint como um POST!";
    }

    @DeleteMapping
    public String deleteUser(){
        return "Chamei o endpoint como um DELETE!";
    }

    @PatchMapping
    public String patchUser(){
        return "Chamei o endpoint como um PATCH!";
    }

    @PutMapping
    public UserResponse putUser(UserRequest request) throws Exception{
        return service.atualizarUsuario(request);
    }
}
