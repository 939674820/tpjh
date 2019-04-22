package com.mao.controller;


import com.mao.entity.Result;
import com.mao.entity.StatusCode;
import com.mao.utlis.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin
@RestController
@RequestMapping("/tpjh")
public class indexController {

    @Autowired
    private HttpServletRequest request;

    /*@Autowired
    private HttpServletResponse response;*/


    @RequestMapping(method = RequestMethod.GET)
    public Result welcome(){



        String ua= request.getHeader("User-Agent");
        String type ;
        if(StringUtil.checkAgentIsMobile(ua)){
           type="APP";
        }else{
            type="PC";
        }

        return new Result(true,StatusCode.OK,"查询成功",
                type);
    }
}
