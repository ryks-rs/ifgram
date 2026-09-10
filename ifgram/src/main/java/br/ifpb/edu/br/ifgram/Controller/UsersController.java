package br.ifpb.edu.br.ifgram.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ryks")
public class UsersController {

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
    public String putUser(){
        return "Chamei o endpoint como um Put!";
    }
}
