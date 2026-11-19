package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.HD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC2927HD {
    public static final InterfaceC2927HD A00 = new InterfaceC2927HD() { // from class: com.facebook.ads.redexgen.X.mq
        @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
        public final InterfaceC2923H9[] A5N() {
            return AbstractC2926HC.A00();
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
        public final /* synthetic */ InterfaceC2923H9[] A5O(Uri uri, Map map) {
            return AbstractC2926HC.A01(this, uri, map);
        }
    };

    InterfaceC2923H9[] A5N();

    InterfaceC2923H9[] A5O(Uri uri, Map<String, List<String>> map);
}
