package com.google.android.gms.ads.nonagon.devicetier;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class DeviceTierManager {

    /* JADX INFO: renamed from: a */
    public final Context f3780a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f3781b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final AtomicReference f3782c = new AtomicReference(AdvertisedMemoryTier.UNKNOWN);

    /* JADX INFO: renamed from: d */
    public final AtomicReference f3783d = new AtomicReference(AvailableMemoryTier.UNKNOWN);

    /* JADX INFO: renamed from: e */
    public final AtomicReference f3784e = new AtomicReference(AvailableProcessorTier.UNKNOWN);

    public enum AdvertisedMemoryTier {
        UNKNOWN(0),
        /* JADX INFO: Fake field, exist only in values array */
        INVALID_DATA_SOURCE(1),
        /* JADX INFO: Fake field, exist only in values array */
        EXTREME_LOW(2),
        /* JADX INFO: Fake field, exist only in values array */
        VERY_LOW(3),
        /* JADX INFO: Fake field, exist only in values array */
        LOW(4),
        /* JADX INFO: Fake field, exist only in values array */
        MID(5),
        /* JADX INFO: Fake field, exist only in values array */
        MID_PLUS(6),
        /* JADX INFO: Fake field, exist only in values array */
        HIGH(7),
        /* JADX INFO: Fake field, exist only in values array */
        VERY_HIGH(8),
        /* JADX INFO: Fake field, exist only in values array */
        EXTREME_HIGH(9);


        /* JADX INFO: renamed from: s */
        public final int f3787s;

        AdvertisedMemoryTier(int i2) {
            this.f3787s = i2;
        }
    }

    public enum AvailableMemoryTier {
        UNKNOWN(0),
        /* JADX INFO: Fake field, exist only in values array */
        INVALID_DATA_SOURCE(1),
        /* JADX INFO: Fake field, exist only in values array */
        EXTREME_LOW(2),
        /* JADX INFO: Fake field, exist only in values array */
        VERY_LOW(3),
        /* JADX INFO: Fake field, exist only in values array */
        LOW(4),
        /* JADX INFO: Fake field, exist only in values array */
        MID(5),
        /* JADX INFO: Fake field, exist only in values array */
        MID_PLUS(6),
        /* JADX INFO: Fake field, exist only in values array */
        HIGH(7),
        /* JADX INFO: Fake field, exist only in values array */
        VERY_HIGH(8),
        /* JADX INFO: Fake field, exist only in values array */
        EXTREME_HIGH(9);


        /* JADX INFO: renamed from: s */
        public final int f3790s;

        AvailableMemoryTier(int i2) {
            this.f3790s = i2;
        }
    }

    public enum AvailableProcessorTier {
        UNKNOWN(0),
        /* JADX INFO: Fake field, exist only in values array */
        INVALID_DATA_SOURCE(1),
        /* JADX INFO: Fake field, exist only in values array */
        EXTREME_LOW(2),
        /* JADX INFO: Fake field, exist only in values array */
        LOW(3),
        /* JADX INFO: Fake field, exist only in values array */
        MID(4),
        /* JADX INFO: Fake field, exist only in values array */
        MID_PLUS(5),
        /* JADX INFO: Fake field, exist only in values array */
        HIGH(6),
        /* JADX INFO: Fake field, exist only in values array */
        EXTREME_HIGH(7);


        /* JADX INFO: renamed from: s */
        public final int f3793s;

        AvailableProcessorTier(int i2) {
            this.f3793s = i2;
        }
    }

    public DeviceTierManager(Context context) {
        this.f3780a = context;
    }
}
