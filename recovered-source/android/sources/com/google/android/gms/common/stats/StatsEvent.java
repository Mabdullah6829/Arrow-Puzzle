package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    public interface Types {
    }

    /* JADX INFO: renamed from: H */
    public abstract int mo3636H();

    /* JADX INFO: renamed from: J */
    public abstract String mo3637J();

    public final String toString() {
        long jMo3638w = mo3638w();
        int iMo3636H = mo3636H();
        String strMo3637J = mo3637J();
        int length = String.valueOf(jMo3638w).length();
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(iMo3636H).length() + 3 + strMo3637J.length());
        sb.append(jMo3638w);
        sb.append("\t");
        sb.append(iMo3636H);
        return AbstractC0271e0.m403k(sb, "\t-1", strMo3637J);
    }

    /* JADX INFO: renamed from: w */
    public abstract long mo3638w();
}
