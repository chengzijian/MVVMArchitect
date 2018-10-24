package com.redpacker.architect.ui.activity

import android.os.Bundle
import com.redpacker.architect.R
import com.redpacker.architect.framework.base.BaseActivity

/**
 * 启动页
 *
 * @author zijian.cheng
 * @date 2018/10/24
 */
class LauncherActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
    }
}