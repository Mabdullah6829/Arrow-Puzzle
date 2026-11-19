package com.instagram.common.viewpoint.core;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1J */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C19671J extends C23377M {
    public static String[] A00 = {"4mrgyhu5NuMSfoRJ7wvth", "0QrbVGKHuGc2eSGsbm7N10peHve4GVgP", "Meba3O6SWeMBrZzPyfP10SBJe7jX", "3Oa5wanHMWuCrkjHvXNfwyLB0ZtCKHr4", "YOQh7xYBrfW2123ECT3lDkRgUFpenV07", "JuO7BKBrPjkMVs4", "5m", "UWhmaXdvjdchgK72Wd2HML9QO634NCpp"};

    public C19671J(C4494gi c4494gi) {
        super(c4494gi);
        setCarouselLayoutManager(c4494gi);
    }

    public AbstractC2845Ft getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        if (A00[6].length() != 2) {
            throw new RuntimeException();
        }
        A00[2] = "XAsjP5XwQSgGjSaOGRXjEIyXW47w";
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.C23377M
    public C4564hr getLayoutManager() {
        return (C4564hr) super.getLayoutManager();
    }

    public AbstractC3535R7 getOnScrollListener() {
        return new C3440PY(this);
    }

    private void setCarouselLayoutManager(C4494gi c4494gi) {
        C4564hr c4564hr = new C4564hr(c4494gi, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c4564hr.A1T(true);
        }
        super.setLayoutManager(c4564hr);
    }

    @Override // com.instagram.common.viewpoint.core.C23377M
    public void setLayoutManager(AbstractC3530R2 abstractC3530R2) {
    }
}
