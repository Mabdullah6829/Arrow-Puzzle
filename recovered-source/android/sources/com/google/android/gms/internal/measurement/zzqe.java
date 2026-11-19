package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import p001B.InterfaceC0097w;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqe {

    /* JADX INFO: renamed from: a */
    public final Context f22758a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0097w f22759b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0097w f22760c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0097w f22761d;

    /* JADX INFO: renamed from: e */
    public volatile int f22762e = 0;

    /* JADX INFO: renamed from: f */
    public final CopyOnWriteArrayList f22763f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g */
    public final Object f22764g = new Object();

    /* JADX INFO: renamed from: h */
    public volatile ListenableFuture f22765h = null;

    public zzqe(Context context, InterfaceC0097w interfaceC0097w, InterfaceC0097w interfaceC0097w2, InterfaceC0097w interfaceC0097w3) {
        this.f22758a = context;
        this.f22759b = interfaceC0097w;
        this.f22760c = interfaceC0097w2;
        this.f22761d = interfaceC0097w3;
    }
}
