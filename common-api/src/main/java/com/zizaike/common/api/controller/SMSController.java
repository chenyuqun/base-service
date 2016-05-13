package com.zizaike.common.api.controller;
import com.twilio.sdk.TwilioRestException;
import com.zizaike.entity.common.SMS;
import com.zizaike.is.common.SMSService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zizaike.core.framework.exception.ZZKServiceException;

/**
 * ClassName:SMSController
 * Function: TO DO
 *
 * @author lin
 * @create on 2016/5/9
 * @since JDK 1.7
 */

@Controller
@RequestMapping("/common")
public class SMSController  {
    private final Logger LOG = (Logger) LoggerFactory.getLogger(SMSController.class);
    @Autowired
    private SMSService smsService;
    @RequestMapping(value = "/sendmessage", method = RequestMethod.POST)
    @ResponseBody
    public String SendMessage(@RequestBody SMS sms)throws ZZKServiceException,TwilioRestException {
        LOG.info("SMS sms {}",sms.toString());
        return smsService.SendMessage(sms);
    }

}
