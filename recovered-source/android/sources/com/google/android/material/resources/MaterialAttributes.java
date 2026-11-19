package com.google.android.material.resources;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.C5183R;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialAttributes {
    @Nullable
    public static TypedValue resolve(@NonNull Context context, @AttrRes int i2) {
        return resolve(context.getTheme(), i2);
    }

    public static boolean resolveBoolean(@NonNull Context context, @AttrRes int i2, boolean z) {
        return resolveBoolean(context.getTheme(), i2, z);
    }

    public static boolean resolveBooleanOrThrow(@NonNull Context context, @AttrRes int i2, @NonNull String str) {
        return resolveOrThrow(context, i2, str) != 0;
    }

    @Px
    public static int resolveDimension(@NonNull Context context, @AttrRes int i2, @DimenRes int i3) {
        float fResolveDimension = resolveDimension(context.getTheme(), i2, Float.NaN);
        return Float.isNaN(fResolveDimension) ? (int) context.getResources().getDimension(i3) : (int) fResolveDimension;
    }

    public static int resolveInteger(@NonNull Context context, @AttrRes int i2, int i3) {
        return resolveInteger(context.getTheme(), i2, i3);
    }

    @Px
    public static int resolveMinimumAccessibleTouchTarget(@NonNull Context context) {
        return resolveDimension(context, C5183R.attr.minTouchTargetSize, C5183R.dimen.mtrl_min_touch_target_size);
    }

    public static int resolveOrThrow(@NonNull Context context, @AttrRes int i2, @NonNull String str) {
        return resolveTypedValueOrThrow(context, i2, str).data;
    }

    @NonNull
    public static TypedValue resolveTypedValueOrThrow(@NonNull View view, @AttrRes int i2) {
        return resolveTypedValueOrThrow(view.getContext(), i2, view.getClass().getCanonicalName());
    }

    @Nullable
    public static TypedValue resolve(@NonNull Resources.Theme theme, @AttrRes int i2) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean resolveBoolean(@NonNull Resources.Theme theme, @AttrRes int i2, boolean z) {
        TypedValue typedValueResolve = resolve(theme, i2);
        if (typedValueResolve == null || typedValueResolve.type != 18) {
            return z;
        }
        return typedValueResolve.data != 0;
    }

    public static int resolveInteger(@NonNull Resources.Theme theme, @AttrRes int i2, int i3) {
        TypedValue typedValueResolve = resolve(theme, i2);
        return (typedValueResolve == null || typedValueResolve.type != 16) ? i3 : typedValueResolve.data;
    }

    public static int resolveOrThrow(@NonNull View view, @AttrRes int i2) {
        return resolveTypedValueOrThrow(view, i2).data;
    }

    @NonNull
    public static TypedValue resolveTypedValueOrThrow(@NonNull Context context, @AttrRes int i2, @NonNull String str) {
        TypedValue typedValueResolve = resolve(context, i2);
        if (typedValueResolve != null) {
            return typedValueResolve;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static float resolveDimension(@NonNull Resources.Theme theme, @AttrRes int i2, float f2) {
        TypedValue typedValueResolve = resolve(theme, i2);
        return (typedValueResolve == null || typedValueResolve.type != 5) ? f2 : typedValueResolve.getDimension(theme.getResources().getDisplayMetrics());
    }
}
