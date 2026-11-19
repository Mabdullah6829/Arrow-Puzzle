package com.instagram.common.viewpoint.core;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC4941oI {
    public static int A00(int hashCode) {
        return (int) (((long) Integer.rotateLeft((int) (((long) hashCode) * (-862048943)), 15)) * 461845907);
    }

    public static int A01(int expectedEntries, double loadFactor) {
        int iMax = Math.max(expectedEntries, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax > ((int) (((double) iHighestOneBit) * loadFactor))) {
            int tableSize = iHighestOneBit << 1;
            return tableSize > 0 ? tableSize : BasicMeasure.EXACTLY;
        }
        return iHighestOneBit;
    }

    public static int A02(@CheckForNull Object o) {
        return A00(o == null ? 0 : o.hashCode());
    }
}
