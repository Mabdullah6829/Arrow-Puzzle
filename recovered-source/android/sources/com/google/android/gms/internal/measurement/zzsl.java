package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsl extends zzsn implements zzsf {

    /* JADX INFO: renamed from: s */
    public final File f22865s;

    public zzsl(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.f22865s = file;
    }

    @Override // com.google.android.gms.internal.measurement.zzsf
    public final File zza() {
        return this.f22865s;
    }
}
