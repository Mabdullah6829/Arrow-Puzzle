package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.google.firebase.messaging.Constants;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhp extends zzhj {

    /* JADX INFO: renamed from: e */
    public zzhv f19093e;

    /* JADX INFO: renamed from: f */
    public byte[] f19094f;

    /* JADX INFO: renamed from: g */
    public int f19095g;

    /* JADX INFO: renamed from: h */
    public int f19096h;

    public zzhp() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    /* JADX INFO: renamed from: b */
    public final int mo4082b(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f19096h;
        if (i4 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i4);
        byte[] bArr2 = this.f19094f;
        String str = zzfm.f16091a;
        System.arraycopy(bArr2, this.f19095g, bArr, i2, iMin);
        this.f19095g += iMin;
        this.f19096h -= iMin;
        m7470i(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: c */
    public final long mo5494c(zzhv zzhvVar) throws zzhs, zzat {
        m7468f(zzhvVar);
        this.f19093e = zzhvVar;
        Uri uriNormalizeScheme = zzhvVar.f19195a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        zzgtr.m7132e("Unsupported scheme: %s", Constants.ScionAnalytics.MessageType.DATA_MESSAGE.equals(scheme), scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = zzfm.f16091a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new zzat("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f19094f = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new zzat("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e, true, 0);
            }
        } else {
            this.f19094f = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = zzhvVar.f19197c;
        int length = this.f19094f.length;
        if (j2 > length) {
            this.f19094f = null;
            throw new zzhs();
        }
        int i2 = (int) j2;
        this.f19095g = i2;
        int i3 = length - i2;
        this.f19096h = i3;
        long j3 = zzhvVar.f19198d;
        if (j3 != -1) {
            this.f19096h = (int) Math.min(i3, j3);
        }
        m7469h(zzhvVar);
        return j3 != -1 ? j3 : this.f19096h;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: d */
    public final void mo5495d() {
        if (this.f19094f != null) {
            this.f19094f = null;
            m7471k();
        }
        this.f19093e = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        zzhv zzhvVar = this.f19093e;
        if (zzhvVar != null) {
            return zzhvVar.f19195a;
        }
        return null;
    }
}
