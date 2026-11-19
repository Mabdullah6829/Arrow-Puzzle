package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p001B.AbstractC0076b;
import p011H.AbstractC0253Q;
import p011H.InterfaceC0238B;

/* JADX INFO: loaded from: classes2.dex */
public final class zztt {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f22904a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final Executor f22905b;

    /* JADX INFO: renamed from: c */
    public final zzru f22906c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0238B f22907d;

    /* JADX INFO: renamed from: e */
    public final Map f22908e;

    public zztt(Executor executor, zzru zzruVar, zzvc zzvcVar, HashMap map) {
        executor.getClass();
        this.f22905b = executor;
        zzruVar.getClass();
        this.f22906c = zzruVar;
        zzvcVar.getClass();
        map.getClass();
        this.f22908e = map;
        AbstractC0076b.m130e(!map.isEmpty());
        this.f22907d = new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzts
            @Override // p011H.InterfaceC0238B
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return AbstractC0253Q.m381d("");
            }
        };
    }
}
