package com.zizaike.common.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

import com.zizaike.common.basetest.BaseTest;


/**
 * ClassName:TtopsAdaptTest <br/>
 * Date: 2015年3月5日 下午3:51:51 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.6
 * @see
 */
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class HanLPServiceTest extends BaseTest {
    @Autowired
    HanLPService hanLPService;
    @Test(description = "简体转繁体")
    public void quryHotRecommend()  {
        String str = hanLPService.convertToTraditionalChinese("我是中国人台湾有我我爱你");
        System.err.println(str);
    }
}
