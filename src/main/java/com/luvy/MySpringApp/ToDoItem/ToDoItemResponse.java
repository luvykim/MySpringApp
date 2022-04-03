package com.luvy.MySpringApp.ToDoItem;

import com.luvy.MySpringApp.ApiResponse.ApiResponse;
import lombok.Builder;

import java.util.List;

public class ToDoItemResponse extends ApiResponse<ToDoItem> {
    @Builder
    public ToDoItemResponse(final ToDoItem toDoItem, final List<String> errors){
        //ApiResponse의 data를 toDoItem으로 초기화
        this.setData(toDoItem);
        this.setErrors(errors);
    }
}
