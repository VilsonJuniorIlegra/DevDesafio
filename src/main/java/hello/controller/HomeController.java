package hello.controller;

import hello.horas.utils.DiasUteis;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class HomeController {
    @RequestMapping("/")
    public String home(@RequestParam(value = "diasUteis", required = false)String diasUteis, Model model){
        DiasUteis uteis = new DiasUteis();
        model.addAttribute("diasUteis", uteis.quantidadeDiasUteis(2015,8));
        return "home";
    }


}
