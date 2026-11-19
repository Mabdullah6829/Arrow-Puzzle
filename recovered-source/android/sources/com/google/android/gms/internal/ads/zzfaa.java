package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfaa implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15253a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f15254b;

    /* JADX INFO: renamed from: c */
    public final Context f15255c;

    /* JADX INFO: renamed from: d */
    public final Set f15256d;

    public zzfaa(zzhcp zzhcpVar, ViewGroup viewGroup, Context context, Set set) {
        this.f15253a = zzhcpVar;
        this.f15256d = set;
        this.f15254b = viewGroup;
        this.f15255c = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15253a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzezz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ViewGroup viewGroup;
                zzfaa zzfaaVar = this.f15243a;
                Set set = zzfaaVar.f15256d;
                zzbio zzbioVar = zzbix.f8247O6;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && (viewGroup = zzfaaVar.f15254b) != null && set.contains("banner")) {
                    return new zzfab(Boolean.valueOf(viewGroup.isHardwareAccelerated()));
                }
                boolean zBooleanValue = ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8264P6)).booleanValue();
                Boolean boolValueOf = null;
                if (zBooleanValue && set.contains("native")) {
                    Context context = zzfaaVar.f15255c;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        Window window = activity.getWindow();
                        if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                            try {
                                boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        } else {
                            boolValueOf = Boolean.TRUE;
                        }
                        return new zzfab(boolValueOf);
                    }
                }
                return new zzfab(null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 22;
    }
}
