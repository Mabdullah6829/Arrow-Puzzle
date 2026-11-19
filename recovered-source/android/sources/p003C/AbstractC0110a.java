package p003C;

import java.util.Arrays;
import p011H.AbstractC0243G;

/* JADX INFO: renamed from: C.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0110a {

    /* JADX INFO: renamed from: a */
    public Object[] f157a;

    /* JADX INFO: renamed from: b */
    public int f158b;

    /* JADX INFO: renamed from: c */
    public boolean f159c;

    public AbstractC0110a(int i2) {
        AbstractC0243G.m371i(i2, "initialCapacity");
        this.f157a = new Object[i2];
        this.f158b = 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m184b(int i2, int i3) {
        if (i3 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i2 + (i2 >> 1) + 1;
        if (iHighestOneBit < i3) {
            iHighestOneBit = Integer.highestOneBit(i3 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: a */
    public final void m185a(Object obj) {
        obj.getClass();
        m186c(this.f158b + 1);
        Object[] objArr = this.f157a;
        int i2 = this.f158b;
        this.f158b = i2 + 1;
        objArr[i2] = obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m186c(int i2) {
        Object[] objArr = this.f157a;
        if (objArr.length < i2) {
            this.f157a = Arrays.copyOf(objArr, m184b(objArr.length, i2));
            this.f159c = false;
        } else if (this.f159c) {
            this.f157a = (Object[]) objArr.clone();
            this.f159c = false;
        }
    }
}
