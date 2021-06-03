package com.headfirst.iterator;

/**
 * 文件迭代器
 *
 * @author zxd
 * @version 1.0
 * @date 2021/4/11 9:55
 */
public class FileIterator implements Iterator{

    private FileItem[] fileItems;

    private int index;

    public FileIterator(FileItem[] fileItems) {
        this.fileItems = fileItems;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index++ < fileItems.length - 1;
    }

    @Override
    public Object next() {
        return fileItems[index];
    }

    @Override
    public void remove(Object ele) {
        throw new UnsupportedOperationException("数组不支持当前操作");
    }
}
