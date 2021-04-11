package com.headfirst.iterator;

import java.util.Random;
import java.util.Stack;

/**
 * 文件管理器
 *
 * @author zxd
 * @version 1.0
 * @date 2021/4/11 9:51
 */
public class FileManager implements Travelsable{

    private FileItem[] fileItems;

    public FileManager() {
        this.fileItems = new FileItem[10];
        Random random = new Random(10000);
        for (int i = 0; i < fileItems.length; i++) {
            fileItems[i] = new FileItem("文件"+i, random.nextInt(2000));
        }
    }

    @Override
    public Iterator createIterator() {
        return new FileIterator(fileItems);
    }

}
