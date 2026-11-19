package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcjh implements Releasable {

    /* JADX INFO: renamed from: s */
    public final Context f10224s;

    /* JADX INFO: renamed from: t */
    public final String f10225t;

    /* JADX INFO: renamed from: u */
    public final WeakReference f10226u;

    public zzcjh(zzchu zzchuVar) {
        Context context = zzchuVar.getContext();
        this.f10224s = context;
        this.f10225t = com.google.android.gms.ads.internal.zzt.f3698C.f3703c.m3231E(context, zzchuVar.mo5472h().f3396s);
        this.f10226u = new WeakReference(zzchuVar);
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo5505f(String str);

    /* JADX INFO: renamed from: h */
    public boolean mo5506h(String str, String[] strArr) {
        return mo5505f(str);
    }

    /* JADX INFO: renamed from: i */
    public boolean mo5507i(String str, String[] strArr, zzciz zzcizVar) {
        return mo5505f(str);
    }

    /* JADX INFO: renamed from: j */
    public void mo5508j(int i2) {
    }

    /* JADX INFO: renamed from: l */
    public void mo5509l(int i2) {
    }

    /* JADX INFO: renamed from: n */
    public void mo5511n(int i2) {
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo5512o();

    /* JADX INFO: renamed from: p */
    public final void m5513p(String str, String str2, String str3, String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.f3409b.post(new zzcjg(this, str, str2, str3, str4));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m5514q(HashMap map) {
        zzchu zzchuVar = (zzchu) this.f10226u.get();
        if (zzchuVar != null) {
            zzchuVar.mo5129b("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    /* JADX INFO: renamed from: m */
    public void mo5510m(int i2) {
    }
}
