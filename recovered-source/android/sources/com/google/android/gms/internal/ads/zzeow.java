package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzeow {

    /* JADX INFO: renamed from: c */
    public final zzhcy f14438c;

    /* JADX INFO: renamed from: f */
    public zzepm f14441f;

    /* JADX INFO: renamed from: h */
    public final String f14443h;

    /* JADX INFO: renamed from: i */
    public final int f14444i;

    /* JADX INFO: renamed from: j */
    public final zzepl f14445j;

    /* JADX INFO: renamed from: k */
    public zzfkn f14446k;

    /* JADX INFO: renamed from: a */
    public final HashMap f14436a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final ArrayList f14437b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f14439d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HashSet f14440e = new HashSet();

    /* JADX INFO: renamed from: g */
    public int f14442g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l */
    public boolean f14447l = false;

    public zzeow(zzfky zzfkyVar, zzepl zzeplVar, zzhcy zzhcyVar) {
        this.f14444i = zzfkyVar.f16006b.f16002b.f15989r;
        this.f14445j = zzeplVar;
        this.f14438c = zzhcyVar;
        this.f14443h = zzeps.m6312a(zzfkyVar);
        List list = zzfkyVar.f16006b.f16001a;
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f14436a.put((zzfkn) list.get(i2), Integer.valueOf(i2));
        }
        this.f14437b.addAll(list);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized zzfkn m6298a() {
        try {
            if (m6301d()) {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = this.f14437b;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    zzfkn zzfknVar = (zzfkn) arrayList.get(i2);
                    String str = zzfknVar.f15955t0;
                    HashSet hashSet = this.f14440e;
                    if (!hashSet.contains(str)) {
                        if (zzfknVar.f15959v0) {
                            this.f14447l = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            hashSet.add(str);
                        }
                        this.f14439d.add(zzfknVar);
                        return (zzfkn) arrayList.remove(i2);
                    }
                    i2++;
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6299b(zzepm zzepmVar, zzfkn zzfknVar) {
        boolean z;
        z = false;
        this.f14447l = false;
        this.f14439d.remove(zzfknVar);
        synchronized (this) {
        }
        if (this.f14438c.isDone()) {
            zzepmVar.mo5869e();
            return;
        }
        Integer num = (Integer) this.f14436a.get(zzfknVar);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (iIntValue > this.f14442g) {
            this.f14445j.m6309c(zzfknVar);
            return;
        }
        if (this.f14441f != null) {
            this.f14445j.m6309c(this.f14446k);
        }
        this.f14442g = iIntValue;
        this.f14441f = zzepmVar;
        this.f14446k = zzfknVar;
        synchronized (this) {
            try {
                if (m6302e(true)) {
                    z = true;
                } else {
                    synchronized (this) {
                        try {
                            ArrayList arrayList = this.f14439d;
                            int size = arrayList.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 < size) {
                                    Object obj = arrayList.get(i2);
                                    i2++;
                                    Integer num2 = (Integer) this.f14436a.get((zzfkn) obj);
                                    if ((num2 != null ? num2.intValue() : Integer.MAX_VALUE) < this.f14442g) {
                                        z = true;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z) {
                    return;
                }
                m6303f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6300c(zzfkn zzfknVar) {
        boolean z;
        z = false;
        this.f14447l = false;
        this.f14439d.remove(zzfknVar);
        this.f14440e.remove(zzfknVar.f15955t0);
        synchronized (this) {
        }
        if (!this.f14438c.isDone()) {
            synchronized (this) {
                if (m6302e(true)) {
                    z = true;
                } else {
                    synchronized (this) {
                        try {
                            ArrayList arrayList = this.f14439d;
                            int size = arrayList.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 < size) {
                                    Object obj = arrayList.get(i2);
                                    i2++;
                                    Integer num = (Integer) this.f14436a.get((zzfkn) obj);
                                    if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.f14442g) {
                                        z = true;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (!z) {
                    m6303f();
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m6301d() {
        if (this.f14447l) {
            return false;
        }
        ArrayList arrayList = this.f14437b;
        if (!arrayList.isEmpty() && ((zzfkn) arrayList.get(0)).f15959v0 && !this.f14439d.isEmpty()) {
            return false;
        }
        synchronized (this) {
            if (!this.f14438c.isDone()) {
                ArrayList arrayList2 = this.f14439d;
                if (arrayList2.size() < this.f14444i && m6302e(false)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m6302e(boolean z) {
        try {
            ArrayList arrayList = this.f14437b;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                zzfkn zzfknVar = (zzfkn) obj;
                Integer num = (Integer) this.f14436a.get(zzfknVar);
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z || !this.f14440e.contains(zzfknVar.f15955t0)) {
                    int i3 = this.f14442g;
                    if (iIntValue < i3) {
                        return true;
                    }
                    if (iIntValue > i3) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m6303f() {
        zzepl zzeplVar = this.f14445j;
        zzfkn zzfknVar = this.f14446k;
        synchronized (zzeplVar) {
            try {
                zzeplVar.f14541h = zzeplVar.f14534a.mo3639a() - zzeplVar.f14542i;
                if (zzfknVar != null) {
                    zzeplVar.f14539f.m6288a(zzfknVar);
                }
                zzeplVar.f14540g = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        zzepm zzepmVar = this.f14441f;
        if (zzepmVar != null) {
            this.f14438c.m7320c(zzepmVar);
        } else {
            this.f14438c.m7321d(new zzepp(3, this.f14443h));
        }
    }
}
