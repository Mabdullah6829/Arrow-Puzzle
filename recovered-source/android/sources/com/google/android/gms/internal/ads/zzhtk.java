package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhtk extends zziep implements zziga {
    private static final zzhtk zzc;
    private static volatile zzigh zzd;
    private int zza;
    private zzifb zzb = zzigk.f19864w;

    static {
        zzhtk zzhtkVar = new zzhtk();
        zzc = zzhtkVar;
        zziep.m8338y(zzhtk.class, zzhtkVar);
    }

    private zzhtk() {
    }

    /* JADX INFO: renamed from: H */
    public static zzhtk m7819H(byte[] bArr, zzidz zzidzVar) {
        zziep zziepVarM8331B = zziep.m8331B(zzc, bArr, bArr.length, zzidzVar);
        zziep.m8332C(zziepVarM8331B);
        return (zzhtk) zziepVarM8331B;
    }

    /* JADX INFO: renamed from: I */
    public static zzhtk m7820I(ByteArrayInputStream byteArrayInputStream, zzidz zzidzVar) throws zzifh {
        zziep zziepVarM8334r = zziep.m8334r(zzc, zzidp.m8198e(byteArrayInputStream), zzidzVar);
        zziep.m8332C(zziepVarM8334r);
        return (zzhtk) zziepVarM8334r;
    }

    /* JADX INFO: renamed from: J */
    public static zzhth m7821J() {
        return (zzhth) zzc.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final int m7822D() {
        return this.zza;
    }

    /* JADX INFO: renamed from: E */
    public final List m7823E() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: F */
    public final int m7824F() {
        return this.zzb.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final zzhtj m7825G(int i2) {
        return (zzhtj) this.zzb.get(i2);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m7826K(int i2) {
        this.zza = i2;
    }

    /* JADX INFO: renamed from: L */
    public final void m7827L(zzhtj zzhtjVar) {
        zzifb zzifbVar = this.zzb;
        if (!zzifbVar.zza()) {
            int size = zzifbVar.size();
            this.zzb = zzifbVar.mo8128l(size + size);
        }
        this.zzb.add(zzhtjVar);
    }

    @Override // com.google.android.gms.internal.ads.zziep
    /* JADX INFO: renamed from: z */
    public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return new zzigl(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhtj.class});
        }
        if (iOrdinal == 3) {
            return new zzhtk();
        }
        if (iOrdinal == 4) {
            return new zzhth(zzc);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzd;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhtk.class) {
            try {
                zziekVar = zzd;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzc);
                    zzd = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
