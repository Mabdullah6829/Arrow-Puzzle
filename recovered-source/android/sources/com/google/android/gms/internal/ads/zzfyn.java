package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfyn {
    /* JADX INFO: renamed from: a */
    public static boolean m6786a(zzbdz zzbdzVar) {
        int iOrdinal = zzbdzVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0032  */
    /* JADX INFO: renamed from: b */
    public static final zzbdz m6787b(Context context, zzfxq zzfxqVar) {
        zzbdz zzbdzVar;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        boolean zExists = file.exists();
        zzbdz zzbdzVar2 = zzbdz.X86;
        zzbdz zzbdzVar3 = zzbdz.ARM7;
        zzbdz zzbdzVar4 = zzbdz.X86_64;
        zzbdz zzbdzVar5 = zzbdz.ARM64;
        zzbdz zzbdzVar6 = zzbdz.RISCV64;
        zzbdz zzbdzVar7 = zzbdz.UNKNOWN;
        zzbdz zzbdzVar8 = zzbdz.UNSUPPORTED;
        if (zExists) {
            File[] fileArrListFiles = file.listFiles(new zzhab(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (zzfxqVar != null) {
                    zzfxqVar.mo6763d(5017, "No .so");
                } else {
                    zzfxqVar = null;
                }
                zzbdzVar = zzbdzVar7;
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                m6788c(bArr, null, zzfxqVar);
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s2 = ByteBuffer.wrap(bArr2).getShort();
                                if (s2 == 3) {
                                    zzbdzVar = zzbdzVar2;
                                } else if (s2 == 40) {
                                    zzbdzVar = zzbdzVar3;
                                } else if (s2 == 62) {
                                    zzbdzVar = zzbdzVar4;
                                } else if (s2 == 183) {
                                    zzbdzVar = zzbdzVar5;
                                } else if (s2 != 243) {
                                    m6788c(bArr, null, zzfxqVar);
                                    zzbdzVar = zzbdzVar8;
                                } else {
                                    zzbdzVar = zzbdzVar6;
                                }
                                fileInputStream.close();
                            }
                        }
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    m6788c(null, e.toString(), zzfxqVar);
                }
                zzbdzVar = zzbdzVar8;
            }
        } else {
            if (zzfxqVar != null) {
                zzfxqVar.mo6763d(5017, "No lib/");
            } else {
                zzfxqVar = null;
            }
            zzbdzVar = zzbdzVar7;
        }
        if (zzbdzVar == zzbdzVar7) {
            HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
            String property = System.getProperty("os.arch");
            if (TextUtils.isEmpty(property) || !hashSet.contains(property)) {
                try {
                    String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                    if (strArr == null || strArr.length <= 0) {
                        property = Build.CPU_ABI;
                        if (property == null) {
                            property = Build.CPU_ABI2;
                        }
                    } else {
                        property = strArr[0];
                    }
                } catch (IllegalAccessException e2) {
                    if (zzfxqVar != null) {
                        zzfxqVar.mo6762c(2024, 0L, e2);
                    }
                } catch (NoSuchFieldException e3) {
                    if (zzfxqVar != null) {
                        zzfxqVar.mo6762c(2024, 0L, e3);
                    }
                }
            }
            if (TextUtils.isEmpty(property)) {
                m6788c(null, "Empty dev arch", zzfxqVar);
            } else if (!property.equalsIgnoreCase("i686") && !property.equalsIgnoreCase("x86")) {
                if (property.equalsIgnoreCase("x86_64")) {
                    zzbdzVar2 = zzbdzVar4;
                } else if (property.equalsIgnoreCase("arm64-v8a")) {
                    zzbdzVar2 = zzbdzVar5;
                } else if (property.equalsIgnoreCase("armeabi-v7a") || property.equalsIgnoreCase("armv71")) {
                    zzbdzVar2 = zzbdzVar3;
                } else if (property.equalsIgnoreCase("riscv64")) {
                    zzbdzVar2 = zzbdzVar6;
                } else {
                    m6788c(null, property, zzfxqVar);
                }
            }
            zzbdzVar2 = zzbdzVar8;
        } else {
            zzbdzVar2 = zzbdzVar;
        }
        if (zzfxqVar != null) {
            zzfxqVar.mo6763d(5018, zzbdzVar2.name());
        }
        return zzbdzVar2;
    }

    /* JADX INFO: renamed from: c */
    public static final void m6788c(byte[] bArr, String str, zzfxq zzfxqVar) {
        if (zzfxqVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(System.getProperty("os.arch"));
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfxqVar.mo6763d(4007, sb.toString());
    }
}
