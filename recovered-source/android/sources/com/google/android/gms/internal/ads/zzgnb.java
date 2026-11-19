package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgnb implements zzgmp {

    /* JADX INFO: renamed from: a */
    public final Context f17842a;

    /* JADX INFO: renamed from: b */
    public final ExecutorService f17843b;

    /* JADX INFO: renamed from: c */
    public final zzgep f17844c;

    /* JADX INFO: renamed from: d */
    public final String f17845d;

    /* JADX INFO: renamed from: e */
    public final String f17846e;

    /* JADX INFO: renamed from: f */
    public final zzgqo f17847f;

    /* JADX INFO: renamed from: g */
    public final zzgnd f17848g;

    /* JADX INFO: renamed from: h */
    public final int f17849h;

    public zzgnb(Context context, ExecutorService executorService, zzgdq zzgdqVar, zzgep zzgepVar, zzgqo zzgqoVar, zzgnd zzgndVar) {
        this.f17842a = context;
        this.f17843b = executorService;
        this.f17844c = zzgepVar;
        this.f17847f = zzgqoVar;
        this.f17848g = zzgndVar;
        this.f17845d = zzgdqVar.m6921U();
        int iM6915O = zzgdqVar.m6915O();
        if (iM6915O == 1) {
            zzifc.m8355a();
            throw null;
        }
        int i2 = iM6915O - 2;
        this.f17849h = i2 != 0 ? i2 != 1 ? i2 != 2 ? 5 : 4 : 3 : 2;
        this.f17846e = zzgdqVar.m6927a0().m6958F();
    }

    /* JADX INFO: renamed from: a */
    public static zzgfz m7037a(int i2) {
        zzgfy zzgfyVarM6977G = zzgfz.m6977G();
        zzgfyVarM6977G.m8326l();
        ((zzgfz) zzgfyVarM6977G.f19780t).m6985L(i2);
        return (zzgfz) zzgfyVarM6977G.m8328o();
    }

    @Override // com.google.android.gms.internal.ads.zzgmp
    public final zzhbx zza() {
        int i2;
        zzbdq zzbdqVarM4758D = zzbdr.m4758D();
        byte[] bArrM4435a = zzavh.m4435a();
        zzidl zzidlVar = zzidl.f19719t;
        zzidl zzidlVarM8149y = zzidl.m8149y(bArrM4435a, 0, bArrM4435a.length);
        zzbdqVarM4758D.m8326l();
        ((zzbdr) zzbdqVarM4758D.f19780t).m4759E(zzidlVarM8149y);
        long j2 = Build.VERSION.SDK_INT;
        zzbdqVarM4758D.m8326l();
        ((zzbdr) zzbdqVarM4758D.f19780t).m4760F(j2);
        String str = Build.MODEL;
        zzbdqVarM4758D.m8326l();
        ((zzbdr) zzbdqVarM4758D.f19780t).m4761G(str);
        Context context = this.f17842a;
        String packageName = context.getPackageName();
        zzbdqVarM4758D.m8326l();
        ((zzbdr) zzbdqVarM4758D.f19780t).m4762H(packageName);
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i2 = -1;
        }
        zzbdqVarM4758D.m8326l();
        ((zzbdr) zzbdqVarM4758D.f19780t).m4763I(i2);
        zzbdqVarM4758D.m8326l();
        ((zzbdr) zzbdqVarM4758D.f19780t).m4764J(this.f17845d);
        zzbdqVarM4758D.m8326l();
        ((zzbdr) zzbdqVarM4758D.f19780t).m4765K(3);
        zzbdqVarM4758D.m8326l();
        ((zzbdr) zzbdqVarM4758D.f19780t).m4766L(this.f17849h);
        byte[] bArrM8099h = ((zzbdr) zzbdqVarM4758D.m8328o()).m8099h();
        zzgzn zzgznVar = (zzgzn) zzgzo.f18402b;
        Character ch = zzgznVar.f18399e;
        zzgzn zzgznVarMo7276i = zzgznVar;
        if (ch != null) {
            zzgznVarMo7276i = zzgznVar.mo7276i(zzgznVar.f18398d, null);
        }
        zzhbx zzhbxVar = (zzhbx) zzhcf.m7375i(zzhbx.m7360q(this.f17844c.zza(Uri.parse(this.f17846e).buildUpon().appendQueryParameter("aspq", zzgznVarMo7276i.m7282g(bArrM8099h.length, bArrM8099h)).build().toString())), new zzgti() { // from class: com.google.android.gms.internal.ads.zzgna
            @Override // com.google.android.gms.internal.ads.zzgti
            public final Object apply(Object obj) {
                zzgeo zzgeoVar = (zzgeo) obj;
                zzgnb zzgnbVar = this.f17841a;
                zzgqo zzgqoVar = zzgnbVar.f17847f;
                if (zzgeoVar.zza() != 200) {
                    zzgqoVar.m7062c(20003, new String(zzavh.m4435a(), StandardCharsets.UTF_8));
                    return zzgnb.m7037a(7);
                }
                try {
                    String strZzb = zzgeoVar.zzb();
                    if (TextUtils.isEmpty(strZzb)) {
                        zzgqoVar.m7061b(20004);
                        return zzgnb.m7037a(8);
                    }
                    zzbdt zzbdtVarM4767F = zzbdt.m4767F(zzgel.m6965a(strZzb, true), zzidz.m8304a());
                    if (zzbdtVarM4767F.m4768D().m4786F() && zzbdtVarM4767F.m4768D().m4784D()) {
                        if (!zzgnbVar.f17848g.m7038a(zzbdtVarM4767F)) {
                            zzgqoVar.m7061b(20006);
                            return zzgnb.m7037a(12);
                        }
                        zzgfy zzgfyVarM6977G = zzgfz.m6977G();
                        zzgga zzggaVarM6987I = zzggb.m6987I();
                        zzbeg zzbegVarM4785E = zzbdtVarM4767F.m4768D().m4785E();
                        zzggaVarM6987I.m8326l();
                        ((zzggb) zzggaVarM6987I.f19780t).m6994L(zzbegVarM4785E);
                        List listM4769E = zzbdtVarM4767F.m4769E();
                        zzggaVarM6987I.m8326l();
                        ((zzggb) zzggaVarM6987I.f19780t).m6996N((zziex) listM4769E);
                        zzggb zzggbVar = (zzggb) zzggaVarM6987I.m8328o();
                        zzgfyVarM6977G.m8326l();
                        ((zzgfz) zzgfyVarM6977G.f19780t).m6981H(zzggbVar);
                        zzidl zzidlVarM4787G = zzbdtVarM4767F.m4768D().m4787G();
                        zzgfyVarM6977G.m8326l();
                        ((zzgfz) zzgfyVarM6977G.f19780t).m6982I(zzidlVarM4787G);
                        zzgfyVarM6977G.m8326l();
                        ((zzgfz) zzgfyVarM6977G.f19780t).m6985L(2);
                        return (zzgfz) zzgfyVarM6977G.m8328o();
                    }
                    zzgqoVar.m7061b(20004);
                    return zzgnb.m7037a(8);
                } catch (Throwable th) {
                    zzgqoVar.m7063d(th, 20005);
                    return zzgnb.m7037a(6);
                }
            }
        }, this.f17843b);
        zzgti zzgtiVar = new zzgti() { // from class: com.google.android.gms.internal.ads.zzgmy
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                this.f17837a.f17847f.m7061b(20007);
                return zzgnb.m7037a(13);
            }
        };
        zzhbu zzhbuVar = zzhbu.f18506s;
        zzhbx zzhbxVar2 = (zzhbx) zzhcf.m7371e((zzhbx) zzhcf.m7371e(zzhbxVar, UnknownHostException.class, zzgtiVar, zzhbuVar), SocketException.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzgmz
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                this.f17838a.f17847f.m7061b(20008);
                return zzgnb.m7037a(13);
            }
        }, zzhbuVar);
        this.f17847f.m7064e(20002, zzhbxVar2);
        return zzhbxVar2;
    }
}
