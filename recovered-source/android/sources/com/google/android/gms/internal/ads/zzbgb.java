package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import androidx.annotation.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
final class zzbgb {

    /* JADX INFO: renamed from: a */
    public ByteArrayOutputStream f7812a = new ByteArrayOutputStream(4096);

    /* JADX INFO: renamed from: b */
    public Base64OutputStream f7813b = new Base64OutputStream(this.f7812a, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        try {
            this.f7813b.close();
        } catch (IOException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("HashManager: Unable to convert to Base64.", e);
        }
        try {
            try {
                this.f7812a.close();
                string = this.f7812a.toString();
            } catch (IOException e2) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("HashManager: Unable to convert to Base64.", e2);
                string = "";
            }
            return string;
        } finally {
            this.f7812a = null;
            this.f7813b = null;
        }
    }
}
