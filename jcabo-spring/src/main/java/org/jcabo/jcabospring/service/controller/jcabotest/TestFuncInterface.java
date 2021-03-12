package org.jcabo.jcabospring.service.controller.jcabotest;

public class TestFuncInterface {

    private int i;
    private String add;
    private String className;

    public TestFuncInterface(){
        System.out.println("创建 对象");
    }

    public TestFuncInterface(int i, String add, String className) {
        this.i = i;
        this.add = add;
        this.className = className;
    }

    public static void showInfo(String name) {
        System.out.println("info===" + name);
    }

    public void showName(String name) {
        System.out.println("name===" + name);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "TestFuncInterface{" +
                "i=" + i +
                ", add='" + add + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
