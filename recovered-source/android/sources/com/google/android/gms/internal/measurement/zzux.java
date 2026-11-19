package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzux {
    /* JADX INFO: renamed from: a */
    public static IOException m10666a(zzru zzruVar, Uri uri, IOException iOException, String str) {
        try {
            zzsr zzsrVarM10646b = zzsr.m10646b();
            zzsrVarM10646b.f22869a = true;
            File file = (File) zzruVar.m10629a(uri, zzsrVarM10646b);
            if (!file.exists()) {
                return m10667b(file, iOException, str);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    return file.canWrite() ? m10667b(file, iOException, str) : m10667b(file, iOException, str);
                }
                return file.canWrite() ? m10667b(file, iOException, str) : m10667b(file, iOException, str);
            }
            if (file.canRead()) {
                return file.canWrite() ? m10667b(file, iOException, str) : m10667b(file, iOException, str);
            }
            return file.canWrite() ? m10667b(file, iOException, str) : m10667b(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    /* JADX INFO: renamed from: b */
    public static IOException m10667b(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return m10668c(file, iOException, str);
        }
        if (!parentFile.exists()) {
            return m10668c(file, iOException, str);
        }
        if (parentFile.isDirectory()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? m10668c(file, iOException, str) : m10668c(file, iOException, str);
            }
            return parentFile.canWrite() ? m10668c(file, iOException, str) : m10668c(file, iOException, str);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? m10668c(file, iOException, str) : m10668c(file, iOException, str);
        }
        return parentFile.canWrite() ? m10668c(file, iOException, str) : m10668c(file, iOException, str);
    }

    /* JADX INFO: renamed from: c */
    public static IOException m10668c(File file, IOException iOException, String str) {
        String strConcat;
        try {
            Locale locale = Locale.US;
            String str2 = " canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + "]";
            StringBuilder sb = new StringBuilder(str2.length() + 16);
            sb.append("Inoperable file:");
            sb.append(str2);
            strConcat = sb.toString();
            try {
                String str3 = " mode[" + Os.stat(file.getCanonicalPath()).st_mode + "]";
                StringBuilder sb2 = new StringBuilder(strConcat.length() + str3.length());
                sb2.append(strConcat);
                sb2.append(str3);
                strConcat = sb2.toString();
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }
}
