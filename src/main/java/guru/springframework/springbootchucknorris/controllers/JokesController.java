package guru.springframework.springbootchucknorris.controllers;

import guru.springframework.springbootchucknorris.services.JokeServiceImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokeServiceImpl jokeService;

    public JokesController(JokeServiceImpl jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/jokes")
    public String getJokes(Model model){
        model.addAttribute("jokes", jokeService.getJoke());
        return "jokes";
    }

}
