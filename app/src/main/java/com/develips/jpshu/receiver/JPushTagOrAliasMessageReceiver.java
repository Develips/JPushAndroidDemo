package com.develips.jpshu.receiver;

import android.content.Context;

import cn.jpush.android.api.JPushMessage;
import cn.jpush.android.service.JPushMessageReceiver;


/**
 * @Author: slp
 * @E-Mail: siilip@qq.com
 * @Date: 2019/5/7
 * @Description: 自定义 JPush message 接收器(仅仅包含 tag/alias 新接口部分)
 *                 包括操作 tag/alias 的结果返回
 * @Version: 1.0
 *
 * https://docs.jiguang.cn/jpush/client/Android/android_api/
 * 设备别名(alias) 接口使用及取消
 * 设置别名（可以在登录成功的时候）
 * public static void setAlias(Context context, int sequence, String alias);
 *      sequence 用户自定义的操作序列号，同操作结果一起返回，用来标识一次操作的唯一性。
 *      alias 每次调用设置有效的别名，覆盖之前的设置。
 *      有效的别名组成：字母（区分大小写）、数字、下划线、汉字、特殊字符@!#$&*+=.|。
 *      限制：alias 命名长度限制为 40 字节。（判断长度需采用 UTF-8 编码）
 * JPushInterface.setAlias(mContext, Integer.parseInt(loginBean.getAccountId()),loginBean.getAccountId());
 *
 * 取消别名
 * public static void deleteAlias(Context context,int sequence);
 *      sequence 用户自定义的操作序列号，同操作结果一起返回，用来标识一次操作的唯一性。
 * JPushInterface.deleteAlias(mContext, Integer.parseInt(getAccountId(mContext)));
 */
public class JPushTagOrAliasMessageReceiver extends JPushMessageReceiver {

    @Override
    public void onTagOperatorResult(Context context, JPushMessage jPushMessage) {
        //TagAliasOperatorHelper.getInstance().onTagOperatorResult(context,jPushMessage);
        super.onTagOperatorResult(context, jPushMessage);
    }
    @Override
    public void onCheckTagOperatorResult(Context context, JPushMessage jPushMessage){
        //TagAliasOperatorHelper.getInstance().onCheckTagOperatorResult(context,jPushMessage);
        super.onCheckTagOperatorResult(context, jPushMessage);
    }
    @Override
    public void onAliasOperatorResult(Context context, JPushMessage jPushMessage) {
        //TagAliasOperatorHelper.getInstance().onAliasOperatorResult(context,jPushMessage);
        super.onAliasOperatorResult(context, jPushMessage);
    }

    @Override
    public void onMobileNumberOperatorResult(Context context, JPushMessage jPushMessage) {
        //TagAliasOperatorHelper.getInstance().onMobileNumberOperatorResult(context,jPushMessage);
        super.onMobileNumberOperatorResult(context, jPushMessage);
    }
}
