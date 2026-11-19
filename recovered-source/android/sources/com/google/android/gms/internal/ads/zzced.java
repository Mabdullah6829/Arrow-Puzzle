package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class zzced implements zzbex {

    /* JADX INFO: renamed from: s */
    public final Context f9821s;

    /* JADX INFO: renamed from: t */
    public final Object f9822t;

    /* JADX INFO: renamed from: u */
    public final String f9823u;

    /* JADX INFO: renamed from: v */
    public boolean f9824v;

    public zzced(Context context, String str) {
        this.f9821s = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f9823u = str;
        this.f9824v = false;
        this.f9822t = new Object();
    }

    /* JADX INFO: renamed from: a */
    public final void m5358a(boolean z) {
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        zzceg zzcegVar = zztVar.f3725y;
        Context context = this.f9821s;
        if (zzcegVar.m5361a(context)) {
            synchronized (this.f9822t) {
                try {
                    if (this.f9824v == z) {
                        return;
                    }
                    this.f9824v = z;
                    String str = this.f9823u;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.f9824v) {
                        zzceg zzcegVar2 = zztVar.f3725y;
                        if (zzcegVar2.m5361a(context)) {
                            zzcegVar2.m5368j(context, str, "beginAdUnitExposure");
                        }
                    } else {
                        zzceg zzcegVar3 = zztVar.f3725y;
                        if (zzcegVar3.m5361a(context)) {
                            zzcegVar3.m5368j(context, str, "endAdUnitExposure");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    /* JADX INFO: renamed from: t */
    public final void mo4826t(zzbew zzbewVar) {
        m5358a(zzbewVar.f7707j);
    }
}
