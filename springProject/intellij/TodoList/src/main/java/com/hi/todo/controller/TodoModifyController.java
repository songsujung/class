package com.hi.todo.controller;

import com.hi.todo.domain.ModifyTodoRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Log4j2
@RequestMapping("/todo/modify")
public class TodoModifyController {

    // get : 수정 화면 생성 목적
    @RequestMapping(method = RequestMethod.GET)
    public String getModifyForm(Model model){
        log.info("get /todo/modify");
        model.addAttribute("todo","TODO");
        return "todo/modifyForm";
        // /WEB-INF/views/todo/modifyForm.jsp

    }

    // post : 데이터 받고 -> 수정 -> list로 이동(redirect)
    @RequestMapping(method = RequestMethod.POST)
    public String modify(@ModelAttribute("modifyData") ModifyTodoRequest modifyTodoRequest){

        log.info("post /todo/modify");

        log.info("modifyTodoRequest" + modifyTodoRequest);

        return "todo/modify";

        // return "redirect:/todo/list";
    }
}