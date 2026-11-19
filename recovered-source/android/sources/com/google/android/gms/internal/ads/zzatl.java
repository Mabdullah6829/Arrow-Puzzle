package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzatl implements Comparable {

    /* JADX INFO: renamed from: A */
    public boolean f6887A;

    /* JADX INFO: renamed from: B */
    public zzasu f6888B;

    /* JADX INFO: renamed from: C */
    public zzatk f6889C;

    /* JADX INFO: renamed from: D */
    public final zzasz f6890D;

    /* JADX INFO: renamed from: s */
    public final zzatw f6891s;

    /* JADX INFO: renamed from: t */
    public final int f6892t;

    /* JADX INFO: renamed from: u */
    public final String f6893u;

    /* JADX INFO: renamed from: v */
    public final int f6894v;

    /* JADX INFO: renamed from: w */
    public final Object f6895w;

    /* JADX INFO: renamed from: x */
    public final zzatp f6896x;

    /* JADX INFO: renamed from: y */
    public Integer f6897y;

    /* JADX INFO: renamed from: z */
    public zzato f6898z;

    public zzatl(int i2, String str, zzatp zzatpVar) {
        Uri uri;
        String host;
        this.f6891s = zzatw.f6917c ? new zzatw() : null;
        this.f6895w = new Object();
        int iHashCode = 0;
        this.f6887A = false;
        this.f6888B = null;
        this.f6892t = i2;
        this.f6893u = str;
        this.f6896x = zzatpVar;
        this.f6890D = new zzasz();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f6894v = iHashCode;
    }

    /* JADX INFO: renamed from: b */
    public final void m4390b(String str) {
        if (zzatw.f6917c) {
            this.f6891s.m4400a(str, Thread.currentThread().getId());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4391c(String str) {
        zzato zzatoVar = this.f6898z;
        if (zzatoVar != null) {
            HashSet hashSet = zzatoVar.f6900b;
            synchronized (hashSet) {
                hashSet.remove(this);
            }
            ArrayList arrayList = zzatoVar.f6907i;
            synchronized (arrayList) {
                try {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((zzatn) obj).zza();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzatoVar.m4399c();
        }
        if (zzatw.f6917c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzatj(this, str, id));
                return;
            }
            zzatw zzatwVar = this.f6891s;
            zzatwVar.m4400a(str, id);
            zzatwVar.m4401b(toString());
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f6897y.intValue() - ((zzatl) obj).f6897y.intValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m4392e() {
        zzato zzatoVar = this.f6898z;
        if (zzatoVar != null) {
            zzatoVar.m4399c();
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m4393f() {
        int i2 = this.f6892t;
        String str = this.f6893u;
        if (i2 == 0) {
            return str;
        }
        String string = Integer.toString(1);
        return AbstractC1456a.m2450q(new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length()), string, "-", str);
    }

    /* JADX INFO: renamed from: g */
    public Map mo3111g() {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: h */
    public byte[] mo3112h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4394i() {
        boolean z;
        synchronized (this.f6895w) {
            z = this.f6887A;
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public abstract zzatr mo3115j(zzath zzathVar);

    /* JADX INFO: renamed from: k */
    public abstract void mo3113k(Object obj);

    /* JADX INFO: renamed from: l */
    public final void m4395l(zzatr zzatrVar) {
        zzatk zzatkVar;
        synchronized (this.f6895w) {
            zzatkVar = this.f6889C;
        }
        if (zzatkVar != null) {
            zzatkVar.mo4389b(this, zzatrVar);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4396m() {
        zzatk zzatkVar;
        synchronized (this.f6895w) {
            zzatkVar = this.f6889C;
        }
        if (zzatkVar != null) {
            zzatkVar.mo4388a(this);
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f6894v));
        synchronized (this.f6895w) {
        }
        Integer num = this.f6897y;
        String str = this.f6893u;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb = new StringBuilder(strConcat.length() + length + 5 + 8 + length2);
        AbstractC0271e0.m413u(sb, "[ ] ", str, " ", strConcat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }
}
