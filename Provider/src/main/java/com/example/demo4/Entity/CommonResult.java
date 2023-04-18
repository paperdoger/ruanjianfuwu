package com.example.demo4.Entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class CommonResult<T> implements Serializable {
    private Integer code;
    private String data;
    private T result;

    public CommonResult(){};

    public CommonResult(Integer code, String data, T result) {
        this.code = code;
        this.data = data;
        this.result = result;
    }
}
