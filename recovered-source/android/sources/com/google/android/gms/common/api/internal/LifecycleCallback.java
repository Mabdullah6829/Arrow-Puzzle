package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {

    /* JADX INFO: renamed from: s */
    public final Object f4255s;

    public LifecycleCallback(LifecycleFragment lifecycleFragment) {
        this.f4255s = lifecycleFragment;
    }

    /* JADX INFO: renamed from: c */
    public static LifecycleFragment m3466c(Activity activity) {
        zza zzaVar;
        zzd zzdVar;
        Activity activity2 = new LifecycleActivity(activity).f4254a;
        if (!(activity2 instanceof FragmentActivity)) {
            if (activity2 == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = zza.f4370t;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity2);
            if (weakReference != null && (zzaVar = (zza) weakReference.get()) != null) {
                return zzaVar;
            }
            try {
                zza zzaVar2 = (zza) activity2.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (zzaVar2 == null || zzaVar2.isRemoving()) {
                    zzaVar2 = new zza();
                    activity2.getFragmentManager().beginTransaction().add(zzaVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity2, new WeakReference(zzaVar2));
                return zzaVar2;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activity2;
        WeakHashMap weakHashMap2 = zzd.f4378t;
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        WeakHashMap weakHashMap3 = zzd.f4378t;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(fragmentActivity);
        if (weakReference2 != null && (zzdVar = (zzd) weakReference2.get()) != null) {
            return zzdVar;
        }
        try {
            zzd zzdVar2 = (zzd) supportFragmentManager.findFragmentByTag("SLifecycleFragmentImpl");
            if (zzdVar2 == null || zzdVar2.isRemoving()) {
                zzdVar2 = new zzd();
                supportFragmentManager.beginTransaction().add(zzdVar2, "SLifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap3.put(fragmentActivity, new WeakReference(zzdVar2));
            return zzdVar2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.internal.LifecycleFragment, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public final Activity m3468b() {
        Activity activityMo3478c = this.f4255s.mo3478c();
        Preconditions.m3544h(activityMo3478c);
        return activityMo3478c;
    }

    /* JADX INFO: renamed from: d */
    public void mo3469d(int i2, int i3, Intent intent) {
    }

    /* JADX INFO: renamed from: e */
    public void mo3470e(Bundle bundle) {
    }

    /* JADX INFO: renamed from: f */
    public void mo3471f() {
    }

    /* JADX INFO: renamed from: g */
    public void mo3472g() {
    }

    /* JADX INFO: renamed from: h */
    public void mo3473h(Bundle bundle) {
    }

    /* JADX INFO: renamed from: i */
    public void mo3474i() {
    }

    /* JADX INFO: renamed from: j */
    public void mo3475j() {
    }

    /* JADX INFO: renamed from: a */
    public void mo3467a() {
    }
}
