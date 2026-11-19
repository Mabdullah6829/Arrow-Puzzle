package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zziba implements zzhep {

    /* JADX INFO: renamed from: e */
    public static final byte[] f19591e = {0};

    /* JADX INFO: renamed from: a */
    public final zzhqo f19592a;

    /* JADX INFO: renamed from: b */
    public final int f19593b;

    /* JADX INFO: renamed from: c */
    public final byte[] f19594c;

    /* JADX INFO: renamed from: d */
    public final byte[] f19595d;

    public zziba(zzhom zzhomVar) {
        this.f19592a = zziax.m8040b(zzhqm.m7615c(zzhqn.m7616b(zzhomVar.f19061a.f19080a), zzhomVar.f19062b));
        zzhot zzhotVar = zzhomVar.f19061a;
        this.f19593b = zzhotVar.f19081b;
        this.f19594c = zzhomVar.f19063c.m8051b();
        if (zzhotVar.f19082c.equals(zzhos.f19077d)) {
            this.f19595d = Arrays.copyOf(f19591e, 1);
        } else {
            this.f19595d = new byte[0];
        }
    }

    public zziba(zzhox zzhoxVar) {
        String strValueOf = String.valueOf(zzhoxVar.f19087a.f19123d);
        zzibm zzibmVar = zzhoxVar.f19088b;
        zzhey zzheyVar = zzhey.f18574a;
        this.f19592a = new zziaz("HMAC".concat(strValueOf), new SecretKeySpec(zzibmVar.f19616a.m8051b(), "HMAC"));
        zzhpg zzhpgVar = zzhoxVar.f19087a;
        this.f19593b = zzhpgVar.f19121b;
        this.f19594c = zzhoxVar.f19089c.m8051b();
        if (zzhpgVar.f19122c.equals(zzhpf.f19117d)) {
            this.f19595d = Arrays.copyOf(f19591e, 1);
        } else {
            this.f19595d = new byte[0];
        }
    }

    public zziba(zziaz zziazVar, int i2) throws InvalidAlgorithmParameterException {
        this.f19592a = zziazVar;
        this.f19593b = i2;
        this.f19594c = new byte[0];
        this.f19595d = new byte[0];
        zziazVar.mo7617a(i2, new byte[0]);
    }
}
