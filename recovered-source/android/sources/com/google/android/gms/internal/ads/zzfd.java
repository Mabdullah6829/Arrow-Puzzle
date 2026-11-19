package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfd {

    /* JADX INFO: renamed from: a */
    public final zzbb f15443a;

    /* JADX INFO: renamed from: b */
    public final zzaz f15444b;

    /* JADX INFO: renamed from: c */
    public final zzex f15445c;

    /* JADX INFO: renamed from: d */
    public final zzbd f15446d = new zzbd();

    /* JADX INFO: renamed from: e */
    public final zzea f15447e;

    /* JADX INFO: renamed from: f */
    public final zzey f15448f;

    /* JADX INFO: renamed from: g */
    public final zzfa f15449g;

    /* JADX INFO: renamed from: h */
    public final zzfb f15450h;

    /* JADX INFO: renamed from: i */
    public final zzfc f15451i;

    public zzfd(zzbb zzbbVar, zzex zzexVar, zzdp zzdpVar, int i2, int i3, int i4, int i5) {
        this.f15443a = zzbbVar;
        this.f15445c = zzexVar;
        zzlj zzljVar = (zzlj) zzbbVar;
        this.f15447e = zzdpVar.mo5975a(zzljVar.f20265s, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzez
            @Override // android.os.Handler.Callback
            public final /* synthetic */ boolean handleMessage(Message message) {
                zzfd zzfdVar = this.f15198s;
                zzfdVar.getClass();
                int i6 = message.what;
                if (i6 == 1) {
                    zzfdVar.f15448f.m6411a();
                    return true;
                }
                if (i6 == 2) {
                    zzfdVar.f15449g.m6413a();
                    return true;
                }
                if (i6 == 3) {
                    zzfdVar.f15450h.m6416a();
                    return true;
                }
                if (i6 != 4) {
                    return false;
                }
                zzfdVar.f15451i.m6421a();
                return true;
            }
        });
        this.f15448f = new zzey(this, i2);
        this.f15449g = new zzfa(this, i3);
        this.f15450h = new zzfb(this, i4);
        this.f15451i = new zzfc(this, i5);
        zzew zzewVar = new zzew(this);
        this.f15444b = zzewVar;
        zzljVar.f20259m.m6195a(zzewVar);
    }
}
