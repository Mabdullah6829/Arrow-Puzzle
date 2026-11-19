package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public final class zzftl extends com.google.android.gms.ads.internal.client.zzcg {

    /* JADX INFO: renamed from: s */
    public final zzftr f16495s;

    /* JADX INFO: renamed from: t */
    public final zzftc f16496t;

    public zzftl(zzftr zzftrVar, zzftc zzftcVar) {
        this.f16495s = zzftrVar;
        this.f16496t = zzftcVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    /* JADX INFO: renamed from: X */
    public final void mo2887X(int i2) {
        zzftc zzftcVar = this.f16496t;
        zzftcVar.getClass();
        AdFormat adFormatM2747b = AdFormat.m2747b(i2);
        if (adFormatM2747b == null) {
            return;
        }
        HashMap map = zzftcVar.f16458a;
        synchronized (map) {
            try {
                if (map.containsKey(adFormatM2747b)) {
                    Map map2 = (Map) map.get(adFormatM2747b);
                    int size = map2.size();
                    if (size == 0) {
                        return;
                    }
                    zzgwt zzgwtVarM7220t = zzgwt.m7220t(map2.values());
                    map2.clear();
                    int size2 = zzgwtVarM7220t.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        zzful zzfulVar = (zzful) zzgwtVarM7220t.get(i3);
                        if (zzfulVar != null) {
                            zzfulVar.f16561g.set(false);
                            zzfulVar.f16570p.set(false);
                            zzfsx zzfsxVar = zzftcVar.f16466i;
                            if (zzfsxVar != null) {
                                zzfsxVar.m6648d(zzfulVar);
                            }
                            Queue queue = zzfulVar.f16564j;
                            synchronized (queue) {
                                queue.clear();
                            }
                            String strValueOf = String.valueOf(zzfulVar.f16566l);
                            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3072e("Destroyed ad preloader for preloadId: ".concat(strValueOf));
                        }
                    }
                    String strConcat = "Destroyed all ad preloaders for ad format: ".concat(adFormatM2747b.toString());
                    int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3072e(strConcat);
                    zzftcVar.f16460c.m6683f("pda", zzftcVar.f16464g.currentTimeMillis(), null, null, adFormatM2747b, -1, -1, size);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006f A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:4:0x0005, B:35:0x0094, B:37:0x00a7, B:40:0x00c3, B:42:0x00c7, B:43:0x00ce, B:44:0x00d6, B:46:0x00e8, B:47:0x00e9, B:49:0x00f5, B:50:0x00f9, B:54:0x0126, B:55:0x0127, B:7:0x0012, B:9:0x0016, B:21:0x0035, B:24:0x0039, B:26:0x003f, B:29:0x0044, B:34:0x0086, B:32:0x0050, B:33:0x006f, B:45:0x00d7, B:10:0x0017, B:12:0x001b, B:18:0x0032, B:17:0x002b), top: B:62:0x0005, inners: #0, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:4:0x0005, B:35:0x0094, B:37:0x00a7, B:40:0x00c3, B:42:0x00c7, B:43:0x00ce, B:44:0x00d6, B:46:0x00e8, B:47:0x00e9, B:49:0x00f5, B:50:0x00f9, B:54:0x0126, B:55:0x0127, B:7:0x0012, B:9:0x0016, B:21:0x0035, B:24:0x0039, B:26:0x003f, B:29:0x0044, B:34:0x0086, B:32:0x0050, B:33:0x006f, B:45:0x00d7, B:10:0x0017, B:12:0x001b, B:18:0x0032, B:17:0x002b), top: B:62:0x0005, inners: #0, #3, #4 }] */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e9, code lost:
    
        r3 = 0;
        r11 = com.google.android.gms.ads.internal.util.client.zzf.f3409b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
    
        if (r4.containsKey(r10) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f5, code lost:
    
        r3 = r4.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f9, code lost:
    
        r4.put(r10, java.lang.Integer.valueOf(((java.lang.Integer) r3).intValue() + 1));
        r13.m6678a(r8.f3192v, r2.f16511h.currentTimeMillis(), new com.google.android.gms.internal.ads.zzftu(new com.google.android.gms.internal.ads.zzftt(r9, r10)), "1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0121, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6669k4(java.util.ArrayList r21, com.google.android.gms.ads.internal.client.zzcb r22) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftl.m6669k4(java.util.ArrayList, com.google.android.gms.ads.internal.client.zzcb):void");
    }

    /* JADX INFO: renamed from: l4 */
    public final boolean m6670l4(String str) {
        boolean zM6691e;
        zzftr zzftrVar = this.f16495s;
        synchronized (zzftrVar) {
            zM6691e = zzftrVar.m6691e(str, AdFormat.REWARDED);
        }
        return zM6691e;
    }

    /* JADX INFO: renamed from: m4 */
    public final zzccp m6671m4(String str) {
        zzccp zzccpVar;
        zzftr zzftrVar = this.f16495s;
        synchronized (zzftrVar) {
            zzccpVar = (zzccp) zzftrVar.m6692f(AdFormat.REWARDED, zzccp.class, str);
        }
        return zzccpVar;
    }

    /* JADX INFO: renamed from: n4 */
    public final boolean m6672n4(String str) {
        boolean zM6691e;
        zzftr zzftrVar = this.f16495s;
        synchronized (zzftrVar) {
            zM6691e = zzftrVar.m6691e(str, AdFormat.APP_OPEN_AD);
        }
        return zM6691e;
    }

    /* JADX INFO: renamed from: o4 */
    public final zzbgq m6673o4(String str) {
        zzbgq zzbgqVar;
        zzftr zzftrVar = this.f16495s;
        synchronized (zzftrVar) {
            zzbgqVar = (zzbgq) zzftrVar.m6692f(AdFormat.APP_OPEN_AD, zzbgq.class, str);
        }
        return zzbgqVar;
    }

    /* JADX INFO: renamed from: p4 */
    public final boolean m6674p4(String str) {
        boolean zM6691e;
        zzftr zzftrVar = this.f16495s;
        synchronized (zzftrVar) {
            zM6691e = zzftrVar.m6691e(str, AdFormat.INTERSTITIAL);
        }
        return zM6691e;
    }

    /* JADX INFO: renamed from: q4 */
    public final com.google.android.gms.ads.internal.client.zzbu m6675q4(String str) {
        com.google.android.gms.ads.internal.client.zzbu zzbuVar;
        zzftr zzftrVar = this.f16495s;
        synchronized (zzftrVar) {
            zzbuVar = (com.google.android.gms.ads.internal.client.zzbu) zzftrVar.m6692f(AdFormat.INTERSTITIAL, com.google.android.gms.ads.internal.client.zzbu.class, str);
        }
        return zzbuVar;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x020c */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:71:0x010f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX INFO: renamed from: r4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m6676r4(java.lang.String r19, com.google.android.gms.ads.internal.client.zzfp r20, com.google.android.gms.ads.internal.client.zzce r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftl.m6676r4(java.lang.String, com.google.android.gms.ads.internal.client.zzfp, com.google.android.gms.ads.internal.client.zzce):boolean");
    }

    /* JADX INFO: renamed from: s4 */
    public final boolean m6677s4(int i2, String str) {
        AdFormat adFormatM2747b = AdFormat.m2747b(i2);
        if (adFormatM2747b == null) {
            return false;
        }
        zzftc zzftcVar = this.f16496t;
        Clock clock = zzftcVar.f16464g;
        long jCurrentTimeMillis = clock.currentTimeMillis();
        HashMap map = zzftcVar.f16458a;
        synchronized (map) {
            try {
                if (!map.containsKey(adFormatM2747b)) {
                    return false;
                }
                zzful zzfulVar = (zzful) ((Map) map.get(adFormatM2747b)).get(str);
                zzftu zzftuVar = null;
                String strM6707o = zzfulVar == null ? null : zzfulVar.m6707o();
                boolean z = strM6707o != null && adFormatM2747b.equals(zzfulVar.m6709q());
                Long lValueOf = z ? Long.valueOf(clock.currentTimeMillis()) : null;
                if (zzfulVar != null) {
                    zzftt zzfttVar = new zzftt(zzfulVar.m6710r(), adFormatM2747b);
                    zzfttVar.f16519c = str;
                    zzftuVar = new zzftu(zzfttVar);
                }
                zzftcVar.f16460c.m6680c(zzfulVar == null ? 0 : zzfulVar.m6711s(), zzfulVar != null ? zzfulVar.m6712t() : 0, jCurrentTimeMillis, lValueOf, strM6707o, zzftuVar, "2");
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    /* JADX INFO: renamed from: x2 */
    public final void mo2888x2(zzbvf zzbvfVar) {
    }
}
