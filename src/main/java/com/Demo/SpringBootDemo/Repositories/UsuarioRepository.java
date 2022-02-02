package com.Demo.SpringBootDemo.Repositories;

import com.Demo.SpringBootDemo.Models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Long> {
   }
