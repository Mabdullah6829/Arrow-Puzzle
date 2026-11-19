package com.google.android.gms.common.images;

/* JADX INFO: loaded from: classes.dex */
public final class Size {
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 1 + String.valueOf(0).length());
        sb.append("0x0");
        return sb.toString();
    }
}
