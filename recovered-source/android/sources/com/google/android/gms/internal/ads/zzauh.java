package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzauh implements zzasv {

    /* JADX INFO: renamed from: c */
    public final zzaug f6947c;

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f6945a = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: b */
    public long f6946b = 0;

    /* JADX INFO: renamed from: d */
    public final int f6948d = 5242880;

    public zzauh(zzaug zzaugVar) {
        this.f6947c = zzaugVar;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m4411b(zzauf zzaufVar, long j2) throws IOException {
        long j3 = zzaufVar.f6943s - zzaufVar.f6944t;
        if (j2 >= 0 && j2 <= j3) {
            int i2 = (int) j2;
            if (i2 == j2) {
                byte[] bArr = new byte[i2];
                new DataInputStream(zzaufVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 33 + String.valueOf(j3).length());
        AbstractC1456a.m2456w(sb, "streamToBytes length=", j2, ", maxLength=");
        sb.append(j3);
        throw new IOException(sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public static void m4412c(BufferedOutputStream bufferedOutputStream, int i2) throws IOException {
        bufferedOutputStream.write(i2 & 255);
        bufferedOutputStream.write((i2 >> 8) & 255);
        bufferedOutputStream.write((i2 >> 16) & 255);
        bufferedOutputStream.write((i2 >> 24) & 255);
    }

    /* JADX INFO: renamed from: d */
    public static int m4413d(InputStream inputStream) {
        return (m4418j(inputStream) << 24) | m4418j(inputStream) | (m4418j(inputStream) << 8) | (m4418j(inputStream) << 16);
    }

    /* JADX INFO: renamed from: e */
    public static void m4414e(BufferedOutputStream bufferedOutputStream, long j2) throws IOException {
        bufferedOutputStream.write((byte) j2);
        bufferedOutputStream.write((byte) (j2 >>> 8));
        bufferedOutputStream.write((byte) (j2 >>> 16));
        bufferedOutputStream.write((byte) (j2 >>> 24));
        bufferedOutputStream.write((byte) (j2 >>> 32));
        bufferedOutputStream.write((byte) (j2 >>> 40));
        bufferedOutputStream.write((byte) (j2 >>> 48));
        bufferedOutputStream.write((byte) (j2 >>> 56));
    }

    /* JADX INFO: renamed from: f */
    public static long m4415f(InputStream inputStream) {
        return (((long) m4418j(inputStream)) & 255) | ((((long) m4418j(inputStream)) & 255) << 8) | ((((long) m4418j(inputStream)) & 255) << 16) | ((((long) m4418j(inputStream)) & 255) << 24) | ((((long) m4418j(inputStream)) & 255) << 32) | ((((long) m4418j(inputStream)) & 255) << 40) | ((((long) m4418j(inputStream)) & 255) << 48) | ((((long) m4418j(inputStream)) & 255) << 56);
    }

    /* JADX INFO: renamed from: g */
    public static void m4416g(BufferedOutputStream bufferedOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        m4414e(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    /* JADX INFO: renamed from: h */
    public static String m4417h(zzauf zzaufVar) {
        return new String(m4411b(zzaufVar, m4415f(zzaufVar)), "UTF-8");
    }

    /* JADX INFO: renamed from: j */
    public static int m4418j(InputStream inputStream) throws IOException {
        int i2 = inputStream.read();
        if (i2 != -1) {
            return i2;
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: k */
    public static final String m4419k(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzasv
    /* JADX INFO: renamed from: G */
    public final synchronized void mo4380G(String str) {
        zzasu zzasuVarZza = zza(str);
        if (zzasuVarZza != null) {
            zzasuVarZza.f6851f = 0L;
            zzasuVarZza.f6850e = 0L;
            mo4381H(str, zzasuVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasv
    /* JADX INFO: renamed from: H */
    public final synchronized void mo4381H(String str, zzasu zzasuVar) {
        try {
            long j2 = this.f6946b;
            int length = zzasuVar.f6846a.length;
            long j3 = j2 + ((long) length);
            int i2 = this.f6948d;
            float f2 = 0.9f;
            if (j3 <= i2 || length <= i2 * 0.9f) {
                File fileM4420a = m4420a(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileM4420a));
                    zzaue zzaueVar = new zzaue(str, zzasuVar);
                    try {
                        m4412c(bufferedOutputStream, 538247942);
                        m4416g(bufferedOutputStream, str);
                        String str2 = zzaueVar.f6937c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        m4416g(bufferedOutputStream, str2);
                        m4414e(bufferedOutputStream, zzaueVar.f6938d);
                        m4414e(bufferedOutputStream, zzaueVar.f6939e);
                        m4414e(bufferedOutputStream, zzaueVar.f6940f);
                        m4414e(bufferedOutputStream, zzaueVar.f6941g);
                        List<zzatd> list = zzaueVar.f6942h;
                        if (list != null) {
                            m4412c(bufferedOutputStream, list.size());
                            for (zzatd zzatdVar : list) {
                                m4416g(bufferedOutputStream, zzatdVar.f6872a);
                                m4416g(bufferedOutputStream, zzatdVar.f6873b);
                            }
                        } else {
                            m4412c(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzasuVar.f6846a);
                        bufferedOutputStream.close();
                        zzaueVar.f6935a = fileM4420a.length();
                        m4421i(str, zzaueVar);
                        long j4 = this.f6946b;
                        int i3 = this.f6948d;
                        if (j4 >= i3) {
                            boolean z = zzatx.f6920a;
                            if (z) {
                                zzatx.m4402a("Pruning old cache entries.", new Object[0]);
                            }
                            long j5 = this.f6946b;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.f6945a.entrySet().iterator();
                            int i4 = 0;
                            while (it.hasNext()) {
                                zzaue zzaueVar2 = (zzaue) ((Map.Entry) it.next()).getValue();
                                String str3 = zzaueVar2.f6936b;
                                if (m4420a(str3).delete()) {
                                    this.f6946b -= zzaueVar2.f6935a;
                                } else {
                                    zzatx.m4403b("Could not delete cache entry for key=%s, filename=%s", str3, m4419k(str3));
                                }
                                it.remove();
                                i4++;
                                if (this.f6946b < i3 * f2) {
                                    break;
                                } else {
                                    f2 = f2;
                                }
                            }
                            if (z) {
                                zzatx.m4402a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i4), Long.valueOf(this.f6946b - j5), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e) {
                        zzatx.m4403b("%s", e.toString());
                        bufferedOutputStream.close();
                        zzatx.m4403b("Failed to write header for %s", fileM4420a.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileM4420a.delete()) {
                        zzatx.m4403b("Could not clean up file %s", fileM4420a.getAbsolutePath());
                    }
                    if (!this.f6947c.zza().exists()) {
                        zzatx.m4403b("Re-initializing cache after external clearing.", new Object[0]);
                        this.f6945a.clear();
                        this.f6946b = 0L;
                        zzc();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final File m4420a(String str) {
        return new File(this.f6947c.zza(), m4419k(str));
    }

    /* JADX INFO: renamed from: i */
    public final void m4421i(String str, zzaue zzaueVar) {
        LinkedHashMap linkedHashMap = this.f6945a;
        if (linkedHashMap.containsKey(str)) {
            this.f6946b = (zzaueVar.f6935a - ((zzaue) linkedHashMap.get(str)).f6935a) + this.f6946b;
        } else {
            this.f6946b += zzaueVar.f6935a;
        }
        linkedHashMap.put(str, zzaueVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasv
    public final synchronized zzasu zza(String str) {
        zzaue zzaueVar = (zzaue) this.f6945a.get(str);
        if (zzaueVar == null) {
            return null;
        }
        File fileM4420a = m4420a(str);
        try {
            zzauf zzaufVar = new zzauf(new BufferedInputStream(new FileInputStream(fileM4420a)), fileM4420a.length());
            try {
                String str2 = zzaue.m4410a(zzaufVar).f6936b;
                if (!TextUtils.equals(str, str2)) {
                    zzatx.m4403b("%s: key=%s, found=%s", fileM4420a.getAbsolutePath(), str, str2);
                    zzaue zzaueVar2 = (zzaue) this.f6945a.remove(str);
                    if (zzaueVar2 != null) {
                        this.f6946b -= zzaueVar2.f6935a;
                    }
                    zzaufVar.close();
                    return null;
                }
                byte[] bArrM4411b = m4411b(zzaufVar, zzaufVar.f6943s - zzaufVar.f6944t);
                zzasu zzasuVar = new zzasu();
                zzasuVar.f6846a = bArrM4411b;
                zzasuVar.f6847b = zzaueVar.f6937c;
                zzasuVar.f6848c = zzaueVar.f6938d;
                zzasuVar.f6849d = zzaueVar.f6939e;
                zzasuVar.f6850e = zzaueVar.f6940f;
                zzasuVar.f6851f = zzaueVar.f6941g;
                List<zzatd> list = zzaueVar.f6942h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzatd zzatdVar : list) {
                    treeMap.put(zzatdVar.f6872a, zzatdVar.f6873b);
                }
                zzasuVar.f6852g = treeMap;
                zzasuVar.f6853h = Collections.unmodifiableList(list);
                zzaufVar.close();
                return zzasuVar;
            } catch (Throwable th) {
                zzaufVar.close();
                throw th;
            }
        } catch (IOException e) {
            zzatx.m4403b("%s: %s", fileM4420a.getAbsolutePath(), e.toString());
            synchronized (this) {
                boolean zDelete = m4420a(str).delete();
                zzaue zzaueVar3 = (zzaue) this.f6945a.remove(str);
                if (zzaueVar3 != null) {
                    this.f6946b -= zzaueVar3.f6935a;
                }
                if (!zDelete) {
                    zzatx.m4403b("Could not delete cache entry for key=%s, filename=%s", str, m4419k(str));
                }
                return null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasv
    public final synchronized void zzc() {
        try {
            File fileZza = this.f6947c.zza();
            if (fileZza.exists()) {
                File[] fileArrListFiles = fileZza.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        try {
                            long length = file.length();
                            zzauf zzaufVar = new zzauf(new BufferedInputStream(new FileInputStream(file)), length);
                            try {
                                zzaue zzaueVarM4410a = zzaue.m4410a(zzaufVar);
                                zzaueVarM4410a.f6935a = length;
                                m4421i(zzaueVarM4410a.f6936b, zzaueVarM4410a);
                                zzaufVar.close();
                            } catch (Throwable th) {
                                zzaufVar.close();
                                throw th;
                            }
                        } catch (IOException unused) {
                            file.delete();
                        }
                    }
                }
            } else if (!fileZza.mkdirs()) {
                zzatx.m4404c("Unable to create cache dir %s", fileZza.getAbsolutePath());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public zzauh(File file) {
        this.f6947c = new zzaud(this, file);
    }
}
