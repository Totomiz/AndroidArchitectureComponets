package com.zt.androidarchitecturecomponets;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

/**
 * Created by tony.zhang on 2017-09-24 0:22
 * Email:461609086@qq.com
 */

public class MyObserver implements LifecycleObserver {
    private static final String TAG="MyObserver";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreated(){
        Log.d(TAG, "onCreated: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(){
        Log.d(TAG, "onStart: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(){
        Log.d(TAG, "onResume: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(){
        Log.d(TAG, "onPause: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(){
        Log.d(TAG, "onStop: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void customMethod(){
        Log.d(TAG, "customMethod: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public void onAny(){
        Log.d(TAG, "onAny: ");
    }

//    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
//    public void onAnyWithParam(LifecycleOwner owner,Lifecycle.Event event){
//        Log.d(TAG, "onAnyWithParam: ");
//    }
}
