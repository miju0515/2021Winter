package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hello!");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name,Model model){
        model.addAttribute("name",name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody //HTTP에서 BODY부에 직접 데이터를 넣어줌
    public String helloString(@RequestParam("name") String name){
        return "hello "+name;
    }

    @GetMapping("hello-api")
    @ResponseBody //기본으로 JSON으로 반환됨 옛날엔 XML방식으로 반환했음.
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello; //JSON 방식으로 출력됨

    }

    static class Hello{
        private String name;

        public String getName(){ //넣을 때
            return name;
        }
        public void setName(String name){ //꺼낼 때
           this.name=name;
        }
        //프로퍼티 접근 방식


    }


}
