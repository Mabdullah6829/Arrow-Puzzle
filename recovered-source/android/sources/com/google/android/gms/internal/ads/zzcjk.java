package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcjk extends zzcjh {

    /* JADX INFO: renamed from: x */
    public static final Set f10228x = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: y */
    public static final DecimalFormat f10229y = new DecimalFormat("#,###");

    /* JADX INFO: renamed from: v */
    public File f10230v;

    /* JADX INFO: renamed from: w */
    public boolean f10231w;

    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    /* JADX WARN: Code duplicated, block: B:194:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:198:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:199:0x0504  */
    /* JADX WARN: Code duplicated, block: B:202:0x0524  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v24, types: [int] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.google.android.gms.internal.ads.zzcjh, com.google.android.gms.internal.ads.zzcjk] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.nio.channels.ReadableByteChannel] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.zzcjh
    /* JADX INFO: renamed from: f */
    public final boolean mo5505f(String str) {
        int i2;
        String str2;
        String str3;
        String str4;
        String string;
        String str5;
        FileOutputStream fileOutputStream;
        ?? r6;
        ?? r2;
        String str6;
        String str7;
        FileOutputStream fileOutputStream2;
        ?? r7;
        ?? r3;
        String str8;
        String str9;
        String str10;
        String str11;
        ?? r4;
        ?? r8;
        String string2;
        int i3;
        int i4;
        boolean zDelete;
        boolean zDelete2;
        String str12 = str;
        String str13 = " at ";
        String str14 = "HTTP status code ";
        if (this.f10230v == null) {
            m5513p(str12, null, "noCacheDir", null);
            return false;
        }
        while (true) {
            File file = this.f10230v;
            if (file == null) {
                i2 = 0;
            } else {
                File[] fileArrListFiles = file.listFiles();
                int length = fileArrListFiles.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    int i7 = i5;
                    int i8 = length;
                    if (!fileArrListFiles[i5].getName().endsWith(".done")) {
                        i6++;
                    }
                    i5 = i7 + 1;
                    length = i8;
                }
                i2 = i6;
            }
            zzbio zzbioVar = zzbix.f8843y;
            String str15 = str13;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            String str16 = str14;
            if (i2 > ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue()) {
                File file2 = this.f10230v;
                if (file2 == null) {
                    zDelete2 = false;
                } else {
                    File[] fileArrListFiles2 = file2.listFiles();
                    int length2 = fileArrListFiles2.length;
                    long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
                    int i9 = 0;
                    File file3 = null;
                    while (i9 < length2) {
                        File file4 = fileArrListFiles2[i9];
                        int i10 = i9;
                        int i11 = length2;
                        if (!file4.getName().endsWith(".done")) {
                            long jLastModified = file4.lastModified();
                            if (jLastModified < j2) {
                                file3 = file4;
                                j2 = jLastModified;
                            }
                        }
                        i9 = i10 + 1;
                        length2 = i11;
                    }
                    if (file3 != null) {
                        zDelete = file3.delete();
                        zzfzv zzfzvVar = zzfzu.f16872a;
                        File file5 = this.f10230v;
                        String strConcat = String.valueOf(file3.getName()).concat(".done");
                        zzfzvVar.getClass();
                        File file6 = new File(zzfzv.m6833a(file5, strConcat));
                        if (file6.isFile()) {
                            zDelete2 = zDelete & file6.delete();
                        }
                    } else {
                        zDelete2 = false;
                    }
                }
                if (!zDelete2) {
                    zDelete2 = zDelete;
                    int i12 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Unable to expire stream cache");
                    m5513p(str12, null, "expireFailed", null);
                    return false;
                }
                zDelete2 = zDelete;
                str13 = str15;
                str14 = str16;
            } else {
                String strM3035d = com.google.android.gms.ads.internal.util.client.zzf.m3035d(str12, "MD5");
                zzfzv zzfzvVar2 = zzfzu.f16872a;
                File file7 = this.f10230v;
                zzfzvVar2.getClass();
                File file8 = new File(zzfzv.m6833a(file7, strM3035d));
                zzfzv zzfzvVar3 = zzfzu.f16872a;
                File file9 = this.f10230v;
                String strConcat2 = String.valueOf(file8.getName()).concat(".done");
                zzfzvVar3.getClass();
                File file10 = new File(zzfzv.m6833a(file9, strConcat2));
                if (file8.isFile() && file10.isFile()) {
                    int length3 = (int) file8.length();
                    String strValueOf = String.valueOf(str12);
                    int i13 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3068a("Stream cache hit at ".concat(strValueOf));
                    com.google.android.gms.ads.internal.util.client.zzf.f3409b.post(new zzcje(this, str12, file8.getAbsolutePath(), length3));
                    return true;
                }
                String strValueOf2 = String.valueOf(this.f10230v.getAbsolutePath());
                String strValueOf3 = String.valueOf(str12);
                Set set = f10228x;
                String strConcat3 = strValueOf2.concat(strValueOf3);
                synchronized (set) {
                    try {
                        if (set.contains(strConcat3)) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str12).length() + 36);
                            sb.append("Stream cache already in progress at ");
                            sb.append(str12);
                            String string3 = sb.toString();
                            int i14 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3073f(string3);
                            m5513p(str12, file8.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(strConcat3);
                        try {
                            zzgas zzgasVar = new zzgas();
                            str2 = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
                            try {
                                HttpURLConnection httpURLConnectionM6834c = zzgasVar.m6834c(new zzcjj(str12));
                                int responseCode = httpURLConnectionM6834c.getResponseCode();
                                if (responseCode >= 400) {
                                    String str17 = strConcat3;
                                    try {
                                        String string4 = Integer.toString(responseCode);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(string4).length() + 27);
                                        sb2.append("HTTP request failed. Code: ");
                                        sb2.append(string4);
                                        string = sb2.toString();
                                        try {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 21 + String.valueOf(str12).length());
                                            sb3.append(str16);
                                            sb3.append(responseCode);
                                            sb3.append(str15);
                                            sb3.append(str12);
                                            throw new IOException(sb3.toString());
                                        } catch (IOException | RuntimeException e) {
                                            e = e;
                                            str3 = "badUrl";
                                            str5 = str17;
                                            fileOutputStream = null;
                                            r2 = str12;
                                            r6 = str5;
                                            if (e instanceof RuntimeException) {
                                                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("VideoStreamFullFileCache.preload", e);
                                            }
                                            fileOutputStream.close();
                                            if (this.f10231w) {
                                                String strM2450q = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 26), "Preload aborted for URL \"", r2, "\"");
                                                int i15 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2450q);
                                            } else {
                                                String strM2450q2 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 25), "Preload failed for URL \"", r2, "\"");
                                                int i16 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                com.google.android.gms.ads.internal.util.client.zzo.m3074g(strM2450q2, e);
                                            }
                                            if (file8.exists()) {
                                                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not delete partial cache file at ".concat(String.valueOf(file8.getAbsolutePath())));
                                            }
                                            m5513p(r2, file8.getAbsolutePath(), str3, string);
                                            f10228x.remove(r6);
                                            return false;
                                        }
                                    } catch (IOException | RuntimeException e2) {
                                        e = e2;
                                        str3 = "badUrl";
                                        str4 = str17;
                                        string = null;
                                        str5 = str4;
                                        fileOutputStream = null;
                                        r2 = str12;
                                        r6 = str5;
                                        if (e instanceof RuntimeException) {
                                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("VideoStreamFullFileCache.preload", e);
                                        }
                                        fileOutputStream.close();
                                        if (this.f10231w) {
                                            String strM2450q3 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 26), "Preload aborted for URL \"", r2, "\"");
                                            int i17 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                            com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2450q3);
                                        } else {
                                            String strM2450q4 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 25), "Preload failed for URL \"", r2, "\"");
                                            int i18 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                            com.google.android.gms.ads.internal.util.client.zzo.m3074g(strM2450q4, e);
                                        }
                                        if (file8.exists()) {
                                            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not delete partial cache file at ".concat(String.valueOf(file8.getAbsolutePath())));
                                        }
                                        m5513p(r2, file8.getAbsolutePath(), str3, string);
                                        f10228x.remove(r6);
                                        return false;
                                    }
                                }
                                int contentLength = httpURLConnectionM6834c.getContentLength();
                                if (contentLength < 0) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(str12).length() + 55);
                                    sb4.append("Stream cache aborted, missing content-length header at ");
                                    sb4.append(str12);
                                    String string5 = sb4.toString();
                                    int i19 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                    com.google.android.gms.ads.internal.util.client.zzo.m3073f(string5);
                                    m5513p(str12, file8.getAbsolutePath(), "contentLengthMissing", null);
                                    set.remove(strConcat3);
                                    return false;
                                }
                                DecimalFormat decimalFormat = f10229y;
                                String str18 = decimalFormat.format(contentLength);
                                int iIntValue = ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8860z)).intValue();
                                str3 = "File too big for full file cache. Size: ";
                                if (contentLength > iIntValue) {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(str18).length() + 33 + String.valueOf(str12).length());
                                    sb5.append("Content length ");
                                    sb5.append(str18);
                                    sb5.append(" exceeds limit at ");
                                    sb5.append(str12);
                                    String string6 = sb5.toString();
                                    int i20 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                    com.google.android.gms.ads.internal.util.client.zzo.m3073f(string6);
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(str18).length() + 40);
                                    sb6.append("File too big for full file cache. Size: ");
                                    sb6.append(str18);
                                    m5513p(str12, file8.getAbsolutePath(), "sizeExceeded", sb6.toString());
                                    set.remove(strConcat3);
                                    return false;
                                }
                                StringBuilder sb7 = new StringBuilder(String.valueOf(str18).length() + 20 + String.valueOf(str12).length());
                                sb7.append("Caching ");
                                sb7.append(str18);
                                sb7.append(" bytes from ");
                                sb7.append(str12);
                                String string7 = sb7.toString();
                                int i21 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                com.google.android.gms.ads.internal.util.client.zzo.m3068a(string7);
                                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionM6834c.getInputStream());
                                FileOutputStream fileOutputStream3 = new FileOutputStream(file8);
                                try {
                                    FileChannel channel = fileOutputStream3.getChannel();
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    try {
                                        String str19 = strConcat3;
                                        try {
                                            fileOutputStream2 = fileOutputStream3;
                                            try {
                                                com.google.android.gms.ads.internal.util.zzbu zzbuVar = new com.google.android.gms.ads.internal.util.zzbu(((Long) zzbaVar.f3098c.m5030a(zzbix.f8573i0)).longValue());
                                                long jLongValue = ((Long) zzbaVar.f3098c.m5030a(zzbix.f8556h0)).longValue();
                                                int i22 = 0;
                                                str19 = str19;
                                                ?? r9 = readableByteChannelNewChannel;
                                                while (true) {
                                                    int i23 = r9.read(byteBufferAllocate);
                                                    try {
                                                        if (i23 < 0) {
                                                            str10 = str;
                                                            str11 = str19;
                                                            fileOutputStream2.close();
                                                            if (com.google.android.gms.ads.internal.util.client.zzo.m3077j(3)) {
                                                                String str20 = decimalFormat.format(i22);
                                                                StringBuilder sb8 = new StringBuilder(String.valueOf(str20).length() + 22 + String.valueOf(str10).length());
                                                                sb8.append("Preloaded ");
                                                                sb8.append(str20);
                                                                sb8.append(" bytes from ");
                                                                sb8.append(str10);
                                                                com.google.android.gms.ads.internal.util.client.zzo.m3068a(sb8.toString());
                                                            }
                                                            file8.setReadable(true, false);
                                                            if (file10.isFile()) {
                                                                file10.setLastModified(System.currentTimeMillis());
                                                            } else {
                                                                try {
                                                                    file10.createNewFile();
                                                                } catch (IOException unused) {
                                                                }
                                                            }
                                                            com.google.android.gms.ads.internal.util.client.zzf.f3409b.post(new zzcje(this, str10, file8.getAbsolutePath(), i22));
                                                            f10228x.remove(str11);
                                                            return true;
                                                        }
                                                        int i24 = i22 + i23;
                                                        if (i24 > iIntValue) {
                                                            r4 = str;
                                                            r8 = str19;
                                                            try {
                                                                String string8 = Integer.toString(i24);
                                                                StringBuilder sb9 = new StringBuilder(String.valueOf(string8).length() + 40);
                                                                sb9.append("File too big for full file cache. Size: ");
                                                                sb9.append(string8);
                                                                string2 = sb9.toString();
                                                                try {
                                                                    throw new IOException("stream cache file size limit exceeded");
                                                                } catch (IOException | RuntimeException e3) {
                                                                    e = e3;
                                                                    str3 = "sizeExceeded";
                                                                    string = string2;
                                                                    fileOutputStream = fileOutputStream2;
                                                                    r2 = r4;
                                                                    r6 = r8;
                                                                    if (e instanceof RuntimeException) {
                                                                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("VideoStreamFullFileCache.preload", e);
                                                                    }
                                                                    fileOutputStream.close();
                                                                    if (this.f10231w) {
                                                                        String strM2450q5 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 26), "Preload aborted for URL \"", r2, "\"");
                                                                        int i110 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                                        com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2450q5);
                                                                    } else {
                                                                        String strM2450q6 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 25), "Preload failed for URL \"", r2, "\"");
                                                                        int i111 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                                        com.google.android.gms.ads.internal.util.client.zzo.m3074g(strM2450q6, e);
                                                                    }
                                                                    if (file8.exists()) {
                                                                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not delete partial cache file at ".concat(String.valueOf(file8.getAbsolutePath())));
                                                                    }
                                                                    m5513p(r2, file8.getAbsolutePath(), str3, string);
                                                                    f10228x.remove(r6);
                                                                    return false;
                                                                }
                                                            } catch (IOException | RuntimeException e4) {
                                                                e = e4;
                                                                str3 = "sizeExceeded";
                                                                fileOutputStream = fileOutputStream2;
                                                                r3 = r4;
                                                                r7 = r8;
                                                                string = null;
                                                                r2 = r3;
                                                                r6 = r7;
                                                                if (e instanceof RuntimeException) {
                                                                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("VideoStreamFullFileCache.preload", e);
                                                                }
                                                                fileOutputStream.close();
                                                                if (this.f10231w) {
                                                                    String strM2450q7 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 26), "Preload aborted for URL \"", r2, "\"");
                                                                    int i112 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                                    com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2450q7);
                                                                } else {
                                                                    String strM2450q8 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 25), "Preload failed for URL \"", r2, "\"");
                                                                    int i113 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                                    com.google.android.gms.ads.internal.util.client.zzo.m3074g(strM2450q8, e);
                                                                }
                                                                if (file8.exists()) {
                                                                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not delete partial cache file at ".concat(String.valueOf(file8.getAbsolutePath())));
                                                                }
                                                                m5513p(r2, file8.getAbsolutePath(), str3, string);
                                                                f10228x.remove(r6);
                                                                return false;
                                                            }
                                                        }
                                                        byteBufferAllocate.flip();
                                                        r8 = r9;
                                                        while (channel.write(byteBufferAllocate) > 0) {
                                                            r8 = r8;
                                                        }
                                                        byteBufferAllocate.clear();
                                                        r4 = ((System.currentTimeMillis() - jCurrentTimeMillis) > (1000 * jLongValue) ? 1 : ((System.currentTimeMillis() - jCurrentTimeMillis) == (1000 * jLongValue) ? 0 : -1));
                                                        try {
                                                            if (r4 > 0) {
                                                                r4 = str;
                                                                r8 = str19;
                                                                str3 = "downloadTimeout";
                                                                String string9 = Long.toString(jLongValue);
                                                                StringBuilder sb10 = new StringBuilder(String.valueOf(string9).length() + 29);
                                                                sb10.append("Timeout exceeded. Limit: ");
                                                                sb10.append(string9);
                                                                sb10.append(" sec");
                                                                string2 = sb10.toString();
                                                                try {
                                                                    throw new IOException("stream cache time limit exceeded");
                                                                } catch (IOException e5) {
                                                                    e = e5;
                                                                    string = string2;
                                                                    fileOutputStream = fileOutputStream2;
                                                                    r2 = r4;
                                                                    r6 = r8;
                                                                    if (e instanceof RuntimeException) {
                                                                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("VideoStreamFullFileCache.preload", e);
                                                                    }
                                                                    fileOutputStream.close();
                                                                    if (this.f10231w) {
                                                                        String strM2450q9 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 26), "Preload aborted for URL \"", r2, "\"");
                                                                        int i114 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                                        com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2450q9);
                                                                    } else {
                                                                        String strM2450q10 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 25), "Preload failed for URL \"", r2, "\"");
                                                                        int i115 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                                        com.google.android.gms.ads.internal.util.client.zzo.m3074g(strM2450q10, e);
                                                                    }
                                                                    if (file8.exists()) {
                                                                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not delete partial cache file at ".concat(String.valueOf(file8.getAbsolutePath())));
                                                                    }
                                                                    m5513p(r2, file8.getAbsolutePath(), str3, string);
                                                                    f10228x.remove(r6);
                                                                    return false;
                                                                } catch (RuntimeException e6) {
                                                                    e = e6;
                                                                    string = string2;
                                                                    fileOutputStream = fileOutputStream2;
                                                                    r2 = r4;
                                                                    r6 = r8;
                                                                    if (e instanceof RuntimeException) {
                                                                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("VideoStreamFullFileCache.preload", e);
                                                                    }
                                                                    fileOutputStream.close();
                                                                    if (this.f10231w) {
                                                                        String strM2450q11 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 26), "Preload aborted for URL \"", r2, "\"");
                                                                        int i116 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                                        com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2450q11);
                                                                    } else {
                                                                        String strM2450q12 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 25), "Preload failed for URL \"", r2, "\"");
                                                                        int i117 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                                        com.google.android.gms.ads.internal.util.client.zzo.m3074g(strM2450q12, e);
                                                                    }
                                                                    if (file8.exists()) {
                                                                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not delete partial cache file at ".concat(String.valueOf(file8.getAbsolutePath())));
                                                                    }
                                                                    m5513p(r2, file8.getAbsolutePath(), str3, string);
                                                                    f10228x.remove(r6);
                                                                    return false;
                                                                }
                                                            }
                                                            if (this.f10231w) {
                                                                throw new IOException("abort requested");
                                                            }
                                                            if (zzbuVar.m3140a()) {
                                                                String str21 = str19;
                                                                i3 = contentLength;
                                                                i4 = i24;
                                                                try {
                                                                    str11 = str21;
                                                                    str10 = str;
                                                                    try {
                                                                        try {
                                                                            com.google.android.gms.ads.internal.util.client.zzf.f3409b.post(new zzcjb(this, str10, file8.getAbsolutePath(), i4, i3));
                                                                        } catch (IOException e7) {
                                                                            e = e7;
                                                                            str9 = str10;
                                                                            str8 = str11;
                                                                        }
                                                                    } catch (RuntimeException e8) {
                                                                        e = e8;
                                                                        str9 = str10;
                                                                        str8 = str11;
                                                                    }
                                                                } catch (IOException e9) {
                                                                    e = e9;
                                                                    str9 = str;
                                                                    str8 = str21;
                                                                    fileOutputStream = fileOutputStream2;
                                                                    str3 = str2;
                                                                    r3 = str9;
                                                                    r7 = str8;
                                                                    string = null;
                                                                    r2 = r3;
                                                                    r6 = r7;
                                                                    if (e instanceof RuntimeException) {
                                                                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("VideoStreamFullFileCache.preload", e);
                                                                    }
                                                                    fileOutputStream.close();
                                                                    if (this.f10231w) {
                                                                        String strM2450q13 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 26), "Preload aborted for URL \"", r2, "\"");
                                                                        int i118 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                                        com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2450q13);
                                                                    } else {
                                                                        String strM2450q14 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 25), "Preload failed for URL \"", r2, "\"");
                                                                        int i119 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                                        com.google.android.gms.ads.internal.util.client.zzo.m3074g(strM2450q14, e);
                                                                    }
                                                                    if (file8.exists()) {
                                                                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not delete partial cache file at ".concat(String.valueOf(file8.getAbsolutePath())));
                                                                    }
                                                                    m5513p(r2, file8.getAbsolutePath(), str3, string);
                                                                    f10228x.remove(r6);
                                                                    return false;
                                                                } catch (RuntimeException e10) {
                                                                    e = e10;
                                                                    str9 = str;
                                                                    str8 = str21;
                                                                    fileOutputStream = fileOutputStream2;
                                                                    str3 = str2;
                                                                    r3 = str9;
                                                                    r7 = str8;
                                                                    string = null;
                                                                    r2 = r3;
                                                                    r6 = r7;
                                                                    if (e instanceof RuntimeException) {
                                                                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("VideoStreamFullFileCache.preload", e);
                                                                    }
                                                                    fileOutputStream.close();
                                                                    if (this.f10231w) {
                                                                        String strM2450q15 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 26), "Preload aborted for URL \"", r2, "\"");
                                                                        int i1110 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                                        com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2450q15);
                                                                    } else {
                                                                        String strM2450q16 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 25), "Preload failed for URL \"", r2, "\"");
                                                                        int i1111 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                                        com.google.android.gms.ads.internal.util.client.zzo.m3074g(strM2450q16, e);
                                                                    }
                                                                    if (file8.exists()) {
                                                                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not delete partial cache file at ".concat(String.valueOf(file8.getAbsolutePath())));
                                                                    }
                                                                    m5513p(r2, file8.getAbsolutePath(), str3, string);
                                                                    f10228x.remove(r6);
                                                                    return false;
                                                                }
                                                            } else {
                                                                str11 = str19;
                                                                i3 = contentLength;
                                                                i4 = i24;
                                                            }
                                                            i22 = i4;
                                                            contentLength = i3;
                                                            str19 = str11;
                                                            iIntValue = iIntValue;
                                                            r9 = r8;
                                                        } catch (IOException e11) {
                                                            e = e11;
                                                            fileOutputStream = fileOutputStream2;
                                                            r3 = r4;
                                                            r7 = r8;
                                                            string = null;
                                                            r2 = r3;
                                                            r6 = r7;
                                                            if (e instanceof RuntimeException) {
                                                                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("VideoStreamFullFileCache.preload", e);
                                                            }
                                                            fileOutputStream.close();
                                                            if (this.f10231w) {
                                                                String strM2450q17 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 26), "Preload aborted for URL \"", r2, "\"");
                                                                int i1112 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                                com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2450q17);
                                                            } else {
                                                                String strM2450q18 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 25), "Preload failed for URL \"", r2, "\"");
                                                                int i1113 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                                com.google.android.gms.ads.internal.util.client.zzo.m3074g(strM2450q18, e);
                                                            }
                                                            if (file8.exists()) {
                                                                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not delete partial cache file at ".concat(String.valueOf(file8.getAbsolutePath())));
                                                            }
                                                            m5513p(r2, file8.getAbsolutePath(), str3, string);
                                                            f10228x.remove(r6);
                                                            return false;
                                                        } catch (RuntimeException e12) {
                                                            e = e12;
                                                            fileOutputStream = fileOutputStream2;
                                                            r3 = r4;
                                                            r7 = r8;
                                                            string = null;
                                                            r2 = r3;
                                                            r6 = r7;
                                                            if (e instanceof RuntimeException) {
                                                                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("VideoStreamFullFileCache.preload", e);
                                                            }
                                                            fileOutputStream.close();
                                                            if (this.f10231w) {
                                                                String strM2450q19 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 26), "Preload aborted for URL \"", r2, "\"");
                                                                int i1114 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                                com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2450q19);
                                                            } else {
                                                                String strM2450q110 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 25), "Preload failed for URL \"", r2, "\"");
                                                                int i1115 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                                com.google.android.gms.ads.internal.util.client.zzo.m3074g(strM2450q110, e);
                                                            }
                                                            if (file8.exists()) {
                                                                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not delete partial cache file at ".concat(String.valueOf(file8.getAbsolutePath())));
                                                            }
                                                            m5513p(r2, file8.getAbsolutePath(), str3, string);
                                                            f10228x.remove(r6);
                                                            return false;
                                                        }
                                                        if (e instanceof RuntimeException) {
                                                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("VideoStreamFullFileCache.preload", e);
                                                        }
                                                        fileOutputStream.close();
                                                        if (this.f10231w) {
                                                            String strM2450q111 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 26), "Preload aborted for URL \"", r2, "\"");
                                                            int i1116 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                            com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2450q111);
                                                        } else {
                                                            String strM2450q112 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 25), "Preload failed for URL \"", r2, "\"");
                                                            int i1117 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                            com.google.android.gms.ads.internal.util.client.zzo.m3074g(strM2450q112, e);
                                                        }
                                                        if (file8.exists() && !file8.delete()) {
                                                            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not delete partial cache file at ".concat(String.valueOf(file8.getAbsolutePath())));
                                                        }
                                                        m5513p(r2, file8.getAbsolutePath(), str3, string);
                                                        f10228x.remove(r6);
                                                        return false;
                                                        fileOutputStream.close();
                                                    } catch (IOException | NullPointerException unused2) {
                                                    }
                                                    fileOutputStream = fileOutputStream2;
                                                    str3 = str2;
                                                    r3 = str9;
                                                    r7 = str8;
                                                    string = null;
                                                    r2 = r3;
                                                    r6 = r7;
                                                    if (e instanceof RuntimeException) {
                                                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("VideoStreamFullFileCache.preload", e);
                                                    }
                                                    if (this.f10231w) {
                                                        String strM2450q113 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 26), "Preload aborted for URL \"", r2, "\"");
                                                        int i1118 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                        com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2450q113);
                                                    } else {
                                                        String strM2450q114 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 25), "Preload failed for URL \"", r2, "\"");
                                                        int i1119 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                                        com.google.android.gms.ads.internal.util.client.zzo.m3074g(strM2450q114, e);
                                                    }
                                                    if (file8.exists()) {
                                                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not delete partial cache file at ".concat(String.valueOf(file8.getAbsolutePath())));
                                                    }
                                                    m5513p(r2, file8.getAbsolutePath(), str3, string);
                                                    f10228x.remove(r6);
                                                    return false;
                                                }
                                            } catch (IOException e13) {
                                                e = e13;
                                                str9 = str;
                                                str8 = str19;
                                            } catch (RuntimeException e14) {
                                                e = e14;
                                                str9 = str;
                                                str8 = str19;
                                            }
                                        } catch (IOException | RuntimeException e15) {
                                            e = e15;
                                            str7 = str;
                                            str6 = str19;
                                            fileOutputStream2 = fileOutputStream3;
                                            str9 = str7;
                                            str8 = str6;
                                        }
                                    } catch (IOException | RuntimeException e16) {
                                        e = e16;
                                        str12 = str;
                                        str6 = strConcat3;
                                        str7 = str12;
                                        fileOutputStream2 = fileOutputStream3;
                                        str9 = str7;
                                        str8 = str6;
                                        fileOutputStream = fileOutputStream2;
                                        str3 = str2;
                                        r3 = str9;
                                        r7 = str8;
                                        string = null;
                                        r2 = r3;
                                        r6 = r7;
                                        if (e instanceof RuntimeException) {
                                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("VideoStreamFullFileCache.preload", e);
                                        }
                                        fileOutputStream.close();
                                        if (this.f10231w) {
                                            String strM2450q115 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 26), "Preload aborted for URL \"", r2, "\"");
                                            int i11110 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                            com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2450q115);
                                        } else {
                                            String strM2450q116 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 25), "Preload failed for URL \"", r2, "\"");
                                            int i11111 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                            com.google.android.gms.ads.internal.util.client.zzo.m3074g(strM2450q116, e);
                                        }
                                        if (file8.exists()) {
                                            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not delete partial cache file at ".concat(String.valueOf(file8.getAbsolutePath())));
                                        }
                                        m5513p(r2, file8.getAbsolutePath(), str3, string);
                                        f10228x.remove(r6);
                                        return false;
                                    }
                                } catch (IOException e17) {
                                    e = e17;
                                } catch (RuntimeException e18) {
                                    e = e18;
                                }
                            } catch (IOException e19) {
                                e = e19;
                                str3 = str2;
                                str4 = strConcat3;
                                string = null;
                                str5 = str4;
                                fileOutputStream = null;
                                r2 = str12;
                                r6 = str5;
                                if (e instanceof RuntimeException) {
                                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("VideoStreamFullFileCache.preload", e);
                                }
                                fileOutputStream.close();
                                if (this.f10231w) {
                                    String strM2450q117 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 26), "Preload aborted for URL \"", r2, "\"");
                                    int i11112 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                    com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2450q117);
                                } else {
                                    String strM2450q118 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 25), "Preload failed for URL \"", r2, "\"");
                                    int i11113 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                    com.google.android.gms.ads.internal.util.client.zzo.m3074g(strM2450q118, e);
                                }
                                if (file8.exists()) {
                                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not delete partial cache file at ".concat(String.valueOf(file8.getAbsolutePath())));
                                }
                                m5513p(r2, file8.getAbsolutePath(), str3, string);
                                f10228x.remove(r6);
                                return false;
                            } catch (RuntimeException e20) {
                                e = e20;
                                str3 = str2;
                                str4 = strConcat3;
                                string = null;
                                str5 = str4;
                                fileOutputStream = null;
                                r2 = str12;
                                r6 = str5;
                                if (e instanceof RuntimeException) {
                                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("VideoStreamFullFileCache.preload", e);
                                }
                                fileOutputStream.close();
                                if (this.f10231w) {
                                    String strM2450q119 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 26), "Preload aborted for URL \"", r2, "\"");
                                    int i11114 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                    com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2450q119);
                                } else {
                                    String strM2450q1110 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf((Object) r2).length() + 25), "Preload failed for URL \"", r2, "\"");
                                    int i11115 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                    com.google.android.gms.ads.internal.util.client.zzo.m3074g(strM2450q1110, e);
                                }
                                if (file8.exists()) {
                                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not delete partial cache file at ".concat(String.valueOf(file8.getAbsolutePath())));
                                }
                                m5513p(r2, file8.getAbsolutePath(), str3, string);
                                f10228x.remove(r6);
                                return false;
                            }
                        } catch (IOException | RuntimeException e21) {
                            e = e21;
                            str2 = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    /* JADX INFO: renamed from: o */
    public final void mo5512o() {
        this.f10231w = true;
    }
}
