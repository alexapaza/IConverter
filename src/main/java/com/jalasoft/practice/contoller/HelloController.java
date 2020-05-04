/**
 * File: HelloController.java
 * Copyright (c) 2020 Jalasoft.
 *
 * This software is the confidential and propietary information of Jalasoft.
 * ("Confidential Information"). You shall not disclose such Confidential
 * information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Jalasoft.
 * */

package com.jalasoft.practice.contoller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * handles the variables and values that client/postman send
 *
 * @author Alexander Apaza
 * @version 1.0
 *
 */

@RestController
@RequestMapping("/hello")
public class HelloController {
    private Path destination;

    @PostMapping
    private String sayHello(@RequestParam(value = "name") String name,
                           @RequestParam(value = "lname") String lastName,
                           @RequestParam(value = "file")MultipartFile file ) {
        saveFile(file);
        return "Hello "+"name:"+name+", lastName:"+lastName+", fileName:"+file.getOriginalFilename();
    }
    /**
     * File saver in certain path
     * @param file is the file retrieved from client side
     * @throws Exception in case of invalid value
     */
    private void saveFile(MultipartFile file){
        Path destination = Paths.get(System.getProperty("user.dir")+"\\src\\fileInput");
        try
        {
            Path filepath = Paths.get(destination.toString(), file.getOriginalFilename());
            file.transferTo(filepath);
        } catch (IOException e)
        {
           e.printStackTrace();
        }
    }
}
