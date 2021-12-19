package com.jhblock.tjk_block.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class pagesController {
    @RequestMapping("/{JspName}")
    public String toJSP(@PathVariable String JspName){
        return  JspName;
    }
}
