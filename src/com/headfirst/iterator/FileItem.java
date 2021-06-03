package com.headfirst.iterator;

/**
 * 文件项
 *
 * @author zxd
 * @version 1.0
 * @date 2021/4/11 9:56
 */
public class FileItem {

    private String fileName;

    private String editDate;

    private String ceateDate;

    private long size;

    public FileItem(String fileName, long size) {
        this.fileName = fileName;
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getEditDate() {
        return editDate;
    }

    public void setEditDate(String editDate) {
        this.editDate = editDate;
    }

    public String getCeateDate() {
        return ceateDate;
    }

    public void setCeateDate(String ceateDate) {
        this.ceateDate = ceateDate;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "FileItem{" +
                "fileName='" + fileName + '\'' +
                ", editDate='" + editDate + '\'' +
                ", ceateDate='" + ceateDate + '\'' +
                ", size=" + size +
                '}';
    }
}
