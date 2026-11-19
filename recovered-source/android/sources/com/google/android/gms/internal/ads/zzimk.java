package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public class zzimk implements Iterator, Closeable, zzaux {

    /* JADX INFO: renamed from: y */
    public static final zzauw f19971y = new zzimj("eof ");

    /* JADX INFO: renamed from: s */
    public zzaut f19972s;

    /* JADX INFO: renamed from: t */
    public zziml f19973t;

    /* JADX INFO: renamed from: u */
    public zzauw f19974u = null;

    /* JADX INFO: renamed from: v */
    public long f19975v = 0;

    /* JADX INFO: renamed from: w */
    public long f19976w = 0;

    /* JADX INFO: renamed from: x */
    public final ArrayList f19977x = new ArrayList();

    static {
        zzimr.m8544b(zzimk.class);
    }

    public void close() {
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final zzauw next() {
        zzauw zzauwVarMo4427a;
        zzauw zzauwVar = this.f19974u;
        if (zzauwVar != null && zzauwVar != f19971y) {
            this.f19974u = null;
            return zzauwVar;
        }
        zziml zzimlVar = this.f19973t;
        if (zzimlVar == null || this.f19975v >= this.f19976w) {
            this.f19974u = f19971y;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzimlVar) {
                this.f19973t.mo5498f(this.f19975v);
                zzauwVarMo4427a = this.f19972s.mo4427a(this.f19973t, this);
                this.f19975v = this.f19973t.zzc();
            }
            return zzauwVarMo4427a;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzauw zzauwVar = this.f19974u;
        zzauw zzauwVar2 = f19971y;
        if (zzauwVar == zzauwVar2) {
            return false;
        }
        if (zzauwVar != null) {
            return true;
        }
        try {
            this.f19974u = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f19974u = zzauwVar2;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f19977x;
            if (i2 >= arrayList.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i2 > 0) {
                sb.append(";");
            }
            sb.append(((zzauw) arrayList.get(i2)).toString());
            i2++;
        }
    }
}
