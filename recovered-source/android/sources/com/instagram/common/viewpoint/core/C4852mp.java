package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mp */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4852mp implements InterfaceC2948HY {
    public static String[] A02 = {"1Tt6ltc55g", "ops4n6D0RsDIbcNK2iFIW7Ay7S5Nano", "QFUbJLsUaFmSVLdjzr36RpAXorrqi07i", "7FxugF0ZmqBQk4dAnarwpNTfiaTe1g6g", "N3T7HRrxqFzk5rl0dpC6S3h47ocLp3rK", "Rq3uRmlvLOcLbWX3oXceNMTvaDTByq6j", "8TmLuftHICqYkzwVWbIwZIwFPzZSJxQj", "4hmJxBFNQAJLWam3xj85pvhcrB85xjeQ"};
    public final long A00;
    public final C2933HJ A01;

    public C4852mp(C2933HJ c2933hj, long j2) {
        this.A01 = c2933hj;
        this.A00 = j2;
    }

    private C2949HZ A00(long j2, long j3) {
        return new C2949HZ((1000000 * j2) / ((long) this.A01.A07), this.A00 + j3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final long A7t() {
        return this.A01.A06();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final C2947HX A91(long j2) {
        long j3;
        AbstractC21273y.A02(this.A01.A0A);
        long[] jArr = this.A01.A0A.A01;
        long[] jArr2 = this.A01.A0A.A00;
        int iA0L = AbstractC22035C.A0L(jArr, this.A01.A07(j2), true, false);
        long j4 = 0;
        if (iA0L == -1) {
            j3 = 0;
        } else {
            j3 = jArr[iA0L];
        }
        if (iA0L != -1) {
            j4 = jArr2[iA0L];
        }
        C2949HZ c2949hzA00 = A00(j3, j4);
        if (c2949hzA00.A01 != j2) {
            int length = jArr.length - 1;
            String[] strArr = A02;
            if (strArr[3].charAt(19) != strArr[6].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "o5tsTNyqew751hc5myqwVOdw8F1gICkG";
            strArr2[6] = "VidtQTuToVY7NImzxnJwSrK8bx75lEQY";
            if (iA0L != length) {
                C2949HZ secondSeekPoint = A00(jArr[iA0L + 1], jArr2[iA0L + 1]);
                return new C2947HX(c2949hzA00, secondSeekPoint);
            }
        }
        return new C2947HX(c2949hzA00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final boolean AAj() {
        return true;
    }
}
