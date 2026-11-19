package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbfo {

    /* JADX INFO: renamed from: b */
    public int f7758b;

    /* JADX INFO: renamed from: a */
    public final Object f7757a = new Object();

    /* JADX INFO: renamed from: c */
    public final LinkedList f7759c = new LinkedList();

    /* JADX INFO: renamed from: a */
    public final void m4848a(zzbfn zzbfnVar) {
        synchronized (this.f7757a) {
            try {
                Iterator it = this.f7759c.iterator();
                while (it.hasNext()) {
                    zzbfn zzbfnVar2 = (zzbfn) it.next();
                    com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
                    if (zztVar.f3708h.m5387g().m3183i()) {
                        if (!zztVar.f3708h.m5387g().m3184j() && !zzbfnVar.equals(zzbfnVar2) && zzbfnVar2.f7756q.equals(zzbfnVar.f7756q)) {
                            it.remove();
                            return;
                        }
                    } else if (!zzbfnVar.equals(zzbfnVar2) && zzbfnVar2.f7754o.equals(zzbfnVar.f7754o)) {
                        it.remove();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4849b(zzbfn zzbfnVar) {
        synchronized (this.f7757a) {
            try {
                LinkedList linkedList = this.f7759c;
                if (linkedList.size() >= 10) {
                    int size = linkedList.size();
                    StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 30);
                    sb.append("Queue is full, current size = ");
                    sb.append(size);
                    String string = sb.toString();
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3068a(string);
                    linkedList.remove(0);
                }
                int i3 = this.f7758b;
                this.f7758b = i3 + 1;
                zzbfnVar.f7751l = i3;
                synchronized (zzbfnVar.f7746g) {
                    try {
                        int i4 = zzbfnVar.f7750k;
                        int i5 = zzbfnVar.f7751l;
                        int i6 = zzbfnVar.f7741b;
                        if (!zzbfnVar.f7743d) {
                            i6 = (i5 * i6) + (i4 * zzbfnVar.f7740a);
                        }
                        if (i6 > zzbfnVar.f7753n) {
                            zzbfnVar.f7753n = i6;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                linkedList.add(zzbfnVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
