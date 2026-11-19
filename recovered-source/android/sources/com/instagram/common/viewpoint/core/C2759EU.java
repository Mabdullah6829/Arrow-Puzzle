package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.EU */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2759EU {
    public static String[] A02 = {"lLT4WSGDXAAEttN4WZpjnZW3EREZ5IUn", "X1LJmLkuKByNLD5", "9E9AvNKTbt", "HDUBXdTF0", "Y2br1ow9JJdQjV7", "Cljbn90LR6", "vevW4XIw", "R43W1WP4nPn8Vokax5r9eZsQvu5hcN6d"};
    public final long A00;
    public final long A01;

    public C2759EU(long j2, long j3) {
        this.A01 = j2;
        this.A00 = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = obj instanceof C2759EU;
        String[] strArr = A02;
        if (strArr[0].charAt(21) != strArr[7].charAt(21)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "RWvSWN92NbOHtVZ";
        strArr2[1] = "5AykDqMn7i1NCR6";
        if (!z) {
            return false;
        }
        C2759EU c2759eu = (C2759EU) obj;
        return this.A01 == c2759eu.A01 && this.A00 == c2759eu.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
