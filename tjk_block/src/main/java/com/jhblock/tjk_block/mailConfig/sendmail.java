package com.jhblock.tjk_block.mailConfig;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class sendmail {
    String to = "";//收件人
    String from = "";//发件人
    String host = "";//smtp主机
    String username = "" ;
    String password = "" ;
    String filename = "";//附件文件名
    String subject = "";//邮件主题
    String content = "";//邮件正文

    public void setTo(String to) {
        this.to = to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void send() throws Exception {
        System.out.println(this.to);
        System.out.println(this.host);
        System.out.println(this.password);

        Properties prop = new Properties();
        prop.setProperty("mail.host", this.host);
        prop.setProperty("mail.transport.protocol", "smtp");
        prop.setProperty("mail.smtp.auth", "true");
        Session session = Session.getInstance(prop);
        session.setDebug(true);
        Transport ts = session.getTransport();
        ts.connect(this.host, this.from, this.password);
        Message message = createSimpleMail(session);
        ts.sendMessage(message, message.getAllRecipients());
        ts.close();
    }

    public  MimeMessage createSimpleMail(Session session)
            throws Exception {
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(this.from));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(this.to));
        message.setSubject(this.subject);
        message.setContent(this.content, "text/html;charset=UTF-8");
        return message;
    }
}


