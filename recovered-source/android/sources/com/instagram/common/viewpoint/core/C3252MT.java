package com.instagram.common.viewpoint.core;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.ads.InterfaceC1889Ad;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.MT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3252MT implements InterfaceC3999Yi {
    public static byte[] A02;
    public static String[] A03 = {"NTFBcVe31dSo2GnU3Js6iiY0zks5LQys", "Ca9zWfFJkFyFOF3Godi91RgYkRzgzr2p", "cII4QPxWTYmVZfubYcNoLj9MPP8GF9tt", "PE9F3dLYBiF4JqqMXSdTSS6miGDS", "DZYdCvYuTuX3W9uqeE5C1IukMMXrX2Kv", "LDE71mkJxI8TxTUVwO2u55MEQLy5qptr", "oLxvrvG8qZvA3h0mNhA70cq5V56", "NZtOBPQowQq2"};
    public final C3568Re A00;
    public final C4494gi A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{46, 41, 51, 56, 53, 49, 56, 38, 55, 55, 56, 40, 53, 46, 34, 41, 51, 38, 51, 46, 40, 41, 56, 44, 34, 62, 78, 73, 79, 66, 92, 89, 66, 84, 89, 66, 86, 88, 68, 69, 73, 75, 8, 64, 71, 69, 67, 68, 73, 73, 77, 8, 71, 66, 85, 8, 79, 72, 82, 67, 84, 72, 71, 74, 8, 79, 86, 69, 8, 103, 83, 66, 79, 67, 72, 69, 67, 104, 67, 82, 81, 73, 84, 77, 99, 94, 86, 73, 84, 82, 67, 66, 103, 69, 82, 79, 80, 79, 82, 95};
    }

    static {
        A01();
    }

    public C3252MT(C4494gi c4494gi, C3568Re c3568Re) {
        this.A01 = c4494gi;
        this.A00 = c3568Re;
    }

    private final void A02() {
        InterfaceC3656T5 interfaceC3656T5A0G = this.A01.A0G();
        if (interfaceC3656T5A0G != null) {
            InterfaceC1889Ad interfaceC1889AdA6k = interfaceC3656T5A0G.A6k();
            String[] strArr = A03;
            if (strArr[2].charAt(26) == strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "uggbWVrJrahsC4DgFI3QlP54yVqi59lG";
            strArr2[1] = "7cYKYqsJYjxuuUZE8o6LAtyu5uwrvd1J";
            if (interfaceC1889AdA6k != null && interfaceC3656T5A0G.A6o() != null) {
                interfaceC3656T5A0G.A6o().onError(interfaceC1889AdA6k, AdError.AD_PRESENTATION_ERROR);
            }
        }
        this.A00.A05().finish();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AAu(Intent intent, Bundle bundle, C3568Re c3568Re) {
        ComponentName component = new ComponentName(AbstractC3766Us.A05(AbstractC3766Us.A02.get()), A00(39, 61, 63));
        Intent intent2 = new Intent();
        intent2.setComponent(component);
        String strA00 = A00(26, 13, 4);
        intent2.putExtra(strA00, intent.getStringExtra(strA00));
        String strA01 = A00(0, 26, 126);
        intent2.putExtra(strA01, intent.getIntExtra(strA01, -1));
        try {
            this.A01.A0F().AID();
            C3889Wu.A09(c3568Re.A05(), intent2);
        } catch (C3887Ws unused) {
            A02();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AFA(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AFi(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AIv(Bundle bundle) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final String getCurrentClientToken() {
        return A00(0, 0, 70);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        this.A01.A0F().AHp();
        if (i3 != -1) {
            this.A01.A0F().AHo(i3);
            A02();
            return false;
        }
        C3568Re c3568Re = this.A00;
        String[] strArr = A03;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[6] = "sxsZAXbczpYXyJjlUSCXbm3Rr92";
        strArr2[7] = "fqqSdoB1RgIi";
        c3568Re.A05().finish();
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void onDestroy() {
    }
}
