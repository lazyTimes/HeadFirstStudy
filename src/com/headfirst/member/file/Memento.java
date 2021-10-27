package com.headfirst.member.file;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.member.file
 * @Description : 备忘录
 * @Create on : 2021/10/27 21:59
 **/
public class Memento {

    private Text text;

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        String info = text.getInfo();
        Text newText = new Text();
        newText.setInfo(info);
        this.text = newText;
    }
}
