package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzh {
    /* JADX INFO: renamed from: a */
    public static void m10003a(String str, int i2, List list) {
        if (list.size() == i2) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i2 + " parameters found " + list.size());
    }

    /* JADX INFO: renamed from: b */
    public static void m10004b(String str, int i2, List list) {
        if (list.size() >= i2) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i2 + " parameters found " + list.size());
    }

    /* JADX INFO: renamed from: c */
    public static void m10005c(int i2, String str, ArrayList arrayList) {
        if (arrayList.size() <= i2) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i2 + " parameters found " + arrayList.size());
    }

    /* JADX INFO: renamed from: d */
    public static boolean m10006d(zzao zzaoVar) {
        if (zzaoVar == null) {
            return false;
        }
        Double dMo9581d = zzaoVar.mo9581d();
        return !dMo9581d.isNaN() && dMo9581d.doubleValue() >= 0.0d && dMo9581d.equals(Double.valueOf(Math.floor(dMo9581d.doubleValue())));
    }

    /* JADX INFO: renamed from: e */
    public static zzbk m10007e(String str) {
        zzbk zzbkVar = null;
        if (str != null && !str.isEmpty()) {
            zzbkVar = (zzbk) zzbk.f22271D0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (zzbkVar != null) {
            return zzbkVar;
        }
        throw new IllegalArgumentException(AbstractC0271e0.m398f("Unsupported commandId ", str));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m10008f(zzao zzaoVar, zzao zzaoVar2) {
        if (!zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            return false;
        }
        if ((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) {
            return true;
        }
        if (zzaoVar instanceof zzah) {
            if (Double.isNaN(zzaoVar.mo9581d().doubleValue()) || Double.isNaN(zzaoVar2.mo9581d().doubleValue())) {
                return false;
            }
            return zzaoVar.mo9581d().equals(zzaoVar2.mo9581d());
        }
        if (zzaoVar instanceof zzas) {
            return zzaoVar.zzc().equals(zzaoVar2.zzc());
        }
        if (zzaoVar instanceof zzaf) {
            return zzaoVar.mo9579a().equals(zzaoVar2.mo9579a());
        }
        return zzaoVar == zzaoVar2;
    }

    /* JADX INFO: renamed from: g */
    public static int m10009g(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    /* JADX INFO: renamed from: h */
    public static double m10010h(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return ((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    /* JADX INFO: renamed from: i */
    public static Object m10011i(zzao zzaoVar) {
        if (zzao.f22238l.equals(zzaoVar)) {
            return null;
        }
        if (zzao.f22237k.equals(zzaoVar)) {
            return "";
        }
        if (zzaoVar instanceof zzal) {
            return m10012j((zzal) zzaoVar);
        }
        if (!(zzaoVar instanceof zzae)) {
            return !zzaoVar.mo9581d().isNaN() ? zzaoVar.mo9581d() : zzaoVar.zzc();
        }
        ArrayList arrayList = new ArrayList();
        zzae zzaeVar = (zzae) zzaoVar;
        zzaeVar.getClass();
        zzad zzadVar = new zzad(zzaeVar);
        while (zzadVar.hasNext()) {
            Object objM10011i = m10011i((zzao) zzadVar.next());
            if (objM10011i != null) {
                arrayList.add(objM10011i);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static HashMap m10012j(zzal zzalVar) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(zzalVar.f22233s.keySet());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str = (String) obj;
            Object objM10011i = m10011i(zzalVar.mo9582g(str));
            if (objM10011i != null) {
                map.put(str, objM10011i);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: k */
    public static void m10013k(zzg zzgVar) {
        int iM10009g = m10009g(zzgVar.m9956g("runtime.counter").mo9581d().doubleValue() + 1.0d);
        if (iM10009g > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        zzgVar.m9954e("runtime.counter", new zzah(Double.valueOf(iM10009g)));
    }
}
