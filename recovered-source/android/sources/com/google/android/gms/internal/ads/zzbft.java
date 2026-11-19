package com.google.android.gms.internal.ads;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class zzbft implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ View f7774s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzbfx f7775t;

    public zzbft(zzbfx zzbfxVar, View view) {
        this.f7774s = view;
        this.f7775t = zzbfxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Application application;
        zzbfx zzbfxVar = this.f7775t;
        View view = this.f7774s;
        zzbfxVar.getClass();
        try {
            zzbfn zzbfnVar = new zzbfn(zzbfxVar.f7797x, zzbfxVar.f7798y, zzbfxVar.f7799z, zzbfxVar.f7785A, zzbfxVar.f7786B, zzbfxVar.f7787C, zzbfxVar.f7788D, zzbfxVar.f7791G);
            zzbfs zzbfsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3707g;
            synchronized (zzbfsVar.f7771a) {
                try {
                    zzbfq zzbfqVar = zzbfsVar.f7772b;
                    application = zzbfqVar != null ? zzbfqVar.f7764t : null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (application != null) {
                String str = zzbfxVar.f7789E;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(application.getResources().getIdentifier((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8088F0), "id", application.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            zzbfw zzbfwVarM4856a = zzbfxVar.m4856a(view, zzbfnVar);
            zzbfnVar.m4846b();
            if (zzbfwVarM4856a.f7783a == 0 && zzbfwVarM4856a.f7784b == 0) {
                return;
            }
            int i2 = zzbfwVarM4856a.f7784b;
            if (i2 == 0 && zzbfnVar.f7750k == 0) {
                return;
            }
            if (i2 == 0) {
                zzbfo zzbfoVar = zzbfxVar.f7795v;
                synchronized (zzbfoVar.f7757a) {
                    try {
                        if (zzbfoVar.f7759c.contains(zzbfnVar)) {
                            return;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            zzbfxVar.f7795v.m4849b(zzbfnVar);
        } catch (Exception e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("ContentFetchTask.fetchContent", e);
        }
    }
}
