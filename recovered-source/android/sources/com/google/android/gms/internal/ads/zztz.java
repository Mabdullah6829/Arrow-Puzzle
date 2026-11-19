package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.core.view.PointerIconCompat;

/* JADX INFO: loaded from: classes2.dex */
final class zztz implements zzsd {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzua f20963a;

    /* JADX INFO: renamed from: a */
    public final void m8893a(final Exception exc) {
        zzeh.m6214f("MediaCodecAudioRenderer", "Audio sink error", exc);
        final zzrw zzrwVar = this.f20963a.f20966Y0;
        Handler handler = zzrwVar.f20723a;
        if (handler != null) {
            handler.post(new Runnable(exc) { // from class: com.google.android.gms.internal.ads.zzrs
                @Override // java.lang.Runnable
                public final void run() {
                    zzrw zzrwVar2 = this.f20719s;
                    zzrwVar2.getClass();
                    String str = zzfm.f16091a;
                    zzpt zzptVar = ((zzkf) zzrwVar2.f20724b).f20189s.f20264r;
                    zzptVar.m8814r(zzptVar.m8818w(), PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, new zznt());
                }
            });
        }
    }
}
