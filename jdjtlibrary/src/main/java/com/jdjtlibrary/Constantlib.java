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


    //------------------雷石ktv(开始)--------------
    //未绑定情况(开始)
//    public static final String LSKTV1="http://wx.handle.ktvdaren.com/interface/appversion.php?";
    public static final String LSKTVbanner="http://poc.handle.ktvdaren.com/php/wxpic.php?";  //banner图片
    public static final String LSKTVrecommand="http://kcloud.v2.service.ktvdaren.com/wxsearchservice.aspx?";
    public static final String SINGER_PHOTO_BASE_URL = "http://bzmusic.ktvdaren.com/BzMusic/SingerImage/";//代码破解+名字
    //未绑定情况(结束)
    //-----------------------------------------扫码绑定房间------开始
    public static final String BASEURLKTV="http://wx.ktvdaren.com/";
    public static final String KTVROOMMSG=BASEURLKTV+"roominfo/";
    public static final String BASEROOM="http://wx.handle.ktvdaren.com/interface/";
//    http://wx.handle.ktvdaren.com/interface/webbindroom_new.php?type=1&roomid=57284649
    public static final String KTVROOMUID=BASEROOM+"webbindroom_new.php?";
    //扫码绑定房间------结束
    //遥控--切换歌曲
    //http://wx.handle.ktvdaren.com/interface/nextsong.php?uid=ipad8cad18ee0dbb56657d1a7aa37ab
    public static final String KTV_CONTROL_CHANGE=BASEROOM+"nextsong.php?";
    //遥控--原/伴唱
    //http://wx.handle.ktvdaren.com/interface/ctoggle.php?uid=ipad8cad18ee0dbb56657d1a7aa37ab
    public static final String KTV_CONTROL_ORIGINAL=BASEROOM+"ctoggle.php?";
    //遥控--播/停
    // http://wx.handle.ktvdaren.com/interface/ptoggle.php?uid=ipad8cad18ee0dbb56657d1a7aa37ab
    public static final String KTV_CONTROL_PLAYSTATE=BASEROOM+"ptoggle.php?";
    //遥控音量增加type=1   减少type=0
    //    http://wx.handle.ktvdaren.com/interface/mvol.php?uid=ipad8cad18ee0dbb56657d1a7aa37ab&type=1
    public static final String KTV_CONTROL_VOICE=BASEROOM+"mvol.php?";
////麦克风音量增加type=1   减少type=0
//    http://wx.handle.ktvdaren.com/interface/mmic.php?uid=ipad8cad18ee0dbb56657d1a7aa37ab&type=1
    public static final String KTV_CONTROL_MINE=BASEROOM+"mmic.php?";
    //-----------------------------------------扫码绑定房间------结束
    //--------------------歌曲列表(开始)----------------
    public static final String KTV_MUSIC_Select=BASEROOM+"getktvsonglist.php?";
    public static final String KTV_MUSIC_Singed=BASEROOM+"oversonglist.php?";
    //--------------------歌曲列表(结束)----------------
    //-------------------歌曲播放添加(开始)-------------
//    http://wx.handle.ktvdaren.com/interface/addsong.php?appid=arr&uid=ipad8cad18ee0dbb56657d1a7aa37ab&mname=北京北京&musicno=7026320&songer=汪峰
    public static final String KTV_PLAY_Add=BASEROOM+"addsong.php?";
    public static final String KTV_PLAY_PopMusic=BASEROOM+"songlisttop.php?";
//    http://wx.handle.ktvdaren.com/interface/addsong.php?appid=arr&uid=ipad8cad18ee0dbb56657d1a7aa37ab&mname=怒放的生命&musicno=7042130&songer=汪峰

    //-------------------歌曲播放添加(结束)-------------
    //------------------雷石ktv(结束)--------------
    //----------------pad(开始)------------
    public static final String KTV_BASE_MUSIC="http://kcloud.v2.service.ktvdaren.com/wxsearchservice.aspx?";
    public static final String KTV_BASE_STAR="http://kcloud.v2.service.ktvdaren.com/singerservice.aspx?";
    //----------------pad(开始)------------
}
