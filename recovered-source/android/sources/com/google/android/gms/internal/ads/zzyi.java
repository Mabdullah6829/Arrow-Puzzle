package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzyi implements zzacb, zzxa {

    /* JADX INFO: renamed from: a */
    public final Uri f21335a;

    /* JADX INFO: renamed from: b */
    public final zzio f21336b;

    /* JADX INFO: renamed from: c */
    public final zzye f21337c;

    /* JADX INFO: renamed from: d */
    public final zzagd f21338d;

    /* JADX INFO: renamed from: e */
    public final zzdt f21339e;

    /* JADX INFO: renamed from: g */
    public volatile boolean f21341g;

    /* JADX INFO: renamed from: i */
    public long f21343i;

    /* JADX INFO: renamed from: j */
    public zzhv f21344j;

    /* JADX INFO: renamed from: k */
    public zzahm f21345k;

    /* JADX INFO: renamed from: l */
    public boolean f21346l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ zzyr f21347m;

    /* JADX INFO: renamed from: f */
    public final zzaha f21340f = new zzaha();

    /* JADX INFO: renamed from: h */
    public boolean f21342h = true;

    public zzyi(zzyr zzyrVar, Uri uri, zzhr zzhrVar, zzye zzyeVar, zzagd zzagdVar, zzdt zzdtVar) {
        this.f21347m = zzyrVar;
        this.f21335a = uri;
        this.f21336b = new zzio(zzhrVar);
        this.f21337c = zzyeVar;
        this.f21338d = zzagdVar;
        this.f21339e = zzdtVar;
        zzxc.f21254a.getAndIncrement();
        this.f21344j = m9032b(0L, null);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0202 */
    /* JADX WARN: Code duplicated, block: B:124:0x0221  */
    /* JADX WARN: Code duplicated, block: B:125:0x0223  */
    /* JADX WARN: Code duplicated, block: B:127:0x022b  */
    /* JADX WARN: Code duplicated, block: B:132:0x023c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0246  */
    /* JADX WARN: Code duplicated, block: B:150:0x01f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01d7 A[EXC_TOP_SPLITTER, LOOP:2: B:171:0x01d7->B:182:?, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:29:0x008e, B:30:0x0094, B:40:0x00d2, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00fe, B:50:0x0108, B:52:0x0114, B:54:0x011e, B:56:0x0130, B:58:0x013a, B:59:0x0140, B:67:0x0179, B:69:0x0182, B:71:0x018c, B:73:0x0191, B:75:0x01aa, B:77:0x01bf, B:78:0x01c2, B:80:0x01c6, B:62:0x014a, B:65:0x016a, B:34:0x00a0, B:39:0x00c4), top: B:144:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:29:0x008e, B:30:0x0094, B:40:0x00d2, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00fe, B:50:0x0108, B:52:0x0114, B:54:0x011e, B:56:0x0130, B:58:0x013a, B:59:0x0140, B:67:0x0179, B:69:0x0182, B:71:0x018c, B:73:0x0191, B:75:0x01aa, B:77:0x01bf, B:78:0x01c2, B:80:0x01c6, B:62:0x014a, B:65:0x016a, B:34:0x00a0, B:39:0x00c4), top: B:144:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:50:0x0108 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:29:0x008e, B:30:0x0094, B:40:0x00d2, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00fe, B:50:0x0108, B:52:0x0114, B:54:0x011e, B:56:0x0130, B:58:0x013a, B:59:0x0140, B:67:0x0179, B:69:0x0182, B:71:0x018c, B:73:0x0191, B:75:0x01aa, B:77:0x01bf, B:78:0x01c2, B:80:0x01c6, B:62:0x014a, B:65:0x016a, B:34:0x00a0, B:39:0x00c4), top: B:144:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:29:0x008e, B:30:0x0094, B:40:0x00d2, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00fe, B:50:0x0108, B:52:0x0114, B:54:0x011e, B:56:0x0130, B:58:0x013a, B:59:0x0140, B:67:0x0179, B:69:0x0182, B:71:0x018c, B:73:0x0191, B:75:0x01aa, B:77:0x01bf, B:78:0x01c2, B:80:0x01c6, B:62:0x014a, B:65:0x016a, B:34:0x00a0, B:39:0x00c4), top: B:144:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:55:0x012e  */
    /* JADX WARN: Code duplicated, block: B:58:0x013a A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:29:0x008e, B:30:0x0094, B:40:0x00d2, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00fe, B:50:0x0108, B:52:0x0114, B:54:0x011e, B:56:0x0130, B:58:0x013a, B:59:0x0140, B:67:0x0179, B:69:0x0182, B:71:0x018c, B:73:0x0191, B:75:0x01aa, B:77:0x01bf, B:78:0x01c2, B:80:0x01c6, B:62:0x014a, B:65:0x016a, B:34:0x00a0, B:39:0x00c4), top: B:144:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0146  */
    /* JADX WARN: Code duplicated, block: B:63:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:29:0x008e, B:30:0x0094, B:40:0x00d2, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00fe, B:50:0x0108, B:52:0x0114, B:54:0x011e, B:56:0x0130, B:58:0x013a, B:59:0x0140, B:67:0x0179, B:69:0x0182, B:71:0x018c, B:73:0x0191, B:75:0x01aa, B:77:0x01bf, B:78:0x01c2, B:80:0x01c6, B:62:0x014a, B:65:0x016a, B:34:0x00a0, B:39:0x00c4), top: B:144:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0181  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bf A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:29:0x008e, B:30:0x0094, B:40:0x00d2, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00fe, B:50:0x0108, B:52:0x0114, B:54:0x011e, B:56:0x0130, B:58:0x013a, B:59:0x0140, B:67:0x0179, B:69:0x0182, B:71:0x018c, B:73:0x0191, B:75:0x01aa, B:77:0x01bf, B:78:0x01c2, B:80:0x01c6, B:62:0x014a, B:65:0x016a, B:34:0x00a0, B:39:0x00c4), top: B:144:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c6 A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:29:0x008e, B:30:0x0094, B:40:0x00d2, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00fe, B:50:0x0108, B:52:0x0114, B:54:0x011e, B:56:0x0130, B:58:0x013a, B:59:0x0140, B:67:0x0179, B:69:0x0182, B:71:0x018c, B:73:0x0191, B:75:0x01aa, B:77:0x01bf, B:78:0x01c2, B:80:0x01c6, B:62:0x014a, B:65:0x016a, B:34:0x00a0, B:39:0x00c4), top: B:144:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01db A[Catch: all -> 0x01df, TRY_LEAVE, TryCatch #14 {all -> 0x01df, blocks: (B:87:0x01d7, B:89:0x01db), top: B:171:0x01d7 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01f5 A[Catch: all -> 0x0202, TRY_LEAVE, TryCatch #2 {, blocks: (B:97:0x01ee, B:99:0x01f5, B:101:0x01f8, B:102:0x01f9, B:108:0x0206, B:100:0x01f6), top: B:148:0x01ee, inners: #3 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9031a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyi.m9031a():void");
    }

    /* JADX INFO: renamed from: b */
    public final zzhv m9032b(long j2, String str) {
        Map mapM7228d = zzyr.f21361g0;
        if (str != null && !str.startsWith("W/")) {
            zzgwv zzgwvVar = new zzgwv();
            zzgwvVar.m7226b(mapM7228d.entrySet());
            zzgwvVar.m7225a("If-Range", str);
            mapM7228d = zzgwvVar.m7228d(false);
        }
        zzhu zzhuVar = new zzhu();
        zzhuVar.f19189a = this.f21335a;
        zzhuVar.f19191c = j2;
        zzhuVar.f19193e = 6;
        zzhuVar.f19190b = mapM7228d;
        return zzhuVar.m7861a();
    }
}
