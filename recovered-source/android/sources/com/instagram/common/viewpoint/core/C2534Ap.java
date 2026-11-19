package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ap */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2534Ap implements InterfaceC5110rI {
    public final /* synthetic */ C2533Ao A00;

    public C2534Ap(C2533Ao c2533Ao) {
        this.A00 = c2533Ao;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5110rI
    public final void AFq() {
        ArrayList arrayList;
        synchronized (this.A00.A06) {
            arrayList = new ArrayList(this.A00.A06.size());
            for (Runnable runnable : this.A00.A06.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            this.A00.A06.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (this.A00.A01 != null) {
            this.A00.A01.AFq();
        }
    }
}
