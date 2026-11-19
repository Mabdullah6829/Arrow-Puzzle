package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzho extends zzhj {

    /* JADX INFO: renamed from: e */
    public final ContentResolver f19036e;

    /* JADX INFO: renamed from: f */
    public Uri f19037f;

    /* JADX INFO: renamed from: g */
    public AssetFileDescriptor f19038g;

    /* JADX INFO: renamed from: h */
    public FileInputStream f19039h;

    /* JADX INFO: renamed from: i */
    public long f19040i;

    /* JADX INFO: renamed from: j */
    public boolean f19041j;

    public zzho(Context context) {
        super(false);
        this.f19036e = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    /* JADX INFO: renamed from: b */
    public final int mo4082b(byte[] bArr, int i2, int i3) throws zzhn {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f19040i;
        if (j2 != 0) {
            if (j2 != -1) {
                try {
                    i3 = (int) Math.min(j2, i3);
                } catch (IOException e) {
                    throw new zzhn(e, AdError.SERVER_ERROR_CODE);
                }
            }
            FileInputStream fileInputStream = this.f19039h;
            String str = zzfm.f16091a;
            int i4 = fileInputStream.read(bArr, i2, i3);
            if (i4 != -1) {
                long j3 = this.f19040i;
                if (j3 != -1) {
                    this.f19040i = j3 - ((long) i4);
                }
                m7470i(i4);
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: c */
    public final long mo5494c(zzhv zzhvVar) throws zzhn {
        int i2;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uri = zzhvVar.f19195a;
                long j2 = zzhvVar.f19197c;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f19037f = uriNormalizeScheme;
                m7468f(zzhvVar);
                boolean zEquals = Objects.equals(uriNormalizeScheme.getScheme(), FirebaseAnalytics.Param.CONTENT);
                ContentResolver contentResolver = this.f19036e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f19038g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    String strValueOf = String.valueOf(uriNormalizeScheme);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
                    sb.append("Could not open file descriptor for: ");
                    sb.append(strValueOf);
                    IOException iOException = new IOException(sb.toString());
                    i2 = AdError.SERVER_ERROR_CODE;
                    try {
                        throw new zzhn(iOException, AdError.SERVER_ERROR_CODE);
                    } catch (IOException e) {
                        e = e;
                        throw new zzhn(e, true != (e instanceof FileNotFoundException) ? i2 : 2005);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f19039h = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new zzhn(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new zzhn(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f19040i = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.f19040i = jPosition;
                        if (jPosition < 0) {
                            throw new zzhn(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.f19040i = jPosition;
                    if (jPosition < 0) {
                        throw new zzhn(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
                long j3 = zzhvVar.f19198d;
                if (j3 != -1) {
                    this.f19040i = jPosition == -1 ? j3 : Math.min(jPosition, j3);
                }
                this.f19041j = true;
                m7469h(zzhvVar);
                return j3 != -1 ? j3 : this.f19040i;
            } catch (zzhn e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i2 = AdError.SERVER_ERROR_CODE;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: d */
    public final void mo5495d() {
        this.f19037f = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.f19039h;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.f19039h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f19038g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f19038g = null;
                        if (this.f19041j) {
                            this.f19041j = false;
                            m7471k();
                        }
                    } catch (IOException e) {
                        throw new zzhn(e, AdError.SERVER_ERROR_CODE);
                    }
                } catch (IOException e2) {
                    throw new zzhn(e2, AdError.SERVER_ERROR_CODE);
                }
            } catch (Throwable th) {
                this.f19039h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f19038g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f19038g = null;
                    if (this.f19041j) {
                        this.f19041j = false;
                        m7471k();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new zzhn(e3, AdError.SERVER_ERROR_CODE);
                }
            }
        } catch (Throwable th2) {
            this.f19038g = null;
            if (this.f19041j) {
                this.f19041j = false;
                m7471k();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.f19037f;
    }
}
