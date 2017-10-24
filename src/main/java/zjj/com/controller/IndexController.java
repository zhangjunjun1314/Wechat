package zjj.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/9/18.
 * 首页
 */
@Controller
public class IndexController {
    @RequestMapping(value="/index")
    public String Index(){
        return "index";
    }
}
