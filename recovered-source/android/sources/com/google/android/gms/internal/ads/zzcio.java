package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcio implements zzhr {

    /* JADX INFO: renamed from: a */
    public final Context f10160a;

    /* JADX INFO: renamed from: b */
    public final zzic f10161b;

    /* JADX INFO: renamed from: c */
    public final String f10162c;

    /* JADX INFO: renamed from: d */
    public final int f10163d;

    /* JADX INFO: renamed from: e */
    public final boolean f10164e;

    /* JADX INFO: renamed from: f */
    public InputStream f10165f;

    /* JADX INFO: renamed from: g */
    public boolean f10166g;

    /* JADX INFO: renamed from: h */
    public Uri f10167h;

    /* JADX INFO: renamed from: i */
    public volatile zzbhi f10168i;

    /* JADX INFO: renamed from: j */
    public boolean f10169j = false;

    /* JADX INFO: renamed from: k */
    public boolean f10170k = false;

    /* JADX INFO: renamed from: l */
    public zzhv f10171l;

    public zzcio(Context context, zzic zzicVar, String str, int i2) {
        this.f10160a = context;
        this.f10161b = zzicVar;
        this.f10162c = str;
        this.f10163d = i2;
        new AtomicLong(-1L);
        this.f10164e = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8829x2)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: a */
    public final void mo5493a(zzip zzipVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzj
    /* JADX INFO: renamed from: b */
    public final int mo4082b(byte[] bArr, int i2, int i3) throws IOException {
        if (!this.f10166g) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f10165f;
        return inputStream != null ? inputStream.read(bArr, i2, i3) : this.f10161b.mo4082b(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: c */
    public final long mo5494c(zzhv zzhvVar) throws IOException {
        if (this.f10166g) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f10166g = true;
        Uri uri = zzhvVar.f19195a;
        this.f10167h = uri;
        this.f10171l = zzhvVar;
        this.f10168i = zzbhi.m4889w(uri);
        zzbio zzbioVar = zzbix.f8594j5;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbhf zzbhfVarM4882b = null;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            if (this.f10168i != null) {
                this.f10168i.f7862z = zzhvVar.f19197c;
                zzbhi zzbhiVar = this.f10168i;
                String str = this.f10162c;
                zzbhiVar.f7853A = str != null ? str : "";
                this.f10168i.f7854B = this.f10163d;
                zzbhfVarM4882b = com.google.android.gms.ads.internal.zzt.f3698C.f3710j.m4882b(this.f10168i);
            }
            if (zzbhfVarM4882b != null && zzbhfVarM4882b.zza()) {
                this.f10169j = zzbhfVarM4882b.m4885H();
                this.f10170k = zzbhfVarM4882b.m4886a();
                if (!m5496f()) {
                    this.f10165f = zzbhfVarM4882b.m4887w();
                    return -1L;
                }
            }
        } else if (this.f10168i != null) {
            this.f10168i.f7862z = zzhvVar.f19197c;
            zzbhi zzbhiVar2 = this.f10168i;
            String str2 = this.f10162c;
            zzbhiVar2.f7853A = str2 != null ? str2 : "";
            this.f10168i.f7854B = this.f10163d;
            long jLongValue = (this.f10168i.f7861y ? (Long) zzbaVar.f3098c.m5030a(zzbix.f8628l5) : (Long) zzbaVar.f3098c.m5030a(zzbix.f8611k5)).longValue();
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            SystemClock.elapsedRealtime();
            Future futureM4891a = zzbht.m4891a(this.f10160a, this.f10168i);
            try {
                try {
                    try {
                        zzbhu zzbhuVar = (zzbhu) ((zzcgd) futureM4891a).f9959s.get(jLongValue, TimeUnit.MILLISECONDS);
                        zzbhuVar.getClass();
                        this.f10169j = zzbhuVar.f7881c;
                        this.f10170k = zzbhuVar.f7883e;
                        if (!m5496f()) {
                            this.f10165f = zzbhuVar.f7879a;
                        }
                    } catch (ExecutionException | TimeoutException unused) {
                        ((zzbhm) futureM4891a).cancel(false);
                    }
                } catch (InterruptedException unused2) {
                    ((zzbhm) futureM4891a).cancel(false);
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable unused3) {
            }
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.f10168i != null) {
            zzhu zzhuVar = new zzhu(zzhvVar);
            zzhuVar.f19189a = Uri.parse(this.f10168i.f7855s);
            this.f10171l = zzhuVar.m7861a();
        }
        return this.f10161b.mo5494c(this.f10171l);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: d */
    public final void mo5495d() throws IOException {
        if (!this.f10166g) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f10166g = false;
        this.f10167h = null;
        InputStream inputStream = this.f10165f;
        if (inputStream == null) {
            this.f10161b.mo5495d();
        } else {
            IOUtils.m3649a(inputStream);
            this.f10165f = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5496f() {
        if (!this.f10164e) {
            return false;
        }
        zzbio zzbioVar = zzbix.f8645m5;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() || this.f10169j) {
            return ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8662n5)).booleanValue() && !this.f10170k;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.f10167h;
    }
}
