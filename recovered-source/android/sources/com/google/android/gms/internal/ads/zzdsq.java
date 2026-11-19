package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdsq {

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.util.zzbl f12823a;

    /* JADX INFO: renamed from: b */
    public final Clock f12824b;

    /* JADX INFO: renamed from: c */
    public final Executor f12825c;

    public zzdsq(com.google.android.gms.ads.internal.util.zzbl zzblVar, Clock clock, Executor executor) {
        this.f12823a = zzblVar;
        this.f12824b = clock;
        this.f12825c = executor;
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m6046a(byte[] bArr, double d, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        zzbio zzbioVar = zzbix.f8444a7;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            options.inJustDecodeBounds = true;
            m6047b(bArr, options);
            options.inJustDecodeBounds = false;
            int i2 = options.outWidth * options.outHeight;
            if (i2 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i2 - 1) / ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8461b7)).intValue())) / 2);
            }
        }
        return m6047b(bArr, options);
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m6047b(byte[] bArr, BitmapFactory.Options options) {
        Clock clock = this.f12824b;
        long jMo3639a = clock.mo3639a();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jMo3639a2 = clock.mo3639a();
        if (bitmapDecodeByteArray != null) {
            long j2 = jMo3639a2 - jMo3639a;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + 15 + String.valueOf(z).length());
            AbstractC1456a.m2455v(sb, "Decoded image w: ", width, " h:", height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j2);
            sb.append(" on ui thread: ");
            sb.append(z);
            com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
        }
        return bitmapDecodeByteArray;
    }
}
