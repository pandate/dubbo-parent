package com.alibaba.dubbo.common.bytecode;

public class WrapperDemo {
    public static String[] pns;
    public static java.util.Map pts;
    public static String[] mns;
    public static String[] dmns;
    public static Class[] mts0;
    public static Class[] mts1;
    public static Class[] mts2;
    public static Class[] mts3;
    public static Class[] mts4;
    public static Class[] mts5;

    public String[] getPropertyNames(){ return pns; }
//    public boolean hasProperty(String n){ return pts.containsKey($1); }
//    public Class getPropertyType(String n){ return (Class)pts.get($1); }
//    public String[] getMethodNames(){ return mns; }
//    public String[] getDeclaredMethodNames(){ return dmns; }
//    public void setPropertyValue(Object o, String n, Object v){
//        com.alibaba.dubbo.common.bytecode.WrapperTest$I1 w;
//        try{
//            w = ((com.alibaba.dubbo.common.bytecode.WrapperTest$I1)$1);
//        }catch(Throwable e){
//            throw new IllegalArgumentException(e);
//        }
//        if( $2.equals("name") ){
//            w.setName((java.lang.String)$3);
//            return;
//        }
//        if( $2.equals("float") ){
//            w.setFloat(((Number)$3).floatValue());
//            return;
//        }
//        throw new com.alibaba.dubbo.common.bytecode.NoSuchPropertyException("Not found property \""+$2+"\" filed or setter method in class com.alibaba.dubbo.common.bytecode.WrapperTest$I1.");
//    }
//    public Object getPropertyValue(Object o, String n){
//        com.alibaba.dubbo.common.bytecode.WrapperTest$I1 w;
//        try{
//            w = ((com.alibaba.dubbo.common.bytecode.WrapperTest$I1)$1);
//        }catch(Throwable e){
//            throw new IllegalArgumentException(e);
//        }
//        if( $2.equals("float") ){
//            return ($w)w.getFloat();
//        }
//        if( $2.equals("name") ){
//            return ($w)w.getName();
//        }
//        throw new com.alibaba.dubbo.common.bytecode.NoSuchPropertyException("Not found property \""+$2+"\" filed or setter method in class com.alibaba.dubbo.common.bytecode.WrapperTest$I1.");
//    }
//    public Object invokeMethod(Object o, String n, Class[] p, Object[] v) throws java.lang.reflect.InvocationTargetException{
//        com.alibaba.dubbo.common.bytecode.WrapperTest$I1 w;
//        try{
//            w = ((com.alibaba.dubbo.common.bytecode.WrapperTest$I1)$1);
//        }catch(Throwable e){
//            throw new IllegalArgumentException(e);
//        }
//        try{
//            if( "getFloat".equals( $2 )  &&  $3.length == 0 ) {
//                return ($w)w.getFloat();
//            }
//            if( "setName".equals( $2 )  &&  $3.length == 1 ) {
//                w.setName((java.lang.String)$4[0]);
//                return null;
//            }
//            if( "setFloat".equals( $2 )  &&  $3.length == 1 ) {
//                w.setFloat(((Number)$4[0]).floatValue());
//                return null;
//            }
//            if( "hello".equals( $2 )  &&  $3.length == 1 ) {
//                w.hello((java.lang.String)$4[0]);
//                return null;
//            }
//            if( "showInt".equals( $2 )  &&  $3.length == 1 ) {
//                return ($w)w.showInt(((Number)$4[0]).intValue());
//            }
//            if( "getName".equals( $2 )  &&  $3.length == 0 ) {
//                return ($w)w.getName();
//            }
//        } catch(Throwable e) {
//            throw new java.lang.reflect.InvocationTargetException(e);
//        }
//        throw new com.alibaba.dubbo.common.bytecode.NoSuchMethodException("Not found method \""+$2+"\" in class com.alibaba.dubbo.common.bytecode.WrapperTest$I1.");
//    }

}
