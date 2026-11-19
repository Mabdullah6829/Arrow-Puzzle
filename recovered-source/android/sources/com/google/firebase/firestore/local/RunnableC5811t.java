package com.google.firebase.firestore.local;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.constraintlayout.core.state.C1106a;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.Map;
import java.util.Objects;
import p069k.C6430k;
import p079q.C6517h;
import p081r.C6530i;
import p081r.InterfaceC6525d;
import p082s.InterfaceC6533a;
import p082s.InterfaceC6534b;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.t */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5811t implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23807s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ int f23808t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23809u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f23810v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f23811w;

    public /* synthetic */ RunnableC5811t(Object obj, Object obj2, int i2, Object obj3, int i3) {
        this.f23807s = i3;
        this.f23809u = obj;
        this.f23810v = obj2;
        this.f23808t = i2;
        this.f23811w = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23807s) {
            case 0:
                ((SQLiteDocumentOverlayCache) this.f23809u).lambda$processOverlaysInBackground$5((byte[]) this.f23810v, this.f23808t, (Map) this.f23811w);
                return;
            default:
                final C6517h c6517h = (C6517h) this.f23809u;
                final C6430k c6430k = (C6430k) this.f23810v;
                final int i2 = this.f23808t;
                Runnable runnable = (Runnable) this.f23811w;
                InterfaceC6534b interfaceC6534b = c6517h.f24721f;
                try {
                    try {
                        InterfaceC6525d interfaceC6525d = c6517h.f24718c;
                        Objects.requireNonNull(interfaceC6525d);
                        ((C6530i) interfaceC6534b).m12207l(new C1106a(interfaceC6525d, 19));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) c6517h.f24716a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((C6530i) interfaceC6534b).m12207l(new InterfaceC6533a() { // from class: q.f
                                @Override // p082s.InterfaceC6533a
                                public final Object execute() {
                                    c6517h.f24719d.m12198a(c6430k, i2 + 1, false);
                                    return null;
                                }
                            });
                        } else {
                            c6517h.m12199a(c6430k, i2);
                        }
                        break;
                    } catch (SynchronizationException unused) {
                        c6517h.f24719d.m12198a(c6430k, i2 + 1, false);
                    }
                    return;
                } finally {
                    runnable.run();
                }
        }
    }
}
