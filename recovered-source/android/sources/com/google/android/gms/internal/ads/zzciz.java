package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzciz extends com.google.android.gms.ads.internal.util.zzb {

    /* JADX INFO: renamed from: b */
    public final zzchu f10179b;

    /* JADX INFO: renamed from: c */
    public final zzcjh f10180c;

    /* JADX INFO: renamed from: d */
    public final String f10181d;

    /* JADX INFO: renamed from: e */
    public final String[] f10182e;

    public zzciz(zzchu zzchuVar, zzcjh zzcjhVar, String str, String[] strArr) {
        this.f10179b = zzchuVar;
        this.f10180c = zzcjhVar;
        this.f10181d = str;
        this.f10182e = strArr;
        com.google.android.gms.ads.internal.zzt.f3698C.f3699A.f10184s.add(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    /* JADX INFO: renamed from: a */
    public final void mo3002a() {
        try {
            this.f10180c.mo5506h(this.f10181d, this.f10182e);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new zzcix(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    /* JADX INFO: renamed from: b */
    public final ListenableFuture mo3108b() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8056D2)).booleanValue() || !(this.f10180c instanceof zzcjq)) {
            return super.mo3108b();
        }
        return ((zzhbb) zzcfy.f9951f).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzciy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzciz zzcizVar = this.f10178a;
                return Boolean.valueOf(zzcizVar.f10180c.mo5507i(zzcizVar.f10181d, zzcizVar.f10182e, zzcizVar));
            }
        });
    }
}
