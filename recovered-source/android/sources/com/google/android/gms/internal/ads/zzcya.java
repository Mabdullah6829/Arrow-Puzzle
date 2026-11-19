package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public class zzcya implements zzepm {

    /* JADX INFO: renamed from: a */
    public final zzfky f11759a;

    /* JADX INFO: renamed from: b */
    public final zzfkn f11760b;

    /* JADX INFO: renamed from: c */
    public final zzddy f11761c;

    /* JADX INFO: renamed from: d */
    public final zzdel f11762d;

    /* JADX INFO: renamed from: e */
    public final zzfib f11763e;

    /* JADX INFO: renamed from: f */
    public final zzdcs f11764f;

    /* JADX INFO: renamed from: g */
    public final zzdhq f11765g;

    /* JADX INFO: renamed from: h */
    public final zzdep f11766h;

    /* JADX INFO: renamed from: i */
    public final zzdkv f11767i;

    /* JADX INFO: renamed from: j */
    public final zzdbv f11768j;

    /* JADX INFO: renamed from: k */
    public final zzeaw f11769k;

    public zzcya(zzcxz zzcxzVar) {
        this.f11759a = zzcxzVar.f11713a;
        this.f11760b = zzcxzVar.f11714b;
        this.f11761c = zzcxzVar.f11715c;
        this.f11762d = zzcxzVar.f11716d;
        this.f11763e = zzcxzVar.f11717e;
        this.f11764f = zzcxzVar.f11718f;
        this.f11765g = zzcxzVar.f11719g;
        this.f11766h = zzcxzVar.f11720h;
        this.f11767i = zzcxzVar.f11721i;
        this.f11768j = zzcxzVar.f11722j;
        this.f11769k = zzcxzVar.f11723k;
    }

    /* JADX INFO: renamed from: a */
    public void mo5855a() {
        this.f11762d.mo5833c();
        this.f11766h.mo5910U(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m5868b() {
        zzeaw zzeawVar;
        Collection collection = this.f11760b.f15886C0;
        if (collection == null) {
            return;
        }
        AbstractCollection abstractCollection = (AbstractCollection) collection;
        if (abstractCollection.isEmpty() || (zzeawVar = this.f11769k) == null) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8147I8)).booleanValue() || abstractCollection.isEmpty()) {
            return;
        }
        zzgzi zzgziVarListIterator = ((zzgwt) collection).listIterator(0);
        while (true) {
            zzguq zzguqVar = (zzguq) zzgziVarListIterator;
            if (!zzguqVar.hasNext()) {
                return;
            }
            zzeax zzeaxVar = (zzeax) zzguqVar.next();
            for (int i2 : zzeaxVar.f13487b) {
                if (i2 == 1) {
                    long j2 = zzeaxVar.f13486a;
                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                    zzeawVar.m6139a(1, j2, System.currentTimeMillis());
                    break;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    /* JADX INFO: renamed from: e */
    public final void mo5869e() {
        this.f11767i.zzi();
    }
}
