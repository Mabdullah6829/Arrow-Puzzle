package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.internal.ads.zziej;
import com.google.android.gms.internal.ads.zziep;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zziep<MessageType extends zziep<MessageType, BuilderType>, BuilderType extends zziej<MessageType, BuilderType>> extends zzicu<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static final Map<Class<?>, zziep<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zzihe zzt = zzihe.f19896f;

    /* JADX INFO: renamed from: A */
    public static final boolean m8330A(zziep zziepVar, boolean z) {
        byte bByteValue = ((Byte) zziepVar.mo4492z(zzieo.f19782s, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo8394b = zzigj.f19860c.m8411a(zziepVar.getClass()).mo8394b(zziepVar);
        if (z) {
            zziepVar.mo4492z(zzieo.f19783t, true == zMo8394b ? zziepVar : null);
        }
        return zMo8394b;
    }

    /* JADX INFO: renamed from: B */
    public static zziep m8331B(zziep zziepVar, byte[] bArr, int i2, zzidz zzidzVar) {
        if (i2 == 0) {
            return zziepVar;
        }
        zziep zziepVarM8345u = zziepVar.m8345u();
        try {
            zzigr zzigrVarM8411a = zzigj.f19860c.m8411a(zziepVarM8345u.getClass());
            zzigrVarM8411a.mo8397e(zziepVarM8345u, bArr, 0, i2, new zzicz(zzidzVar));
            zzigrVarM8411a.mo8395c(zziepVarM8345u);
            return zziepVarM8345u;
        } catch (zzifh e) {
            if (e.f19803s) {
                throw new zzifh(e.getMessage(), e);
            }
            throw e;
        } catch (zzihc e2) {
            throw new zzifh(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzifh) {
                throw ((zzifh) e3.getCause());
            }
            throw new zzifh(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m8332C(zziep zziepVar) {
        if (zziepVar != null && !m8330A(zziepVar, true)) {
            throw new zzifh(new zzihc().getMessage());
        }
    }

    /* JADX INFO: renamed from: q */
    public static Object m8333q(Method method, zziep zziepVar, Object... objArr) {
        try {
            return method.invoke(zziepVar, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: r */
    public static zziep m8334r(zziep zziepVar, zzidp zzidpVar, zzidz zzidzVar) throws zzifh {
        zziep zziepVarM8345u = zziepVar.m8345u();
        try {
            zzigr zzigrVarM8411a = zzigj.f19860c.m8411a(zziepVarM8345u.getClass());
            zzigrVarM8411a.mo8398f(zziepVarM8345u, zzidq.m8205x(zzidpVar), zzidzVar);
            zzigrVarM8411a.mo8395c(zziepVarM8345u);
            return zziepVarM8345u;
        } catch (zzifh e) {
            if (e.f19803s) {
                throw new zzifh(e.getMessage(), e);
            }
            throw e;
        } catch (zzihc e2) {
            throw new zzifh(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzifh) {
                throw ((zzifh) e3.getCause());
            }
            throw new zzifh(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzifh) {
                throw ((zzifh) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: renamed from: s */
    public static zziep m8335s(zziep zziepVar, zzidl zzidlVar, zzidz zzidzVar) {
        zzidp zzidpVarMo8140u = zzidlVar.mo8140u();
        zziep zziepVarM8334r = m8334r(zziepVar, zzidpVarMo8140u, zzidzVar);
        zzidpVarMo8140u.mo8170k(0);
        m8332C(zziepVarM8334r);
        return zziepVarM8334r;
    }

    /* JADX INFO: renamed from: t */
    public static zziep m8336t(zziep zziepVar, byte[] bArr, zzidz zzidzVar) {
        zziep zziepVarM8331B = m8331B(zziepVar, bArr, bArr.length, zzidzVar);
        m8332C(zziepVarM8331B);
        return zziepVarM8331B;
    }

    /* JADX INFO: renamed from: x */
    public static zziep m8337x(Class cls) {
        Map<Class<?>, zziep<?, ?>> map = zzd;
        zziep<?, ?> zziepVar = map.get(cls);
        if (zziepVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zziepVar = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zziepVar != null) {
            return zziepVar;
        }
        zziep<?, ?> zziepVar2 = (zziep) ((zziep) zzihk.m8472f(cls)).mo4492z(zzieo.f19787x, null);
        if (zziepVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zziepVar2);
        return zziepVar2;
    }

    /* JADX INFO: renamed from: y */
    public static void m8338y(Class cls, zziep zziepVar) {
        zziepVar.m8344p();
        zzd.put(cls, zziepVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifz
    /* JADX INFO: renamed from: a */
    public final int mo8339a() {
        return mo8101k(null);
    }

    @Override // com.google.android.gms.internal.ads.zziga
    /* JADX INFO: renamed from: b */
    public final zziep mo8340b() {
        return (zziep) mo4492z(zzieo.f19787x, null);
    }

    @Override // com.google.android.gms.internal.ads.zzifz
    /* JADX INFO: renamed from: d */
    public final zzify mo8103d() {
        return (zziej) mo4492z(zzieo.f19786w, null);
    }

    @Override // com.google.android.gms.internal.ads.zzifz
    /* JADX INFO: renamed from: e */
    public final zzigh mo8341e() {
        return (zzigh) mo4492z(zzieo.f19788y, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzigj.f19860c.m8411a(getClass()).mo8400h(this, (zziep) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzifz
    /* JADX INFO: renamed from: f */
    public final void mo8104f(zzidu zziduVar) {
        zzigr zzigrVarM8411a = zzigj.f19860c.m8411a(getClass());
        Object obj = zziduVar.f19751a;
        zzigrVarM8411a.mo8399g(this, obj != null ? (zzidv) obj : new zzidv(zziduVar));
    }

    public final int hashCode() {
        if (m8343o()) {
            return zzigj.f19860c.m8411a(getClass()).mo8396d(this);
        }
        if (this.zzq == 0) {
            this.zzq = zzigj.f19860c.m8411a(getClass()).mo8396d(this);
        }
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    /* JADX INFO: renamed from: i */
    public final int mo8100i() {
        return this.zzc & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    /* JADX INFO: renamed from: k */
    public final int mo8101k(zzigr zzigrVar) {
        int iMo8401i;
        int iMo8401i2;
        if (m8343o()) {
            if (zzigrVar == null) {
                iMo8401i2 = zzigj.f19860c.m8411a(getClass()).mo8401i(this);
            } else {
                iMo8401i2 = zzigrVar.mo8401i(this);
            }
            if (iMo8401i2 >= 0) {
                return iMo8401i2;
            }
            throw new IllegalStateException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iMo8401i2).length() + 42), "serialized size must be non-negative, was ", iMo8401i2));
        }
        if (mo8100i() != Integer.MAX_VALUE) {
            return mo8100i();
        }
        if (zzigrVar == null) {
            iMo8401i = zzigj.f19860c.m8411a(getClass()).mo8401i(this);
        } else {
            iMo8401i = zzigrVar.mo8401i(this);
        }
        m8342n(iMo8401i);
        return iMo8401i;
    }

    /* JADX INFO: renamed from: n */
    public final void m8342n(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 42), "serialized size must be non-negative, was ", i2));
        }
        this.zzc = i2 | (this.zzc & Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m8343o() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final void m8344p() {
        this.zzc &= Integer.MAX_VALUE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = zzigb.f19840a;
        StringBuilder sbM410r = AbstractC0271e0.m410r("# ", string);
        zzigb.m8371b(this, sbM410r, 0);
        return sbM410r.toString();
    }

    /* JADX INFO: renamed from: u */
    public final zziep m8345u() {
        return (zziep) mo4492z(zzieo.f19785v, null);
    }

    /* JADX INFO: renamed from: v */
    public final zziej m8346v() {
        return (zziej) mo4492z(zzieo.f19786w, null);
    }

    /* JADX INFO: renamed from: w */
    public final zziej m8347w() {
        zziej zziejVar = (zziej) mo4492z(zzieo.f19786w, null);
        zziejVar.m8329p(this);
        return zziejVar;
    }

    /* JADX INFO: renamed from: z */
    public abstract Object mo4492z(zzieo zzieoVar, zziep zziepVar);
}
