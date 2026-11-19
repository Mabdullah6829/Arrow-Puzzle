package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdcl implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzdcj f12035a;

    /* JADX INFO: renamed from: b */
    public final zzini f12036b;

    public zzdcl(zzdcj zzdcjVar, zzcnz zzcnzVar) {
        this.f12035a = zzdcjVar;
        this.f12036b = zzcnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        ((zzcnz) this.f12036b).m5709a();
        Context context = this.f12035a.f12027a;
        zzinh.m8554a(context);
        return context;
    }
}
