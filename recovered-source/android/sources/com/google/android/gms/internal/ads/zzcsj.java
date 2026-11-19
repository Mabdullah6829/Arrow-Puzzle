package com.google.android.gms.internal.ads;

import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzcsj implements zzcsa {

    /* JADX INFO: renamed from: a */
    public final zzely f11329a;

    public zzcsj(zzely zzelyVar) {
        this.f11329a = zzelyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    /* JADX INFO: renamed from: a */
    public final void mo5814a(HashMap map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8252Ob)).booleanValue()) {
            zzhcf.m7372f(zzhbx.m7360q(this.f11329a.m6283a(true)), Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzcsi
                @Override // com.google.android.gms.internal.ads.zzhbn
                /* JADX INFO: renamed from: b */
                public final ListenableFuture mo3248b(Object obj) {
                    Throwable th = (Throwable) obj;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8269Pb)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5386f("GetTopicsApiWithRecordObservationActionHandlerUnsampled", th);
                    } else {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("GetTopicsApiWithRecordObservationActionHandler", th);
                    }
                    zzgzi zzgziVar = zzgwt.f18303t;
                    return zzhcf.m7367a(new GetTopicsResponse(zzgyo.f18355w));
                }
            }, zzcfy.f9946a);
        }
    }
}
