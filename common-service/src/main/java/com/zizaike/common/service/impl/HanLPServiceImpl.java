/**  
 * Project Name:common-service  <br/>
 * File Name:HanLPServiceImpl.java  <br/>
 * Package Name:com.zizaike.common.service.impl  <br/>
 * Date:2015年11月20日下午8:59:42  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.common.service.impl;

import org.springframework.stereotype.Service;

import com.hankcs.hanlp.HanLP;
import com.zizaike.core.framework.exception.IllegalParamterException;
import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.common.Langue;
import com.zizaike.is.common.HanLPService;

/**
 * ClassName:HanLPServiceImpl <br/>
 * Function: HanLP 简繁转换. <br/>
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
    @Override
    public String translate(Langue langue, String content) throws ZZKServiceException {
        if(langue==null){
            throw new IllegalParamterException("langue is not empty");
        }
        if(Langue.ZH_CN==langue){
            return convertToSimplifiedChinese(content);
        }else if(Langue.ZH_TW==langue){
            return convertToTraditionalChinese(content);
        }
        return null;
    }

}
