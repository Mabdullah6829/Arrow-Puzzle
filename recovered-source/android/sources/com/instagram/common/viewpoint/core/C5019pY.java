package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.Tracks;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5019pY implements InterfaceC201424 {

    @MetaExoPlayerCustomization("Remove Immutable List for Oculus")
    public final List<C5020pZ> A00;
    public static String[] A01 = {"0eRTZm", "wsJdmo7HTY", "VHUY43wJh5fnSZ3wEvYR5lxV3yQqNNMU", "k8", "kUjTCgoRRteoZ0", "6rJamNQt6U89KJOuF", "xAstRHAahUkfHwQSYEnj0qzfqp", "GuXFY9846UfmIsqOXXuGkg4YoPfa8R1b"};
    public static final C5019pY A03 = new C5019pY(new ArrayList());
    public static final String A04 = AbstractC22035C.A0h(0);
    public static final InterfaceC201323<C5019pY> A02 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.pb
        @Override // com.instagram.common.viewpoint.core.InterfaceC201323
        public final InterfaceC201424 A6f(Bundle bundle) {
            return C5019pY.A00(bundle);
        }
    };

    public C5019pY(List<C5020pZ> list) {
        this.A00 = MetaExoPlayerCustomizedCollections.A03((C5020pZ[]) list.toArray(new C5020pZ[0]));
    }

    public static /* synthetic */ C5019pY A00(Bundle bundle) {
        List<Tracks.Group> groups;
        List<Tracks.Group> groups2 = bundle.getParcelableArrayList(A04);
        if (groups2 == null) {
            groups = Collections.emptyList();
        } else {
            groups = C213344.A01(C5020pZ.A05, groups2);
        }
        return new C5019pY(groups);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A00.equals(((C5019pY) obj).A00);
        }
        String[] strArr = A01;
        if (strArr[2].charAt(26) == strArr[7].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "oFMxQz";
        strArr2[3] = "4E";
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
