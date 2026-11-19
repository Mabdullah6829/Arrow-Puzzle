package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfxl {

    /* JADX INFO: renamed from: c */
    public static final byte[] f16754c = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* JADX INFO: renamed from: d */
    public static final byte[] f16755d = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    /* JADX INFO: renamed from: a */
    public final byte[] f16756a = f16755d;

    /* JADX INFO: renamed from: b */
    public final byte[] f16757b = f16754c;

    /* JADX INFO: renamed from: a */
    public final boolean m6759a(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] x509CertificateArrM4367a = zzasr.m4367a(file.getAbsolutePath());
            if (x509CertificateArrM4367a.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrM4367a[0][0].getEncoded());
            return Arrays.equals(this.f16757b, bArrDigest) || (!"user".equals(Build.TYPE) && Arrays.equals(this.f16756a, bArrDigest));
        } catch (zzaso e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException e2) {
            e = e2;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e3) {
            e = e3;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
