package com.Demo.SpringBootDemo.Controllers;

import com.Demo.SpringBootDemo.Models.UsuarioModel;
import com.Demo.SpringBootDemo.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerTodoslosUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return  usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path="/{id}")
    public Optional<UsuarioModel> obtenerporID(@PathVariable("id") long id){
        return this.usuarioService.obtenerporId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") long id){
        boolean ok = this.usuarioService.elimniraUsuario(id);
        if (ok){
            return "Se eliminó el usuario Correctamente";
        }else {
            return "No se eliminó el usuario";
        }
    }


}
