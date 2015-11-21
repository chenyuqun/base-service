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
import com.zizaike.is.common.HanLPService;

/**  
 * ClassName:HanLPServiceImpl <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2015年11月20日 下午8:59:42 <br/>  
 * @author   zeuskingzb  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
@Service
public class HanLPServiceImpl implements HanLPService {

    @Override
    public String convertToTraditionalChinese(String str) {
        return HanLP.convertToTraditionalChinese(str);
    }

}
  
