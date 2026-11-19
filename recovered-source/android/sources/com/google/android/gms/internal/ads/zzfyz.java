package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfyz {

    /* JADX INFO: renamed from: a */
    public final zzbei f16824a;

    /* JADX INFO: renamed from: b */
    public final File f16825b;

    /* JADX INFO: renamed from: c */
    public final File f16826c;

    /* JADX INFO: renamed from: d */
    public final File f16827d;

    /* JADX INFO: renamed from: e */
    public byte[] f16828e;

    public zzfyz(zzbei zzbeiVar, File file, File file2, File file3) {
        this.f16824a = zzbeiVar;
        this.f16825b = file;
        this.f16826c = file3;
        this.f16827d = file2;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m6799a() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrM8151a;
        FileInputStream fileInputStream2 = null;
        if (this.f16828e == null) {
            try {
                fileInputStream = new FileInputStream(this.f16827d);
                try {
                    zzidl zzidlVar = zzidl.f19719t;
                    ArrayList arrayList = new ArrayList();
                    int iMin = 256;
                    while (true) {
                        byte[] bArr = new byte[iMin];
                        int i2 = 0;
                        while (i2 < iMin) {
                            int i3 = fileInputStream.read(bArr, i2, iMin - i2);
                            if (i3 == -1) {
                                break;
                            }
                            i2 += i3;
                        }
                        zzidl zzidlVarM8149y = i2 == 0 ? null : zzidl.m8149y(bArr, 0, i2);
                        if (zzidlVarM8149y == null) {
                            break;
                        }
                        arrayList.add(zzidlVarM8149y);
                        iMin = Math.min(iMin + iMin, 8192);
                    }
                    bArrM8151a = zzidl.m8145B(arrayList).m8151a();
                    IOUtils.m3649a(fileInputStream);
                } catch (IOException unused) {
                    IOUtils.m3649a(fileInputStream);
                    bArrM8151a = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    IOUtils.m3649a(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.f16828e = bArrM8151a;
        }
        byte[] bArr2 = this.f16828e;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }
}
