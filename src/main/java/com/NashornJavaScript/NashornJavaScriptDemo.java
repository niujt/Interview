package com.NashornJavaScript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * Nashorn取代Rhino(JDK 1.6, JDK1.7)成为Java的嵌入式JavaScript引擎。Nashorn完全支持ECMAScript 5.1规范以及一些扩展。
 * 它使用基于JSR 292的新语言特性，其中包含在JDK 7中引入的 invokedynamic，将JavaScript编译成Java字节码。
 *与先前的Rhino实现相比，这带来了2到10倍的性能提升。
 * 控制台命令行jjs
 */
public class NashornJavaScriptDemo {
    public static void main(String[] args){
        ScriptEngineManager scriptEngineManager=new ScriptEngineManager();
        ScriptEngine nashorn=scriptEngineManager.getEngineByName("nashorn");
        String name="小明";
        Integer result=null;
        try {
            nashorn.eval("print('"+name+"')");
            result=(Integer)nashorn.eval("10 + 2");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(result.toString());
    }
}
