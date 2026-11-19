package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzsd extends zzsi {
    public zzsd() {
        super(0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsi
    /* JADX INFO: renamed from: a */
    public final void mo9268a() {
        if (!this.f21815v) {
            if (this.f21813t > 0) {
                ((zzqe) ((zzse) m9272d(0)).f21803s).mo9208a();
                throw null;
            }
            Iterator it = m9270b().iterator();
            if (it.hasNext()) {
                ((zzqe) ((Map.Entry) it.next()).getKey()).mo9208a();
                throw null;
            }
        }
        super.mo9268a();
    }
}
