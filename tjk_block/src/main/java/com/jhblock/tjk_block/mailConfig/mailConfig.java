package com.jhblock.tjk_block.mailConfig;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class mailConfig {
  public  String yzm;
  public String user;
  public String getYzm() {
    return yzm;
  }
  public String getUser() {
    return user;
  }
  public void setYzm(String yzm) {
    this.yzm = yzm;
  }
  public void setUser(String user) {
    this.user = user;}
  @Test
  public void setSendmail()throws Exception {
  List yzm=new ArrayList<Integer>();
  for(int a=0;a<6;a++){
    yzm.add(new Integer((int)Math.ceil(Math.random()*10)));
  }
  StringBuffer a=new StringBuffer();
  Iterator in = yzm.iterator();
  while (in.hasNext()) {
   a.append(in.next());
  }
  this.yzm=a.toString();
    sendmail mail =new sendmail();
    mail.setContent("您的验证码是:"+a.toString());
    mail.setFrom("3010765632@qq.com");
    mail.setTo(this.user);
    mail.setHost("smtp.qq.com");
    mail.setSubject("JHblock");
    mail.setPassword("ujvacompfdvsdfai");
    System.out.println(this.yzm+this.user);
    mail.send();
  }
}

