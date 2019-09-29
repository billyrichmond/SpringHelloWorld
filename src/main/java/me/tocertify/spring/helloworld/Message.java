package me.tocertify.spring.helloworld;

public class Message {

    private String text;

    public Message() {
        setText();
    }

    private void setText() {
        this.text = "Hello, World";
    }

    void sayHello() {
        System.out.println(text);
    }

}
