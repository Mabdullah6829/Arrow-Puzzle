package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.text.Cue;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5012pR implements InterfaceC201424 {
    public final long A00;

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public final List<C5014pT> A01;
    public static final C5012pR A03 = new C5012pR(MetaExoPlayerCustomizedCollections.A01(), 0);
    public static final String A04 = AbstractC22035C.A0h(0);
    public static final String A05 = AbstractC22035C.A0h(1);
    public static final InterfaceC201323<C5012pR> A02 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.pS
        @Override // com.instagram.common.viewpoint.core.InterfaceC201323
        public final InterfaceC201424 A6f(Bundle bundle) {
            return C5012pR.A00(bundle);
        }
    };

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public C5012pR(List<C5014pT> list, long j2) {
        this.A01 = MetaExoPlayerCustomizedCollections.A03((C5014pT[]) list.toArray(new C5014pT[0]));
        this.A00 = j2;
    }

    public static final C5012pR A00(Bundle bundle) {
        List listA01;
        List<Cue> cues = bundle.getParcelableArrayList(A04);
        if (cues == null) {
            listA01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            listA01 = C213344.A01(C5014pT.A0I, cues);
        }
        return new C5012pR(listA01, bundle.getLong(A05));
    }
}
