package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.bridge.fbsdk.FBLoginASID;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ao */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4129ao implements InterfaceC3664TD {
    public static byte[] A01;
    public final C3659T8 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-20, 25, 15, 29, 26, 20, 15};
    }

    public C4129ao(C3659T8 c3659t8) {
        this.A00 = c3659t8;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3664TD
    public final String A79() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3664TD
    public final String A86() {
        return AbstractC3852WI.A02(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3664TD
    public final String A87() {
        return FBLoginASID.getFBLoginASID();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3664TD
    public final String A8V() {
        return AdInternalSettings.getMediationService();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3664TD
    public final String A8c() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3664TD
    public final InterfaceC3663TC A8x() {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new C4138ax(this, advertisingIdInfoDirectly);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3664TD
    public final String A9Q() {
        return AdInternalSettings.getUrlPrefix();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3664TD
    public final String A9S() {
        return A00(0, 7, 114);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3664TD
    public final String A9T() {
        return BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3664TD
    public final boolean AAO() {
        return BuildConfigApi.isDebug();
    }
}
