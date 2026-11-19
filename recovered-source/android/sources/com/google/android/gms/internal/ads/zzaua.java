package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public class zzaua implements zzate {

    /* JADX INFO: renamed from: a */
    public final zzatz f6928a;

    /* JADX INFO: renamed from: b */
    public final zzauc f6929b;

    public zzaua(zzaum zzaumVar) {
        zzauc zzaucVar = new zzauc();
        this.f6928a = zzaumVar;
        this.f6929b = zzaucVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:109:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:123:0x0210  */
    /* JADX WARN: Code duplicated, block: B:127:0x0226 A[LOOP:0: B:3:0x0010->B:127:0x0226, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:127:0x0226, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzate
    /* JADX INFO: renamed from: a */
    public zzath mo3107a(zzatl zzatlVar) throws Throwable {
        byte[] bArr;
        zzauj zzaujVar;
        int i2;
        Throwable zzatgVar;
        String str;
        int i3;
        int i4;
        Map map;
        byte[] bArr2;
        byte[] bArrM4408a;
        String str2 = zzatlVar.f6893u;
        zzasz zzaszVar = zzatlVar.f6890D;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                zzasu zzasuVar = zzatlVar.f6888B;
                if (zzasuVar == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map2 = new HashMap();
                    String str3 = zzasuVar.f6847b;
                    if (str3 != null) {
                        map2.put("If-None-Match", str3);
                    }
                    long j2 = zzasuVar.f6849d;
                    if (j2 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        map2.put("If-Modified-Since", simpleDateFormat.format(new Date(j2)));
                    }
                    map = map2;
                }
                zzauj zzaujVarMo4407a = this.f6928a.mo4407a(zzatlVar, map);
                try {
                    int i5 = zzaujVarMo4407a.f6949a;
                    List listUnmodifiableList = Collections.unmodifiableList(zzaujVarMo4407a.f6950b);
                    if (i5 == 304) {
                        SystemClock.elapsedRealtime();
                        zzasu zzasuVar2 = zzatlVar.f6888B;
                        if (zzasuVar2 == null) {
                            return new zzath(304, null, true, listUnmodifiableList);
                        }
                        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                        if (!listUnmodifiableList.isEmpty()) {
                            Iterator it = listUnmodifiableList.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((zzatd) it.next()).f6872a);
                            }
                        }
                        ArrayList arrayList = new ArrayList(listUnmodifiableList);
                        List list = zzasuVar2.f6853h;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (zzatd zzatdVar : zzasuVar2.f6853h) {
                                    if (!treeSet.contains(zzatdVar.f6872a)) {
                                        arrayList.add(zzatdVar);
                                    }
                                }
                            }
                        } else if (!zzasuVar2.f6852g.isEmpty()) {
                            for (Map.Entry entry : zzasuVar2.f6852g.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new zzatd((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                        }
                        return new zzath(304, zzasuVar2.f6846a, true, arrayList);
                    }
                    InputStream inputStream = zzaujVarMo4407a.f6952d;
                    if (inputStream == null) {
                        inputStream = null;
                    }
                    if (inputStream != null) {
                        int i6 = zzaujVarMo4407a.f6951c;
                        zzauc zzaucVar = this.f6929b;
                        zzaun zzaunVar = new zzaun(zzaucVar, i6);
                        try {
                            bArrM4408a = zzaucVar.m4408a(1024);
                            while (true) {
                                try {
                                    int i7 = inputStream.read(bArrM4408a);
                                    if (i7 == -1) {
                                        break;
                                    }
                                    zzaunVar.write(bArrM4408a, 0, i7);
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        inputStream.close();
                                    } catch (IOException unused) {
                                        zzatx.m4402a("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzaucVar.m4409b(bArrM4408a);
                                    zzaunVar.close();
                                    throw th;
                                }
                            }
                            byte[] byteArray = zzaunVar.toByteArray();
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                                zzatx.m4402a("Error occurred when closing InputStream", new Object[0]);
                            }
                            zzaucVar.m4409b(bArrM4408a);
                            zzaunVar.close();
                            bArr2 = byteArray;
                        } catch (Throwable th2) {
                            th = th2;
                            bArrM4408a = null;
                        }
                    } else {
                        bArr2 = new byte[0];
                    }
                    try {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (zzatx.f6920a || jElapsedRealtime2 > 3000) {
                            zzatx.m4403b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzatlVar, Long.valueOf(jElapsedRealtime2), bArr2 != null ? Integer.valueOf(bArr2.length) : "null", Integer.valueOf(i5), Integer.valueOf(zzaszVar.f6864b));
                        }
                        if (i5 < 200 || i5 > 299) {
                            throw new IOException();
                        }
                        SystemClock.elapsedRealtime();
                        return new zzath(i5, bArr2, false, listUnmodifiableList);
                    } catch (IOException e) {
                        e = e;
                        bArr = bArr2;
                        zzaujVar = zzaujVarMo4407a;
                        if (e instanceof SocketTimeoutException) {
                            zzatgVar = new zzatt();
                            str = "socket";
                        } else {
                            if (!(e instanceof MalformedURLException)) {
                                throw new RuntimeException("Bad URL ".concat(String.valueOf(str2)), e);
                            }
                            if (zzaujVar != null) {
                                throw new zzati(e);
                            }
                            i2 = zzaujVar.f6949a;
                            zzatx.m4404c("Unexpected response code %d for %s", Integer.valueOf(i2), str2);
                            if (bArr != null) {
                                List listUnmodifiableList2 = Collections.unmodifiableList(zzaujVar.f6950b);
                                SystemClock.elapsedRealtime();
                                new zzath(i2, bArr, false, listUnmodifiableList2);
                                if (i2 == 401) {
                                }
                                zzatgVar = new zzast();
                                str = "auth";
                            } else {
                                zzatgVar = new zzatg();
                                str = "network";
                            }
                        }
                        i3 = zzaszVar.f6863a;
                        try {
                            i4 = zzaszVar.f6864b + 1;
                            zzaszVar.f6864b = i4;
                            zzaszVar.f6863a = i3 + i3;
                            if (i4 <= 1) {
                                throw zzatgVar;
                            }
                            zzatlVar.m4390b(str + "-retry [timeout=" + i3 + "]");
                        } catch (zzatu e2) {
                            zzatlVar.m4390b(str + "-timeout-giveup [timeout=" + i3 + "]");
                            throw e2;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    zzaujVar = zzaujVarMo4407a;
                    bArr = null;
                    if (e instanceof SocketTimeoutException) {
                        zzatgVar = new zzatt();
                        str = "socket";
                    } else {
                        if (!(e instanceof MalformedURLException)) {
                            throw new RuntimeException("Bad URL ".concat(String.valueOf(str2)), e);
                        }
                        if (zzaujVar != null) {
                            throw new zzati(e);
                        }
                        i2 = zzaujVar.f6949a;
                        zzatx.m4404c("Unexpected response code %d for %s", Integer.valueOf(i2), str2);
                        if (bArr != null) {
                            List listUnmodifiableList3 = Collections.unmodifiableList(zzaujVar.f6950b);
                            SystemClock.elapsedRealtime();
                            new zzath(i2, bArr, false, listUnmodifiableList3);
                            if (i2 == 401 && i2 != 403) {
                                if (i2 < 400 || i2 > 499) {
                                    throw new zzats();
                                }
                                throw new zzasy();
                            }
                            zzatgVar = new zzast();
                            str = "auth";
                        } else {
                            zzatgVar = new zzatg();
                            str = "network";
                        }
                    }
                    i3 = zzaszVar.f6863a;
                    i4 = zzaszVar.f6864b + 1;
                    zzaszVar.f6864b = i4;
                    zzaszVar.f6863a = i3 + i3;
                    if (i4 <= 1) {
                        throw zzatgVar;
                    }
                    zzatlVar.m4390b(str + "-retry [timeout=" + i3 + "]");
                }
            } catch (IOException e4) {
                e = e4;
                bArr = null;
                zzaujVar = null;
            }
            zzatlVar.m4390b(str + "-retry [timeout=" + i3 + "]");
        }
    }
}
