package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzt extends zzai {

    /* JADX INFO: renamed from: u */
    public final zzr f22876u;

    public zzt(zzr zzrVar) {
        super("internal.logger");
        this.f22876u = zzrVar;
        this.f22199t.put("log", new zzs(this, false, true));
        this.f22199t.put(NotificationCompat.GROUP_KEY_SILENT, new zzp(NotificationCompat.GROUP_KEY_SILENT));
        ((zzai) this.f22199t.get(NotificationCompat.GROUP_KEY_SILENT)).mo9583h("log", new zzs(this, true, true));
        this.f22199t.put("unmonitored", new zzq("unmonitored"));
        ((zzai) this.f22199t.get("unmonitored")).mo9583h("log", new zzs(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    /* JADX INFO: renamed from: c */
    public final zzao mo9793c(zzg zzgVar, List list) {
        return zzao.f22237k;
    }
}
