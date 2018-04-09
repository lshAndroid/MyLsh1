package com.jdjtlibrary;


public class Constantlib {

    /**
     * 1、联网方式
     * */
    public static final String NET_METHOD_GET="GET";  //get方式联网
    public static final String NET_METHOD_POST="POST";  //POST方式联网


    /**
     *2、网络代理设置
     * */
    public static String PROXY_IP = "";
    public static int PROXY_PORT = 0;
    /*
    * 3、日志管理常量
    * */
    public static final String LOG_TAG="lsh";   //日志tag名称


    /**
     *
     / 当前是否是正式环境还是测试环境
     *
     * 当是正式环境时，日志会关闭，一些测试开关会关闭 ， 第三方测试账号会切换
     *  true -- 线上
     *  false --测试
     * */
    public static final boolean isRelease=false;



    //----------------------页面上拉下拉加载(开始)--------------
    public static final int LOAD_PAGE_SIZE=0;
    //----------------------页面上拉下拉加载(结束)--------------


}
