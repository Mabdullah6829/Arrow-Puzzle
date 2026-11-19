package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.firebase.messaging.Constants;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzebv extends zzbrz {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f13514s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f13515t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ long f13516u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzfqg f13517v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzcgd f13518w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzece f13519x;

    public zzebv(long j2, zzcgd zzcgdVar, zzece zzeceVar, zzfqg zzfqgVar, Object obj, String str) {
        this.f13514s = obj;
        this.f13515t = str;
        this.f13516u = j2;
        this.f13517v = zzfqgVar;
        this.f13518w = zzcgdVar;
        Objects.requireNonNull(zzeceVar);
        this.f13519x = zzeceVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6147a() {
        synchronized (this.f13514s) {
            zzece zzeceVar = this.f13519x;
            String str = this.f13515t;
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            zzeceVar.m6153d((int) (SystemClock.elapsedRealtime() - this.f13516u), str, "", true);
            zzeceVar.f13551l.m6130b(str);
            zzeceVar.f13554o.mo5933m(str);
            zzfqt zzfqtVar = zzeceVar.f13555p;
            zzfqg zzfqgVar = this.f13517v;
            zzfqgVar.mo6563L(true);
            zzfqtVar.m6588b(zzfqgVar.mo6564e());
            this.f13518w.m5397a(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m6148j0(String str) {
        synchronized (this.f13514s) {
            zzece zzeceVar = this.f13519x;
            String str2 = this.f13515t;
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            zzeceVar.m6153d((int) (SystemClock.elapsedRealtime() - this.f13516u), str2, str, false);
            zzeceVar.f13551l.m6131c(str2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            zzeceVar.f13554o.mo5932d(str2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            zzfqt zzfqtVar = zzeceVar.f13555p;
            zzfqg zzfqgVar = this.f13517v;
            zzfqgVar.mo6565g(str);
            zzfqgVar.mo6563L(false);
            zzfqtVar.m6588b(zzfqgVar.mo6564e());
            this.f13518w.m5397a(Boolean.FALSE);
        }
    }
}
