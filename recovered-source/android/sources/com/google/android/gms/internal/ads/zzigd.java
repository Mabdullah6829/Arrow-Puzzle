package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzigd implements zzigr {

    /* JADX INFO: renamed from: a */
    public final zzifz f19855a;

    /* JADX INFO: renamed from: b */
    public final zzihd f19856b;

    /* JADX INFO: renamed from: c */
    public final boolean f19857c;

    /* JADX INFO: renamed from: d */
    public final zziea f19858d;

    public zzigd(zzihd zzihdVar, zziea zzieaVar, zzifz zzifzVar) {
        this.f19856b = zzihdVar;
        this.f19857c = zzifzVar instanceof zziel;
        this.f19858d = zzieaVar;
        this.f19855a = zzifzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: a */
    public final void mo8393a(Object obj, Object obj2) {
        zzigs.m8421d(obj, obj2);
        if (!this.f19857c || ((zziel) obj2).zza.f19767a.isEmpty()) {
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: b */
    public final boolean mo8394b(Object obj) {
        ((zziel) obj).zza.m8315d();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: c */
    public final void mo8395c(Object obj) {
        this.f19856b.mo8452j(obj);
        this.f19858d.mo8305a(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: d */
    public final int mo8396d(zziep zziepVar) {
        int iHashCode = zziepVar.zzt.hashCode();
        return this.f19857c ? (iHashCode * 53) + ((zziel) zziepVar).zza.f19767a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: e */
    public final void mo8397e(Object obj, byte[] bArr, int i2, int i3, zzicz zziczVar) {
        zziep zziepVar = (zziep) obj;
        if (zziepVar.zzt == zzihe.f19896f) {
            zziepVar.zzt = zzihe.m8454a();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: f */
    public final void mo8398f(Object obj, zzidq zzidqVar, zzidz zzidzVar) {
        this.f19856b.mo8450h(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: g */
    public final void mo8399g(Object obj, zzidv zzidvVar) {
        Iterator itM8313b = ((zziel) obj).zza.m8313b();
        if (itM8313b.hasNext()) {
            ((zzied) ((Map.Entry) itM8313b.next()).getKey()).zzc();
            throw null;
        }
        zzihe zziheVar = ((zziep) obj).zzt;
        for (int i2 = 0; i2 < zziheVar.f19897a; i2++) {
            int i3 = zziheVar.f19898b[i2] >>> 3;
            Object obj2 = zziheVar.f19899c[i2];
            zzidu zziduVar = zzidvVar.f19752a;
            if (obj2 instanceof zzidl) {
                zziduVar.mo8263q(i3, (zzidl) obj2);
            } else {
                zziduVar.mo8262p(i3, (zzifz) obj2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: h */
    public final boolean mo8400h(zziep zziepVar, zziep zziepVar2) {
        if (!zziepVar.zzt.equals(zziepVar2.zzt)) {
            return false;
        }
        if (this.f19857c) {
            return ((zziel) zziepVar).zza.equals(((zziel) zziepVar2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    /* JADX INFO: renamed from: i */
    public final int mo8401i(zziep zziepVar) {
        zzihe zziheVar = zziepVar.zzt;
        int iM395c = zziheVar.f19900d;
        if (iM395c == -1) {
            iM395c = 0;
            for (int i2 = 0; i2 < zziheVar.f19897a; i2++) {
                int i3 = zziheVar.f19898b[i2] >>> 3;
                zzidl zzidlVar = (zzidl) zziheVar.f19899c[i2];
                int iM8280b = zzidu.m8280b(8);
                int iM8280b2 = zzidu.m8280b(i3) + zzidu.m8280b(16);
                int iM8280b3 = zzidu.m8280b(24);
                int iMo8132h = zzidlVar.mo8132h();
                iM395c = AbstractC0271e0.m395c(iM8280b + iM8280b, iM8280b2, AbstractC5152f.m3769a(iMo8132h, iMo8132h, iM8280b3), iM395c);
            }
            zziheVar.f19900d = iM395c;
        }
        if (this.f19857c) {
            zzigt zzigtVar = ((zziel) zziepVar).zza.f19767a;
            if (zzigtVar.f19891t > 0) {
                zziee.m8311i(zzigtVar.m8435b(0));
                throw null;
            }
            Iterator it = zzigtVar.m8436c().iterator();
            if (it.hasNext()) {
                zziee.m8311i((Map.Entry) it.next());
                throw null;
            }
        }
        return iM395c;
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final Object zza() {
        zzifz zzifzVar = this.f19855a;
        return zzifzVar instanceof zziep ? ((zziep) zzifzVar).m8345u() : zzifzVar.mo8103d().mo8324j();
    }
}
