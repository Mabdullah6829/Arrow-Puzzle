package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface Dimension {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: renamed from: DP */
    public static final int f2564DP = 0;

    /* JADX INFO: renamed from: PX */
    public static final int f2565PX = 1;

    /* JADX INFO: renamed from: SP */
    public static final int f2566SP = 2;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: renamed from: DP */
        public static final int f2567DP = 0;

        /* JADX INFO: renamed from: PX */
        public static final int f2568PX = 1;

        /* JADX INFO: renamed from: SP */
        public static final int f2569SP = 2;

        private Companion() {
        }
    }

    int unit() default 1;
}
