package p024O;

/* JADX INFO: renamed from: O.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0462e {

    /* JADX INFO: renamed from: a */
    public int f794a;

    /* JADX INFO: renamed from: b */
    public int f795b;

    /* JADX INFO: renamed from: c */
    public int f796c;

    /* JADX INFO: renamed from: d */
    public int[] f797d;

    /* JADX INFO: renamed from: a */
    public static String m984a(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        for (int i2 : iArr) {
            AbstractC0475r.m1165b(i2, sb);
        }
        sb.append('\"');
        return sb.toString();
    }

    public final String toString() {
        switch (this.f794a) {
            case 1:
                return "alt -> " + this.f795b + ", " + this.f796c;
            case 2:
                return "altmatch -> " + this.f795b + ", " + this.f796c;
            case 3:
                return "cap " + this.f796c + " -> " + this.f795b;
            case 4:
                return "empty " + this.f796c + " -> " + this.f795b;
            case 5:
                return "fail";
            case 6:
                return "match";
            case 7:
                return "nop -> " + this.f795b;
            case 8:
                if (this.f797d == null) {
                    return "rune <null>";
                }
                StringBuilder sb = new StringBuilder("rune ");
                sb.append(m984a(this.f797d));
                sb.append((this.f796c & 1) != 0 ? "/i" : "");
                sb.append(" -> ");
                sb.append(this.f795b);
                return sb.toString();
            case 9:
                return "rune1 " + m984a(this.f797d) + " -> " + this.f795b;
            case 10:
                return "any -> " + this.f795b;
            case 11:
                return "anynotnl -> " + this.f795b;
            default:
                throw new IllegalStateException("unhandled case in Inst.toString");
        }
    }
}
