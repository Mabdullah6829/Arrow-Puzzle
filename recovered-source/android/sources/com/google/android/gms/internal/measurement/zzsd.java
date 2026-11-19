package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p037U0.AbstractC0846b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsd implements zzsx {
    public zzsd() {
        new zzsh();
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    /* JADX INFO: renamed from: a */
    public final InputStream mo10631a(Uri uri) throws zzsi {
        File fileM10641a = zzsc.m10641a(uri);
        return new zzsl(new FileInputStream(fileM10641a), fileM10641a);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    /* JADX INFO: renamed from: b */
    public final boolean mo10632b(Uri uri) {
        return zzsc.m10641a(uri).exists();
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    /* JADX INFO: renamed from: c */
    public final File mo10633c(Uri uri) {
        return zzsc.m10641a(uri);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    /* JADX INFO: renamed from: d */
    public final OutputStream mo10642d(Uri uri) throws IOException {
        File fileM10641a = zzsc.m10641a(uri);
        AbstractC0846b.m1748g(fileM10641a);
        return new zzsm(new FileOutputStream(fileM10641a), fileM10641a);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    /* JADX INFO: renamed from: e */
    public final void mo10643e(Uri uri) throws IOException {
        File fileM10641a = zzsc.m10641a(uri);
        if (fileM10641a.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileM10641a.delete()) {
            return;
        }
        if (!fileM10641a.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    /* JADX INFO: renamed from: f */
    public final void mo10644f(Uri uri, Uri uri2) throws IOException {
        File fileM10641a = zzsc.m10641a(uri);
        File fileM10641a2 = zzsc.m10641a(uri2);
        AbstractC0846b.m1748g(fileM10641a2);
        if (!fileM10641a.renameTo(fileM10641a2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final String zzc() {
        return "file";
    }
}
