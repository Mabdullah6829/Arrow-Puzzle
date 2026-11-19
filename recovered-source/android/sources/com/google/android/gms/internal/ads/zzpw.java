package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.core.location.LocationRequestCompat;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpw implements zzqf {

    /* JADX INFO: renamed from: h */
    public static final zzguj f20572h = null;

    /* JADX INFO: renamed from: i */
    public static final Random f20573i;

    /* JADX INFO: renamed from: a */
    public final zzbe f20574a;

    /* JADX INFO: renamed from: b */
    public final zzbd f20575b;

    /* JADX INFO: renamed from: c */
    public final HashMap f20576c;

    /* JADX INFO: renamed from: d */
    public zzqd f20577d;

    /* JADX INFO: renamed from: e */
    public zzbf f20578e;

    /* JADX INFO: renamed from: f */
    public String f20579f;

    /* JADX INFO: renamed from: g */
    public long f20580g;

    static {
        zzpu zzpuVar = new zzguj() { // from class: com.google.android.gms.internal.ads.zzpu
            @Override // com.google.android.gms.internal.ads.zzguj
            public final Object zza() {
                byte[] bArr = new byte[12];
                zzpw.f20573i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            }
        };
        f20573i = new Random();
    }

    public zzpw() {
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized String m8823a(zzbf zzbfVar, zzxl zzxlVar) {
        return m8827e(zzbfVar.mo4841o(zzxlVar.f21278a, this.f20575b).f7634c, zzxlVar).f20565a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003d A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0063 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006a A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0083 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009b A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00bf A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX INFO: renamed from: b */
    public final synchronized void m8824b(zznp zznpVar) {
        int i2;
        zzpv zzpvVarM8827e;
        zzqd zzqdVar;
        String str;
        zzxl zzxlVar;
        Object obj;
        int i3;
        zzpv zzpvVarM8827e2;
        zzpv zzpvVar;
        long j2;
        long jM6518t = zzfm.m6518t(0L);
        synchronized (this) {
            try {
                if (this.f20577d == null) {
                    throw null;
                }
                zzbf zzbfVar = zznpVar.f20515b;
                if (!zzbfVar.m4833g()) {
                    zzxl zzxlVar2 = zznpVar.f20517d;
                    if (zzxlVar2 != null) {
                        long j3 = zzxlVar2.f21281d;
                        if (j3 == -1) {
                            zzpvVar = (zzpv) this.f20576c.get(this.f20579f);
                            if (zzpvVar != null || zzpvVar.f20567c != -1 || zzpvVar.f20566b == zznpVar.f20516c) {
                                i2 = zznpVar.f20516c;
                                zzpvVarM8827e = m8827e(i2, zzxlVar2);
                                if (this.f20579f == null) {
                                    this.f20579f = zzpvVarM8827e.f20565a;
                                }
                                if (zzxlVar2 != null && zzxlVar2.m9025b()) {
                                    obj = zzxlVar2.f21278a;
                                    long j4 = zzxlVar2.f21281d;
                                    i3 = zzxlVar2.f21279b;
                                    zzpvVarM8827e2 = m8827e(i2, new zzxl(obj, i3, j4));
                                    if (!zzpvVarM8827e2.f20569e) {
                                        zzpvVarM8827e2.f20569e = true;
                                        zzbd zzbdVar = this.f20575b;
                                        zzbfVar.mo4841o(obj, zzbdVar);
                                        zzbdVar.f7637f.m5285a(i3).getClass();
                                        Math.max(0L, jM6518t + jM6518t);
                                    }
                                }
                                if (!zzpvVarM8827e.f20569e) {
                                    zzpvVarM8827e.f20569e = true;
                                }
                                if (zzpvVarM8827e.f20565a.equals(this.f20579f) && !zzpvVarM8827e.f20570f) {
                                    zzpvVarM8827e.f20570f = true;
                                    zzqdVar = this.f20577d;
                                    str = zzpvVarM8827e.f20565a;
                                    zzqdVar.getClass();
                                    zzxlVar = zznpVar.f20517d;
                                    if (zzxlVar != null || !zzxlVar.m9025b()) {
                                        zzqdVar.m8831k();
                                        zzqdVar.f20598B = str;
                                        zzqdVar.f20599C = AbstractC5159m.m3847e().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.0");
                                        zzqdVar.m8830g(zznpVar.f20515b, zzxlVar);
                                    }
                                }
                            }
                        } else {
                            zzpv zzpvVar2 = (zzpv) this.f20576c.get(this.f20579f);
                            if (zzpvVar2 != null) {
                                j2 = zzpvVar2.f20567c;
                                if (j2 == -1) {
                                    j2 = this.f20580g + 1;
                                }
                            } else {
                                j2 = this.f20580g + 1;
                            }
                            if (j3 >= j2) {
                                zzpvVar = (zzpv) this.f20576c.get(this.f20579f);
                                if (zzpvVar != null) {
                                    i2 = zznpVar.f20516c;
                                    zzpvVarM8827e = m8827e(i2, zzxlVar2);
                                    if (this.f20579f == null) {
                                        this.f20579f = zzpvVarM8827e.f20565a;
                                    }
                                    if (zzxlVar2 != null) {
                                        obj = zzxlVar2.f21278a;
                                        long j5 = zzxlVar2.f21281d;
                                        i3 = zzxlVar2.f21279b;
                                        zzpvVarM8827e2 = m8827e(i2, new zzxl(obj, i3, j5));
                                        if (!zzpvVarM8827e2.f20569e) {
                                            zzpvVarM8827e2.f20569e = true;
                                            zzbd zzbdVar2 = this.f20575b;
                                            zzbfVar.mo4841o(obj, zzbdVar2);
                                            zzbdVar2.f7637f.m5285a(i3).getClass();
                                            Math.max(0L, jM6518t + jM6518t);
                                        }
                                    }
                                    if (!zzpvVarM8827e.f20569e) {
                                        zzpvVarM8827e.f20569e = true;
                                    }
                                    if (zzpvVarM8827e.f20565a.equals(this.f20579f)) {
                                        zzpvVarM8827e.f20570f = true;
                                        zzqdVar = this.f20577d;
                                        str = zzpvVarM8827e.f20565a;
                                        zzqdVar.getClass();
                                        zzxlVar = zznpVar.f20517d;
                                        if (zzxlVar != null) {
                                            zzqdVar.m8831k();
                                            zzqdVar.f20598B = str;
                                            zzqdVar.f20599C = AbstractC5159m.m3847e().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.0");
                                            zzqdVar.m8830g(zznpVar.f20515b, zzxlVar);
                                        } else {
                                            zzqdVar.m8831k();
                                            zzqdVar.f20598B = str;
                                            zzqdVar.f20599C = AbstractC5159m.m3847e().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.0");
                                            zzqdVar.m8830g(zznpVar.f20515b, zzxlVar);
                                        }
                                    }
                                } else {
                                    i2 = zznpVar.f20516c;
                                    zzpvVarM8827e = m8827e(i2, zzxlVar2);
                                    if (this.f20579f == null) {
                                        this.f20579f = zzpvVarM8827e.f20565a;
                                    }
                                    if (zzxlVar2 != null) {
                                        obj = zzxlVar2.f21278a;
                                        long j6 = zzxlVar2.f21281d;
                                        i3 = zzxlVar2.f21279b;
                                        zzpvVarM8827e2 = m8827e(i2, new zzxl(obj, i3, j6));
                                        if (!zzpvVarM8827e2.f20569e) {
                                            zzpvVarM8827e2.f20569e = true;
                                            zzbd zzbdVar3 = this.f20575b;
                                            zzbfVar.mo4841o(obj, zzbdVar3);
                                            zzbdVar3.f7637f.m5285a(i3).getClass();
                                            Math.max(0L, jM6518t + jM6518t);
                                        }
                                    }
                                    if (!zzpvVarM8827e.f20569e) {
                                        zzpvVarM8827e.f20569e = true;
                                    }
                                    if (zzpvVarM8827e.f20565a.equals(this.f20579f)) {
                                        zzpvVarM8827e.f20570f = true;
                                        zzqdVar = this.f20577d;
                                        str = zzpvVarM8827e.f20565a;
                                        zzqdVar.getClass();
                                        zzxlVar = zznpVar.f20517d;
                                        if (zzxlVar != null) {
                                            zzqdVar.m8831k();
                                            zzqdVar.f20598B = str;
                                            zzqdVar.f20599C = AbstractC5159m.m3847e().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.0");
                                            zzqdVar.m8830g(zznpVar.f20515b, zzxlVar);
                                        } else {
                                            zzqdVar.m8831k();
                                            zzqdVar.f20598B = str;
                                            zzqdVar.f20599C = AbstractC5159m.m3847e().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.0");
                                            zzqdVar.m8830g(zznpVar.f20515b, zzxlVar);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        i2 = zznpVar.f20516c;
                        zzpvVarM8827e = m8827e(i2, zzxlVar2);
                        if (this.f20579f == null) {
                            this.f20579f = zzpvVarM8827e.f20565a;
                        }
                        if (zzxlVar2 != null) {
                            obj = zzxlVar2.f21278a;
                            long j7 = zzxlVar2.f21281d;
                            i3 = zzxlVar2.f21279b;
                            zzpvVarM8827e2 = m8827e(i2, new zzxl(obj, i3, j7));
                            if (!zzpvVarM8827e2.f20569e) {
                                zzpvVarM8827e2.f20569e = true;
                                zzbd zzbdVar4 = this.f20575b;
                                zzbfVar.mo4841o(obj, zzbdVar4);
                                zzbdVar4.f7637f.m5285a(i3).getClass();
                                Math.max(0L, jM6518t + jM6518t);
                            }
                        }
                        if (!zzpvVarM8827e.f20569e) {
                            zzpvVarM8827e.f20569e = true;
                        }
                        if (zzpvVarM8827e.f20565a.equals(this.f20579f)) {
                            zzpvVarM8827e.f20570f = true;
                            zzqdVar = this.f20577d;
                            str = zzpvVarM8827e.f20565a;
                            zzqdVar.getClass();
                            zzxlVar = zznpVar.f20517d;
                            if (zzxlVar != null) {
                                zzqdVar.m8831k();
                                zzqdVar.f20598B = str;
                                zzqdVar.f20599C = AbstractC5159m.m3847e().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.0");
                                zzqdVar.m8830g(zznpVar.f20515b, zzxlVar);
                            } else {
                                zzqdVar.m8831k();
                                zzqdVar.f20598B = str;
                                zzqdVar.f20599C = AbstractC5159m.m3847e().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.0");
                                zzqdVar.m8830g(zznpVar.f20515b, zzxlVar);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8825c(zznp zznpVar) {
        zzxl zzxlVar;
        boolean zM4833g = zznpVar.f20515b.m4833g();
        HashMap map = this.f20576c;
        if (zM4833g) {
            String str = this.f20579f;
            if (str != null) {
                zzpv zzpvVar = (zzpv) map.get(str);
                zzpvVar.getClass();
                m8826d(zzpvVar);
                return;
            }
            return;
        }
        zzpv zzpvVar2 = (zzpv) map.get(this.f20579f);
        int i2 = zznpVar.f20516c;
        zzxl zzxlVar2 = zznpVar.f20517d;
        this.f20579f = m8827e(i2, zzxlVar2).f20565a;
        m8824b(zznpVar);
        if (zzxlVar2 != null) {
            long j2 = zzxlVar2.f21281d;
            if (zzxlVar2.m9025b()) {
                if (zzpvVar2 != null && zzpvVar2.f20567c == j2 && (zzxlVar = zzpvVar2.f20568d) != null) {
                    if (zzxlVar.f21279b == zzxlVar2.f21279b) {
                        if (zzxlVar.f21280c == zzxlVar2.f21280c) {
                            return;
                        }
                    }
                }
                m8827e(i2, new zzxl(j2, zzxlVar2.f21278a));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8826d(zzpv zzpvVar) {
        long j2 = zzpvVar.f20567c;
        if (j2 != -1 && zzpvVar.f20569e) {
            this.f20580g = j2;
        }
        this.f20579f = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final zzpv m8827e(int i2, zzxl zzxlVar) {
        long j2;
        long j3;
        long j4;
        HashMap map = this.f20576c;
        long j5 = LocationRequestCompat.PASSIVE_INTERVAL;
        zzpv zzpvVar = null;
        for (zzpv zzpvVar2 : map.values()) {
            long j6 = zzpvVar2.f20567c;
            zzxl zzxlVar2 = zzpvVar2.f20568d;
            if (j6 == -1 && i2 == zzpvVar2.f20566b && zzxlVar != null) {
                zzpw zzpwVar = zzpvVar2.f20571g;
                long j7 = zzxlVar.f21281d;
                j2 = -1;
                zzpv zzpvVar3 = (zzpv) zzpwVar.f20576c.get(zzpwVar.f20579f);
                if (zzpvVar3 != null) {
                    j4 = zzpvVar3.f20567c;
                    if (j4 == -1) {
                        j4 = 1 + zzpwVar.f20580g;
                    }
                } else {
                    j4 = 1 + zzpwVar.f20580g;
                }
                if (j7 >= j4) {
                    zzpvVar2.f20567c = j7;
                }
            } else {
                j2 = -1;
            }
            if (zzxlVar != null) {
                long j8 = zzxlVar.f21281d;
                if (j8 != j2) {
                    if (zzxlVar2 == null) {
                        if (!zzxlVar.m9025b() && j8 == zzpvVar2.f20567c) {
                            j3 = zzpvVar2.f20567c;
                            if (j3 != j2 || j3 < j5) {
                                zzpvVar = zzpvVar2;
                                j5 = j3;
                            } else if (j3 == j5) {
                                String str = zzfm.f16091a;
                                if (zzpvVar.f20568d != null && zzxlVar2 != null) {
                                    zzpvVar = zzpvVar2;
                                }
                            }
                        }
                    } else if (j8 == zzxlVar2.f21281d && zzxlVar.f21279b == zzxlVar2.f21279b && zzxlVar.f21280c == zzxlVar2.f21280c) {
                        j3 = zzpvVar2.f20567c;
                        if (j3 != j2) {
                        }
                        zzpvVar = zzpvVar2;
                        j5 = j3;
                    }
                }
            }
            if (i2 == zzpvVar2.f20566b) {
                j3 = zzpvVar2.f20567c;
                if (j3 != j2) {
                }
                zzpvVar = zzpvVar2;
                j5 = j3;
            }
        }
        if (zzpvVar != null) {
            return zzpvVar;
        }
        byte[] bArr = new byte[12];
        f20573i.nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 10);
        zzpv zzpvVar4 = new zzpv(this, strEncodeToString, i2, zzxlVar);
        map.put(strEncodeToString, zzpvVar4);
        return zzpvVar4;
    }

    public zzpw(int i2) {
        this.f20574a = new zzbe();
        this.f20575b = new zzbd();
        this.f20576c = new HashMap();
        this.f20578e = zzbf.f7725a;
        this.f20580g = -1L;
    }
}
