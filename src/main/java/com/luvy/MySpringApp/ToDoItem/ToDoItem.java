package com.luvy.MySpringApp.ToDoItem;

import lombok.*;

import javax.persistence.*;

@Data
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ToDoItem {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String title;

    private boolean done;
}
