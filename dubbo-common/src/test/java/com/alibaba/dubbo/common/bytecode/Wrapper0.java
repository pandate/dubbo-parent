package com.alibaba.dubbo.common.bytecode;



public class Wrapper0 extends Wrapper{
    //属性名称
    public static String[] pns = new String[]{"name","float"};
    //当前类属性及类型映射
    public static java.util.Map pts = new java.util.HashMap();
    //所有方法名称
    public static String[] mns=new String[]{"getFloat","setName","setFloat","hello","showInt","getName"};
    //当前类的公共方法
    public static String[] dmns = new String[]{"getFloat","setName","setFloat","hello","showInt"};
    //所有方法的入参类型
    public static Class[] mts0 = null;
    public static Class[] mts1 = new Class[]{java.lang.String.class};
    public static Class[] mts2 = new Class[]{float.class};
    public static Class[] mts3 = new Class[]{java.lang.String.class};
    public static Class[] mts4 = new Class[]{int.class};
    public static Class[] mts5 = null;

    {
        pts.put("name",java.lang.String.class);
        pts.put("float","float");
    }

    public String[] getPropertyNames(){ return pns; }
    public boolean hasProperty(String n){ return pts.containsKey(n); }
    public Class getPropertyType(String n){ return (Class)pts.get(n); }
    public String[] getMethodNames(){ return mns; }
    public String[] getDeclaredMethodNames(){ return dmns; }
    public void setPropertyValue(Object o, String n, Object v){
        com.alibaba.dubbo.common.bytecode.WrapperTest.I1 w;
        try{
            w = ((com.alibaba.dubbo.common.bytecode.WrapperTest.I1)o);
        }catch(Throwable e){
            throw new IllegalArgumentException(e);
        }
        if( n.equals("name") ){
            w.setName((java.lang.String)v);
            return;
        }
        if( n.equals("float") ){
            w.setFloat(((Number)v).floatValue());
            return;
        }
        throw new com.alibaba.dubbo.common.bytecode.NoSuchPropertyException("Not found property \""+n+"\" filed or setter method in class com.alibaba.dubbo.common.bytecode.WrapperTest$I1.");
    }
    public Object getPropertyValue(Object o, String n){
        com.alibaba.dubbo.common.bytecode.WrapperTest.I1 w;
        try{
            w = ((com.alibaba.dubbo.common.bytecode.WrapperTest.I1)o);
        }catch(Throwable e){
            throw new IllegalArgumentException(e);
        }
        if( n.equals("float") ){
            return (float)w.getFloat();
        }
        if( n.equals("name") ){
            return (String)w.getName();
        }
        throw new com.alibaba.dubbo.common.bytecode.NoSuchPropertyException("Not found property \""+n+"\" filed or setter method in class com.alibaba.dubbo.common.bytecode.WrapperTest$I1.");
    }
    public Object invokeMethod(Object o, String n, Class[] p, Object[] v) throws java.lang.reflect.InvocationTargetException{
        com.alibaba.dubbo.common.bytecode.WrapperTest.I1 w;
        try{
            w = ((com.alibaba.dubbo.common.bytecode.WrapperTest.I1)o);
        }catch(Throwable e){
            throw new IllegalArgumentException(e);
        }
        try{
            if( "getFloat".equals( n )  &&  p.length == 0 ) {
                return (float)w.getFloat();
            }
            if( "setName".equals( n )  &&  p.length == 1 ) {
                w.setName((java.lang.String)v[0]);
                return null;
            }
            if( "setFloat".equals( n )  &&  p.length == 1 ) {
                w.setFloat(((Number)v[0]).floatValue());
                return null;
            }
            if( "hello".equals( n )  &&  p.length == 1 ) {
                w.hello((java.lang.String)v[0]);
                return null;
            }
            if( "showInt".equals( n )  &&  p.length == 1 ) {
                return (int)w.showInt(((Number)v[0]).intValue());
            }
            if( "getName".equals( n )  &&  p.length == 0 ) {
                return (String)w.getName();
            }
        } catch(Throwable e) {
            throw new java.lang.reflect.InvocationTargetException(e);
        }
        throw new com.alibaba.dubbo.common.bytecode.NoSuchMethodException("Not found method \""+n+"\" in class com.alibaba.dubbo.common.bytecode.WrapperTest$I1.");
    }

}
