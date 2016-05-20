package com.zizaike.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.twilio.sdk.TwilioRestException;
import com.zizaike.entity.common.SMS;
import com.zizaike.is.common.SMSService;
import com.zizaike.open.bastest.BaseTest;

public class SMSServiceTest extends BaseTest{
	@Autowired
    private SMSService smsService;
    @Test(description = "test sendsms")
    public void sendMessage()throws TwilioRestException{
        SMS sms = new SMS();
        sms.setMessage("你好 www.baidu.com");
        sms.setTo("8618817930894");
        System.err.println(smsService.SendMessage(sms));
    }
}
