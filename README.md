# Fragment
1、命名规范：布局文件中以下面这些名字开头
    activity_   fragment_   view_   include_   shape_



一、Fragment的简单使用
    1、Activity和Fragment的生命周期关系：
    Created --> onAttach()    onCreate()    onCreateView()   onActivityCreated()
    Started --> onStart()
    Resumed --> onResume()
    Paused  --> onPause()
    Stoped  --> onStop()
    Destroyed  --> onDestroyView()   onDestroy()   onDetach()

    2、使用方法
    静态使用方法：把Fragment当成普通的View一样声明在Activity的布局文件中，然后所有控件的事件处理等代码都由各自的Fragment去处理，
    动态使用方法：
