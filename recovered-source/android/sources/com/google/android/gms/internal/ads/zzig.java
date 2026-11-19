package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class zzig extends zzhs {

    /* JADX INFO: renamed from: t */
    public final int f19839t;

    public zzig() {
        this.f19839t = 1;
    }

    /* JADX INFO: renamed from: a */
    public static zzig m8369a(IOException iOException, int i2) {
        int i3;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i3 = AdError.CACHE_ERROR_CODE;
        } else if (iOException instanceof InterruptedIOException) {
            i3 = PointerIconCompat.TYPE_WAIT;
        } else {
            i3 = (message == null || !zzgsz.m7119a(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i3 == 2007 ? new zzif("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1) : new zzig(iOException, i3, i2);
    }

    public zzig(IOException iOException, int i2, int i3) {
        super(iOException, i2 == 2000 ? i3 != 1 ? 2000 : AdError.INTERNAL_ERROR_CODE : i2);
        this.f19839t = i3;
    }

    public zzig(String str, int i2, int i3) {
        super(str, i2 == 2000 ? i3 != 1 ? 2000 : AdError.INTERNAL_ERROR_CODE : i2);
        this.f19839t = i3;
    }

    public zzig(String str, IOException iOException, int i2, int i3) {
        super(str, iOException, i2 == 2000 ? i3 != 1 ? 2000 : AdError.INTERNAL_ERROR_CODE : i2);
        this.f19839t = i3;
    }
}
