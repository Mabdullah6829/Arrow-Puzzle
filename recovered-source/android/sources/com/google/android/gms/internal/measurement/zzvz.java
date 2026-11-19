package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
final class zzvz {

    /* JADX INFO: renamed from: c */
    public static final zzvz f23012c;

    /* JADX INFO: renamed from: a */
    public final UUID f23013a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f23014b;

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            f23012c = new zzvz(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public zzvz(UUID uuid, long j2) {
        this.f23013a = uuid;
        this.f23014b = new AtomicLong((j2 ^ 25214903917L) & 281474976710655L);
    }

    /* JADX INFO: renamed from: a */
    public final long m10687a() {
        AtomicLong atomicLong;
        long j2;
        long j3;
        long j4;
        do {
            atomicLong = this.f23014b;
            j2 = atomicLong.get();
            j3 = ((j2 * 25214903917L) + 11) & 281474976710655L;
            j4 = ((25214903917L * j3) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j2, j4));
        return (((long) ((int) (j3 >>> 16))) << 32) + ((long) ((int) (j4 >>> 16)));
    }

    /* JADX INFO: renamed from: b */
    public final UUID m10688b() {
        long jM10687a = m10687a() & (-61441);
        long jM10687a2 = m10687a() >>> 2;
        UUID uuid = this.f23013a;
        return new UUID(jM10687a ^ uuid.getMostSignificantBits(), jM10687a2 ^ uuid.getLeastSignificantBits());
    }
}
