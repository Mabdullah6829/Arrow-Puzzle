package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzafr extends zzafv {
    public zzafr() {
        super(0);
    }

    @Override // com.google.android.gms.internal.measurement.zzafv
    /* JADX INFO: renamed from: a */
    public final void mo9664a() {
        if (!this.f22116v) {
            if (this.f22114t > 0) {
                ((zzadj) ((zzafs) m9666b(0)).f22105s).mo9537d();
                throw null;
            }
            Iterator it = m9667c().iterator();
            if (it.hasNext()) {
                ((zzadj) ((Map.Entry) it.next()).getKey()).mo9537d();
                throw null;
            }
        }
        super.mo9664a();
    }
}
