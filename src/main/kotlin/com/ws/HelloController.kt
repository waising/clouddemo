package com.ws

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by wxwang on 2017/5/2.
 */
@RestController
class HelloController {

    @RequestMapping("/")
    fun hello(): String {
        return "hello world!"
    }

    @RequestMapping("/hi")
    fun hi(): String {
        return "hi!"
    }
}