package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
final class zzgmw implements zzgmp {

    /* JADX INFO: renamed from: a */
    public final Context f17823a;

    /* JADX INFO: renamed from: b */
    public final zzimt f17824b;

    /* JADX INFO: renamed from: c */
    public final zzgng f17825c;

    /* JADX INFO: renamed from: d */
    public final zzgqo f17826d;

    /* JADX INFO: renamed from: e */
    public final ExecutorService f17827e;

    /* JADX INFO: renamed from: f */
    public final zzgll f17828f;

    /* JADX INFO: renamed from: g */
    public final zzfxq f17829g;

    public zzgmw(Context context, zzimt zzimtVar, zzgng zzgngVar, zzgqo zzgqoVar, ExecutorService executorService, zzgll zzgllVar, zzfxq zzfxqVar) {
        this.f17823a = context;
        this.f17824b = zzimtVar;
        this.f17825c = zzgngVar;
        this.f17826d = zzgqoVar;
        this.f17827e = executorService;
        this.f17828f = zzgllVar;
        this.f17829g = zzfxqVar;
    }

    /* JADX INFO: renamed from: a */
    public static zzgfz m7036a(int i2) {
        zzgfy zzgfyVarM6977G = zzgfz.m6977G();
        zzgfyVarM6977G.m8326l();
        ((zzgfz) zzgfyVarM6977G.f19780t).m6985L(i2);
        return (zzgfz) zzgfyVarM6977G.m8328o();
    }

    @Override // com.google.android.gms.internal.ads.zzgmp
    public final zzhbx zza() {
        final zzimt zzimtVar = this.f17824b;
        Objects.requireNonNull(zzimtVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzgmr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzimtVar.zzb();
            }
        };
        ExecutorService executorService = this.f17827e;
        zzhbx zzhbxVarM7360q = zzhbx.m7360q(zzhcf.m7369c(executorService, callable));
        zzgti zzgtiVar = new zzgti() { // from class: com.google.android.gms.internal.ads.zzgmv
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzbdz zzbdzVar = (zzbdz) obj;
                zzgmw zzgmwVar = this.f17822a;
                zzgmwVar.getClass();
                if (zzfyn.m6786a(zzbdzVar)) {
                    return new Integer(0);
                }
                zzgmwVar.f17826d.m7062c(15204, zzbdzVar.name());
                throw new zzgmq();
            }
        };
        zzhbu zzhbuVar = zzhbu.f18506s;
        zzhbx zzhbxVar = (zzhbx) zzhcf.m7371e((zzhbx) zzhcf.m7375i((zzhbx) zzhcf.m7374h((zzhbx) zzhcf.m7375i(zzhbxVarM7360q, zzgtiVar, zzhbuVar), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgms
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                return this.f17819a.f17825c.zzb();
            }
        }, zzhbuVar), new zzgti() { // from class: com.google.android.gms.internal.ads.zzgmt
            @Override // com.google.android.gms.internal.ads.zzgti
            public final Object apply(Object obj) {
                boolean zM6759a;
                zzggb zzggbVar = (zzggb) obj;
                zzgmw zzgmwVar = this.f17820a;
                zzimt zzimtVar2 = zzgmwVar.f17824b;
                String strM4796D = zzggbVar.m6989D().m4796D();
                String strM4797E = zzggbVar.m6989D().m4797E();
                zzgqo zzgqoVar = zzgmwVar.f17826d;
                zzgqm zzgqmVarM7060a = zzgqoVar.m7060a(15203);
                try {
                    zzgqmVarM7060a.m7057a();
                    zzfze zzfzeVarM6776a = zzfxz.m6776a(zzgmwVar.f17823a, (zzbdz) zzimtVar2.zzb(), strM4796D, strM4797E, zzgmwVar.f17829g);
                    int i2 = zzfzeVarM6776a.f16843u;
                    zzgqmVarM7060a.m7059c();
                    int i3 = 2;
                    if (i2 == 2) {
                        zzgqoVar.m7061b(15208);
                        return zzgmw.m7036a(4);
                    }
                    byte[] bArr = zzfzeVarM6776a.f16842t;
                    if (bArr == null || bArr.length == 0) {
                        zzgqoVar.m7061b(5010);
                        return zzgmw.m7036a(8);
                    }
                    try {
                        zzbeb zzbebVarM4779H = zzbeb.m4779H(bArr, zzidz.m8304a());
                        if (zzbebVarM4779H.m4780D().m4796D().isEmpty() || zzbebVarM4779H.m4780D().m4797E().isEmpty() || zzbebVarM4779H.m4782F().m8151a().length == 0) {
                            zzgqoVar.m7061b(15207);
                        } else {
                            if (zzggbVar.equals(zzggb.m6988J()) || !TextUtils.equals(zzggbVar.m6989D().m4796D(), zzbebVarM4779H.m4780D().m4796D()) || !TextUtils.equals(zzggbVar.m6989D().m4797E(), zzbebVarM4779H.m4780D().m4797E())) {
                                if (i2 == 4) {
                                    zzgll zzgllVar = zzgmwVar.f17828f;
                                    byte[] bArrM8151a = zzbebVarM4779H.m4781E().m8151a();
                                    File file = zzgllVar.f17730a;
                                    try {
                                        zzhaa.m7288b(file);
                                        zzhaa.m7287a(file, bArrM8151a);
                                        zM6759a = zzgllVar.f17731b.m6759a(file);
                                    } catch (IOException | GeneralSecurityException e) {
                                        zzgllVar.f17732c.m7063d(e, 2027);
                                        zM6759a = false;
                                    }
                                    try {
                                        file.delete();
                                    } catch (SecurityException unused) {
                                    }
                                    if (!zM6759a) {
                                        zzgqoVar.m7061b(15206);
                                        return zzgmw.m7036a(12);
                                    }
                                    i2 = 4;
                                }
                                zzgfy zzgfyVarM6977G = zzgfz.m6977G();
                                if (i2 == 2) {
                                    i3 = 4;
                                } else if (i2 != 3) {
                                    if (i2 != 4) {
                                        i3 = i2 != 6 ? 1 : 5;
                                    } else {
                                        i3 = 3;
                                    }
                                }
                                zzgfyVarM6977G.m8326l();
                                ((zzgfz) zzgfyVarM6977G.f19780t).m6985L(i3);
                                zzgga zzggaVarM6987I = zzggb.m6987I();
                                zzbei zzbeiVarM4780D = zzbebVarM4779H.m4780D();
                                zzggaVarM6987I.m8326l();
                                ((zzggb) zzggaVarM6987I.f19780t).m6993K(zzbeiVarM4780D);
                                zzbdz zzbdzVar = (zzbdz) zzimtVar2.zzb();
                                zzggaVarM6987I.m8326l();
                                ((zzggb) zzggaVarM6987I.f19780t).m6995M(zzbdzVar);
                                zzggb zzggbVar2 = (zzggb) zzggaVarM6987I.m8328o();
                                zzgfyVarM6977G.m8326l();
                                ((zzgfz) zzgfyVarM6977G.f19780t).m6981H(zzggbVar2);
                                zzidl zzidlVarM4781E = zzbebVarM4779H.m4781E();
                                zzgfyVarM6977G.m8326l();
                                ((zzgfz) zzgfyVarM6977G.f19780t).m6983J(zzidlVarM4781E);
                                zzidl zzidlVarM4782F = zzbebVarM4779H.m4782F();
                                zzgfyVarM6977G.m8326l();
                                ((zzgfz) zzgfyVarM6977G.f19780t).m6982I(zzidlVarM4782F);
                                return (zzgfz) zzgfyVarM6977G.m8328o();
                            }
                            zzgqoVar.m7061b(15209);
                        }
                        return zzgmw.m7036a(11);
                    } catch (zzifh e2) {
                        zzgqoVar.m7063d(e2, 15205);
                        return zzgmw.m7036a(9);
                    } catch (NullPointerException unused2) {
                        zzgqoVar.m7061b(15210);
                        return zzgmw.m7036a(10);
                    }
                } catch (Throwable th) {
                    try {
                        zzgqmVarM7060a.m7058b(th);
                        throw th;
                    } catch (Throwable th2) {
                        zzgqmVarM7060a.m7059c();
                        throw th2;
                    }
                }
            }
        }, executorService), zzgmq.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzgmu
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return zzgmw.m7036a(5);
            }
        }, zzhbuVar);
        this.f17826d.m7064e(15202, zzhbxVar);
        return zzhbxVar;
    }
}
