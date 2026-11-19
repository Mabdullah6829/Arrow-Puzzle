package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p003C.AbstractC0116g;
import p011H.AbstractC0253Q;
import p011H.C0240D;
import p011H.C0241E;
import p011H.InterfaceC0237A;
import p011H.InterfaceC0238B;

/* JADX INFO: loaded from: classes2.dex */
final class zzul implements InterfaceC0237A {

    /* JADX INFO: renamed from: s */
    public List f22943s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zztp f22944t;

    public /* synthetic */ zzul(zztp zztpVar) {
        this.f22944t = zztpVar;
    }

    @Override // p011H.InterfaceC0237A
    public final ListenableFuture call() throws IOException {
        zztp zztpVar = this.f22944t;
        zzwi zzwiVarMo10689a = zztpVar.f22965h.mo10689a("Initialize ".concat(String.valueOf(zztpVar.f22958a)));
        try {
            synchronized (zztpVar.f22964g) {
                try {
                    if (this.f22943s == null) {
                        this.f22943s = zztpVar.f22966i;
                        zztpVar.f22966i = Collections.EMPTY_LIST;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList(this.f22943s.size());
            zzus zzusVar = new zzus(this.f22944t);
            Iterator it = this.f22943s.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((InterfaceC0238B) it.next()).apply(zzusVar));
                } catch (Exception e) {
                    arrayList.add(AbstractC0253Q.m380c(e));
                }
            }
            AbstractC0116g abstractC0116gM193q = AbstractC0116g.m193q(arrayList);
            Callable callable = new Callable() { // from class: com.google.android.gms.internal.measurement.zzuk
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzul zzulVar = this.f22942a;
                    synchronized (zzulVar.f22944t.f22964g) {
                        zzulVar.f22943s = null;
                    }
                    return null;
                }
            };
            C0241E c0241e = new C0241E(abstractC0116gM193q, true);
            c0241e.f481F = new C0240D(c0241e, callable);
            c0241e.m345r();
            zzwiVarMo10689a.m10691c(c0241e);
            zzwiVarMo10689a.close();
            return c0241e;
        } catch (Throwable th2) {
            try {
                zzwiVarMo10689a.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
