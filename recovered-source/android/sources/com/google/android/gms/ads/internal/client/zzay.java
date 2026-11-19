package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbzf;
import com.google.android.gms.internal.ads.zzcdb;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class zzay {

    /* JADX INFO: renamed from: g */
    public static final zzay f3085g = new zzay();

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.util.client.zzf f3086a;

    /* JADX INFO: renamed from: b */
    public final zzaw f3087b;

    /* JADX INFO: renamed from: c */
    public boolean f3088c;

    /* JADX INFO: renamed from: d */
    public final VersionInfoParcel f3089d;

    /* JADX INFO: renamed from: e */
    public final Random f3090e;

    /* JADX INFO: renamed from: f */
    public final String f3091f;

    public zzay() {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = new com.google.android.gms.ads.internal.util.client.zzf();
        zzk zzkVar = new zzk();
        zzi zziVar = new zzi();
        zzfc zzfcVar = new zzfc();
        zzboe zzboeVar = new zzboe();
        new zzcdb();
        zzbzf zzbzfVar = new zzbzf();
        new zzbof();
        zzaw zzawVar = new zzaw(zzkVar, zziVar, zzfcVar, zzboeVar, zzbzfVar, new zzl());
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, 261710000, true);
        Random random = new Random();
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        this.f3086a = zzfVar;
        this.f3087b = zzawVar;
        this.f3088c = false;
        this.f3089d = versionInfoParcel;
        this.f3090e = random;
        this.f3091f = string;
    }

    /* JADX INFO: renamed from: a */
    public static void m2812a() {
        f3085g.f3088c = false;
    }
}
