package com.taiyuan.jvm.chapter2;

/**
 * Vm Args:-Xss2M
 * Created by ytai on 2017/7/20.
 */
public class JavaVMStackOOM {
    
    private void dontStop()
    {
        while(true)
        {
        
        }
    }
    
    public void stackLeakByThread()
    {
        while(true)
        {
            Thread thread=new Thread(new Runnable() {
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }
    
    public static void main(String[] args) {
        JavaVMStackOOM oom=new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
    
}
