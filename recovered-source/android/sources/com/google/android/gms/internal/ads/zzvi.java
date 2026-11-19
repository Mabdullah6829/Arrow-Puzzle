package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import androidx.annotation.RequiresApi;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(35)
public final class zzvi {

    /* JADX INFO: renamed from: a */
    public final HashSet f21103a;

    /* JADX INFO: renamed from: b */
    public LoudnessCodecController f21104b;

    public zzvi() {
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m8941a(int i2) {
        LoudnessCodecController loudnessCodecController = this.f21104b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f21104b = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i2, zzhbu.f18506s, new zzvf());
        this.f21104b = loudnessCodecControllerCreate;
        Iterator it = this.f21103a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8942b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f21103a.remove(mediaCodec) || (loudnessCodecController = this.f21104b) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public zzvi(int i2) {
        this.f21103a = new HashSet();
    }
}
