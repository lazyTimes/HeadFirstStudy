package com.headfirst.iterator;

/**
 * 电脑，负责打印内容
 *
 * @author zxd
 * @version 1.0
 * @date 2021/4/11 10:03
 */
public class Computer {

    private FileManager fileManager;
    private MissionBoard missionBoard;

    public Computer(FileManager fileManager, MissionBoard missionBoard) {
        this.fileManager = fileManager;
        this.missionBoard = missionBoard;
    }

    public void display(){
        Iterator fileManagerIterator = fileManager.createIterator();
        Iterator missionBoardIterator = missionBoard.createIterator();

        while (fileManagerIterator.hasNext()){
            Object next = fileManagerIterator.next();
            System.out.println(next);
        }

        while (missionBoardIterator.hasNext()){
            Object next = missionBoardIterator.next();
            System.out.println(next);
        }

    }
}
