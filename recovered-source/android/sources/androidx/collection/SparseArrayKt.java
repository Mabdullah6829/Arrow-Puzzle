package androidx.collection;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6452k;
import p058e0.AbstractC6316x;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6502p;
import p080q0.InterfaceC6520a;

/* JADX INFO: loaded from: classes.dex */
public final class SparseArrayKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.collection.SparseArrayKt$valueIterator$1 */
    public static final class C10971<T> implements Iterator<T>, InterfaceC6520a {
        final /* synthetic */ SparseArrayCompat<T> $this_valueIterator;
        private int index;

        public C10971(SparseArrayCompat<T> sparseArrayCompat) {
            this.$this_valueIterator = sparseArrayCompat;
        }

        public final int getIndex() {
            return this.index;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_valueIterator.size();
        }

        @Override // java.util.Iterator
        public T next() {
            SparseArrayCompat<T> sparseArrayCompat = this.$this_valueIterator;
            int i2 = this.index;
            this.index = i2 + 1;
            return sparseArrayCompat.valueAt(i2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i2) {
            this.index = i2;
        }
    }

    public static final <T> boolean contains(SparseArrayCompat<T> sparseArrayCompat, int i2) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        return sparseArrayCompat.containsKey(i2);
    }

    public static final <T> void forEach(SparseArrayCompat<T> sparseArrayCompat, InterfaceC6502p action) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        AbstractC6452k.m12181e(action, "action");
        int size = sparseArrayCompat.size();
        for (int i2 = 0; i2 < size; i2++) {
            action.invoke(Integer.valueOf(sparseArrayCompat.keyAt(i2)), sparseArrayCompat.valueAt(i2));
        }
    }

    public static final <T> T getOrDefault(SparseArrayCompat<T> sparseArrayCompat, int i2, T t) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        return sparseArrayCompat.get(i2, t);
    }

    public static final <T> T getOrElse(SparseArrayCompat<T> sparseArrayCompat, int i2, InterfaceC6487a defaultValue) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        AbstractC6452k.m12181e(defaultValue, "defaultValue");
        T t = sparseArrayCompat.get(i2);
        return t == null ? (T) defaultValue.invoke() : t;
    }

    public static final <T> int getSize(SparseArrayCompat<T> sparseArrayCompat) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size();
    }

    public static final <T> boolean isNotEmpty(SparseArrayCompat<T> sparseArrayCompat) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        return !sparseArrayCompat.isEmpty();
    }

    public static final <T> AbstractC6316x keyIterator(final SparseArrayCompat<T> sparseArrayCompat) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        return new AbstractC6316x() { // from class: androidx.collection.SparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArrayCompat.size();
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // p058e0.AbstractC6316x
            public int nextInt() {
                SparseArrayCompat<T> sparseArrayCompat2 = sparseArrayCompat;
                int i2 = this.index;
                this.index = i2 + 1;
                return sparseArrayCompat2.keyAt(i2);
            }

            public final void setIndex(int i2) {
                this.index = i2;
            }
        };
    }

    public static final <T> SparseArrayCompat<T> plus(SparseArrayCompat<T> sparseArrayCompat, SparseArrayCompat<T> other) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        AbstractC6452k.m12181e(other, "other");
        SparseArrayCompat<T> sparseArrayCompat2 = new SparseArrayCompat<>(other.size() + sparseArrayCompat.size());
        sparseArrayCompat2.putAll(sparseArrayCompat);
        sparseArrayCompat2.putAll(other);
        return sparseArrayCompat2;
    }

    public static final /* synthetic */ boolean remove(SparseArrayCompat sparseArrayCompat, int i2, Object obj) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        return sparseArrayCompat.remove(i2, obj);
    }

    public static final <T> void set(SparseArrayCompat<T> sparseArrayCompat, int i2, T t) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        sparseArrayCompat.put(i2, t);
    }

    public static final <T> Iterator<T> valueIterator(SparseArrayCompat<T> sparseArrayCompat) {
        AbstractC6452k.m12181e(sparseArrayCompat, "<this>");
        return new C10971(sparseArrayCompat);
    }
}
