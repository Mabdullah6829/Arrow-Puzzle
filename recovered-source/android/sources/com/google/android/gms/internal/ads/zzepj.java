package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
final class zzepj implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f14522a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfkq f14523b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzfkn f14524c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f14525d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzfsi f14526e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zzfky f14527f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zzepl f14528g;

    public zzepj(zzepl zzeplVar, long j2, zzfkq zzfkqVar, zzfkn zzfknVar, String str, zzfsi zzfsiVar, zzfky zzfkyVar) {
        this.f14522a = j2;
        this.f14523b = zzfkqVar;
        this.f14524c = zzfknVar;
        this.f14525d = str;
        this.f14526e = zzfsiVar;
        this.f14527f = zzfkyVar;
        Objects.requireNonNull(zzeplVar);
        this.f14528g = zzeplVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        long j2;
        zzepl zzeplVar = this.f14528g;
        long jMo3639a = zzeplVar.f14534a.mo3639a() - this.f14522a;
        synchronized (zzeplVar) {
            try {
                if (zzeplVar.f14538e) {
                    zzeplVar.f14535b.m6311a(this.f14523b, this.f14524c, 0, null, jMo3639a);
                    j2 = jMo3639a;
                } else {
                    j2 = jMo3639a;
                }
                if (zzeplVar.f14540g) {
                    return;
                }
                zzfkn zzfknVar = this.f14524c;
                synchronized (zzeplVar) {
                    zzepk zzepkVar = (zzepk) zzeplVar.f14537d.get(zzfknVar);
                    if (zzepkVar != null && zzepkVar.f14531c == 8) {
                        ((zzepk) zzeplVar.f14537d.get(zzfknVar)).f14532d = j2;
                    } else {
                        zzeplVar.f14537d.put(zzfknVar, new zzepk(this.f14525d, zzfknVar.f15927f0, 0, j2, null));
                    }
                    zzeplVar.f14539f.m6290c(zzfknVar, j2, null, true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0062 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:30:0x005e, B:32:0x0062, B:34:0x006d, B:38:0x0078, B:40:0x007f, B:42:0x0091, B:43:0x00a4, B:45:0x00a8, B:47:0x00aa, B:55:0x00e0, B:56:0x00e9, B:50:0x00c5, B:52:0x00c9, B:54:0x00d3), top: B:60:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006d A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:30:0x005e, B:32:0x0062, B:34:0x006d, B:38:0x0078, B:40:0x007f, B:42:0x0091, B:43:0x00a4, B:45:0x00a8, B:47:0x00aa, B:55:0x00e0, B:56:0x00e9, B:50:0x00c5, B:52:0x00c9, B:54:0x00d3), top: B:60:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:39:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:30:0x005e, B:32:0x0062, B:34:0x006d, B:38:0x0078, B:40:0x007f, B:42:0x0091, B:43:0x00a4, B:45:0x00a8, B:47:0x00aa, B:55:0x00e0, B:56:0x00e9, B:50:0x00c5, B:52:0x00c9, B:54:0x00d3), top: B:60:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8 A[Catch: all -> 0x0074, DONT_GENERATE, TryCatch #0 {all -> 0x0074, blocks: (B:30:0x005e, B:32:0x0062, B:34:0x006d, B:38:0x0078, B:40:0x007f, B:42:0x0091, B:43:0x00a4, B:45:0x00a8, B:47:0x00aa, B:55:0x00e0, B:56:0x00e9, B:50:0x00c5, B:52:0x00c9, B:54:0x00d3), top: B:60:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:30:0x005e, B:32:0x0062, B:34:0x006d, B:38:0x0078, B:40:0x007f, B:42:0x0091, B:43:0x00a4, B:45:0x00a8, B:47:0x00aa, B:55:0x00e0, B:56:0x00e9, B:50:0x00c5, B:52:0x00c9, B:54:0x00d3), top: B:60:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:60:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        int i2;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        Integer numValueOf;
        long j2;
        int i3;
        com.google.android.gms.ads.internal.client.zze zzeVarM6532a;
        int i4;
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        zzepl zzeplVar = this.f14528g;
        long jMo3639a = zzeplVar.f14534a.mo3639a() - this.f14522a;
        if (th instanceof TimeoutException) {
            i2 = 2;
        } else if (th instanceof zzeot) {
            i2 = 3;
        } else if (th instanceof CancellationException) {
            i2 = 4;
        } else if (th instanceof zzfln) {
            i2 = 5;
        } else {
            if (th instanceof zzeel) {
                i2 = zzfmi.m6532a(th).f3106s == 3 ? 1 : 6;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8591j2)).booleanValue() && (th instanceof zzeme) && (zzeVar = ((zzeme) th).f14194t) != null) {
                    numValueOf = Integer.valueOf(zzeVar.f3106s);
                }
                synchronized (zzeplVar) {
                    try {
                        if (zzeplVar.f14538e) {
                            i3 = i2;
                            zzeplVar.f14535b.m6311a(this.f14523b, this.f14524c, i3, th instanceof zzeme ? (zzeme) th : null, jMo3639a);
                            j2 = jMo3639a;
                        } else {
                            j2 = jMo3639a;
                            i3 = i2;
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8870z9)).booleanValue()) {
                            zzfsm zzfsmVar = zzeplVar.f14536c;
                            zzfsi zzfsiVar = this.f14526e;
                            zzfky zzfkyVar = this.f14527f;
                            zzfkn zzfknVar = this.f14524c;
                            zzfsmVar.m6642a(zzfsiVar.m6640a(zzfkyVar, zzfknVar, zzfknVar.f15942n), zzfknVar.f15963x0);
                        }
                        if (zzeplVar.f14540g) {
                            return;
                        }
                        LinkedHashMap linkedHashMap = zzeplVar.f14537d;
                        zzfkn zzfknVar2 = this.f14524c;
                        linkedHashMap.put(zzfknVar2, new zzepk(this.f14525d, zzfknVar2.f15927f0, i3, j2, numValueOf));
                        zzeVarM6532a = zzfmi.m6532a(th);
                        i4 = zzeVarM6532a.f3106s;
                        if ((i4 != 3 || i4 == 0) && (zzeVar2 = zzeVarM6532a.f3109v) != null && !zzeVar2.f3108u.equals("com.google.android.gms.ads")) {
                        }
                        zzeplVar.f14539f.m6290c(zzfknVar2, j2, zzeVarM6532a, false);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            i2 = 6;
        }
        numValueOf = null;
        synchronized (zzeplVar) {
            if (zzeplVar.f14538e) {
                i3 = i2;
                zzeplVar.f14535b.m6311a(this.f14523b, this.f14524c, i3, th instanceof zzeme ? (zzeme) th : null, jMo3639a);
                j2 = jMo3639a;
            } else {
                j2 = jMo3639a;
                i3 = i2;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8870z9)).booleanValue()) {
                zzfsm zzfsmVar2 = zzeplVar.f14536c;
                zzfsi zzfsiVar2 = this.f14526e;
                zzfky zzfkyVar2 = this.f14527f;
                zzfkn zzfknVar3 = this.f14524c;
                zzfsmVar2.m6642a(zzfsiVar2.m6640a(zzfkyVar2, zzfknVar3, zzfknVar3.f15942n), zzfknVar3.f15963x0);
            }
            if (zzeplVar.f14540g) {
                return;
            }
            LinkedHashMap linkedHashMap2 = zzeplVar.f14537d;
            zzfkn zzfknVar4 = this.f14524c;
            linkedHashMap2.put(zzfknVar4, new zzepk(this.f14525d, zzfknVar4.f15927f0, i3, j2, numValueOf));
            zzeVarM6532a = zzfmi.m6532a(th);
            i4 = zzeVarM6532a.f3106s;
            zzeVarM6532a = i4 != 3 ? zzfmi.m6532a(new zzeme(13, zzeVarM6532a.f3109v)) : zzfmi.m6532a(new zzeme(13, zzeVarM6532a.f3109v));
            zzeplVar.f14539f.m6290c(zzfknVar4, j2, zzeVarM6532a, false);
        }
    }
}
