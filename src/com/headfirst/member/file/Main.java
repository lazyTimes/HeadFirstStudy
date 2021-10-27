package com.headfirst.member.file;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.adapter.use
 * @Description : 单元测试
 * @Create on : 2021/3/3 10:13
 **/
public class Main {

    public static void main(String[] args) {
        Text text = new Text();
        TextEditor textEditor = new TextEditor(text);
        textEditor.write("d111111");
        Memento memento = new Memento();
        memento.setText(text);
        CareTaker careTaker = new CareTaker(memento);
        textEditor.write("66666");
        careTaker.restore(textEditor);
        System.out.println(careTaker.getMemento().getText().getInfo());
    }/*运行结果：
        浅拷贝：66666
        深拷贝：d111111

    */
}
