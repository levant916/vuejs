package com.vuejs.demo.controller.model;

import lombok.Data;

@Data
public class ResponseVO<T> {
    String msg;
    boolean check = true;
    T response;
}
