package controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class APIControllerForHeroku {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String doHello() {
        return "Hello, Heroku";
    }

    @GetMapping(value="hi/{name}")
    public String doHi(@PathVariable String name) {
        return "What's happening, " + name;
    }
}
