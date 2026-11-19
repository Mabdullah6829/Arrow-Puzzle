package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzin extends zzhj {

    /* JADX INFO: renamed from: e */
    public final Context f20004e;

    /* JADX INFO: renamed from: f */
    public zzhv f20005f;

    /* JADX INFO: renamed from: g */
    public AssetFileDescriptor f20006g;

    /* JADX INFO: renamed from: h */
    public FileInputStream f20007h;

    /* JADX INFO: renamed from: i */
    public long f20008i;

    /* JADX INFO: renamed from: j */
    public boolean f20009j;

    public zzin(Context context) {
        super(false);
        this.f20004e = context.getApplicationContext();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    /* JADX INFO: renamed from: b */
    public final int mo4082b(byte[] bArr, int i2, int i3) throws zzim {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f20008i;
        if (j2 != 0) {
            if (j2 != -1) {
                try {
                    i3 = (int) Math.min(j2, i3);
                } catch (IOException e) {
                    throw new zzim(null, e, AdError.SERVER_ERROR_CODE);
                }
            }
            FileInputStream fileInputStream = this.f20007h;
            String str = zzfm.f16091a;
            int i4 = fileInputStream.read(bArr, i2, i3);
            if (i4 != -1) {
                long j3 = this.f20008i;
                if (j3 != -1) {
                    this.f20008i = j3 - ((long) i4);
                }
                m7470i(i4);
                return i4;
            }
            if (this.f20008i != -1) {
                throw new zzim("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: c */
    public final long mo5494c(zzhv zzhvVar) throws zzim {
        Resources resourcesForApplication;
        int identifier;
        Resources resources;
        long size;
        this.f20005f = zzhvVar;
        m7468f(zzhvVar);
        Uri uri = zzhvVar.f19195a;
        long j2 = zzhvVar.f19197c;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f20004e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                int size2 = pathSegments.size();
                throw new zzim(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(size2).length() + 61), "rawresource:// URI must have exactly one path element, found ", size2), null, AdError.SERVER_ERROR_CODE);
            }
            try {
                identifier = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new zzim("Resource identifier must be an integer.", null, PointerIconCompat.TYPE_WAIT);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                String scheme = uriNormalizeScheme.getScheme();
                throw new zzim(AbstractC1456a.m2450q(new StringBuilder(String.valueOf(scheme).length() + 62), "Unsupported URI scheme (", scheme, "). Only android.resource is supported."), null, PointerIconCompat.TYPE_WAIT);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new zzim("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new zzim("Resource identifier must be an integer.", null, PointerIconCompat.TYPE_WAIT);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(AbstractC1456a.m2450q(new StringBuilder(packageName.length() + 1 + path.length()), packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new zzim("Resource not found.", null, 2005);
                }
            }
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new zzim("Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme)), null, AdError.SERVER_ERROR_CODE);
            }
            this.f20006g = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f20006g.getFileDescriptor());
            this.f20007h = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new zzim(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                long startOffset = this.f20006g.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new zzim(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f20008i = -1L;
                        size = -1;
                    } else {
                        size = channel.size() - channel.position();
                        this.f20008i = size;
                        if (size < 0) {
                            throw new zzim(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                } else {
                    size = length - jSkip;
                    this.f20008i = size;
                    if (size < 0) {
                        throw new zzhs();
                    }
                }
                long j3 = zzhvVar.f19198d;
                if (j3 != -1) {
                    this.f20008i = size == -1 ? j3 : Math.min(size, j3);
                }
                this.f20009j = true;
                m7469h(zzhvVar);
                return j3 != -1 ? j3 : this.f20008i;
            } catch (zzim e2) {
                throw e2;
            } catch (IOException e3) {
                throw new zzim(null, e3, AdError.SERVER_ERROR_CODE);
            }
        } catch (Resources.NotFoundException e4) {
            throw new zzim(null, e4, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: d */
    public final void mo5495d() {
        this.f20005f = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.f20007h;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.f20007h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f20006g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f20006g = null;
                        if (this.f20009j) {
                            this.f20009j = false;
                            m7471k();
                        }
                    } catch (IOException e) {
                        throw new zzim(null, e, AdError.SERVER_ERROR_CODE);
                    }
                } catch (IOException e2) {
                    throw new zzim(null, e2, AdError.SERVER_ERROR_CODE);
                }
            } catch (Throwable th) {
                this.f20007h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f20006g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f20006g = null;
                    if (this.f20009j) {
                        this.f20009j = false;
                        m7471k();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new zzim(null, e3, AdError.SERVER_ERROR_CODE);
                }
            }
        } catch (Throwable th2) {
            this.f20006g = null;
            if (this.f20009j) {
                this.f20009j = false;
                m7471k();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        zzhv zzhvVar = this.f20005f;
        if (zzhvVar != null) {
            return zzhvVar.f19195a;
        }
        return null;
    }
}
