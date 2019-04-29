package com.example.demo.service;
import java.util.*;

import com.example.demo.dto.WtfDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Arrays;

/**
 * @author l
 * @date 2019-04-29
 * @for: HelloService
 */

@SuppressWarnings("ALL")
@Service
public class HelloService {

    @Autowired
    WtfDto wtfDto;

    public String hello() {

        return "hello,Spring Boot!"+wtfDto.wtf();
    }

    public int[] get(){
        return new int[] { 1, 2, 3, 4, 5 };
    }

    public String add(int[] arr){

        return Arrays.toString(arr);
    }
}

