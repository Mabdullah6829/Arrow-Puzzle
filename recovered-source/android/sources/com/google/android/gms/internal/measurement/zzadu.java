package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.internal.measurement.zzadp;
import com.google.android.gms.internal.measurement.zzadu;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzadu<MessageType extends zzadu<MessageType, BuilderType>, BuilderType extends zzadp<MessageType, BuilderType>> extends zzacb<MessageType, BuilderType> {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb = -1;
    protected zzaga zzc = zzaga.f22121f;

    /* JADX INFO: renamed from: l */
    public static zzadu m9559l(zzadu zzaduVar, byte[] bArr, zzadf zzadfVar) throws zzaeh {
        int length = bArr.length;
        if (length != 0) {
            zzadu zzaduVarM9570p = zzaduVar.m9570p();
            try {
                zzafp zzafpVarM9649a = zzafl.f22093c.m9649a(zzaduVarM9570p.getClass());
                zzafpVarM9649a.mo9637g(zzaduVarM9570p, bArr, 0, length, new zzacg(zzadfVar));
                zzafpVarM9649a.mo9633c(zzaduVarM9570p);
                zzaduVar = zzaduVarM9570p;
            } catch (zzaeh e) {
                if (e.f22041s) {
                    throw new zzaeh(e.getMessage(), e);
                }
                throw e;
            } catch (zzafy e2) {
                throw e2.m9674a();
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzaeh) {
                    throw ((zzaeh) e3.getCause());
                }
                throw new zzaeh(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        m9564y(zzaduVar);
        return zzaduVar;
    }

    /* JADX INFO: renamed from: t */
    public static zzadu m9560t(Class cls) {
        Map map = zze;
        zzadu zzaduVar = (zzadu) map.get(cls);
        if (zzaduVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzaduVar = (zzadu) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzaduVar != null) {
            return zzaduVar;
        }
        zzadu zzaduVar2 = (zzadu) ((zzadu) zzagg.m9701d(cls)).mo9574z(6);
        if (zzaduVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzaduVar2);
        return zzaduVar2;
    }

    /* JADX INFO: renamed from: u */
    public static void m9561u(Class cls, zzadu zzaduVar) {
        zzaduVar.m9569o();
        zze.put(cls, zzaduVar);
    }

    /* JADX INFO: renamed from: v */
    public static Object m9562v(Method method, zzadu zzaduVar, Object... objArr) {
        try {
            return method.invoke(zzaduVar, objArr);
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

    /* JADX INFO: renamed from: x */
    public static final boolean m9563x(zzadu zzaduVar, boolean z) {
        byte bByteValue = ((Byte) zzaduVar.mo9574z(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo9632b = zzafl.f22093c.m9649a(zzaduVar.getClass()).mo9632b(zzaduVar);
        if (z) {
            zzaduVar.mo9574z(2);
        }
        return zMo9632b;
    }

    /* JADX INFO: renamed from: y */
    public static void m9564y(zzadu zzaduVar) throws zzaeh {
        if (zzaduVar != null && !m9563x(zzaduVar, true)) {
            throw new zzafy().m9674a();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafd
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzadu mo9565a() {
        return (zzadu) mo9574z(6);
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzafb mo9348c() {
        return (zzadp) mo9574z(5);
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    /* JADX INFO: renamed from: d */
    public final zzafj mo9566d() {
        return (zzafj) mo9574z(7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzafl.f22093c.m9649a(getClass()).mo9636f(this, (zzadu) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    /* JADX INFO: renamed from: f */
    public final int mo9567f() {
        if (m9568m()) {
            int iMo9635e = zzafl.f22093c.m9649a(getClass()).mo9635e(this);
            if (iMo9635e >= 0) {
                return iMo9635e;
            }
            StringBuilder sb = new StringBuilder(AbstractC1456a.m2434a(iMo9635e, 42));
            sb.append("serialized size must be non-negative, was ");
            sb.append(iMo9635e);
            throw new IllegalStateException(sb.toString());
        }
        int i2 = this.zzb & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int iMo9635e2 = zzafl.f22093c.m9649a(getClass()).mo9635e(this);
        if (iMo9635e2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iMo9635e2;
            return iMo9635e2;
        }
        StringBuilder sb2 = new StringBuilder(AbstractC1456a.m2434a(iMo9635e2, 42));
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iMo9635e2);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    /* JADX INFO: renamed from: g */
    public final void mo9349g(zzada zzadaVar) {
        zzafp zzafpVarM9649a = zzafl.f22093c.m9649a(getClass());
        Object obj = zzadaVar.f22005a;
        zzafpVarM9649a.mo9634d(this, obj != null ? (zzadb) obj : new zzadb(zzadaVar));
    }

    public final int hashCode() {
        if (m9568m()) {
            return zzafl.f22093c.m9649a(getClass()).mo9639i(this);
        }
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int iMo9639i = zzafl.f22093c.m9649a(getClass()).mo9639i(this);
        this.zza = iMo9639i;
        return iMo9639i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacb
    /* JADX INFO: renamed from: j */
    public final int mo9347j(zzafp zzafpVar) {
        if (m9568m()) {
            int iMo9635e = zzafpVar.mo9635e(this);
            if (iMo9635e >= 0) {
                return iMo9635e;
            }
            StringBuilder sb = new StringBuilder(AbstractC1456a.m2434a(iMo9635e, 42));
            sb.append("serialized size must be non-negative, was ");
            sb.append(iMo9635e);
            throw new IllegalStateException(sb.toString());
        }
        int i2 = this.zzb & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int iMo9635e2 = zzafpVar.mo9635e(this);
        if (iMo9635e2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iMo9635e2;
            return iMo9635e2;
        }
        StringBuilder sb2 = new StringBuilder(AbstractC1456a.m2434a(iMo9635e2, 42));
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iMo9635e2);
        throw new IllegalStateException(sb2.toString());
    }

    /* JADX INFO: renamed from: m */
    public final boolean m9568m() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: o */
    public final void m9569o() {
        this.zzb &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: p */
    public final zzadu m9570p() {
        return (zzadu) mo9574z(4);
    }

    /* JADX INFO: renamed from: q */
    public final zzadp m9571q() {
        return (zzadp) mo9574z(5);
    }

    /* JADX INFO: renamed from: r */
    public final zzadp m9572r() {
        zzadp zzadpVar = (zzadp) mo9574z(5);
        zzadpVar.m9556s(this);
        return zzadpVar;
    }

    /* JADX INFO: renamed from: s */
    public final void m9573s() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = zzafe.f22073a;
        StringBuilder sbM410r = AbstractC0271e0.m410r("# ", string);
        zzafe.m9609b(this, sbM410r, 0);
        return sbM410r.toString();
    }

    /* JADX INFO: renamed from: z */
    public abstract Object mo9574z(int i2);
}
