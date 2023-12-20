package com.mylearnings.todolist.repository;

import com.mylearnings.todolist.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment ,Long> {
}
