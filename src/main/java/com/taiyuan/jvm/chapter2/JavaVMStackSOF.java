package com.taiyuan.jvm.chapter2;

/**
 * VM Args:-Xss:128k
 * Created by ytai on 2017/7/20.
 */
public class JavaVMStackSOF {
    private int stackLength=1;
    
    public void stackLeak()
    {
        stackLength++;
        stackLeak();
    }
    
    public static void main(String[] args) throws Throwable{
        JavaVMStackSOF oom=new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stackLength is : "+oom.stackLength);
            throw e;
            
        }
    }
}
