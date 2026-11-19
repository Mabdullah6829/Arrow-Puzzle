package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.A1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2484A1 {
    public final int A00;
    public final C4912no A01;
    public final CopyOnWriteArrayList<DrmSessionEventListener.EventDispatcher.ListenerAndHandler> A02;

    public C2484A1() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public C2484A1(CopyOnWriteArrayList<DrmSessionEventListener.EventDispatcher.ListenerAndHandler> listenerAndHandlers, int i2, C4912no c4912no) {
        this.A02 = listenerAndHandlers;
        this.A00 = i2;
        this.A01 = c4912no;
    }

    public final C2484A1 A00(int i2, C4912no c4912no) {
        return new C2484A1(this.A02, i2, c4912no);
    }
}
