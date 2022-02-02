package com.Demo.SpringBootDemo.Services;

import com.Demo.SpringBootDemo.Models.UsuarioModel;
import com.Demo.SpringBootDemo.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }
    public Optional<UsuarioModel> obtenerporId(long id){
        return usuarioRepository.findById(id);
    }
      public boolean elimniraUsuario(long id){
        try {
            usuarioRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
