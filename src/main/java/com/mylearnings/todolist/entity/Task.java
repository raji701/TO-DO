package com.mylearnings.todolist.entity;

import com.mylearnings.todolist.enums.Enum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tasks")
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id ;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "completed")
    @Enumerated(EnumType.ORDINAL)
    private Enum.TaskStatus completed;

    @Column(name = "priority")
    private int priority;

    @Column(name = "completed_at")
    private Date completedAt;


}
