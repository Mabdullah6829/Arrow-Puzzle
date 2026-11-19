package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class zzads implements zzbt {

    /* JADX INFO: renamed from: a */
    public final Context f5040a;

    /* JADX INFO: renamed from: b */
    public final zzbs f5041b;

    /* JADX INFO: renamed from: c */
    public final SparseArray f5042c;

    /* JADX INFO: renamed from: d */
    public final boolean f5043d;

    /* JADX INFO: renamed from: e */
    public final zzaew f5044e;

    /* JADX INFO: renamed from: f */
    public final zzdp f5045f;

    /* JADX INFO: renamed from: g */
    public final CopyOnWriteArraySet f5046g;

    /* JADX INFO: renamed from: h */
    public final long f5047h;

    /* JADX INFO: renamed from: i */
    public final zzadx f5048i;

    /* JADX INFO: renamed from: j */
    public zzfi f5049j = new zzfi(0);

    /* JADX INFO: renamed from: k */
    public zzea f5050k;

    /* JADX INFO: renamed from: l */
    public Pair f5051l;

    /* JADX INFO: renamed from: m */
    public int f5052m;

    /* JADX INFO: renamed from: n */
    public int f5053n;

    /* JADX INFO: renamed from: o */
    public long f5054o;

    /* JADX INFO: renamed from: p */
    public int f5055p;

    public zzads(zzadk zzadkVar) {
        this.f5040a = zzadkVar.f5021a;
        zzbs zzbsVar = zzadkVar.f5023c;
        zzbsVar.getClass();
        this.f5041b = zzbsVar;
        this.f5042c = new SparseArray();
        zzgzi zzgziVar = zzgwt.f18303t;
        zzgwt zzgwtVar = zzgyo.f18355w;
        this.f5043d = zzadkVar.f5024d;
        zzdp zzdpVar = zzadkVar.f5025e;
        this.f5045f = zzdpVar;
        this.f5047h = -zzadkVar.f5027g;
        zzadx zzadxVar = zzadkVar.f5028h;
        this.f5048i = zzadxVar;
        this.f5044e = new zzacx(zzadkVar.f5022b, zzadxVar, zzdpVar);
        this.f5046g = new CopyOnWriteArraySet();
        new zzv(new zzt());
        this.f5054o = -9223372036854775807L;
        this.f5055p = -1;
        this.f5053n = 0;
    }
}
