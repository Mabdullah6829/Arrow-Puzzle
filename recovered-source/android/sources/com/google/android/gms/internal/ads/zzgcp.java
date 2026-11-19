package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.InterfaceC0066v;
import p006D0.AbstractC0163C;
import p006D0.InterfaceC0170e;
import p011H.AbstractC0243G;
import p014I0.C0315d;
import p014I0.InterfaceC0312a;
import p057d0.C6289k;
import p058e0.AbstractC6305m;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgcp implements zzgbf {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0066v f16975a;

    /* JADX INFO: renamed from: b */
    public final zzgst f16976b;

    /* JADX INFO: renamed from: c */
    public final C0315d f16977c;

    /* JADX INFO: renamed from: d */
    public final C0315d f16978d;

    /* JADX INFO: renamed from: e */
    public final C0315d f16979e;

    /* JADX INFO: renamed from: f */
    public boolean f16980f;

    /* JADX INFO: renamed from: g */
    public zzgbd f16981g;

    /* JADX INFO: renamed from: h */
    public boolean f16982h;

    /* JADX INFO: renamed from: i */
    public final DataStore f16983i;

    /* JADX INFO: renamed from: j */
    public final zzdxe f16984j;

    public zzgcp(DataStore adQualityDataStore, zzgbr zzgbrVar, zzdxe dataPinger, zzgbo zzgboVar) {
        AbstractC6452k.m12181e(adQualityDataStore, "adQualityDataStore");
        AbstractC6452k.m12181e(dataPinger, "dataPinger");
        this.f16984j = dataPinger;
        this.f16975a = ((zzgbs) zzgbrVar).m6869a();
        this.f16976b = new zzgst();
        this.f16977c = new C0315d();
        this.f16978d = new C0315d();
        this.f16979e = new C0315d();
        this.f16983i = adQualityDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00df  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.google.android.gms.internal.ads.zzgcp] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX INFO: renamed from: d */
    public static final Object m6870d(zzgcp zzgcpVar, AbstractC6373c abstractC6373c) throws Throwable {
        zzgck zzgckVar;
        InterfaceC0312a interfaceC0312a;
        zzgbi zzgbiVar;
        zzgbd zzgbdVar;
        zzgbe zzgbeVar;
        zzifa zzifaVarM6849P;
        Long l2;
        boolean z;
        boolean z2;
        Object obj;
        if (abstractC6373c instanceof zzgck) {
            zzgckVar = (zzgck) abstractC6373c;
            int i2 = zzgckVar.f16960v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzgckVar.f16960v = i2 - Integer.MIN_VALUE;
            } else {
                zzgckVar = new zzgck(zzgcpVar, abstractC6373c);
            }
        } else {
            zzgckVar = new zzgck(zzgcpVar, abstractC6373c);
        }
        Object objM263e = zzgckVar.f16958t;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        ?? r4 = zzgckVar.f16960v;
        C6289k c6289k = C6289k.f24318a;
        try {
            if (r4 == 0) {
                AbstractC0243G.m377o(objM263e);
                C0315d c0315d = zzgcpVar.f16979e;
                zzgckVar.f16957s = c0315d;
                zzgckVar.f16960v = 1;
                if (c0315d.m462d(zzgckVar) != enumC6363a) {
                    interfaceC0312a = c0315d;
                }
                return enumC6363a;
            }
            if (r4 == 1) {
                InterfaceC0312a interfaceC0312a2 = zzgckVar.f16957s;
                AbstractC0243G.m377o(objM263e);
                interfaceC0312a = interfaceC0312a2;
            } else {
                if (r4 != 2) {
                    if (r4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0243G.m377o(objM263e);
                    return c6289k;
                }
                InterfaceC0312a interfaceC0312a3 = zzgckVar.f16957s;
                AbstractC0243G.m377o(objM263e);
                r4 = interfaceC0312a3;
            }
            zzgbiVar = (zzgbi) objM263e;
            ((C0315d) r4).m464f(null);
            if (zzgbiVar != null && zzgbiVar.m6866D() != 0) {
                for (Map.Entry entry : zzgbiVar.m6867E().entrySet()) {
                    zzgbdVar = (zzgbd) ((zzgbe) entry.getValue()).m8347w();
                    Object value = entry.getValue();
                    AbstractC6452k.m12180d(value, "<get-value>(...)");
                    zzgbeVar = (zzgbe) value;
                    zzifaVarM6849P = zzgbeVar.m6849P();
                    if (zzifaVarM6849P != null) {
                        AbstractC6452k.m12181e(zzifaVarM6849P, "<this>");
                        if (zzifaVarM6849P.isEmpty()) {
                            obj = null;
                        } else {
                            obj = zzifaVarM6849P.get(zzifaVarM6849P.size() - 1);
                        }
                        l2 = (Long) obj;
                    } else {
                        l2 = null;
                    }
                    z = false;
                    if (zzgbeVar.m6850Q() > zzgbeVar.m6851R() || zzgbeVar.m6843J()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (l2 != null) {
                        if (zzgbeVar.m6847N() - l2.longValue() > 5000) {
                            z = true;
                        }
                    }
                    if (z2 || z) {
                        zzgbdVar.m8326l();
                        ((zzgbe) zzgbdVar.f19780t).m6858Z(true);
                    }
                    zzgcpVar.f16984j.m6079a((zzgbe) zzgbdVar.m8328o());
                }
                zzgckVar.f16957s = null;
                zzgckVar.f16960v = 3;
                if (zzgcpVar.m6877a(zzgckVar) == enumC6363a) {
                    return enumC6363a;
                }
            }
            return c6289k;
            InterfaceC0170e data = zzgcpVar.f16983i.getData();
            zzgckVar.f16957s = interfaceC0312a;
            zzgckVar.f16960v = 2;
            objM263e = AbstractC0163C.m263e(data, zzgckVar);
            r4 = interfaceC0312a;
            if (objM263e != enumC6363a) {
                zzgbiVar = (zzgbi) objM263e;
                ((C0315d) r4).m464f(null);
                if (zzgbiVar != null) {
                    while (r1.hasNext()) {
                        zzgbdVar = (zzgbd) ((zzgbe) entry.getValue()).m8347w();
                        Object value2 = entry.getValue();
                        AbstractC6452k.m12180d(value2, "<get-value>(...)");
                        zzgbeVar = (zzgbe) value2;
                        zzifaVarM6849P = zzgbeVar.m6849P();
                        if (zzifaVarM6849P != null) {
                            AbstractC6452k.m12181e(zzifaVarM6849P, "<this>");
                            if (zzifaVarM6849P.isEmpty()) {
                                obj = null;
                            } else {
                                obj = zzifaVarM6849P.get(zzifaVarM6849P.size() - 1);
                            }
                            l2 = (Long) obj;
                        } else {
                            l2 = null;
                        }
                        z = false;
                        if (zzgbeVar.m6850Q() > zzgbeVar.m6851R()) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (l2 != null) {
                            if (zzgbeVar.m6847N() - l2.longValue() > 5000) {
                                z = true;
                            }
                        }
                        if (z2) {
                            zzgbdVar.m8326l();
                            ((zzgbe) zzgbdVar.f19780t).m6858Z(true);
                        } else {
                            zzgbdVar.m8326l();
                            ((zzgbe) zzgbdVar.f19780t).m6858Z(true);
                        }
                        zzgcpVar.f16984j.m6079a((zzgbe) zzgbdVar.m8328o());
                    }
                    zzgckVar.f16957s = null;
                    zzgckVar.f16960v = 3;
                    if (zzgcpVar.m6877a(zzgckVar) == enumC6363a) {
                    }
                }
                return c6289k;
            }
            return enumC6363a;
        } catch (Throwable th) {
            ((C0315d) r4).m464f(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m6871e(zzgcp zzgcpVar, String str, AbstractC6373c abstractC6373c) throws Throwable {
        zzgce zzgceVar;
        String str2;
        C0315d c0315d;
        long j2;
        if (abstractC6373c instanceof zzgce) {
            zzgceVar = (zzgce) abstractC6373c;
            int i2 = zzgceVar.f16939w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzgceVar.f16939w = i2 - Integer.MIN_VALUE;
            } else {
                zzgceVar = new zzgce(zzgcpVar, abstractC6373c);
            }
        } else {
            zzgceVar = new zzgce(zzgcpVar, abstractC6373c);
        }
        Object obj = zzgceVar.f16937u;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = zzgceVar.f16939w;
        if (i3 == 0) {
            AbstractC0243G.m377o(obj);
            C0315d c0315d2 = zzgcpVar.f16977c;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgceVar.f16940x = str;
            zzgceVar.f16935s = c0315d2;
            zzgceVar.f16936t = jCurrentTimeMillis;
            zzgceVar.f16939w = 1;
            if (c0315d2.m462d(zzgceVar) == enumC6363a) {
                return enumC6363a;
            }
            str2 = str;
            c0315d = c0315d2;
            j2 = jCurrentTimeMillis;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = zzgceVar.f16936t;
            c0315d = zzgceVar.f16935s;
            str2 = zzgceVar.f16940x;
            AbstractC0243G.m377o(obj);
        }
        try {
            boolean z = zzgcpVar.f16980f;
            C6289k c6289k = C6289k.f24318a;
            if (z) {
                return c6289k;
            }
            zzgcpVar.f16980f = true;
            zzgbd zzgbdVar = (zzgbd) zzgbe.m6836U().m8347w();
            zzgcpVar.f16981g = zzgbdVar;
            zzgbdVar.m8326l();
            ((zzgbe) zzgbdVar.f19780t).m6854V(str2);
            zzgbdVar.m8326l();
            ((zzgbe) zzgbdVar.f19780t).m6860b0(j2);
            return c6289k;
        } finally {
            c0315d.m464f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0080 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #0 {all -> 0x00a7, blocks: (B:31:0x007c, B:33:0x0080, B:40:0x00a1, B:41:0x00a6), top: B:49:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1 A[Catch: all -> 0x00a7, TRY_ENTER, TryCatch #0 {all -> 0x00a7, blocks: (B:31:0x007c, B:33:0x0080, B:40:0x00a1, B:41:0x00a6), top: B:49:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Object m6872f(zzgcp zzgcpVar, AbstractC6373c abstractC6373c) throws Throwable {
        zzgca zzgcaVar;
        C0315d c0315d;
        C0315d c0315d2;
        long j2;
        zzgbd zzgbdVar;
        if (abstractC6373c instanceof zzgca) {
            zzgcaVar = (zzgca) abstractC6373c;
            int i2 = zzgcaVar.f16924w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzgcaVar.f16924w = i2 - Integer.MIN_VALUE;
            } else {
                zzgcaVar = new zzgca(zzgcpVar, abstractC6373c);
            }
        } else {
            zzgcaVar = new zzgca(zzgcpVar, abstractC6373c);
        }
        Object obj = zzgcaVar.f16922u;
        Object obj2 = EnumC6363a.f24419s;
        int i3 = zzgcaVar.f16924w;
        C6289k c6289k = C6289k.f24318a;
        try {
            if (i3 == 0) {
                AbstractC0243G.m377o(obj);
                c0315d = zzgcpVar.f16978d;
                zzgcaVar.f16920s = c0315d;
                zzgcaVar.f16924w = 1;
                if (c0315d.m462d(zzgcaVar) != obj2) {
                }
                return obj2;
            }
            if (i3 == 1) {
                c0315d = zzgcaVar.f16920s;
                AbstractC0243G.m377o(obj);
            } else {
                if (i3 == 2) {
                    j2 = zzgcaVar.f16921t;
                    c0315d2 = zzgcaVar.f16920s;
                    AbstractC0243G.m377o(obj);
                    try {
                        zzgbdVar = zzgcpVar.f16981g;
                        if (zzgbdVar != null) {
                            AbstractC6452k.m12185i("adQualityDataBuilder");
                            throw null;
                        }
                        zzgbdVar.m8326l();
                        ((zzgbe) zzgbdVar.f19780t).m6863e0(j2);
                        c0315d2.m464f(null);
                        zzgcaVar.f16920s = null;
                        zzgcaVar.f16924w = 3;
                        if (zzgcpVar.m6878b(j2, zzgcaVar) != obj2) {
                        }
                        return obj2;
                    } catch (Throwable th) {
                        c0315d2.m464f(null);
                        throw th;
                    }
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0243G.m377o(obj);
                    return c6289k;
                }
                AbstractC0243G.m377o(obj);
            }
            zzgcaVar.f16924w = 4;
            if (zzgcpVar.m6879c(zzgcaVar) != obj2) {
                return c6289k;
            }
            return obj2;
            if (zzgcpVar.f16982h) {
                c0315d.m464f(null);
                return c6289k;
            }
            zzgcpVar.f16982h = true;
            c0315d.m464f(null);
            c0315d2 = zzgcpVar.f16977c;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgcaVar.f16920s = c0315d2;
            zzgcaVar.f16921t = jCurrentTimeMillis;
            zzgcaVar.f16924w = 2;
            if (c0315d2.m462d(zzgcaVar) != obj2) {
                j2 = jCurrentTimeMillis;
                zzgbdVar = zzgcpVar.f16981g;
                if (zzgbdVar != null) {
                    AbstractC6452k.m12185i("adQualityDataBuilder");
                    throw null;
                }
                zzgbdVar.m8326l();
                ((zzgbe) zzgbdVar.f19780t).m6863e0(j2);
                c0315d2.m464f(null);
                zzgcaVar.f16920s = null;
                zzgcaVar.f16924w = 3;
                if (zzgcpVar.m6878b(j2, zzgcaVar) != obj2) {
                    zzgcaVar.f16924w = 4;
                    if (zzgcpVar.m6879c(zzgcaVar) != obj2) {
                        return c6289k;
                    }
                }
            }
            return obj2;
        } catch (Throwable th2) {
            c0315d.m464f(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[Catch: all -> 0x00d6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0082 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00be A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2 A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9 A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5 A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3 A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0117 A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x012b A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x012f A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0137 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0149 A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x014d A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:27:0x0070, B:30:0x0076, B:33:0x0082, B:35:0x0086, B:37:0x00aa, B:39:0x00ba, B:41:0x00be, B:42:0x00d2, B:43:0x00d5, B:46:0x00d9, B:47:0x00dc, B:48:0x00dd, B:49:0x00e0, B:50:0x00e1, B:52:0x00e5, B:54:0x00ef, B:56:0x00f3, B:58:0x0117, B:59:0x012b, B:60:0x012e, B:61:0x012f, B:62:0x0132, B:63:0x0133, B:65:0x0137, B:68:0x0145, B:69:0x0148, B:70:0x0149, B:71:0x014c, B:72:0x014d, B:73:0x0150), top: B:82:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public static final Object m6873g(zzgcp zzgcpVar, AbstractC6373c abstractC6373c) throws Throwable {
        zzgco zzgcoVar;
        C0315d c0315d;
        C0315d c0315d2;
        long j2;
        zzgbd zzgbdVar;
        zzgbd zzgbdVar2;
        zzgbd zzgbdVar3;
        zzgbd zzgbdVar4;
        long jLongValue;
        zzgbd zzgbdVar5;
        zzgbd zzgbdVar6;
        long jLongValue2;
        zzgbd zzgbdVar7;
        zzgbd zzgbdVar8;
        if (abstractC6373c instanceof zzgco) {
            zzgcoVar = (zzgco) abstractC6373c;
            int i2 = zzgcoVar.f16974w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzgcoVar.f16974w = i2 - Integer.MIN_VALUE;
            } else {
                zzgcoVar = new zzgco(zzgcpVar, abstractC6373c);
            }
        } else {
            zzgcoVar = new zzgco(zzgcpVar, abstractC6373c);
        }
        Object obj = zzgcoVar.f16972u;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = zzgcoVar.f16974w;
        C6289k c6289k = C6289k.f24318a;
        try {
            if (i3 == 0) {
                AbstractC0243G.m377o(obj);
                c0315d = zzgcpVar.f16978d;
                zzgcoVar.f16970s = c0315d;
                zzgcoVar.f16974w = 1;
                if (c0315d.m462d(zzgcoVar) != enumC6363a) {
                }
                return enumC6363a;
            }
            if (i3 == 1) {
                c0315d = zzgcoVar.f16970s;
                AbstractC0243G.m377o(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = zzgcoVar.f16971t;
                c0315d2 = zzgcoVar.f16970s;
                AbstractC0243G.m377o(obj);
            }
            try {
                zzgbdVar = zzgcpVar.f16981g;
                if (zzgbdVar != null) {
                    AbstractC6452k.m12185i("adQualityDataBuilder");
                    throw null;
                }
                if (((zzgbe) zzgbdVar.f19780t).m6853T() > 0) {
                    zzgbdVar6 = zzgcpVar.f16981g;
                    if (zzgbdVar6 != null) {
                        AbstractC6452k.m12185i("adQualityDataBuilder");
                        throw null;
                    }
                    List listUnmodifiableList = Collections.unmodifiableList(((zzgbe) zzgbdVar6.f19780t).m6852S());
                    AbstractC6452k.m12180d(listUnmodifiableList, "getAdClickTimestampsMsList(...)");
                    Object objM12106B = AbstractC6305m.m12106B(listUnmodifiableList);
                    AbstractC6452k.m12180d(objM12106B, "last(...)");
                    jLongValue2 = j2 - ((Number) objM12106B).longValue();
                    zzgbdVar7 = zzgcpVar.f16981g;
                    if (zzgbdVar7 != null) {
                        AbstractC6452k.m12185i("adQualityDataBuilder");
                        throw null;
                    }
                    zzgbdVar7.m8326l();
                    ((zzgbe) zzgbdVar7.f19780t).m6839F();
                    if (jLongValue2 < 5000) {
                        zzgbdVar8 = zzgcpVar.f16981g;
                        if (zzgbdVar8 != null) {
                            AbstractC6452k.m12185i("adQualityDataBuilder");
                            throw null;
                        }
                        int iM6842I = ((zzgbe) zzgbdVar8.f19780t).m6842I() + 1;
                        zzgbdVar8.m8326l();
                        ((zzgbe) zzgbdVar8.f19780t).m6856X(iM6842I);
                    }
                }
                zzgbdVar2 = zzgcpVar.f16981g;
                if (zzgbdVar2 != null) {
                    AbstractC6452k.m12185i("adQualityDataBuilder");
                    throw null;
                }
                if (((zzgbe) zzgbdVar2.f19780t).m6850Q() > 0) {
                    zzgbdVar4 = zzgcpVar.f16981g;
                    if (zzgbdVar4 != null) {
                        AbstractC6452k.m12185i("adQualityDataBuilder");
                        throw null;
                    }
                    List listUnmodifiableList2 = Collections.unmodifiableList(((zzgbe) zzgbdVar4.f19780t).m6849P());
                    AbstractC6452k.m12180d(listUnmodifiableList2, "getAppBackgroundTimestampsMsList(...)");
                    Object objM12106B2 = AbstractC6305m.m12106B(listUnmodifiableList2);
                    AbstractC6452k.m12180d(objM12106B2, "last(...)");
                    jLongValue = j2 - ((Number) objM12106B2).longValue();
                    zzgbdVar5 = zzgcpVar.f16981g;
                    if (zzgbdVar5 != null) {
                        AbstractC6452k.m12185i("adQualityDataBuilder");
                        throw null;
                    }
                    long jM6845L = ((zzgbe) zzgbdVar5.f19780t).m6845L() + jLongValue;
                    zzgbdVar5.m8326l();
                    ((zzgbe) zzgbdVar5.f19780t).m6859a0(jM6845L);
                }
                zzgbdVar3 = zzgcpVar.f16981g;
                if (zzgbdVar3 != null) {
                    AbstractC6452k.m12185i("adQualityDataBuilder");
                    throw null;
                }
                zzgbdVar3.m8326l();
                ((zzgbe) zzgbdVar3.f19780t).m6837D(j2);
                c0315d2.m464f(null);
                return c6289k;
            } catch (Throwable th) {
                c0315d2.m464f(null);
                throw th;
            }
            if (!zzgcpVar.f16982h) {
                c0315d.m464f(null);
                return c6289k;
            }
            zzgcpVar.f16982h = false;
            c0315d.m464f(null);
            C0315d c0315d3 = zzgcpVar.f16977c;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgcoVar.f16970s = c0315d3;
            zzgcoVar.f16971t = jCurrentTimeMillis;
            zzgcoVar.f16974w = 2;
            if (c0315d3.m462d(zzgcoVar) != enumC6363a) {
                c0315d2 = c0315d3;
                j2 = jCurrentTimeMillis;
                zzgbdVar = zzgcpVar.f16981g;
                if (zzgbdVar != null) {
                    AbstractC6452k.m12185i("adQualityDataBuilder");
                    throw null;
                }
                if (((zzgbe) zzgbdVar.f19780t).m6853T() > 0) {
                    zzgbdVar6 = zzgcpVar.f16981g;
                    if (zzgbdVar6 != null) {
                        AbstractC6452k.m12185i("adQualityDataBuilder");
                        throw null;
                    }
                    List listUnmodifiableList3 = Collections.unmodifiableList(((zzgbe) zzgbdVar6.f19780t).m6852S());
                    AbstractC6452k.m12180d(listUnmodifiableList3, "getAdClickTimestampsMsList(...)");
                    Object objM12106B3 = AbstractC6305m.m12106B(listUnmodifiableList3);
                    AbstractC6452k.m12180d(objM12106B3, "last(...)");
                    jLongValue2 = j2 - ((Number) objM12106B3).longValue();
                    zzgbdVar7 = zzgcpVar.f16981g;
                    if (zzgbdVar7 != null) {
                        AbstractC6452k.m12185i("adQualityDataBuilder");
                        throw null;
                    }
                    zzgbdVar7.m8326l();
                    ((zzgbe) zzgbdVar7.f19780t).m6839F();
                    if (jLongValue2 < 5000) {
                        zzgbdVar8 = zzgcpVar.f16981g;
                        if (zzgbdVar8 != null) {
                            AbstractC6452k.m12185i("adQualityDataBuilder");
                            throw null;
                        }
                        int iM6842I2 = ((zzgbe) zzgbdVar8.f19780t).m6842I() + 1;
                        zzgbdVar8.m8326l();
                        ((zzgbe) zzgbdVar8.f19780t).m6856X(iM6842I2);
                    }
                }
                zzgbdVar2 = zzgcpVar.f16981g;
                if (zzgbdVar2 != null) {
                    AbstractC6452k.m12185i("adQualityDataBuilder");
                    throw null;
                }
                if (((zzgbe) zzgbdVar2.f19780t).m6850Q() > 0) {
                    zzgbdVar4 = zzgcpVar.f16981g;
                    if (zzgbdVar4 != null) {
                        AbstractC6452k.m12185i("adQualityDataBuilder");
                        throw null;
                    }
                    List listUnmodifiableList4 = Collections.unmodifiableList(((zzgbe) zzgbdVar4.f19780t).m6849P());
                    AbstractC6452k.m12180d(listUnmodifiableList4, "getAppBackgroundTimestampsMsList(...)");
                    Object objM12106B4 = AbstractC6305m.m12106B(listUnmodifiableList4);
                    AbstractC6452k.m12180d(objM12106B4, "last(...)");
                    jLongValue = j2 - ((Number) objM12106B4).longValue();
                    zzgbdVar5 = zzgcpVar.f16981g;
                    if (zzgbdVar5 != null) {
                        AbstractC6452k.m12185i("adQualityDataBuilder");
                        throw null;
                    }
                    long jM6845L2 = ((zzgbe) zzgbdVar5.f19780t).m6845L() + jLongValue;
                    zzgbdVar5.m8326l();
                    ((zzgbe) zzgbdVar5.f19780t).m6859a0(jM6845L2);
                }
                zzgbdVar3 = zzgcpVar.f16981g;
                if (zzgbdVar3 != null) {
                    AbstractC6452k.m12185i("adQualityDataBuilder");
                    throw null;
                }
                zzgbdVar3.m8326l();
                ((zzgbe) zzgbdVar3.f19780t).m6837D(j2);
                c0315d2.m464f(null);
                return c6289k;
            }
            return enumC6363a;
        } catch (Throwable th2) {
            c0315d.m464f(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008f A[Catch: all -> 0x00f5, TRY_ENTER, TryCatch #0 {all -> 0x00f5, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:54:0x00f7, B:55:0x00fa, B:56:0x00fb, B:57:0x00fe, B:58:0x00ff, B:59:0x0102, B:60:0x0103, B:61:0x0106), top: B:68:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009d A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:54:0x00f7, B:55:0x00fa, B:56:0x00fb, B:57:0x00fe, B:58:0x00ff, B:59:0x0102, B:60:0x0103, B:61:0x0106), top: B:68:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:54:0x00f7, B:55:0x00fa, B:56:0x00fb, B:57:0x00fe, B:58:0x00ff, B:59:0x0102, B:60:0x0103, B:61:0x0106), top: B:68:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2 A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #0 {all -> 0x00f5, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:54:0x00f7, B:55:0x00fa, B:56:0x00fb, B:57:0x00fe, B:58:0x00ff, B:59:0x0102, B:60:0x0103, B:61:0x0106), top: B:68:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7 A[Catch: all -> 0x00f5, TRY_ENTER, TryCatch #0 {all -> 0x00f5, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:54:0x00f7, B:55:0x00fa, B:56:0x00fb, B:57:0x00fe, B:58:0x00ff, B:59:0x0102, B:60:0x0103, B:61:0x0106), top: B:68:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fb A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:54:0x00f7, B:55:0x00fa, B:56:0x00fb, B:57:0x00fe, B:58:0x00ff, B:59:0x0102, B:60:0x0103, B:61:0x0106), top: B:68:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:54:0x00f7, B:55:0x00fa, B:56:0x00fb, B:57:0x00fe, B:58:0x00ff, B:59:0x0102, B:60:0x0103, B:61:0x0106), top: B:68:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0103 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:54:0x00f7, B:55:0x00fa, B:56:0x00fb, B:57:0x00fe, B:58:0x00ff, B:59:0x0102, B:60:0x0103, B:61:0x0106), top: B:68:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: h */
    public static final Object m6874h(zzgcp zzgcpVar, AbstractC6373c abstractC6373c) throws Throwable {
        zzgci zzgciVar;
        Object obj;
        long j2;
        Object obj2;
        zzgbd zzgbdVar;
        long jM6846M;
        zzgbd zzgbdVar2;
        zzgbd zzgbdVar3;
        zzgbd zzgbdVar4;
        zzgbe zzgbeVar;
        zzgbe zzgbeVar2;
        String strM6840G;
        C0315d c0315d = zzgcpVar.f16977c;
        if (abstractC6373c instanceof zzgci) {
            zzgciVar = (zzgci) abstractC6373c;
            int i2 = zzgciVar.f16954w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzgciVar.f16954w = i2 - Integer.MIN_VALUE;
            } else {
                zzgciVar = new zzgci(zzgcpVar, abstractC6373c);
            }
        } else {
            zzgciVar = new zzgci(zzgcpVar, abstractC6373c);
        }
        Object obj3 = zzgciVar.f16952u;
        Object obj4 = EnumC6363a.f24419s;
        int i3 = zzgciVar.f16954w;
        C6289k c6289k = C6289k.f24318a;
        try {
            if (i3 == 0) {
                AbstractC0243G.m377o(obj3);
                zzgciVar.f16950s = c0315d;
                zzgciVar.f16954w = 1;
                if (c0315d.m462d(zzgciVar) != obj4) {
                    obj = c0315d;
                }
                return obj4;
            }
            if (i3 == 1) {
                InterfaceC0312a interfaceC0312a = (InterfaceC0312a) zzgciVar.f16950s;
                AbstractC0243G.m377o(obj3);
                obj = interfaceC0312a;
            } else {
                if (i3 == 2) {
                    j2 = zzgciVar.f16951t;
                    InterfaceC0312a interfaceC0312a2 = (InterfaceC0312a) zzgciVar.f16950s;
                    AbstractC0243G.m377o(obj3);
                    obj2 = interfaceC0312a2;
                    try {
                        zzgbdVar = zzgcpVar.f16981g;
                        if (zzgbdVar != null) {
                            AbstractC6452k.m12185i("adQualityDataBuilder");
                            throw null;
                        }
                        jM6846M = j2 - ((zzgbe) zzgbdVar.f19780t).m6846M();
                        zzgbdVar2 = zzgcpVar.f16981g;
                        if (zzgbdVar2 != null) {
                            AbstractC6452k.m12185i("adQualityDataBuilder");
                            throw null;
                        }
                        long jM6845L = jM6846M - ((zzgbe) zzgbdVar2.f19780t).m6845L();
                        zzgbdVar.m8326l();
                        ((zzgbe) zzgbdVar.f19780t).m6855W(jM6845L);
                        zzgbdVar3 = zzgcpVar.f16981g;
                        if (zzgbdVar3 != null) {
                            AbstractC6452k.m12185i("adQualityDataBuilder");
                            throw null;
                        }
                        zzgbdVar3.m8326l();
                        ((zzgbe) zzgbdVar3.f19780t).m6862d0(j2);
                        zzgbdVar4 = zzgcpVar.f16981g;
                        if (zzgbdVar4 != null) {
                            AbstractC6452k.m12185i("adQualityDataBuilder");
                            throw null;
                        }
                        zzgbeVar = (zzgbe) zzgbdVar4.m8328o();
                        ((C0315d) obj2).m464f(null);
                        zzgciVar.f16950s = zzgbeVar;
                        zzgciVar.f16954w = 3;
                        if (zzgcpVar.m6879c(zzgciVar) != obj4) {
                            zzgbeVar2 = zzgbeVar;
                        }
                        return obj4;
                    } catch (Throwable th) {
                        ((C0315d) obj2).m464f(null);
                        throw th;
                    }
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0243G.m377o(obj3);
                    return c6289k;
                }
                zzgbeVar2 = (zzgbe) zzgciVar.f16950s;
                AbstractC0243G.m377o(obj3);
            }
            if (zzgcpVar.f16984j.m6079a(zzgbeVar2)) {
                strM6840G = zzgbeVar2.m6840G();
                AbstractC6452k.m12180d(strM6840G, "getGwsQueryId(...)");
                zzgciVar.f16950s = null;
                zzgciVar.f16954w = 4;
                if (zzgcpVar.m6880k(strM6840G, zzgciVar) == obj4) {
                    return obj4;
                }
            }
            return c6289k;
            if (!zzgcpVar.f16980f) {
                ((C0315d) obj).m464f(null);
                return c6289k;
            }
            zzgcpVar.f16980f = false;
            ((C0315d) obj).m464f(null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgciVar.f16950s = c0315d;
            zzgciVar.f16951t = jCurrentTimeMillis;
            zzgciVar.f16954w = 2;
            if (c0315d.m462d(zzgciVar) != obj4) {
                j2 = jCurrentTimeMillis;
                obj2 = c0315d;
                zzgbdVar = zzgcpVar.f16981g;
                if (zzgbdVar != null) {
                    AbstractC6452k.m12185i("adQualityDataBuilder");
                    throw null;
                }
                jM6846M = j2 - ((zzgbe) zzgbdVar.f19780t).m6846M();
                zzgbdVar2 = zzgcpVar.f16981g;
                if (zzgbdVar2 != null) {
                    AbstractC6452k.m12185i("adQualityDataBuilder");
                    throw null;
                }
                long jM6845L2 = jM6846M - ((zzgbe) zzgbdVar2.f19780t).m6845L();
                zzgbdVar.m8326l();
                ((zzgbe) zzgbdVar.f19780t).m6855W(jM6845L2);
                zzgbdVar3 = zzgcpVar.f16981g;
                if (zzgbdVar3 != null) {
                    AbstractC6452k.m12185i("adQualityDataBuilder");
                    throw null;
                }
                zzgbdVar3.m8326l();
                ((zzgbe) zzgbdVar3.f19780t).m6862d0(j2);
                zzgbdVar4 = zzgcpVar.f16981g;
                if (zzgbdVar4 != null) {
                    AbstractC6452k.m12185i("adQualityDataBuilder");
                    throw null;
                }
                zzgbeVar = (zzgbe) zzgbdVar4.m8328o();
                ((C0315d) obj2).m464f(null);
                zzgciVar.f16950s = zzgbeVar;
                zzgciVar.f16954w = 3;
                if (zzgcpVar.m6879c(zzgciVar) != obj4) {
                    zzgbeVar2 = zzgbeVar;
                    if (zzgcpVar.f16984j.m6079a(zzgbeVar2)) {
                        strM6840G = zzgbeVar2.m6840G();
                        AbstractC6452k.m12180d(strM6840G, "getGwsQueryId(...)");
                        zzgciVar.f16950s = null;
                        zzgciVar.f16954w = 4;
                        if (zzgcpVar.m6880k(strM6840G, zzgciVar) == obj4) {
                        }
                    }
                    return c6289k;
                }
            }
            return obj4;
        } catch (Throwable th2) {
            ((C0315d) obj).m464f(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008f A[Catch: all -> 0x0103, TRY_ENTER, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009d A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0 A[Catch: all -> 0x0103, TRY_LEAVE, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:56:0x0105 A[Catch: all -> 0x0103, TRY_ENTER, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0109 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x010d A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0111 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0115 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: i */
    public static final Object m6875i(zzgcp zzgcpVar, AbstractC6373c abstractC6373c) throws Throwable {
        zzgcm zzgcmVar;
        Object obj;
        long j2;
        Object obj2;
        zzgbd zzgbdVar;
        long jM6846M;
        zzgbd zzgbdVar2;
        zzgbd zzgbdVar3;
        zzgbd zzgbdVar4;
        zzgbd zzgbdVar5;
        zzgbe zzgbeVar;
        zzgbe zzgbeVar2;
        String strM6840G;
        C0315d c0315d = zzgcpVar.f16977c;
        if (abstractC6373c instanceof zzgcm) {
            zzgcmVar = (zzgcm) abstractC6373c;
            int i2 = zzgcmVar.f16967w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzgcmVar.f16967w = i2 - Integer.MIN_VALUE;
            } else {
                zzgcmVar = new zzgcm(zzgcpVar, abstractC6373c);
            }
        } else {
            zzgcmVar = new zzgcm(zzgcpVar, abstractC6373c);
        }
        Object obj3 = zzgcmVar.f16965u;
        Object obj4 = EnumC6363a.f24419s;
        int i3 = zzgcmVar.f16967w;
        C6289k c6289k = C6289k.f24318a;
        try {
            if (i3 == 0) {
                AbstractC0243G.m377o(obj3);
                zzgcmVar.f16963s = c0315d;
                zzgcmVar.f16967w = 1;
                if (c0315d.m462d(zzgcmVar) != obj4) {
                    obj = c0315d;
                }
                return obj4;
            }
            if (i3 == 1) {
                InterfaceC0312a interfaceC0312a = (InterfaceC0312a) zzgcmVar.f16963s;
                AbstractC0243G.m377o(obj3);
                obj = interfaceC0312a;
            } else {
                if (i3 == 2) {
                    j2 = zzgcmVar.f16964t;
                    InterfaceC0312a interfaceC0312a2 = (InterfaceC0312a) zzgcmVar.f16963s;
                    AbstractC0243G.m377o(obj3);
                    obj2 = interfaceC0312a2;
                    try {
                        zzgbdVar = zzgcpVar.f16981g;
                        if (zzgbdVar != null) {
                            AbstractC6452k.m12185i("adQualityDataBuilder");
                            throw null;
                        }
                        jM6846M = j2 - ((zzgbe) zzgbdVar.f19780t).m6846M();
                        zzgbdVar2 = zzgcpVar.f16981g;
                        if (zzgbdVar2 != null) {
                            AbstractC6452k.m12185i("adQualityDataBuilder");
                            throw null;
                        }
                        long jM6845L = jM6846M - ((zzgbe) zzgbdVar2.f19780t).m6845L();
                        zzgbdVar.m8326l();
                        ((zzgbe) zzgbdVar.f19780t).m6855W(jM6845L);
                        zzgbdVar3 = zzgcpVar.f16981g;
                        if (zzgbdVar3 != null) {
                            AbstractC6452k.m12185i("adQualityDataBuilder");
                            throw null;
                        }
                        zzgbdVar3.m8326l();
                        ((zzgbe) zzgbdVar3.f19780t).m6861c0(j2);
                        zzgbdVar4 = zzgcpVar.f16981g;
                        if (zzgbdVar4 != null) {
                            AbstractC6452k.m12185i("adQualityDataBuilder");
                            throw null;
                        }
                        zzgbdVar4.m8326l();
                        ((zzgbe) zzgbdVar4.f19780t).m6857Y();
                        zzgbdVar5 = zzgcpVar.f16981g;
                        if (zzgbdVar5 != null) {
                            AbstractC6452k.m12185i("adQualityDataBuilder");
                            throw null;
                        }
                        zzgbeVar = (zzgbe) zzgbdVar5.m8328o();
                        ((C0315d) obj2).m464f(null);
                        zzgcmVar.f16963s = zzgbeVar;
                        zzgcmVar.f16967w = 3;
                        if (zzgcpVar.m6879c(zzgcmVar) != obj4) {
                            zzgbeVar2 = zzgbeVar;
                        }
                        return obj4;
                    } catch (Throwable th) {
                        ((C0315d) obj2).m464f(null);
                        throw th;
                    }
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0243G.m377o(obj3);
                    return c6289k;
                }
                zzgbeVar2 = (zzgbe) zzgcmVar.f16963s;
                AbstractC0243G.m377o(obj3);
            }
            if (zzgcpVar.f16984j.m6079a(zzgbeVar2)) {
                strM6840G = zzgbeVar2.m6840G();
                AbstractC6452k.m12180d(strM6840G, "getGwsQueryId(...)");
                zzgcmVar.f16963s = null;
                zzgcmVar.f16967w = 4;
                if (zzgcpVar.m6880k(strM6840G, zzgcmVar) == obj4) {
                    return obj4;
                }
            }
            return c6289k;
            if (!zzgcpVar.f16980f) {
                ((C0315d) obj).m464f(null);
                return c6289k;
            }
            zzgcpVar.f16980f = false;
            ((C0315d) obj).m464f(null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgcmVar.f16963s = c0315d;
            zzgcmVar.f16964t = jCurrentTimeMillis;
            zzgcmVar.f16967w = 2;
            if (c0315d.m462d(zzgcmVar) != obj4) {
                j2 = jCurrentTimeMillis;
                obj2 = c0315d;
                zzgbdVar = zzgcpVar.f16981g;
                if (zzgbdVar != null) {
                    AbstractC6452k.m12185i("adQualityDataBuilder");
                    throw null;
                }
                jM6846M = j2 - ((zzgbe) zzgbdVar.f19780t).m6846M();
                zzgbdVar2 = zzgcpVar.f16981g;
                if (zzgbdVar2 != null) {
                    AbstractC6452k.m12185i("adQualityDataBuilder");
                    throw null;
                }
                long jM6845L2 = jM6846M - ((zzgbe) zzgbdVar2.f19780t).m6845L();
                zzgbdVar.m8326l();
                ((zzgbe) zzgbdVar.f19780t).m6855W(jM6845L2);
                zzgbdVar3 = zzgcpVar.f16981g;
                if (zzgbdVar3 != null) {
                    AbstractC6452k.m12185i("adQualityDataBuilder");
                    throw null;
                }
                zzgbdVar3.m8326l();
                ((zzgbe) zzgbdVar3.f19780t).m6861c0(j2);
                zzgbdVar4 = zzgcpVar.f16981g;
                if (zzgbdVar4 != null) {
                    AbstractC6452k.m12185i("adQualityDataBuilder");
                    throw null;
                }
                zzgbdVar4.m8326l();
                ((zzgbe) zzgbdVar4.f19780t).m6857Y();
                zzgbdVar5 = zzgcpVar.f16981g;
                if (zzgbdVar5 != null) {
                    AbstractC6452k.m12185i("adQualityDataBuilder");
                    throw null;
                }
                zzgbeVar = (zzgbe) zzgbdVar5.m8328o();
                ((C0315d) obj2).m464f(null);
                zzgcmVar.f16963s = zzgbeVar;
                zzgcmVar.f16967w = 3;
                if (zzgcpVar.m6879c(zzgcmVar) != obj4) {
                    zzgbeVar2 = zzgbeVar;
                    if (zzgcpVar.f16984j.m6079a(zzgbeVar2)) {
                        strM6840G = zzgbeVar2.m6840G();
                        AbstractC6452k.m12180d(strM6840G, "getGwsQueryId(...)");
                        zzgcmVar.f16963s = null;
                        zzgcmVar.f16967w = 4;
                        if (zzgcpVar.m6880k(strM6840G, zzgcmVar) == obj4) {
                        }
                    }
                    return c6289k;
                }
            }
            return obj4;
        } catch (Throwable th2) {
            ((C0315d) obj).m464f(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public static final Object m6876j(zzgcp zzgcpVar, AbstractC6373c abstractC6373c) throws Throwable {
        zzgcg zzgcgVar;
        C0315d c0315d;
        long j2;
        if (abstractC6373c instanceof zzgcg) {
            zzgcgVar = (zzgcg) abstractC6373c;
            int i2 = zzgcgVar.f16947w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzgcgVar.f16947w = i2 - Integer.MIN_VALUE;
            } else {
                zzgcgVar = new zzgcg(zzgcpVar, abstractC6373c);
            }
        } else {
            zzgcgVar = new zzgcg(zzgcpVar, abstractC6373c);
        }
        Object obj = zzgcgVar.f16945u;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = zzgcgVar.f16947w;
        if (i3 == 0) {
            AbstractC0243G.m377o(obj);
            C0315d c0315d2 = zzgcpVar.f16977c;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgcgVar.f16944t = c0315d2;
            zzgcgVar.f16943s = jCurrentTimeMillis;
            zzgcgVar.f16947w = 1;
            if (c0315d2.m462d(zzgcgVar) == enumC6363a) {
                return enumC6363a;
            }
            c0315d = c0315d2;
            j2 = jCurrentTimeMillis;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = zzgcgVar.f16943s;
            c0315d = zzgcgVar.f16944t;
            AbstractC0243G.m377o(obj);
        }
        try {
            zzgbd zzgbdVar = zzgcpVar.f16981g;
            if (zzgbdVar == null) {
                AbstractC6452k.m12185i("adQualityDataBuilder");
                throw null;
            }
            zzgbdVar.m8326l();
            ((zzgbe) zzgbdVar.f19780t).m6838E(j2);
            c0315d.m464f(null);
            return C6289k.f24318a;
        } catch (Throwable th) {
            c0315d.m464f(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m6877a(AbstractC6373c abstractC6373c) throws Throwable {
        zzgbx zzgbxVar;
        C0315d c0315d;
        InterfaceC0312a interfaceC0312a;
        InterfaceC0312a interfaceC0312a2;
        Throwable th;
        if (abstractC6373c instanceof zzgbx) {
            zzgbxVar = (zzgbx) abstractC6373c;
            int i2 = zzgbxVar.f16915v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzgbxVar.f16915v = i2 - Integer.MIN_VALUE;
            } else {
                zzgbxVar = new zzgbx(this, abstractC6373c);
            }
        } else {
            zzgbxVar = new zzgbx(this, abstractC6373c);
        }
        Object obj = zzgbxVar.f16913t;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = zzgbxVar.f16915v;
        try {
            if (i3 == 0) {
                AbstractC0243G.m377o(obj);
                c0315d = this.f16979e;
                zzgbxVar.f16912s = c0315d;
                zzgbxVar.f16915v = 1;
                if (c0315d.m462d(zzgbxVar) != enumC6363a) {
                }
                interfaceC0312a = c0315d;
                return enumC6363a;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC0312a2 = zzgbxVar.f16912s;
                try {
                    AbstractC0243G.m377o(obj);
                    interfaceC0312a2 = interfaceC0312a2;
                    ((C0315d) interfaceC0312a2).m464f(null);
                    return C6289k.f24318a;
                } catch (Throwable th2) {
                    th = th2;
                    ((C0315d) interfaceC0312a2).m464f(null);
                    throw th;
                }
            }
            InterfaceC0312a interfaceC0312a3 = zzgbxVar.f16912s;
            AbstractC0243G.m377o(obj);
            interfaceC0312a = interfaceC0312a3;
            interfaceC0312a = c0315d;
            DataStore dataStore = this.f16983i;
            zzgby zzgbyVar = new zzgby(2, null);
            zzgbxVar.f16912s = interfaceC0312a;
            zzgbxVar.f16915v = 2;
            Object objUpdateData = dataStore.updateData(zzgbyVar, zzgbxVar);
            if (objUpdateData != enumC6363a) {
                interfaceC0312a2 = interfaceC0312a;
                obj = objUpdateData;
                ((C0315d) interfaceC0312a2).m464f(null);
                return C6289k.f24318a;
            }
            interfaceC0312a = c0315d;
            return enumC6363a;
        } catch (Throwable th3) {
            interfaceC0312a2 = interfaceC0312a;
            th = th3;
            ((C0315d) interfaceC0312a2).m464f(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m6878b(long j2, AbstractC6373c abstractC6373c) throws Throwable {
        zzgbw zzgbwVar;
        C0315d c0315d;
        if (abstractC6373c instanceof zzgbw) {
            zzgbwVar = (zzgbw) abstractC6373c;
            int i2 = zzgbwVar.f16911w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzgbwVar.f16911w = i2 - Integer.MIN_VALUE;
            } else {
                zzgbwVar = new zzgbw(this, abstractC6373c);
            }
        } else {
            zzgbwVar = new zzgbw(this, abstractC6373c);
        }
        Object obj = zzgbwVar.f16909u;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = zzgbwVar.f16911w;
        if (i3 == 0) {
            AbstractC0243G.m377o(obj);
            C0315d c0315d2 = this.f16977c;
            zzgbwVar.f16908t = c0315d2;
            zzgbwVar.f16907s = j2;
            zzgbwVar.f16911w = 1;
            if (c0315d2.m462d(zzgbwVar) == enumC6363a) {
                return enumC6363a;
            }
            c0315d = c0315d2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = zzgbwVar.f16907s;
            c0315d = zzgbwVar.f16908t;
            AbstractC0243G.m377o(obj);
        }
        try {
            zzgbd zzgbdVar = this.f16981g;
            if (zzgbdVar == null) {
                AbstractC6452k.m12185i("adQualityDataBuilder");
                throw null;
            }
            long jM6846M = j2 - ((zzgbe) zzgbdVar.f19780t).m6846M();
            zzgbd zzgbdVar2 = this.f16981g;
            if (zzgbdVar2 == null) {
                AbstractC6452k.m12185i("adQualityDataBuilder");
                throw null;
            }
            long jM6845L = jM6846M - ((zzgbe) zzgbdVar2.f19780t).m6845L();
            zzgbdVar.m8326l();
            ((zzgbe) zzgbdVar.f19780t).m6855W(jM6845L);
            c0315d.m464f(null);
            return C6289k.f24318a;
        } catch (Throwable th) {
            c0315d.m464f(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m6879c(AbstractC6373c abstractC6373c) throws Throwable {
        zzgcb zzgcbVar;
        C0315d c0315d;
        InterfaceC0312a interfaceC0312a;
        C0315d c0315d2;
        zzgbe zzgbeVar;
        InterfaceC0312a interfaceC0312a2;
        if (abstractC6373c instanceof zzgcb) {
            zzgcbVar = (zzgcb) abstractC6373c;
            int i2 = zzgcbVar.f16929w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzgcbVar.f16929w = i2 - Integer.MIN_VALUE;
            } else {
                zzgcbVar = new zzgcb(this, abstractC6373c);
            }
        } else {
            zzgcbVar = new zzgcb(this, abstractC6373c);
        }
        Object objUpdateData = zzgcbVar.f16927u;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = zzgcbVar.f16929w;
        try {
            if (i3 == 0) {
                AbstractC0243G.m377o(objUpdateData);
                c0315d = this.f16977c;
                zzgcbVar.f16925s = c0315d;
                zzgcbVar.f16929w = 1;
                if (c0315d.m462d(zzgcbVar) != enumC6363a) {
                }
                interfaceC0312a = c0315d;
                return enumC6363a;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0312a2 = (InterfaceC0312a) zzgcbVar.f16925s;
                    try {
                        AbstractC0243G.m377o(objUpdateData);
                        ((C0315d) interfaceC0312a2).m464f(null);
                        return C6289k.f24318a;
                    } catch (Throwable th) {
                        th = th;
                        ((C0315d) interfaceC0312a2).m464f(null);
                        throw th;
                    }
                }
                c0315d2 = zzgcbVar.f16926t;
                zzgbeVar = (zzgbe) zzgcbVar.f16925s;
                AbstractC0243G.m377o(objUpdateData);
                try {
                    DataStore dataStore = this.f16983i;
                    zzgcc zzgccVar = new zzgcc(zzgbeVar, null);
                    zzgcbVar.f16925s = c0315d2;
                    zzgcbVar.f16926t = null;
                    zzgcbVar.f16929w = 3;
                    objUpdateData = dataStore.updateData(zzgccVar, zzgcbVar);
                    if (objUpdateData != enumC6363a) {
                        interfaceC0312a2 = c0315d2;
                        ((C0315d) interfaceC0312a2).m464f(null);
                        return C6289k.f24318a;
                    }
                    interfaceC0312a = c0315d;
                    return enumC6363a;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC0312a2 = c0315d2;
                    ((C0315d) interfaceC0312a2).m464f(null);
                    throw th;
                }
            }
            InterfaceC0312a interfaceC0312a3 = (InterfaceC0312a) zzgcbVar.f16925s;
            AbstractC0243G.m377o(objUpdateData);
            interfaceC0312a = interfaceC0312a3;
            interfaceC0312a = c0315d;
            zzgbd zzgbdVar = this.f16981g;
            if (zzgbdVar == null) {
                AbstractC6452k.m12185i("adQualityDataBuilder");
                throw null;
            }
            zzgbe zzgbeVar2 = (zzgbe) zzgbdVar.m8328o();
            ((C0315d) interfaceC0312a).m464f(null);
            zzgcbVar.f16925s = zzgbeVar2;
            c0315d2 = this.f16979e;
            zzgcbVar.f16926t = c0315d2;
            zzgcbVar.f16929w = 2;
            if (c0315d2.m462d(zzgcbVar) != enumC6363a) {
                zzgbeVar = zzgbeVar2;
                DataStore dataStore2 = this.f16983i;
                zzgcc zzgccVar2 = new zzgcc(zzgbeVar, null);
                zzgcbVar.f16925s = c0315d2;
                zzgcbVar.f16926t = null;
                zzgcbVar.f16929w = 3;
                objUpdateData = dataStore2.updateData(zzgccVar2, zzgcbVar);
                if (objUpdateData != enumC6363a) {
                    interfaceC0312a2 = c0315d2;
                    ((C0315d) interfaceC0312a2).m464f(null);
                    return C6289k.f24318a;
                }
            }
            interfaceC0312a = c0315d;
            return enumC6363a;
        } catch (Throwable th3) {
            ((C0315d) interfaceC0312a).m464f(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m6880k(String str, AbstractC6373c abstractC6373c) throws Throwable {
        zzgbu zzgbuVar;
        C0315d c0315d;
        Throwable th;
        InterfaceC0312a interfaceC0312a;
        if (abstractC6373c instanceof zzgbu) {
            zzgbuVar = (zzgbu) abstractC6373c;
            int i2 = zzgbuVar.f16904w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzgbuVar.f16904w = i2 - Integer.MIN_VALUE;
            } else {
                zzgbuVar = new zzgbu(this, abstractC6373c);
            }
        } else {
            zzgbuVar = new zzgbu(this, abstractC6373c);
        }
        Object obj = zzgbuVar.f16902u;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = zzgbuVar.f16904w;
        try {
            if (i3 == 0) {
                AbstractC0243G.m377o(obj);
                zzgbuVar.f16900s = str;
                c0315d = this.f16979e;
                zzgbuVar.f16901t = c0315d;
                zzgbuVar.f16904w = 1;
                if (c0315d.m462d(zzgbuVar) != enumC6363a) {
                }
                return enumC6363a;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC0312a = (InterfaceC0312a) zzgbuVar.f16900s;
                try {
                    AbstractC0243G.m377o(obj);
                    ((C0315d) interfaceC0312a).m464f(null);
                    return C6289k.f24318a;
                } catch (Throwable th2) {
                    th = th2;
                    ((C0315d) interfaceC0312a).m464f(null);
                    throw th;
                }
            }
            C0315d c0315d2 = zzgbuVar.f16901t;
            String str2 = (String) zzgbuVar.f16900s;
            AbstractC0243G.m377o(obj);
            c0315d = c0315d2;
            str = str2;
            DataStore dataStore = this.f16983i;
            zzgbv zzgbvVar = new zzgbv(str, null);
            zzgbuVar.f16900s = c0315d;
            zzgbuVar.f16901t = null;
            zzgbuVar.f16904w = 2;
            Object objUpdateData = dataStore.updateData(zzgbvVar, zzgbuVar);
            if (objUpdateData != enumC6363a) {
                C0315d c0315d3 = c0315d;
                obj = objUpdateData;
                interfaceC0312a = c0315d3;
                ((C0315d) interfaceC0312a).m464f(null);
                return C6289k.f24318a;
            }
            return enumC6363a;
        } catch (Throwable th3) {
            C0315d c0315d4 = c0315d;
            th = th3;
            interfaceC0312a = c0315d4;
            ((C0315d) interfaceC0312a).m464f(null);
            throw th;
        }
    }
}
