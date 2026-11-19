package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzenb implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f14265a;

    /* JADX INFO: renamed from: b */
    public final zzini f14266b;

    /* JADX INFO: renamed from: c */
    public final zzini f14267c;

    /* JADX INFO: renamed from: d */
    public final zzini f14268d;

    /* JADX INFO: renamed from: e */
    public final zzdcq f14269e;

    /* JADX INFO: renamed from: f */
    public final zzini f14270f;

    /* JADX INFO: renamed from: g */
    public final zzini f14271g;

    public zzenb(zzina zzinaVar, zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzdcq zzdcqVar, zzini zziniVar4, zzini zziniVar5) {
        this.f14265a = zzinaVar;
        this.f14266b = zziniVar;
        this.f14267c = zziniVar2;
        this.f14268d = zziniVar3;
        this.f14269e = zzdcqVar;
        this.f14270f = zziniVar4;
        this.f14271g = zziniVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzena zzb() {
        return new zzena((zzcwx) this.f14265a.f20011a, (Context) this.f14266b.zzb(), (Executor) this.f14267c.zzb(), (zzdwq) this.f14268d.zzb(), this.f14269e.m5898a(), (zzgti) this.f14270f.zzb(), (zzdzo) this.f14271g.zzb());
    }
}
