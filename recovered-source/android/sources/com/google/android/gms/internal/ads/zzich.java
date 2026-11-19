package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzich extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: A */
    public static final Comparator f19657A = new zzica();

    /* JADX INFO: renamed from: s */
    public final Comparator f19658s;

    /* JADX INFO: renamed from: t */
    public final boolean f19659t;

    /* JADX INFO: renamed from: u */
    public zzicg f19660u;

    /* JADX INFO: renamed from: v */
    public int f19661v;

    /* JADX INFO: renamed from: w */
    public int f19662w;

    /* JADX INFO: renamed from: x */
    public final zzicg f19663x;

    /* JADX INFO: renamed from: y */
    public zzicc f19664y;

    /* JADX INFO: renamed from: z */
    public zzice f19665z;

    public zzich() {
        this(f19657A, true);
    }

    /* JADX INFO: renamed from: a */
    public final zzicg m8064a(Object obj, boolean z) {
        int iCompareTo;
        zzicg zzicgVar;
        zzicg zzicgVar2 = this.f19660u;
        Comparator comparator = f19657A;
        Comparator comparator2 = this.f19658s;
        if (zzicgVar2 != null) {
            Comparable comparable = comparator2 == comparator ? (Comparable) obj : null;
            while (true) {
                Object obj2 = zzicgVar2.f19654x;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator2.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return zzicgVar2;
                }
                zzicg zzicgVar3 = iCompareTo < 0 ? zzicgVar2.f19650t : zzicgVar2.f19651u;
                if (zzicgVar3 == null) {
                    break;
                }
                zzicgVar2 = zzicgVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        zzicg zzicgVar4 = this.f19663x;
        if (zzicgVar2 != null) {
            zzicg zzicgVar5 = zzicgVar2;
            zzicgVar = new zzicg(this.f19659t, zzicgVar5, obj, zzicgVar4, zzicgVar4.f19653w);
            if (iCompareTo < 0) {
                zzicgVar5.f19650t = zzicgVar;
            } else {
                zzicgVar5.f19651u = zzicgVar;
            }
            m8067d(zzicgVar5, true);
        } else {
            if (comparator2 == comparator && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            zzicgVar = new zzicg(this.f19659t, null, obj, zzicgVar4, zzicgVar4.f19653w);
            this.f19660u = zzicgVar;
        }
        this.f19661v++;
        this.f19662w++;
        return zzicgVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m8065b(zzicg zzicgVar, boolean z) {
        zzicg zzicgVar2;
        zzicg zzicgVar3;
        int i2;
        if (z) {
            zzicg zzicgVar4 = zzicgVar.f19653w;
            zzicgVar4.f19652v = zzicgVar.f19652v;
            zzicgVar.f19652v.f19653w = zzicgVar4;
        }
        zzicg zzicgVar5 = zzicgVar.f19650t;
        zzicg zzicgVar6 = zzicgVar.f19651u;
        zzicg zzicgVar7 = zzicgVar.f19649s;
        int i3 = 0;
        if (zzicgVar5 == null || zzicgVar6 == null) {
            if (zzicgVar5 != null) {
                m8066c(zzicgVar, zzicgVar5);
                zzicgVar.f19650t = null;
            } else if (zzicgVar6 != null) {
                m8066c(zzicgVar, zzicgVar6);
                zzicgVar.f19651u = null;
            } else {
                m8066c(zzicgVar, null);
            }
            m8067d(zzicgVar7, false);
            this.f19661v--;
            this.f19662w++;
            return;
        }
        if (zzicgVar5.f19648A > zzicgVar6.f19648A) {
            do {
                zzicgVar3 = zzicgVar5;
                zzicgVar5 = zzicgVar5.f19651u;
            } while (zzicgVar5 != null);
        } else {
            do {
                zzicgVar2 = zzicgVar6;
                zzicgVar6 = zzicgVar6.f19650t;
            } while (zzicgVar6 != null);
            zzicgVar3 = zzicgVar2;
        }
        m8065b(zzicgVar3, false);
        zzicg zzicgVar8 = zzicgVar.f19650t;
        if (zzicgVar8 != null) {
            i2 = zzicgVar8.f19648A;
            zzicgVar3.f19650t = zzicgVar8;
            zzicgVar8.f19649s = zzicgVar3;
            zzicgVar.f19650t = null;
        } else {
            i2 = 0;
        }
        zzicg zzicgVar9 = zzicgVar.f19651u;
        if (zzicgVar9 != null) {
            i3 = zzicgVar9.f19648A;
            zzicgVar3.f19651u = zzicgVar9;
            zzicgVar9.f19649s = zzicgVar3;
            zzicgVar.f19651u = null;
        }
        zzicgVar3.f19648A = Math.max(i2, i3) + 1;
        m8066c(zzicgVar, zzicgVar3);
    }

    /* JADX INFO: renamed from: c */
    public final void m8066c(zzicg zzicgVar, zzicg zzicgVar2) {
        zzicg zzicgVar3 = zzicgVar.f19649s;
        zzicgVar.f19649s = null;
        if (zzicgVar2 != null) {
            zzicgVar2.f19649s = zzicgVar3;
        }
        if (zzicgVar3 == null) {
            this.f19660u = zzicgVar2;
        } else if (zzicgVar3.f19650t == zzicgVar) {
            zzicgVar3.f19650t = zzicgVar2;
        } else {
            zzicgVar3.f19651u = zzicgVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f19660u = null;
        this.f19661v = 0;
        this.f19662w++;
        zzicg zzicgVar = this.f19663x;
        zzicgVar.f19653w = zzicgVar;
        zzicgVar.f19652v = zzicgVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        zzicg zzicgVarM8064a = null;
        if (obj != null) {
            try {
                zzicgVarM8064a = m8064a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return zzicgVarM8064a != null;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0080 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final void m8067d(zzicg zzicgVar, boolean z) {
        while (zzicgVar != null) {
            zzicg zzicgVar2 = zzicgVar.f19650t;
            zzicg zzicgVar3 = zzicgVar.f19651u;
            boolean z2 = false;
            int i2 = zzicgVar2 != null ? zzicgVar2.f19648A : 0;
            int i3 = zzicgVar3 != null ? zzicgVar3.f19648A : 0;
            int i4 = i2 - i3;
            boolean z3 = true;
            if (i4 == -2) {
                zzicg zzicgVar4 = zzicgVar3.f19650t;
                zzicg zzicgVar5 = zzicgVar3.f19651u;
                int i5 = (zzicgVar4 != null ? zzicgVar4.f19648A : 0) - (zzicgVar5 != null ? zzicgVar5.f19648A : 0);
                if (i5 != -1) {
                    if (i5 == 0) {
                        if (!z) {
                        }
                        if (z3) {
                            return;
                        }
                    } else {
                        z3 = z;
                    }
                    m8069f(zzicgVar3);
                    m8068e(zzicgVar);
                    if (z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                m8068e(zzicgVar);
                z3 = z2;
                if (z3) {
                    return;
                }
            } else if (i4 == 2) {
                zzicg zzicgVar6 = zzicgVar2.f19650t;
                zzicg zzicgVar7 = zzicgVar2.f19651u;
                int i6 = (zzicgVar6 != null ? zzicgVar6.f19648A : 0) - (zzicgVar7 != null ? zzicgVar7.f19648A : 0);
                if (i6 != 1) {
                    if (i6 == 0) {
                        if (!z) {
                        }
                        if (z3) {
                            return;
                        }
                    } else {
                        z3 = z;
                    }
                    m8068e(zzicgVar2);
                    m8069f(zzicgVar);
                    if (z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                m8069f(zzicgVar);
                z3 = z2;
                if (z3) {
                    return;
                }
            } else if (i4 == 0) {
                zzicgVar.f19648A = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                zzicgVar.f19648A = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            zzicgVar = zzicgVar.f19649s;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8068e(zzicg zzicgVar) {
        zzicg zzicgVar2 = zzicgVar.f19650t;
        zzicg zzicgVar3 = zzicgVar.f19651u;
        zzicg zzicgVar4 = zzicgVar3.f19650t;
        zzicg zzicgVar5 = zzicgVar3.f19651u;
        zzicgVar.f19651u = zzicgVar4;
        if (zzicgVar4 != null) {
            zzicgVar4.f19649s = zzicgVar;
        }
        m8066c(zzicgVar, zzicgVar3);
        zzicgVar3.f19650t = zzicgVar;
        zzicgVar.f19649s = zzicgVar3;
        int iMax = Math.max(zzicgVar2 != null ? zzicgVar2.f19648A : 0, zzicgVar4 != null ? zzicgVar4.f19648A : 0) + 1;
        zzicgVar.f19648A = iMax;
        zzicgVar3.f19648A = Math.max(iMax, zzicgVar5 != null ? zzicgVar5.f19648A : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzicc zziccVar = this.f19664y;
        if (zziccVar != null) {
            return zziccVar;
        }
        zzicc zziccVar2 = new zzicc(this);
        this.f19664y = zziccVar2;
        return zziccVar2;
    }

    /* JADX INFO: renamed from: f */
    public final void m8069f(zzicg zzicgVar) {
        zzicg zzicgVar2 = zzicgVar.f19650t;
        zzicg zzicgVar3 = zzicgVar.f19651u;
        zzicg zzicgVar4 = zzicgVar2.f19650t;
        zzicg zzicgVar5 = zzicgVar2.f19651u;
        zzicgVar.f19650t = zzicgVar5;
        if (zzicgVar5 != null) {
            zzicgVar5.f19649s = zzicgVar;
        }
        m8066c(zzicgVar, zzicgVar2);
        zzicgVar2.f19651u = zzicgVar;
        zzicgVar.f19649s = zzicgVar2;
        int iMax = Math.max(zzicgVar3 != null ? zzicgVar3.f19648A : 0, zzicgVar5 != null ? zzicgVar5.f19648A : 0) + 1;
        zzicgVar.f19648A = iMax;
        zzicgVar2.f19648A = Math.max(iMax, zzicgVar4 != null ? zzicgVar4.f19648A : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzicg zzicgVarM8064a;
        if (obj != null) {
            try {
                zzicgVarM8064a = m8064a(obj, false);
            } catch (ClassCastException unused) {
                zzicgVarM8064a = null;
            }
        } else {
            zzicgVarM8064a = null;
        }
        if (zzicgVarM8064a != null) {
            return zzicgVarM8064a.f19656z;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzice zziceVar = this.f19665z;
        if (zziceVar != null) {
            return zziceVar;
        }
        zzice zziceVar2 = new zzice(this);
        this.f19665z = zziceVar2;
        return zziceVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f19659t) {
            throw new NullPointerException("value == null");
        }
        zzicg zzicgVarM8064a = m8064a(obj, true);
        Object obj3 = zzicgVarM8064a.f19656z;
        zzicgVarM8064a.f19656z = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzicg zzicgVarM8064a;
        if (obj != null) {
            try {
                zzicgVarM8064a = m8064a(obj, false);
            } catch (ClassCastException unused) {
                zzicgVarM8064a = null;
            }
        } else {
            zzicgVarM8064a = null;
        }
        if (zzicgVarM8064a != null) {
            m8065b(zzicgVarM8064a, true);
        }
        if (zzicgVarM8064a != null) {
            return zzicgVarM8064a.f19656z;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19661v;
    }

    public zzich(Comparator comparator, boolean z) {
        this.f19661v = 0;
        this.f19662w = 0;
        this.f19658s = comparator;
        this.f19659t = z;
        this.f19663x = new zzicg(z);
    }
}
