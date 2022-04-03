package com.luvy.MySpringApp.ApiResponse;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@RequiredArgsConstructor
public abstract class ApiResponse<T> {
    //data에는 어느 모델이든 들어갈 수 있게 하고, 리스폰스마다 list errors를 추가하지 않도록

    private T data;
    private List<String> errors;
}
