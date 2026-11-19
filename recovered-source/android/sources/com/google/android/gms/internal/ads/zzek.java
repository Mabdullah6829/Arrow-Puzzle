package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzek {
    /* JADX INFO: renamed from: a */
    public static void m6243a(MediaFormat mediaFormat, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 4), "csd-", i2), ByteBuffer.wrap((byte[]) list.get(i2)));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m6244b(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }
}
