package com.designpatterns.prototype;

/**
 * 发短信实体类
 */
public class Mail implements Cloneable{

    private String name;
    private String emailAddress;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Mail(String name, String emailAddress, String content) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.content = content;
    }

    public Mail() {
        System.out.println("main constructor ");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
