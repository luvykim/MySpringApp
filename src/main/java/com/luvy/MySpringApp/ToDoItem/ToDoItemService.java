package com.luvy.MySpringApp.ToDoItem;

import org.springframework.stereotype.Service;

@Service
public class ToDoItemService {
    //임의
    public ToDoItem get(final String id){
        return ToDoItem.builder()
                .title("Add an id validation")
                .build();
    }
}
