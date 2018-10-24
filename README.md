## 此项目通过使用kotlin语言来实现MVVM模式的快速开发框架，用来学习kotlin语言和Android Jetpack等相关知识（开发中）


以谷歌DataBinding+LiveData+ViewModel框架为基础，整合Okhttp+RxJava+Retrofit+Glide等流行模块
[todo-mvvm-live](https://github.com/googlesamples/android-architecture/tree/todo-mvvm-live)

# 语言和规范
kotlin + java
MVVM模式
代码风格（阿里巴巴Java开发规范）
开发工具 Android Studio 3.2

#初期实现功能
登录、注册
网络请求
带分页和不分页的列表 Paging
文件下载、文件（图片）上传
侧滑返回
权限申请
全局异常捕获
后台任务
notification
全局Cookie，支持SharedPreferences和内存两种管理模式。
DialogFragment （弹出位置、动画）


- **全局操作**
	1. 全局的Activity堆栈式管理，在程序任何地方可以打开、结束指定的Activity，一键退出应用程序。
	2. LoggingInterceptor全局拦截网络请求，打印Request和Response，格式化json、xml数据显示，方便与后台调试接口。
	3. 全局Cookie，支持SharedPreferences和内存两种管理模式。
	4. 通用的网络请求异常监听，根据不同的状态码或异常设置相应的message。
	5. 全局的异常捕获，程序发生异常时不会崩溃，可跳入异常界面重启应用。
	6. 全局事件回调，提供RxBus、Messenger两种回调方式。
	7. 全局任意位置一行代码实现文件下载。

navigation
Room    数据库
ViewModel
LiveData
Rxlifecycle2
DataBinding
Crash
RxBus
HTTP(Download)   网络请求、文件下载

Sideslip 页面侧滑关闭
https://github.com/ikew0ng/SwipeBackLayout

Glide 图片框架

Paging
https://github.com/Ahmed-Abdelmeged/PagingLibraryWithRxJava

RxBinding
https://github.com/JakeWharton/RxBinding

RxPermissions
https://github.com/tbruyelle/RxPermissions

material-dialogs
https://github.com/afollestad/material-dialogs


## License

    Copyright 2018 zijian.cheng(程子健)
 
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
 
        http://www.apache.org/licenses/LICENSE-2.0
 
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
