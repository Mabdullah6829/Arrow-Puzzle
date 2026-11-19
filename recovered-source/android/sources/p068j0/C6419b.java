package p068j0;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6452k;
import p058e0.AbstractC6298f;
import p058e0.C6294b;

/* JADX INFO: renamed from: j0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6419b extends AbstractC6298f implements InterfaceC6418a, Serializable {

    /* JADX INFO: renamed from: s */
    public final Enum[] f24556s;

    public C6419b(Enum[] entries) {
        AbstractC6452k.m12181e(entries, "entries");
        this.f24556s = entries;
    }

    @Override // p058e0.AbstractC6293a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        AbstractC6452k.m12181e(element, "element");
        int iOrdinal = element.ordinal();
        Enum[] enumArr = this.f24556s;
        AbstractC6452k.m12181e(enumArr, "<this>");
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == element;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        C6294b c6294b = AbstractC6298f.Companion;
        Enum[] enumArr = this.f24556s;
        int length = enumArr.length;
        c6294b.getClass();
        C6294b.m12077a(i2, length);
        return enumArr[i2];
    }

    @Override // p058e0.AbstractC6293a
    public final int getSize() {
        return this.f24556s.length;
    }

    @Override // p058e0.AbstractC6298f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        AbstractC6452k.m12181e(element, "element");
        int iOrdinal = element.ordinal();
        Enum[] enumArr = this.f24556s;
        AbstractC6452k.m12181e(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p058e0.AbstractC6298f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        AbstractC6452k.m12181e(element, "element");
        return indexOf(element);
    }
}
