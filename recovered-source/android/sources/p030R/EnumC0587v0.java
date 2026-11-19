package p030R;

import p001B.AbstractC0081g;

/* JADX INFO: renamed from: R.v0 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0587v0 {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);


    /* JADX INFO: renamed from: s */
    public final int f1265s;

    /* JADX INFO: renamed from: t */
    public final byte[] f1266t;

    EnumC0587v0(int i2) {
        this.f1265s = i2;
        this.f1266t = Integer.toString(i2).getBytes(AbstractC0081g.f107a);
    }

    /* JADX INFO: renamed from: b */
    public final C0589w0 m1345b() {
        return (C0589w0) C0589w0.f1274d.get(this.f1265s);
    }
}
