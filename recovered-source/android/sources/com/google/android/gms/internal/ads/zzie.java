package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public final class zzie extends zzhj {

    /* JADX INFO: renamed from: e */
    public RandomAccessFile f19761e;

    /* JADX INFO: renamed from: f */
    public Uri f19762f;

    /* JADX INFO: renamed from: g */
    public long f19763g;

    /* JADX INFO: renamed from: h */
    public boolean f19764h;

    public zzie() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    /* JADX INFO: renamed from: b */
    public final int mo4082b(byte[] bArr, int i2, int i3) throws zzid {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f19763g;
        if (j2 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f19761e;
            String str = zzfm.f16091a;
            int i4 = randomAccessFile.read(bArr, i2, (int) Math.min(j2, i3));
            if (i4 > 0) {
                this.f19763g -= (long) i4;
                m7470i(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new zzid(e, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: c */
    public final long mo5494c(zzhv zzhvVar) throws zzid {
        Uri uri = zzhvVar.f19195a;
        this.f19762f = uri;
        m7468f(zzhvVar);
        int i2 = AdError.INTERNAL_ERROR_2006;
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f19761e = randomAccessFile;
            try {
                long j2 = zzhvVar.f19197c;
                randomAccessFile.seek(j2);
                long length = zzhvVar.f19198d;
                if (length == -1) {
                    length = this.f19761e.length() - j2;
                }
                this.f19763g = length;
                if (length < 0) {
                    throw new zzid(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                this.f19764h = true;
                m7469h(zzhvVar);
                return this.f19763g;
            } catch (IOException e) {
                throw new zzid(e, AdError.SERVER_ERROR_CODE);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (!(e2.getCause() instanceof ErrnoException) || ((ErrnoException) e2.getCause()).errno != OsConstants.EACCES) {
                    i2 = 2005;
                }
                throw new zzid(e2, i2);
            }
            throw new zzid("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e2, PointerIconCompat.TYPE_WAIT);
        } catch (SecurityException e3) {
            throw new zzid(e3, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e4) {
            throw new zzid(e4, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: d */
    public final void mo5495d() {
        this.f19762f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f19761e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f19761e = null;
                if (this.f19764h) {
                    this.f19764h = false;
                    m7471k();
                }
            } catch (IOException e) {
                throw new zzid(e, AdError.SERVER_ERROR_CODE);
            }
        } catch (Throwable th) {
            this.f19761e = null;
            if (this.f19764h) {
                this.f19764h = false;
                m7471k();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.f19762f;
    }
}
