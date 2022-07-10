package com.designpatterns.prototype;

/**
 * 原型设计模式
 *  使用场景
 *  duiyu
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模版");
        for (int i = 0; i < 10; i++) {
            Mail tmail = (Mail)mail.clone();
            tmail.setName("姓名"+i);
            tmail.setEmailAddress(i+"@163.com");
            tmail.setContent("恭喜您学习原型模式");
            MailUtil.sendMail(tmail);
        }
        MailUtil.saveOriginMain(mail);
    }
}
