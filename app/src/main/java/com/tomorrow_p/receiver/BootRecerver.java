package com.tomorrow_p.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.tomorrow_p.common.Logger;

/**
 * Created by Ansen on 2016/12/28 09:15.
 *
 * @E-mail: tomorrow_p@163.com
 * @Blog: http://blog.csdn.net/qq_25804863
 * @Github: https://github.com/1031307403/
 * @PROJECT_NAME: CodeRepository
 * @PACKAGE_NAME: com.tomorrow_p.receiver
 * @Description: TODO
 */
public class BootRecerver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Logger.d("ansen", "kai ji le");

    }
}
