package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.util.IOUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcjw extends zzhj {

    /* JADX INFO: renamed from: e */
    public final Context f10284e;

    /* JADX INFO: renamed from: f */
    public final zzhr f10285f;

    /* JADX INFO: renamed from: g */
    public final zzcju f10286g;

    /* JADX INFO: renamed from: h */
    public final String f10287h;

    /* JADX INFO: renamed from: i */
    public final int f10288i;

    /* JADX INFO: renamed from: j */
    public final boolean f10289j;

    /* JADX INFO: renamed from: k */
    public InputStream f10290k;

    /* JADX INFO: renamed from: l */
    public boolean f10291l;

    /* JADX INFO: renamed from: m */
    public Uri f10292m;

    /* JADX INFO: renamed from: n */
    public volatile zzbhi f10293n;

    /* JADX INFO: renamed from: o */
    public boolean f10294o;

    /* JADX INFO: renamed from: p */
    public boolean f10295p;

    /* JADX INFO: renamed from: q */
    public boolean f10296q;

    /* JADX INFO: renamed from: r */
    public boolean f10297r;

    /* JADX INFO: renamed from: s */
    public long f10298s;

    /* JADX INFO: renamed from: t */
    public ListenableFuture f10299t;

    /* JADX INFO: renamed from: u */
    public final AtomicLong f10300u;

    public zzcjw(Context context, zzhr zzhrVar, String str, int i2, zzip zzipVar, zzcju zzcjuVar) {
        super(false);
        this.f10284e = context;
        this.f10285f = zzhrVar;
        this.f10286g = zzcjuVar;
        this.f10287h = str;
        this.f10288i = i2;
        this.f10294o = false;
        this.f10295p = false;
        this.f10296q = false;
        this.f10297r = false;
        this.f10298s = 0L;
        this.f10300u = new AtomicLong(-1L);
        this.f10299t = null;
        this.f10289j = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8829x2)).booleanValue();
        mo5493a(zzipVar);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    /* JADX INFO: renamed from: b */
    public final int mo4082b(byte[] bArr, int i2, int i3) throws IOException {
        if (!this.f10291l) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f10290k;
        int iMo4082b = inputStream != null ? inputStream.read(bArr, i2, i3) : this.f10285f.mo4082b(bArr, i2, i3);
        if (this.f10289j && this.f10290k == null) {
            return iMo4082b;
        }
        m7470i(iMo4082b);
        return iMo4082b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [com.google.android.gms.ads.internal.zzt] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v31, types: [com.google.android.gms.internal.ads.zzckh] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: c */
    public final long mo5494c(zzhv zzhvVar) throws Throwable {
        zzbhf zzbhfVarM4882b;
        boolean z;
        long j2;
        boolean z2;
        boolean z3;
        long jElapsedRealtime;
        StringBuilder sb;
        ?? string;
        zzhv zzhvVarM7861a = zzhvVar;
        if (this.f10291l) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        ?? r5 = 1;
        this.f10291l = true;
        Uri uri = zzhvVarM7861a.f19195a;
        this.f10292m = uri;
        boolean z4 = this.f10289j;
        if (!z4) {
            m7469h(zzhvVar);
        }
        this.f10293n = zzbhi.m4889w(uri);
        zzbio zzbioVar = zzbix.f8594j5;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            if (this.f10293n != null) {
                this.f10293n.f7862z = zzhvVarM7861a.f19197c;
                zzbhi zzbhiVar = this.f10293n;
                String str = this.f10287h;
                zzbhiVar.f7853A = str != null ? str : "";
                this.f10293n.f7854B = this.f10288i;
                zzbhfVarM4882b = com.google.android.gms.ads.internal.zzt.f3698C.f3710j.m4882b(this.f10293n);
            } else {
                zzbhfVarM4882b = null;
            }
            if (zzbhfVarM4882b != null && zzbhfVarM4882b.zza()) {
                synchronized (zzbhfVarM4882b) {
                    z = zzbhfVarM4882b.f7849t;
                }
                this.f10294o = z;
                this.f10296q = zzbhfVarM4882b.m4885H();
                this.f10297r = zzbhfVarM4882b.m4886a();
                synchronized (zzbhfVarM4882b) {
                    j2 = zzbhfVarM4882b.f7851v;
                }
                this.f10298s = j2;
                this.f10295p = true;
                if (!m5530l()) {
                    this.f10290k = zzbhfVarM4882b.m4887w();
                    if (this.f10289j) {
                        m7469h(zzhvVar);
                    }
                    return -1L;
                }
            }
        } else if (this.f10293n != null) {
            this.f10293n.f7862z = zzhvVarM7861a.f19197c;
            zzbhi zzbhiVar2 = this.f10293n;
            String str2 = this.f10287h;
            zzbhiVar2.f7853A = str2 != null ? str2 : "";
            this.f10293n.f7854B = this.f10288i;
            long jLongValue = (this.f10293n.f7861y ? (Long) zzbaVar.f3098c.m5030a(zzbix.f8628l5) : (Long) zzbaVar.f3098c.m5030a(zzbix.f8611k5)).longValue();
            ?? string2 = com.google.android.gms.ads.internal.zzt.f3698C;
            string2.f3711k.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            Future futureM4891a = zzbht.m4891a(this.f10284e, this.f10293n);
            try {
                try {
                    zzbhu zzbhuVar = (zzbhu) ((zzcgd) futureM4891a).f9959s.get(jLongValue, TimeUnit.MILLISECONDS);
                    try {
                        this.f10294o = zzbhuVar.f7880b;
                        this.f10296q = zzbhuVar.f7881c;
                        this.f10297r = zzbhuVar.f7883e;
                        this.f10298s = zzbhuVar.f7882d;
                        if (!m5530l()) {
                            this.f10290k = zzbhuVar.f7879a;
                            if (z4) {
                                m7469h(zzhvVar);
                            }
                            string2.f3711k.getClass();
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                            ((zzckh) this.f10286g).m5537a(true, jElapsedRealtime3);
                            this.f10295p = true;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 24);
                            sb2.append("Cache connection took ");
                            sb2.append(jElapsedRealtime3);
                            sb2.append("ms");
                            com.google.android.gms.ads.internal.util.zze.m3150k(sb2.toString());
                            return -1L;
                        }
                        string2.f3711k.getClass();
                        long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        ((zzckh) this.f10286g).m5537a(true, jElapsedRealtime4);
                        this.f10295p = true;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 24);
                        sb3.append("Cache connection took ");
                        sb3.append(jElapsedRealtime4);
                        sb3.append("ms");
                        string = sb3.toString();
                    } catch (InterruptedException unused) {
                        z3 = true;
                        ((zzbhm) futureM4891a).cancel(true);
                        Thread.currentThread().interrupt();
                        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        ((zzckh) this.f10286g).m5537a(z3, jElapsedRealtime);
                        this.f10295p = z3;
                        sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 24);
                        sb.append("Cache connection took ");
                        sb.append(jElapsedRealtime);
                        sb.append("ms");
                        string2 = sb.toString();
                        string = string2;
                    } catch (ExecutionException | TimeoutException unused2) {
                        z2 = true;
                        ((zzbhm) futureM4891a).cancel(true);
                        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        ((zzckh) this.f10286g).m5537a(z2, jElapsedRealtime);
                        this.f10295p = z2;
                        sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 24);
                        sb.append("Cache connection took ");
                        sb.append(jElapsedRealtime);
                        sb.append("ms");
                        string2 = sb.toString();
                        string = string2;
                    } catch (Throwable th) {
                        th = th;
                        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                        long jElapsedRealtime5 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        ((zzckh) this.f10286g).m5537a(r5, jElapsedRealtime5);
                        this.f10295p = r5;
                        StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime5).length() + 24);
                        sb4.append("Cache connection took ");
                        sb4.append(jElapsedRealtime5);
                        sb4.append("ms");
                        com.google.android.gms.ads.internal.util.zze.m3150k(sb4.toString());
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r5 = string2;
                }
            } catch (InterruptedException unused3) {
                z3 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z2 = false;
            } catch (Throwable th3) {
                th = th3;
                r5 = 0;
            }
            com.google.android.gms.ads.internal.util.zze.m3150k(string);
        }
        this.f10295p = false;
        if (this.f10293n != null) {
            zzhu zzhuVar = new zzhu(zzhvVarM7861a);
            zzhuVar.f19189a = Uri.parse(this.f10293n.f7855s);
            zzhvVarM7861a = zzhuVar.m7861a();
        }
        return this.f10285f.mo5494c(zzhvVarM7861a);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: d */
    public final void mo5495d() throws IOException {
        if (!this.f10291l) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f10291l = false;
        this.f10292m = null;
        boolean z = (this.f10289j && this.f10290k == null) ? false : true;
        InputStream inputStream = this.f10290k;
        if (inputStream != null) {
            IOUtils.m3649a(inputStream);
            this.f10290k = null;
        } else {
            this.f10285f.mo5495d();
        }
        if (z) {
            m7471k();
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m5530l() {
        if (!this.f10289j) {
            return false;
        }
        zzbio zzbioVar = zzbix.f8645m5;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() || this.f10296q) {
            return ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8662n5)).booleanValue() && !this.f10297r;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.f10292m;
    }
}
