package com.first.behind.component.index;

import com.first.behind.component.api.RestResult;
import com.first.behind.component.api.ResultGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping({"", "/"})
    @ResponseBody
    public RestResult index() {
        return new ResultGenerator().getSuccessResult();
    }
}
