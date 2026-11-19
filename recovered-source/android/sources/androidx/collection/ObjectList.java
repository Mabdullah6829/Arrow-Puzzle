package androidx.collection;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p011H.AbstractC0271e0;
import p037U0.AbstractC0846b;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;
import p078p0.InterfaceC6503q;
import p087v0.C6545d;

/* JADX INFO: loaded from: classes.dex */
public abstract class ObjectList<E> {
    public int _size;
    public Object[] content;

    /* JADX INFO: renamed from: androidx.collection.ObjectList$toString$1 */
    public static final class C10941 extends AbstractC6453l implements InterfaceC6498l {
        final /* synthetic */ ObjectList<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10941(ObjectList<E> objectList) {
            super(1);
            this.this$0 = objectList;
        }

        @Override // p078p0.InterfaceC6498l
        public final CharSequence invoke(E e) {
            return e == this.this$0 ? "(this)" : String.valueOf(e);
        }
    }

    public /* synthetic */ ObjectList(int i2, AbstractC6447f abstractC6447f) {
        this(i2);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, InterfaceC6498l interfaceC6498l, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i3 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i3 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i3 & 32) != 0) {
            interfaceC6498l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC6498l interfaceC6498l2 = interfaceC6498l;
        return objectList.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence5, interfaceC6498l2);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public abstract List<E> asList();

    public final boolean contains(E e) {
        return indexOf(e) >= 0;
    }

    public final boolean containsAll(E[] elements) {
        AbstractC6452k.m12181e(elements, "elements");
        for (E e : elements) {
            if (!contains(e)) {
                return false;
            }
        }
        return true;
    }

    public final int count() {
        return this._size;
    }

    public final E elementAt(int i2) {
        if (i2 >= 0 && i2 < this._size) {
            return (E) this.content[i2];
        }
        StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index ", " must be in 0..");
        sbM404l.append(this._size - 1);
        throw new IndexOutOfBoundsException(sbM404l.toString());
    }

    public final E elementAtOrElse(int i2, InterfaceC6498l defaultValue) {
        AbstractC6452k.m12181e(defaultValue, "defaultValue");
        return (i2 < 0 || i2 >= this._size) ? (E) defaultValue.invoke(Integer.valueOf(i2)) : (E) this.content[i2];
    }

    public boolean equals(Object obj) {
        if (obj instanceof ObjectList) {
            ObjectList objectList = (ObjectList) obj;
            int i2 = objectList._size;
            int i3 = this._size;
            if (i2 == i3) {
                Object[] objArr = this.content;
                Object[] objArr2 = objectList.content;
                C6545d c6545dM1757p = AbstractC0846b.m1757p(0, i3);
                int i4 = c6545dM1757p.f24767s;
                int i5 = c6545dM1757p.f24768t;
                if (i4 > i5) {
                    return true;
                }
                while (AbstractC6452k.m12177a(objArr[i4], objArr2[i4])) {
                    if (i4 == i5) {
                        return true;
                    }
                    i4++;
                }
                return false;
            }
        }
        return false;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[0];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final <R> R fold(R r2, InterfaceC6502p operation) {
        AbstractC6452k.m12181e(operation, "operation");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            r2 = (R) operation.invoke(r2, objArr[i3]);
        }
        return r2;
    }

    public final <R> R foldIndexed(R r2, InterfaceC6503q operation) {
        AbstractC6452k.m12181e(operation, "operation");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            r2 = (R) operation.invoke(Integer.valueOf(i3), r2, objArr[i3]);
        }
        return r2;
    }

    public final <R> R foldRight(R r2, InterfaceC6502p operation) {
        AbstractC6452k.m12181e(operation, "operation");
        Object[] objArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (-1 >= i2) {
                return r2;
            }
            r2 = (R) operation.invoke(objArr[i2], r2);
        }
    }

    public final <R> R foldRightIndexed(R r2, InterfaceC6503q operation) {
        AbstractC6452k.m12181e(operation, "operation");
        Object[] objArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (-1 >= i2) {
                return r2;
            }
            r2 = (R) operation.invoke(Integer.valueOf(i2), objArr[i2], r2);
        }
    }

    public final void forEach(InterfaceC6498l block) {
        AbstractC6452k.m12181e(block, "block");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            block.invoke(objArr[i3]);
        }
    }

    public final void forEachIndexed(InterfaceC6502p block) {
        AbstractC6452k.m12181e(block, "block");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            block.invoke(Integer.valueOf(i3), objArr[i3]);
        }
    }

    public final void forEachReversed(InterfaceC6498l block) {
        AbstractC6452k.m12181e(block, "block");
        Object[] objArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (-1 >= i2) {
                return;
            } else {
                block.invoke(objArr[i2]);
            }
        }
    }

    public final void forEachReversedIndexed(InterfaceC6502p block) {
        AbstractC6452k.m12181e(block, "block");
        Object[] objArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (-1 >= i2) {
                return;
            } else {
                block.invoke(Integer.valueOf(i2), objArr[i2]);
            }
        }
    }

    public final E get(int i2) {
        if (i2 >= 0 && i2 < this._size) {
            return (E) this.content[i2];
        }
        StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index ", " must be in 0..");
        sbM404l.append(this._size - 1);
        throw new IndexOutOfBoundsException(sbM404l.toString());
    }

    public final C6545d getIndices() {
        return AbstractC0846b.m1757p(0, this._size);
    }

    public final int getLastIndex() {
        return this._size - 1;
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        Object[] objArr = this.content;
        int i2 = this._size;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(E e) {
        int i2 = 0;
        if (e == null) {
            Object[] objArr = this.content;
            int i3 = this._size;
            while (i2 < i3) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i4 = this._size;
        while (i2 < i4) {
            if (e.equals(objArr2[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final int indexOfFirst(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (((Boolean) predicate.invoke(objArr[i3])).booleanValue()) {
                return i3;
            }
        }
        return -1;
    }

    public final int indexOfLast(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        do {
            i2--;
            if (-1 >= i2) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(objArr[i2])).booleanValue());
        return i2;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[this._size - 1];
    }

    public final int lastIndexOf(E e) {
        if (e == null) {
            Object[] objArr = this.content;
            for (int i2 = this._size - 1; -1 < i2; i2--) {
                if (objArr[i2] == null) {
                    return i2;
                }
            }
        } else {
            Object[] objArr2 = this.content;
            for (int i3 = this._size - 1; -1 < i3; i3--) {
                if (e.equals(objArr2[i3])) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        Object[] objArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            if (((Boolean) predicate.invoke(objArr[i2])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new C10941(this), 25, null);
    }

    private ObjectList(int i2) {
        this.content = i2 == 0 ? ObjectListKt.EmptyArray : new Object[i2];
    }

    public final boolean any(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (((Boolean) predicate.invoke(objArr[i3])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (((Boolean) predicate.invoke(objArr[i4])).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    public final E firstOrNull(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            E e = (E) objArr[i3];
            if (((Boolean) predicate.invoke(e)).booleanValue()) {
                return e;
            }
        }
        return null;
    }

    public final String joinToString(CharSequence separator) {
        AbstractC6452k.m12181e(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final boolean containsAll(List<? extends E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        int size = elements.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!contains(elements.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    public final E lastOrNull(InterfaceC6498l predicate) {
        E e;
        AbstractC6452k.m12181e(predicate, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        do {
            i2--;
            if (-1 >= i2) {
                return null;
            }
            e = (E) objArr[i2];
        } while (!((Boolean) predicate.invoke(e)).booleanValue());
        return e;
    }

    public final E first(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            E e = (E) objArr[i3];
            if (((Boolean) predicate.invoke(e)).booleanValue()) {
                return e;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        AbstractC6452k.m12181e(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final boolean containsAll(Iterable<? extends E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        AbstractC6452k.m12181e(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i2, null, null, 48, null);
    }

    public final E last(InterfaceC6498l predicate) {
        E e;
        AbstractC6452k.m12181e(predicate, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        do {
            i2--;
            if (-1 < i2) {
                e = (E) objArr[i2];
            } else {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(e)).booleanValue());
        return e;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        AbstractC6452k.m12181e(postfix, "postfix");
        AbstractC6452k.m12181e(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i2, truncated, null, 32, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(ObjectList<E> elements) {
        AbstractC6452k.m12181e(elements, "elements");
        Object[] objArr = elements.content;
        int i2 = elements._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (!contains(objArr[i3])) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i2, CharSequence charSequence2, InterfaceC6498l interfaceC6498l) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        StringBuilder sbM405m = AbstractC0271e0.m405m(charSequence, "postfix", charSequence2, "truncated", prefix);
        Object[] objArr = this.content;
        int i3 = this._size;
        for (int i4 = 0; i4 < i3; i4++) {
            Object obj = objArr[i4];
            if (i4 == i2) {
                sbM405m.append(charSequence2);
                String string = sbM405m.toString();
                AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i4 != 0) {
                sbM405m.append(separator);
            }
            if (interfaceC6498l == null) {
                sbM405m.append(obj);
            } else {
                sbM405m.append((CharSequence) interfaceC6498l.invoke(obj));
            }
        }
        sbM405m.append(charSequence);
        String string2 = sbM405m.toString();
        AbstractC6452k.m12180d(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }
}
