package com.alibaba.dubbo.common.bytecode;


public class proxy0 implements com.alibaba.dubbo.common.bytecode.ProxyTest.ITest{



    //这里就是接口的两个Method
    //public abstract java.lang.String com.alibaba.dubbo.common.bytecode.ProxyTest$ITest.getName()
    //public abstract void com.alibaba.dubbo.common.bytecode.ProxyTest$ITest.setName(java.lang.String,java.lang.String)
    public static java.lang.reflect.Method[] methods = com.alibaba.dubbo.common.bytecode.ProxyTest.ITest.class.getMethods();

    private java.lang.reflect.InvocationHandler handler;

    public proxy0(java.lang.reflect.InvocationHandler handler){
        this.handler = handler;
    }

    public java.lang.String getName(){
        Object[] args = new Object[0];
        Object ret = null;
        try {
            ret = handler.invoke(this, methods[0], args);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return (java.lang.String)ret;
    }

    public void setName(java.lang.String arg0,java.lang.String arg1){
        Object[] args = new Object[2];
        args[0] = (String)arg0;
        args[1] = (String)arg1;
        try {
            Object ret = handler.invoke(this, methods[1], args);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
