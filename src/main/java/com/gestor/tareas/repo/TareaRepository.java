package com.gestor.tareas.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.gestor.tareas.model.Tarea;

public interface TareaRepository extends MongoRepository <Tarea, String > {
}
