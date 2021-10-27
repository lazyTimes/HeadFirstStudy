package com.headfirst.member.file;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.member.file
 * @Description : 备忘录模式案例
 * @Create on : 2021/10/27 17:02
 **/
public class TextEditor {

    private Text text;

    public TextEditor(Text text) {
        this.text = text;
    }

    public void write(String info){
        text.setInfo(info);
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }
}
