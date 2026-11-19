package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p003C.AbstractC0116g;
import p011H.AbstractC0253Q;
import p011H.C0240D;
import p011H.C0241E;
import p011H.CallableC0239C;
import p011H.EnumC0244H;
import p011H.InterfaceC0237A;
import p011H.InterfaceC0238B;

/* JADX INFO: loaded from: classes2.dex */
public final class zzto implements InterfaceC0238B {

    /* JADX INFO: renamed from: a */
    public final AbstractC0116g f22901a;

    /* JADX INFO: renamed from: b */
    public final Executor f22902b;

    public zzto(AbstractC0116g abstractC0116g, Executor executor) {
        this.f22901a = abstractC0116g;
        this.f22902b = executor;
    }

    @Override // p011H.InterfaceC0238B
    public final ListenableFuture apply(Object obj) {
        zzth zzthVar = (zzth) obj;
        AbstractC0116g abstractC0116g = this.f22901a;
        final int size = abstractC0116g.size();
        final ArrayList arrayList = new ArrayList(size);
        int size2 = abstractC0116g.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = abstractC0116g.get(i2);
            i2++;
            arrayList.add(((zztj) obj2).zza());
        }
        InterfaceC0238B interfaceC0238B = new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zztn
            @Override // p011H.InterfaceC0238B
            public final ListenableFuture apply(Object obj3) {
                final zzafc zzafcVar = (zzafc) obj3;
                final ArrayList arrayList2 = arrayList;
                AbstractC0116g abstractC0116gM193q = AbstractC0116g.m193q(arrayList2);
                final zzto zztoVar = this;
                final int i3 = size;
                zzwx zzwxVarM10703a = zzxa.m10703a(new InterfaceC0237A() { // from class: com.google.android.gms.internal.measurement.zztl
                    @Override // p011H.InterfaceC0237A
                    public final ListenableFuture call() {
                        ListenableFuture listenableFutureM381d = AbstractC0253Q.m381d(zzafcVar);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (((Boolean) AbstractC0253Q.m379b((Future) arrayList2.get(i4))).booleanValue()) {
                                final zztj zztjVar = (zztj) zztoVar.f22901a.get(i4);
                                InterfaceC0238B interfaceC0238B2 = new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zztm
                                    @Override // p011H.InterfaceC0238B
                                    public final /* synthetic */ ListenableFuture apply(Object obj4) {
                                        return zztjVar.zzc();
                                    }
                                };
                                int i5 = zzxa.f23060a;
                                listenableFutureM381d = AbstractC0253Q.m384g(listenableFutureM381d, new zzwy(zzvy.m10684a(), interfaceC0238B2), EnumC0244H.f483s);
                            }
                        }
                        return listenableFutureM381d;
                    }
                });
                Executor executor = zztoVar.f22902b;
                C0241E c0241e = new C0241E(abstractC0116gM193q, false);
                c0241e.f481F = new C0240D(c0241e, zzwxVarM10703a, executor);
                c0241e.m345r();
                return c0241e;
            }
        };
        int i3 = zzxa.f23060a;
        return AbstractC0253Q.m384g(zzthVar.mo10659a(new zzwy(zzvy.m10684a(), interfaceC0238B)), new zzwy(zzvy.m10684a(), new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zztk
            @Override // p011H.InterfaceC0238B
            public final ListenableFuture apply(Object obj3) {
                int i4 = size;
                ArrayList arrayList2 = new ArrayList(i4);
                for (int i5 = 0; i5 < i4; i5++) {
                    if (((Boolean) AbstractC0253Q.m379b((Future) arrayList.get(i5))).booleanValue()) {
                        arrayList2.add(((zztj) this.f22901a.get(i5)).zzb());
                    }
                }
                AbstractC0116g abstractC0116gM193q = AbstractC0116g.m193q(arrayList2);
                CallableC0239C callableC0239C = new CallableC0239C();
                C0241E c0241e = new C0241E(abstractC0116gM193q, true);
                c0241e.f481F = new C0240D(c0241e, callableC0239C);
                c0241e.m345r();
                return c0241e;
            }
        }), EnumC0244H.f483s);
    }
}
