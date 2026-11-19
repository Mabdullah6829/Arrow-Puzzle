package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfnr {

    /* JADX INFO: renamed from: a */
    public final zzfmv f16170a;

    /* JADX INFO: renamed from: b */
    public final zzfno f16171b;

    /* JADX INFO: renamed from: d */
    public zzfnx f16173d;

    /* JADX INFO: renamed from: e */
    public int f16174e = 1;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f16172c = new ArrayDeque();

    public zzfnr(zzfmv zzfmvVar, zzfmr zzfmrVar, zzfno zzfnoVar) {
        this.f16170a = zzfmvVar;
        this.f16171b = zzfnoVar;
        zzfmrVar.f16120a = new zzfnq(this);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[Catch: all -> 0x002a, DONT_GENERATE, TRY_ENTER, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0023, B:12:0x002d, B:16:0x0034, B:21:0x003b, B:23:0x0043, B:25:0x004b, B:27:0x0051, B:28:0x0059, B:35:0x0076, B:33:0x0073, B:42:0x007f, B:43:0x0080, B:44:0x0090, B:46:0x00ab, B:51:0x00b0, B:18:0x0037, B:56:0x00b5, B:13:0x002e, B:29:0x005a, B:31:0x0064, B:45:0x0091), top: B:63:0x0001, inners: #0, #1, #3 }] */
    /* JADX INFO: renamed from: a */
    public final synchronized void m6545a() {
        zzfnp zzfnpVar;
        boolean z;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8563h7)).booleanValue() && !com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().zzi().f9882j) {
            this.f16172c.clear();
            return;
        }
        synchronized (this) {
            if (this.f16173d == null) {
                while (true) {
                    ArrayDeque arrayDeque = this.f16172c;
                    if (!arrayDeque.isEmpty()) {
                        zzfnpVar = (zzfnp) arrayDeque.pollFirst();
                        if (zzfnpVar == null) {
                            break;
                        }
                        if (zzfnpVar.zzb() != null) {
                            zzfmv zzfmvVar = this.f16170a;
                            zzfnf zzfnfVarZzb = zzfnpVar.zzb();
                            zzfmw zzfmwVar = (zzfmw) zzfmvVar;
                            synchronized (zzfmwVar) {
                                zzfmu zzfmuVar = (zzfmu) zzfmwVar.f16126a.get(zzfnfVarZzb);
                                if (zzfmuVar != null) {
                                    zzfnc zzfncVar = zzfmwVar.f16127b;
                                    zzfmuVar.m6539a();
                                    z = zzfmuVar.f16122a.size() < zzfncVar.f16151w;
                                }
                                throw th;
                            }
                            if (z) {
                                break;
                            }
                        }
                    }
                }
                zzfnx zzfnxVar = new zzfnx(this.f16170a, this.f16171b, zzfnpVar);
                this.f16173d = zzfnxVar;
                zzfnm zzfnmVar = new zzfnm(this, zzfnpVar);
                synchronized (zzfnxVar) {
                    ListenableFuture listenableFutureM7374h = zzhcf.m7374h(zzfnxVar.f16191b, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfnv
                        @Override // com.google.android.gms.internal.ads.zzhbn
                        /* JADX INFO: renamed from: b */
                        public final ListenableFuture mo3248b(Object obj) {
                            return zzhcj.f18518t;
                        }
                    }, zzfnpVar.zza());
                    ((zzhay) listenableFutureM7374h).addListener(new zzhcd(listenableFutureM7374h, zzfnmVar), zzfnpVar.zza());
                }
            }
        }
    }
}
