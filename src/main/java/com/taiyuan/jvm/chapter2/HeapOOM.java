package com.taiyuan.jvm.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args:-verbose:gc -Xmx20m -Xms20m -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * Created by ytai on 2017/7/20.
 */
public class HeapOOM {
    
    public static class OOMObject{
    
    }
    
    public static void main(String[] args) {
        List<OOMObject> list=new ArrayList<OOMObject>();
        while(true)
        {
            list.add(new OOMObject());
        }
        
    }
    
}
