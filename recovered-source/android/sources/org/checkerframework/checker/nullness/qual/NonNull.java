package org.checkerframework.checker.nullness.qual;

import com.instagram.common.viewpoint.core.EnumC19200E;
import com.instagram.common.viewpoint.core.EnumC19210F;
import com.instagram.common.viewpoint.core.EnumC19220L;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.QualifierForLiterals;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.UpperBoundFor;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@QualifierForLiterals({EnumC19220L.A0C})
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({MonotonicNonNull.class})
@DefaultFor({EnumC19200E.A04})
@Documented
@UpperBoundFor(typeKinds = {EnumC19210F.A0I, EnumC19210F.A0C, EnumC19210F.A04, EnumC19210F.A06, EnumC19210F.A08, EnumC19210F.A0B, EnumC19210F.A0E, EnumC19210F.A0J, EnumC19210F.A05})
@DefaultQualifierInHierarchy
public @interface NonNull {
}
