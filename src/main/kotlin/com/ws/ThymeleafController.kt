package com.ws

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by wxwang on 2017/5/2.
 */
@Controller
class ThymeleafController {

    @RequestMapping("thy")
    fun helloThy(map: ModelMap): String{
        map.addAttribute("hello","hello thymeleaf111!")

        return "thy"
    }
}