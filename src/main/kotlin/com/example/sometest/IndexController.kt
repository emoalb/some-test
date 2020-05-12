package com.example.sometest

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.ModelAndView

@Controller
class IndexController {
@GetMapping("/")
@ResponseBody
fun getIndexPage():String{
    val str = StringBuilder();

    str.append("<!doctype html>").append(System.lineSeparator()).append( "<html lang=\"en\">").append(System.lineSeparator())
            .append( "<head>").append(System.lineSeparator()).append( "<meta charset=\"UTF-8\">")
            .append(System.lineSeparator()).append( "<meta name=\"viewport\">").append(System.lineSeparator()).append("<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">").append(System.lineSeparator())
            .append("<body>").append(System.lineSeparator())
            .append("<p>Hi</p>").append(System.lineSeparator()).append( "</body>").append(System.lineSeparator())
            .append("<form action=\"\" method=\"post\" class=\"form-example\">\n" +
                    "  <div class=\"form-example\">\n" +
                    "    <label for=\"name\">Enter your name: </label>\n" +
                    "    <input type=\"text\" name=\"name\" id=\"name\">\n" +
                    "  </div>\n" +
                    "  <div class=\"form-example\">\n" +
                    "    <label for=\"date\">Enter date: </label>\n" +
                    "    <input type=\"text\" name=\"date\" id=\"date\">\n" +
                    "  </div>\n" +
                    "  <div class=\"form-example\">\n" +
                    "    <input type=\"submit\" value=\"Subscribe!\">\n" +
                    "  </div>\n" +
                    "</form>")
            .append( "</html>").append(System.lineSeparator())
    println("get /")
    return str.toString();
}
    @PostMapping("/")
    fun postIndexPage(@RequestParam name: String):ModelAndView{
       val modelAndView = ModelAndView();
        modelAndView.viewName="redirect:/"
        println(name)
        return modelAndView

    }
}