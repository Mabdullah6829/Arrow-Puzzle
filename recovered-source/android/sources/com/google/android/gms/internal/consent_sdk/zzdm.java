package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdm implements Iterable {
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        try {
            zzdc zzdcVar = (zzdc) iterator();
            if (zzdcVar.hasNext()) {
                Object next = zzdcVar.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (zzdcVar.hasNext()) {
                    sb.append((CharSequence) ", ");
                    Object next2 = zzdcVar.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
