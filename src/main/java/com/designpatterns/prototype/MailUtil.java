package com.designpatterns.prototype;

import java.text.MessageFormat;

/**
 * 操作发送短信操作
 */
public class MailUtil {
    public static void  sendMail(Mail mail) {
        String outPutStr = "向{0}同学，邮件地址{1},邮件内容{2},发送成功";
        System.out.println(MessageFormat.format(outPutStr,mail.getName(),mail.getEmailAddress(),mail.getContent()));
    }

    /**
     * 存储原始邮件
     * @param mail
     */
    public static void saveOriginMain(Mail mail) {
        System.out.println("存储原邮件内容："+mail.getContent());
    }
}
