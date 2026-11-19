package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhaa {
    /* JADX INFO: renamed from: a */
    public static void m7287a(File file, byte[] bArr) throws IOException {
        new zzgzp();
        file.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file, zzgxd.m7242s(new zzgzx[0]).contains(zzgzx.f18411s));
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7288b(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7289c(File file, File file2) throws Throwable {
        file.getClass();
        file2.getClass();
        if (file.equals(file2)) {
            throw new IllegalArgumentException(zzgui.m7149b("Source %s and destination %s must be different", file, file2));
        }
        if (file.renameTo(file2)) {
            return;
        }
        if (file.equals(file2)) {
            throw new IllegalArgumentException(zzgui.m7149b("Source %s and destination %s must be different", file, file2));
        }
        zzgzz zzgzzVar = new zzgzz(file);
        new zzgzp();
        zzgxd zzgxdVarM7242s = zzgxd.m7242s(new zzgzx[0]);
        zzgzw zzgzwVar = new zzgzw();
        ArrayDeque arrayDeque = zzgzwVar.f18409s;
        try {
            FileInputStream fileInputStream = new FileInputStream(zzgzzVar.f18413a);
            arrayDeque.addFirst(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(file2, zzgxdVarM7242s.contains(zzgzx.f18411s));
            arrayDeque.addFirst(fileOutputStream);
            int i2 = zzgzt.f18406a;
            byte[] bArr = new byte[8192];
            while (true) {
                int i3 = fileInputStream.read(bArr);
                if (i3 == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, i3);
                }
            }
            zzgzwVar.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th) {
            try {
                zzgzwVar.f18410t = th;
                Object obj = zzgun.f18209a;
                if (IOException.class.isInstance(th)) {
                    throw ((Throwable) IOException.class.cast(th));
                }
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                if (!(th instanceof Error)) {
                    throw new RuntimeException(th);
                }
                throw ((Error) th);
            } catch (Throwable th2) {
                zzgzwVar.close();
                throw th2;
            }
        }
    }
}
