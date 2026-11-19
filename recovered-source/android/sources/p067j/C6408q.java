package p067j;

import java.util.Arrays;

/* JADX INFO: renamed from: j.q */
/* JADX INFO: loaded from: classes.dex */
public final class C6408q extends AbstractC6383D {

    /* JADX INFO: renamed from: a */
    public final byte[] f24523a;

    /* JADX INFO: renamed from: b */
    public final byte[] f24524b;

    public C6408q(byte[] bArr, byte[] bArr2) {
        this.f24523a = bArr;
        this.f24524b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6383D) {
            AbstractC6383D abstractC6383D = (AbstractC6383D) obj;
            boolean z = abstractC6383D instanceof C6408q;
            if (Arrays.equals(this.f24523a, z ? ((C6408q) abstractC6383D).f24523a : ((C6408q) abstractC6383D).f24523a)) {
                if (Arrays.equals(this.f24524b, z ? ((C6408q) abstractC6383D).f24524b : ((C6408q) abstractC6383D).f24524b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f24523a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f24524b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f24523a) + ", encryptedBlob=" + Arrays.toString(this.f24524b) + "}";
    }
}
