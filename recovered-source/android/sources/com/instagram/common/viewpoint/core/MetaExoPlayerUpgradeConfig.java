package com.instagram.common.viewpoint.core;

import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ja, reason: from Kotlin metadata */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\u0002J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0007H\u0087\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\tH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\nH\u0007J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\fH\u0007J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\rH\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerUpgradeConfig;", "", "<init>", "()V", "CONFIG", "", "Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerUpgradeConfig$ID;", "", "INTEGER_CONFIG", "Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerUpgradeConfig$INTEGER_ID;", "", "LONG_CONFIG", "Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerUpgradeConfig$LONG_ID;", "", "get", "upgradeIdentifier", "set", "", "value", "getInteger", "setInteger", "getLong", "setLong", "ID", "INTEGER_ID", "LONG_ID", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MetaExoPlayerUpgradeConfig {
    public static byte[] A00;
    public static final MetaExoPlayerUpgradeConfig A01;
    public static final Map<EnumC4663jX, Boolean> A02;
    public static final Map<EnumC4664jY, Integer> A03;
    public static final Map<EnumC4665jZ, Long> A04;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ C1137R.styleable.ConstraintSet_transitionPathRotate);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{126, 73, 93, 89, 69, 94, 73, 72, 12, 90, 77, 64, 89, 73, 12, 91, 77, 95, 12, 66, 89, 64, 64, 2, 39, 34, 53, 32, 51, 54, 55, 27, 54, 55, 60, 38, 59, 52, 59, 55, 32};
    }

    static {
        A02();
        A01 = new MetaExoPlayerUpgradeConfig();
        A02 = new EnumMap(EnumC4663jX.class);
        A03 = new EnumMap(EnumC4664jY.class);
        A04 = new EnumMap(EnumC4665jZ.class);
        for (EnumC4663jX enumC4663jX : EnumC4663jX.valuesCustom()) {
            A02.put(enumC4663jX, false);
        }
        for (EnumC4664jY enumC4664jY : EnumC4664jY.valuesCustom()) {
            A03.put(enumC4664jY, -1);
        }
        for (EnumC4665jZ id : EnumC4665jZ.values()) {
            A04.put(id, -1L);
        }
        A02.put(EnumC4663jX.A0W, true);
        A02.put(EnumC4663jX.A0Q, true);
        A02.put(EnumC4663jX.A1j, true);
        A03.put(EnumC4664jY.A05, 100);
    }

    @JvmStatic
    public static final int A00(EnumC4664jY enumC4664jY) {
        C5078qY.A09(enumC4664jY, A01(24, 17, 40));
        Integer num = A03.get(enumC4664jY);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(A01(0, 24, 86).toString());
    }

    @JvmStatic
    public static final boolean A03(EnumC4663jX enumC4663jX) {
        C5078qY.A09(enumC4663jX, A01(24, 17, 40));
        return C5078qY.A0C(true, A02.get(enumC4663jX));
    }
}
