package com.arrow.puzzle.escape.maze.free.game.personal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.Date;
import p049b0.C1887c;
import p059f.C6323e;
import p061g.C6343h;
import p061g.C6344i;

/* JADX INFO: loaded from: classes.dex */
public class MyApplication extends Application implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: s */
    public C6344i f2913s;

    /* JADX INFO: renamed from: t */
    public Activity f2914t;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Log.e("Hello", "Me");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Log.e("Hello", "Me");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Log.e("Hello", "Me");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Log.e("Hello", "Me");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Log.e("Hello", "Me");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f2913s.f24400c) {
            return;
        }
        this.f2914t = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Log.e("Hello", "Me");
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(this);
        zzeu.m2944d().m2947e(this, new C6323e(1));
        AudienceNetworkAds.initialize(this);
        FirebaseFirestore.getInstance().collection("ALLID").document("ADID").get().addOnCompleteListener(new C1887c(7));
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
        C6344i c6344i = new C6344i();
        c6344i.f24398a = null;
        c6344i.f24399b = false;
        c6344i.f24400c = false;
        c6344i.f24401d = 0L;
        Log.e("Hello", "Me");
        this.f2913s = c6344i;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        super.onStart(lifecycleOwner);
        C6344i c6344i = this.f2913s;
        Activity activity = this.f2914t;
        C1887c c1887c = new C1887c(8);
        if (c6344i.f24400c) {
            Log.d("AppOpenAdManager", "The app open ad is already showing.");
            return;
        }
        if (c6344i.f24398a == null || new Date().getTime() - c6344i.f24401d >= 14400000) {
            Log.d("AppOpenAdManager", "The app open ad is not ready yet.");
            c6344i.m12154a(activity);
        } else {
            Log.d("AppOpenAdManager", "Will show ad.");
            c6344i.f24398a.mo2767c(new C6343h(c6344i, c1887c, activity));
            c6344i.f24400c = true;
            c6344i.f24398a.mo2768d(activity);
        }
    }
}
