package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzqj;
import com.google.android.gms.internal.consent_sdk.zzqm;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzqm<MessageType extends zzqm<MessageType, BuilderType>, BuilderType extends zzqj<MessageType, BuilderType>> extends zzpa<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzsq zzc = zzsq.f21818d;

    /* JADX INFO: renamed from: f */
    public static zzqm m9218f(Class cls) {
        Map map = zzb;
        zzqm zzqmVar = (zzqm) map.get(cls);
        if (zzqmVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzqmVar = (zzqm) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzqmVar != null) {
            return zzqmVar;
        }
        zzqm zzqmVar2 = (zzqm) ((zzqm) zzsw.m9289g(cls)).mo9141e(6);
        if (zzqmVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzqmVar2);
        return zzqmVar2;
    }

    /* JADX INFO: renamed from: h */
    public static Object m9219h(Method method, zzqm zzqmVar, Object... objArr) {
        try {
            return method.invoke(zzqmVar, objArr);
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

    /* JADX INFO: renamed from: k */
    public static void m9220k(Class cls, zzqm zzqmVar) {
        zzqmVar.m9226j();
        zzb.put(cls, zzqmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    /* JADX INFO: renamed from: a */
    public final void mo9221a(zzpv zzpvVar) {
        zzsa zzsaVarM9255a = zzrx.f21791c.m9255a(getClass());
        Object obj = zzpvVar.f21722a;
        zzsaVarM9255a.mo9248e(this, obj != null ? (zzpw) obj : new zzpw(zzpvVar));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpa
    /* JADX INFO: renamed from: b */
    public final int mo9144b(zzsa zzsaVar) {
        if (m9223d()) {
            int iMo9247d = zzsaVar.mo9247d(this);
            if (iMo9247d >= 0) {
                return iMo9247d;
            }
            throw new IllegalStateException(AbstractC0271e0.m396d(iMo9247d, "serialized size must be non-negative, was "));
        }
        int i2 = this.zzd & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int iMo9247d2 = zzsaVar.mo9247d(this);
        if (iMo9247d2 < 0) {
            throw new IllegalStateException(AbstractC0271e0.m396d(iMo9247d2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo9247d2;
        return iMo9247d2;
    }

    /* JADX INFO: renamed from: c */
    public final void m9222c() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9223d() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: e */
    public abstract Object mo9141e(int i2);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzrx.f21791c.m9255a(getClass()).mo9246c(this, (zzqm) obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    /* JADX INFO: renamed from: g */
    public final int mo9224g() {
        if (m9223d()) {
            int iMo9247d = zzrx.f21791c.m9255a(getClass()).mo9247d(this);
            if (iMo9247d >= 0) {
                return iMo9247d;
            }
            throw new IllegalStateException(AbstractC0271e0.m396d(iMo9247d, "serialized size must be non-negative, was "));
        }
        int i2 = this.zzd & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int iMo9247d2 = zzrx.f21791c.m9255a(getClass()).mo9247d(this);
        if (iMo9247d2 < 0) {
            throw new IllegalStateException(AbstractC0271e0.m396d(iMo9247d2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo9247d2;
        return iMo9247d2;
    }

    public final int hashCode() {
        if (m9223d()) {
            return zzrx.f21791c.m9255a(getClass()).mo9245b(this);
        }
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int iMo9245b = zzrx.f21791c.m9255a(getClass()).mo9245b(this);
        this.zza = iMo9245b;
        return iMo9245b;
    }

    /* JADX INFO: renamed from: i */
    public final void m9225i() {
        zzrx.f21791c.m9255a(getClass()).mo9244a(this);
        m9226j();
    }

    /* JADX INFO: renamed from: j */
    public final void m9226j() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = zzrs.f21777a;
        StringBuilder sbM410r = AbstractC0271e0.m410r("# ", string);
        zzrs.m9238c(this, sbM410r, 0);
        return sbM410r.toString();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final /* synthetic */ zzqm zzl() {
        return (zzqm) mo9141e(6);
    }
}
