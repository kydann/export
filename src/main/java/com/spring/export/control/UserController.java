package com.spring.export.control;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.spring.export.services.UserService;
import com.spring.export.model.User;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService){

        this.userService=userService;

    }

    @GetMapping("/exportUsers")
    public void exportCSV(HttpServletResponse response) throws Exception{

        String filename="TestingExport.csv";

        response.setContentType("text/csv");
        response.setHeader(HttpHeaders .CONTENT_DISPOSITION,"attachment; filename=\"" + filename + "\"");

        StatefulBeanToCsv<User> writer = new StatefulBeanToCsvBuilder<User>(response.getWriter())
                .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
                .withOrderedResults(true).build();
        writer.write(userService.listUsers());

    }


}
