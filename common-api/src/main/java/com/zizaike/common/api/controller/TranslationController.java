/**  
 * Project Name:common-api  <br/>
 * File Name:TranslationController.java  <br/>
 * Package Name:com.zizaike.common.api.controller  <br/>
 * Date:2016年1月9日上午11:33:43  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.common.api.controller;  


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zizaike.core.bean.ResponseResult;
import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.common.Langue;
import com.zizaike.is.common.HanLPService;


/**  
 * ClassName:TranslationController <br/>  
 * Function: 翻译服务. <br/>  
 * Date:     2016年1月9日 上午11:33:43 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
@Controller
@RequestMapping("/common")
public class TranslationController extends BaseAjaxController{
    @Autowired
    HanLPService hanLPService;
    @RequestMapping(value = "translate",method= RequestMethod.POST)
    @ResponseBody
    public ResponseResult translate(@RequestParam Langue langue,@RequestParam String content) throws ZZKServiceException {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setInfo(hanLPService.translate(langue, content));
        return responseResult;
    }
}
  
