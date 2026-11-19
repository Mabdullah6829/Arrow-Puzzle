package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeun implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final Context f14915a;

    /* JADX INFO: renamed from: b */
    public final com.google.android.gms.ads.internal.client.zzr f14916b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f14917c;

    public zzeun(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, ArrayList arrayList) {
        this.f14915a = context;
        this.f14916b = zzrVar;
        this.f14917c = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        Bundle bundle = (Bundle) obj;
        if (((Boolean) zzbla.f9101a.m5057c()).booleanValue()) {
            Bundle bundle2 = new Bundle();
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f14915a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    className = runningTaskInfo.topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle2.putString("activity", className);
            Bundle bundle3 = new Bundle();
            com.google.android.gms.ads.internal.client.zzr zzrVar = this.f14916b;
            bundle3.putInt("width", zzrVar.f3261w);
            bundle3.putInt("height", zzrVar.f3258t);
            bundle2.putBundle("size", bundle3);
            ArrayList arrayList = this.f14917c;
            if (!arrayList.isEmpty()) {
                bundle2.putParcelableArray("parents", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
