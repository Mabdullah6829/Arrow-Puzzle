package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsm extends zzso implements zzsf {

    /* JADX INFO: renamed from: s */
    public final FileOutputStream f22866s;

    /* JADX INFO: renamed from: t */
    public final File f22867t;

    public zzsm(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f22866s = fileOutputStream;
        this.f22867t = file;
    }

    @Override // com.google.android.gms.internal.measurement.zzsf
    public final File zza() {
        return this.f22867t;
    }
}
