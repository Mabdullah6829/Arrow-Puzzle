package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaly {
    /* JADX INFO: renamed from: a */
    public static void m4216a(int i2, zzap zzapVar, zzt zztVar, zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(new zzao[0]);
        }
        if (zzapVar != null) {
            zzgzi zzgziVar = zzgwt.f18303t;
            zzgwq zzgwqVar = new zzgwq();
            for (zzao zzaoVar : zzapVar.f6355a) {
                if (zzfx.class.isAssignableFrom(zzaoVar.getClass())) {
                    zzgwqVar.m7203c((zzao) zzfx.class.cast(zzaoVar));
                }
            }
            zzgyo zzgyoVar = (zzgyo) zzgwqVar.m7214f();
            int i3 = zzgyoVar.f18357v;
            for (int i4 = 0; i4 < i3; i4++) {
                zzfx zzfxVar = (zzfx) zzgyoVar.get(i4);
                if (!zzfxVar.f16731a.equals("com.android.capture.fps") || i2 == 2) {
                    zzapVar2 = zzapVar2.m4289d(zzfxVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.m4288c(zzapVar3);
        }
        if (zzapVar2.f6355a.length > 0) {
            zztVar.f20799k = zzapVar2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static zzajx m4217b(int i2, String str, zzeu zzeuVar) {
        int iM6376b = zzeuVar.m6376b();
        if (zzeuVar.m6376b() == 1684108385) {
            zzeuVar.m6365G(8);
            return new zzajx(str, null, zzgwt.m7216n(zzeuVar.m6386l(iM6376b - 16)));
        }
        zzeh.m6211c("MetadataUtil", "Failed to parse text attribute: ".concat(zzgb.m6835a(i2)));
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static zzajs m4218c(int i2, String str, zzeu zzeuVar, boolean z, boolean z2) {
        int iM4219d = m4219d(zzeuVar);
        if (z2) {
            iM4219d = Math.min(1, iM4219d);
        }
        if (iM4219d >= 0) {
            return z ? new zzajx(str, null, zzgwt.m7216n(Integer.toString(iM4219d))) : new zzajm("und", str, Integer.toString(iM4219d));
        }
        zzeh.m6211c("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzgb.m6835a(i2)));
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static int m4219d(zzeu zzeuVar) {
        int iM6376b = zzeuVar.m6376b();
        if (zzeuVar.m6376b() == 1684108385) {
            zzeuVar.m6365G(8);
            int i2 = iM6376b - 16;
            if (i2 == 1) {
                return zzeuVar.m6369K();
            }
            if (i2 == 2) {
                return zzeuVar.m6370L();
            }
            if (i2 == 3) {
                return zzeuVar.m6373O();
            }
            if (i2 == 4 && (zzeuVar.m6367I() & 128) == 0) {
                return zzeuVar.m6382h();
            }
        }
        zzeh.m6211c("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static zzajx m4220e(int i2, String str, zzeu zzeuVar) {
        int iM6376b = zzeuVar.m6376b();
        if (zzeuVar.m6376b() == 1684108385 && iM6376b >= 22) {
            zzeuVar.m6365G(10);
            int iM6370L = zzeuVar.m6370L();
            if (iM6370L > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(iM6370L).length());
                sb.append(iM6370L);
                String string = sb.toString();
                int iM6370L2 = zzeuVar.m6370L();
                if (iM6370L2 > 0) {
                    StringBuilder sb2 = new StringBuilder(string.length() + 1 + String.valueOf(iM6370L2).length());
                    sb2.append(string);
                    sb2.append("/");
                    sb2.append(iM6370L2);
                    string = sb2.toString();
                }
                return new zzajx(str, null, zzgwt.m7216n(string));
            }
        }
        zzeh.m6211c("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzgb.m6835a(i2)));
        return null;
    }
}
