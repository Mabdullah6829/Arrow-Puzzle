package androidx.core.util;

import androidx.core.content.C1166d;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface Predicate<T> {
    static <T> Predicate<T> isEqual(Object obj) {
        return obj == null ? new C1166d(11) : new C1233b(obj, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$and$0(Predicate predicate, Object obj) {
        return test(obj) && predicate.test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$negate$1(Object obj) {
        return !test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$or$2(Predicate predicate, Object obj) {
        return test(obj) || predicate.test(obj);
    }

    static <T> Predicate<T> not(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }

    default Predicate<T> and(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new C1232a(this, predicate, 1);
    }

    default Predicate<T> negate() {
        return new C1233b(this, 1);
    }

    /* JADX INFO: renamed from: or */
    default Predicate<T> m2275or(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new C1232a(this, predicate, 0);
    }

    boolean test(T t);
}
