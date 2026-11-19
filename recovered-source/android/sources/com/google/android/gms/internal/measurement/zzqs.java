package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p003C.AbstractC0109D;
import p003C.AbstractC0120k;
import p003C.AbstractC0122m;
import p003C.C0106A;
import p003C.C0113d;
import p003C.C0118i;
import p003C.C0121l;
import p003C.C0134y;
import p003C.C0135z;
import p011H.AbstractC0243G;

/* JADX INFO: loaded from: classes2.dex */
final class zzqs {

    /* JADX INFO: renamed from: a */
    public final boolean f22793a = true;

    /* JADX INFO: renamed from: b */
    public final String f22794b;

    /* JADX INFO: renamed from: c */
    public final zzacr f22795c;

    /* JADX INFO: renamed from: d */
    public final C0134y f22796d;

    /* JADX INFO: renamed from: e */
    public final zzqr f22797e;

    /* JADX WARN: Code duplicated, block: B:109:0x0271  */
    /* JADX WARN: Code duplicated, block: B:110:0x0274  */
    /* JADX WARN: Code duplicated, block: B:113:0x027a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0292  */
    /* JADX WARN: Code duplicated, block: B:117:0x0297  */
    /* JADX WARN: Code duplicated, block: B:118:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:124:0x02de  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:160:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f5  */
    public zzqs(zznd zzndVar, zzqr zzqrVar) {
        C0134y c0134yM198a;
        char c;
        long j2;
        long j3;
        String str;
        int i2 = 1;
        zzmw zzmwVar = zzndVar.f22674a;
        zzmq zzmqVar = zzndVar.f22675b;
        if (zzmwVar.f22662a.isEmpty()) {
            zzmq.m10520H().equals(zzmqVar);
        }
        this.f22794b = zzmqVar.m10521A();
        this.f22795c = zzmqVar.m10522B();
        zzmqVar.getClass();
        zzmqVar.getClass();
        Map mapM10526F = zzmqVar.m10525E() == 0 ? null : zzmqVar.m10526F();
        if (mapM10526F != null) {
            AbstractC0120k.m205q(mapM10526F.keySet());
        } else {
            Object[] objArr = C0135z.f208A;
        }
        zzmw zzmwVar2 = zzndVar.f22674a;
        char c2 = 3;
        if (zzmqVar.m10525E() > 0) {
            Collection<zzmi> collectionValues = zzmqVar.m10526F().values();
            if (collectionValues == null) {
                c0134yM198a = C0134y.f204y;
            } else {
                C0118i c0118i = new C0118i(4);
                for (zzmi zzmiVar : collectionValues) {
                    int iM10513O = zzmiVar.m10513O();
                    int i3 = iM10513O - 1;
                    if (iM10513O == 0) {
                        throw null;
                    }
                    if (i3 == 0) {
                        c0118i.m200d(zzmiVar.m10501A(), Long.valueOf(zzmiVar.m10502B()));
                    } else if (i3 == 1) {
                        c0118i.m200d(zzmiVar.m10501A(), Boolean.valueOf(zzmiVar.m10503C()));
                    } else if (i3 == 2) {
                        c0118i.m200d(zzmiVar.m10501A(), Double.valueOf(zzmiVar.m10504D()));
                    } else if (i3 == 3) {
                        c0118i.m200d(zzmiVar.m10501A(), zzmiVar.m10505E());
                    } else {
                        if (i3 != 4) {
                            throw new IllegalStateException("Could not serialize Flag for override: ".concat(String.valueOf(zzmiVar.m10501A())));
                        }
                        c0118i.m200d(zzmiVar.m10501A(), zzmiVar.m10506F().m9383q());
                    }
                }
                c0134yM198a = c0118i.m198a(false);
            }
            if (!c0134yM198a.isEmpty()) {
                HashMap map = new HashMap(c0134yM198a);
                AbstractC0122m abstractC0122m = zzmwVar2.f22662a;
                C0121l c0121l = new C0121l();
                AbstractC0109D it = abstractC0122m.iterator();
                while (true) {
                    C0113d c0113d = (C0113d) it;
                    if (!c0113d.hasNext()) {
                        for (String str2 : map.keySet()) {
                            Object obj = map.get(str2);
                            int length = str2.length();
                            if (length <= 19) {
                                if (length == 0) {
                                    c = c2;
                                } else {
                                    c = c2;
                                    long jCharAt = str2.charAt(0) - '0';
                                    if (jCharAt >= 1) {
                                        if (jCharAt <= 9) {
                                            int i4 = i2;
                                            while (true) {
                                                if (i4 >= length) {
                                                    j2 = 0;
                                                    if (jCharAt >= 0 && jCharAt <= 2305843009213693951L) {
                                                        j3 = jCharAt;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                int iCharAt = str2.charAt(i4) - '0';
                                                j2 = 0;
                                                if (!((iCharAt < 0) | (iCharAt > 9))) {
                                                    jCharAt = (jCharAt * 10) + ((long) iCharAt);
                                                    i4++;
                                                }
                                            }
                                        }
                                        if (j3 == j2) {
                                            str = str2;
                                        } else {
                                            str = null;
                                        }
                                        if (obj instanceof String) {
                                            c0121l.m185a(new zzmv(j3, str, 4, 0L, obj));
                                        } else if (obj instanceof byte[]) {
                                            c0121l.m185a(new zzmv(j3, str, 5, 0L, obj));
                                        } else if (obj instanceof Boolean) {
                                            c0121l.m185a(new zzmv(j3, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                        } else if (obj instanceof Long) {
                                            c0121l.m185a(new zzmv(j3, str, 2, ((Long) obj).longValue(), null));
                                        } else {
                                            if (obj instanceof Double) {
                                                String strValueOf = String.valueOf(obj);
                                                throw new IllegalStateException(AbstractC1456a.m2451r(new StringBuilder(str2.length() + 28 + strValueOf.length()), "Cannot serialize override ", str2, ": ", strValueOf));
                                            }
                                            c0121l.m185a(new zzmv(j3, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                        }
                                        c2 = c;
                                        i2 = 1;
                                    }
                                    j3 = j2;
                                    if (j3 == j2) {
                                        str = str2;
                                    } else {
                                        str = null;
                                    }
                                    if (obj instanceof String) {
                                        c0121l.m185a(new zzmv(j3, str, 4, 0L, obj));
                                    } else if (obj instanceof byte[]) {
                                        c0121l.m185a(new zzmv(j3, str, 5, 0L, obj));
                                    } else if (obj instanceof Boolean) {
                                        c0121l.m185a(new zzmv(j3, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                    } else if (obj instanceof Long) {
                                        c0121l.m185a(new zzmv(j3, str, 2, ((Long) obj).longValue(), null));
                                    } else {
                                        if (obj instanceof Double) {
                                            String strValueOf2 = String.valueOf(obj);
                                            throw new IllegalStateException(AbstractC1456a.m2451r(new StringBuilder(str2.length() + 28 + strValueOf2.length()), "Cannot serialize override ", str2, ": ", strValueOf2));
                                        }
                                        c0121l.m185a(new zzmv(j3, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                    }
                                    c2 = c;
                                    i2 = 1;
                                }
                                j2 = 0;
                                j3 = 0;
                                if (j3 == j2) {
                                    str = str2;
                                } else {
                                    str = null;
                                }
                                if (obj instanceof String) {
                                    c0121l.m185a(new zzmv(j3, str, 4, 0L, obj));
                                } else if (obj instanceof byte[]) {
                                    c0121l.m185a(new zzmv(j3, str, 5, 0L, obj));
                                } else if (obj instanceof Boolean) {
                                    c0121l.m185a(new zzmv(j3, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                } else if (obj instanceof Long) {
                                    c0121l.m185a(new zzmv(j3, str, 2, ((Long) obj).longValue(), null));
                                } else {
                                    if (obj instanceof Double) {
                                        String strValueOf3 = String.valueOf(obj);
                                        throw new IllegalStateException(AbstractC1456a.m2451r(new StringBuilder(str2.length() + 28 + strValueOf3.length()), "Cannot serialize override ", str2, ": ", strValueOf3));
                                    }
                                    c0121l.m185a(new zzmv(j3, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                }
                                c2 = c;
                                i2 = 1;
                            } else {
                                c = c2;
                            }
                            j2 = 0;
                            j3 = j2;
                            if (j3 == j2) {
                                str = str2;
                            } else {
                                str = null;
                            }
                            if (obj instanceof String) {
                                c0121l.m185a(new zzmv(j3, str, 4, 0L, obj));
                            } else if (obj instanceof byte[]) {
                                c0121l.m185a(new zzmv(j3, str, 5, 0L, obj));
                            } else if (obj instanceof Boolean) {
                                c0121l.m185a(new zzmv(j3, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                            } else if (obj instanceof Long) {
                                c0121l.m185a(new zzmv(j3, str, 2, ((Long) obj).longValue(), null));
                            } else {
                                if (obj instanceof Double) {
                                    String strValueOf4 = String.valueOf(obj);
                                    throw new IllegalStateException(AbstractC1456a.m2451r(new StringBuilder(str2.length() + 28 + strValueOf4.length()), "Cannot serialize override ", str2, ": ", strValueOf4));
                                }
                                c0121l.m185a(new zzmv(j3, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                            }
                            c2 = c;
                            i2 = 1;
                        }
                        zzmwVar2 = new zzmw(c0121l.m207d());
                        break;
                    }
                    zzmv zzmvVar = (zzmv) c0113d.next();
                    Object obj2 = zzmvVar.f22656t;
                    long j4 = zzmvVar.f22655s;
                    Object objRemove = map.remove(obj2 == null ? Long.toString(j4) : obj2);
                    if (objRemove == null) {
                        c0121l.m185a(zzmvVar);
                    } else if (objRemove instanceof String) {
                        c0121l.m185a(new zzmv(zzmvVar.f22655s, zzmvVar.f22656t, 4, 0L, objRemove));
                    } else if (objRemove instanceof byte[]) {
                        c0121l.m185a(new zzmv(zzmvVar.f22655s, zzmvVar.f22656t, 5, 0L, objRemove));
                    } else if (objRemove instanceof Boolean) {
                        c0121l.m185a(new zzmv(zzmvVar.f22655s, zzmvVar.f22656t, ((Boolean) objRemove).booleanValue() ? 1 : 0, 0L, null));
                    } else if (objRemove instanceof Long) {
                        c0121l.m185a(new zzmv(zzmvVar.f22655s, zzmvVar.f22656t, 2, ((Long) objRemove).longValue(), null));
                    } else {
                        if (!(objRemove instanceof Double)) {
                            String string = zzmvVar.f22656t;
                            string = string == null ? Long.toString(j4) : string;
                            String string2 = objRemove.toString();
                            throw new IllegalStateException(AbstractC1456a.m2451r(new StringBuilder(String.valueOf(string).length() + 46 + string2.length()), "Cannot serialize override for existing flag ", string, ": ", string2));
                        }
                        c0121l.m185a(new zzmv(zzmvVar.f22655s, zzmvVar.f22656t, 3, Double.doubleToRawLongBits(((Double) objRemove).doubleValue()), null));
                    }
                }
            }
        }
        int size = ((C0106A) zzmwVar2.f22662a).f155y.size() + 3;
        AbstractC0243G.m371i(size, "expectedSize");
        C0118i c0118i2 = new C0118i(size);
        AbstractC0109D it2 = zzmwVar2.f22662a.iterator();
        while (true) {
            C0113d c0113d2 = (C0113d) it2;
            if (!c0113d2.hasNext()) {
                c0118i2.m200d("__phenotype_server_token", zzmqVar.m10523C());
                c0118i2.m200d("__phenotype_snapshot_token", zzmqVar.m10521A());
                c0118i2.m200d("__phenotype_configuration_version", Long.valueOf(zzmqVar.m10524D()));
                this.f22796d = c0118i2.m198a(false);
                this.f22797e = zzqrVar;
                return;
            }
            zzmv zzmvVar2 = (zzmv) c0113d2.next();
            String string3 = zzmvVar2.f22656t;
            if (string3 == null) {
                string3 = Long.toString(zzmvVar2.f22655s);
            }
            c0118i2.m200d(string3, zzmvVar2.m10528b());
        }
    }

    public zzqs(zzqv zzqvVar, zzqr zzqrVar) {
        zzqv.m10595H().equals(zzqvVar);
        this.f22794b = zzqvVar.m10596A();
        this.f22795c = zzqvVar.m10597B();
        int i2 = AbstractC0120k.f179u;
        Object[] objArr = C0135z.f208A;
        int iM10601F = zzqvVar.m10601F() + 3;
        AbstractC0243G.m371i(iM10601F, "expectedSize");
        C0118i c0118i = new C0118i(iM10601F);
        for (zzqx zzqxVar : zzqvVar.m10600E()) {
            int iM10620N = zzqxVar.m10620N();
            int i3 = iM10620N - 1;
            if (iM10620N == 0) {
                throw null;
            }
            if (i3 == 0) {
                c0118i.m200d(zzqxVar.m10608A(), Long.valueOf(zzqxVar.m10609B()));
            } else if (i3 == 1) {
                c0118i.m200d(zzqxVar.m10608A(), Boolean.valueOf(zzqxVar.m10610C()));
            } else if (i3 == 2) {
                c0118i.m200d(zzqxVar.m10608A(), Double.valueOf(zzqxVar.m10611D()));
            } else if (i3 == 3) {
                c0118i.m200d(zzqxVar.m10608A(), zzqxVar.m10612E());
            } else if (i3 == 4) {
                c0118i.m200d(zzqxVar.m10608A(), zzqxVar.m10613F().m9383q());
            }
        }
        c0118i.m200d("__phenotype_server_token", zzqvVar.m10598C());
        c0118i.m200d("__phenotype_snapshot_token", zzqvVar.m10596A());
        c0118i.m200d("__phenotype_configuration_version", Long.valueOf(zzqvVar.m10599D()));
        this.f22796d = c0118i.m198a(false);
        this.f22797e = zzqrVar;
    }
}
