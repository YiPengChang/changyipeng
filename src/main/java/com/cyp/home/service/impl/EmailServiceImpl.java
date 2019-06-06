package com.cyp.home.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cyp.home.service.EmailService;
@Service
public class EmailServiceImpl implements EmailService {
	private static Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);
	
	@Autowired
	JavaMailSender mailSender;
	
	@Override
	public void sendSimpleMail(String to, String subject, String content)  throws Exception{
		SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("1159443654@qq.com");   //发送者，必须和application.yml中的username一致，否则会报错；
        message.setTo(to);              //接收者
        message.setSubject(subject);    //邮件主题
        message.setText(content);       //邮件内容
        mailSender.send(message);
        logger.info("简单邮件已经发送。");
        logger.info("发送至:{};主题:{}",to,subject);
        logger.info("发送至:{};内容:{}",to,content);
	}

}
