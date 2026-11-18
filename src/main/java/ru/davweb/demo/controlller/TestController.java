package ru.davweb.demo.controlller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.davweb.demo.model.Company;
import ru.davweb.demo.model.Human;

import java.util.ArrayList;
import java.util.List;


@Controller
    public class TestController{

    List<Company> storage = new ArrayList<>();




        @GetMapping("/companies")
        @ResponseBody
//        public Human test(){
//
//            Human human = new Human();
//
//            human.setAge(21);
//            human.setEmployeed(false);
//            human.setName("Ivan");
//
//            return human;
//
//        }

        @PostMapping("/")
        public List<Company> test2 (){

            Company company = new Company();

            company.setEmployers(1000);
            company.setName("Yandex");

            Company company2 = new Company();

            company.setEmployers(6000);
            company.setName("Google");

            Company company3 = new Company();

            company.setEmployers(3000);
            company.setName("MS");

            List<Company> test2 =new ArrayList<Company>();


            test2.add(company);
            test2.add(company2);
            test2.add(company3);


            return test2;
        }

    }

