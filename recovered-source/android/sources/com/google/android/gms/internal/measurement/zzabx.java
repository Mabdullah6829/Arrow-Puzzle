package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public enum zzabx implements zzady {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s */
    public final int f21942s;

    zzabx(int i2) {
        this.f21942s = i2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f21942s);
    }

    @Override // com.google.android.gms.internal.measurement.zzady
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f21942s;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
