package androidx.transition;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class ViewUtilsApi22 extends ViewUtilsApi21 {
    private static boolean sTryHiddenSetLeftTopRightBottom = true;

    public static class Api29Impl {
        private Api29Impl() {
        }

        public static void setLeftTopRightBottom(View view, int i2, int i3, int i4, int i5) {
            view.setLeftTopRightBottom(i2, i3, i4, i5);
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void setLeftTopRightBottom(View view, int i2, int i3, int i4, int i5) {
        if (sTryHiddenSetLeftTopRightBottom) {
            try {
                Api29Impl.setLeftTopRightBottom(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSetLeftTopRightBottom = false;
            }
        }
    }
}
