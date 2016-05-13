package com.zizaike.common.service.impl;
import com.zizaike.entity.common.SMS;
import com.zizaike.is.common.SMSService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
/**
 * ClassName:SMSServiceImpl
 * Function: TO DO
 *
 * @author lin
 * @create on 2016/5/12
 * @since JDK 1.7
 */
@Service
public class SMSServiceImpl implements SMSService  {
    protected final Logger LOG = LoggerFactory.getLogger(SMSServiceImpl.class);
/*   @Value("${sms.from}")
    private String from ;
    @Value("${sms.ACCOUNT_SID}")
    private String ACCOUNT_SID;
    @Value("${sms.AUTH_TOKEN}")
    private String AUTH_TOKEN;*/
    static String from = "+14155992671";
    static String ACCOUNT_SID = "AC3d867eb6260b90c5b6834b6f7ef73422";
    static String AUTH_TOKEN = "3aec6d2b4632e864b7386c84bde2a4a0";
    
    @Override
    public String SendMessage(SMS sms){
        TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
        String to = "+"+sms.getTo();
        String messages = sms.getMessage();
        //Build a filter for the MessageList
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("Body", messages));
        params.add(new BasicNameValuePair("To",to));
        params.add(new BasicNameValuePair("From", from));

        MessageFactory messageFactory = client.getAccount().getMessageFactory();
        Message message = null;
		try {
			message = messageFactory.create(params);
		} catch (TwilioRestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        LOG.info(message.getSid());
        LOG.info(message.getBody());
        return message.getSid()+":"+message.getBody();
    }

}
