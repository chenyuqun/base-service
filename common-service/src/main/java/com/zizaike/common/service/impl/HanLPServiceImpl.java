/**  
 * Project Name:common-service  <br/>
 * File Name:HanLPServiceImpl.java  <br/>
 * Package Name:com.zizaike.common.service.impl  <br/>
 * Date:2015年11月20日下午8:59:42  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.common.service.impl;

import java.lang.reflect.Field;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hankcs.hanlp.HanLP;
import com.zizaike.core.common.ranslator.Translate;
import com.zizaike.entity.recommend.DestConfig;
import com.zizaike.entity.recommend.Loctype;
import com.zizaike.entity.recommend.Recommend;
import com.zizaike.entity.recommend.vo.CountryArea;
import com.zizaike.entity.recommend.vo.RecommendArea;
import com.zizaike.is.common.HanLPService;

/**
 * ClassName:HanLPServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015年11月20日 下午8:59:42 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
@Service
public class HanLPServiceImpl implements HanLPService {

    @Override
    public String convertToTraditionalChinese(String str) {
        return HanLP.convertToTraditionalChinese(str);
    }
    @Override
    public String convertToSimplifiedChinese(String str) {
          
        return HanLP.convertToSimplifiedChinese(str);
    }

    public static void main(String[] args) throws Exception {
       
    }


    
    public JSONObject translate(Object obj) throws Exception {
        String str = com.alibaba.fastjson.JSON.toJSONString(obj);
        System.err.println(str);
        String returnStr = HanLP.convertToTraditionalChinese((String)str );
        JSONObject jsonobject = JSONObject.parseObject(returnStr);
        return jsonobject;
  }

}
