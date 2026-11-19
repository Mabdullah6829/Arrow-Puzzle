package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5045pz extends Exception implements InterfaceC201424 {
    public final int A00;
    public final long A01;
    public static final String A03 = AbstractC22035C.A0h(0);
    public static final String A04 = AbstractC22035C.A0h(1);
    public static final String A07 = AbstractC22035C.A0h(2);
    public static final String A05 = AbstractC22035C.A0h(3);
    public static final String A06 = AbstractC22035C.A0h(4);
    public static final InterfaceC201323<C5045pz> A02 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.q0
        @Override // com.instagram.common.viewpoint.core.InterfaceC201323
        public final InterfaceC201424 A6f(Bundle bundle) {
            return new C5045pz(bundle);
        }
    };

    public C5045pz(Bundle bundle) {
        this(bundle.getString(A07), A09(bundle), bundle.getInt(A03, 1000), bundle.getLong(A04, SystemClock.elapsedRealtime()));
    }

    public C5045pz(String str, Throwable th, int i2, long j2) {
        super(str, th);
        this.A00 = i2;
        this.A01 = j2;
    }

    public static RemoteException A08(String str) {
        return new RemoteException(str);
    }

    public static Throwable A09(Bundle bundle) {
        String string = bundle.getString(A05);
        String causeClassName = A06;
        String string2 = bundle.getString(causeClassName);
        Throwable thA0A = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, C5045pz.class.getClassLoader());
            if (Throwable.class.isAssignableFrom(cls)) {
                thA0A = A0A(cls, string2);
            }
            if (thA0A == null) {
                return A08(string2);
            }
            return thA0A;
        } catch (Throwable unused) {
            if (thA0A != null) {
                return thA0A;
            }
        }
    }

    public static Throwable A0A(Class<?> clazz, String str) throws Exception {
        return (Throwable) clazz.getConstructor(String.class).newInstance(str);
    }
}
