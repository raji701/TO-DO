package com.mylearnings.todolist.repository;

import com.mylearnings.todolist.entity.Label;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabelRepository extends JpaRepository<Label ,Long> {
}
