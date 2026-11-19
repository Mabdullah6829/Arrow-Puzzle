package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhi extends zzhj {

    /* JADX INFO: renamed from: e */
    public final AssetManager f18771e;

    /* JADX INFO: renamed from: f */
    public Uri f18772f;

    /* JADX INFO: renamed from: g */
    public InputStream f18773g;

    /* JADX INFO: renamed from: h */
    public long f18774h;

    /* JADX INFO: renamed from: i */
    public boolean f18775i;

    public zzhi(Context context) {
        super(false);
        this.f18771e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    /* JADX INFO: renamed from: b */
    public final int mo4082b(byte[] bArr, int i2, int i3) throws zzhh {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f18774h;
        if (j2 != 0) {
            if (j2 != -1) {
                try {
                    i3 = (int) Math.min(j2, i3);
                } catch (IOException e) {
                    throw new zzhh(e, AdError.SERVER_ERROR_CODE);
                }
            }
            InputStream inputStream = this.f18773g;
            String str = zzfm.f16091a;
            int i4 = inputStream.read(bArr, i2, i3);
            if (i4 != -1) {
                long j3 = this.f18774h;
                if (j3 != -1) {
                    this.f18774h = j3 - ((long) i4);
                }
                m7470i(i4);
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: c */
    public final long mo5494c(zzhv zzhvVar) throws zzhh {
        try {
            Uri uri = zzhvVar.f19195a;
            this.f18772f = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m7468f(zzhvVar);
            InputStream inputStreamOpen = this.f18771e.open(path, 1);
            this.f18773g = inputStreamOpen;
            long j2 = zzhvVar.f19197c;
            if (inputStreamOpen.skip(j2) < j2) {
                throw new zzhh(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long j3 = zzhvVar.f19198d;
            if (j3 != -1) {
                this.f18774h = j3;
            } else {
                long jAvailable = this.f18773g.available();
                this.f18774h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f18774h = -1L;
                }
            }
            this.f18775i = true;
            m7469h(zzhvVar);
            return this.f18774h;
        } catch (zzhh e) {
            throw e;
        } catch (IOException e2) {
            throw new zzhh(e2, true != (e2 instanceof FileNotFoundException) ? AdError.SERVER_ERROR_CODE : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: d */
    public final void mo5495d() {
        this.f18772f = null;
        try {
            try {
                InputStream inputStream = this.f18773g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f18773g = null;
                if (this.f18775i) {
                    this.f18775i = false;
                    m7471k();
                }
            } catch (IOException e) {
                throw new zzhh(e, AdError.SERVER_ERROR_CODE);
            }
        } catch (Throwable th) {
            this.f18773g = null;
            if (this.f18775i) {
                this.f18775i = false;
                m7471k();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.f18772f;
    }
}
