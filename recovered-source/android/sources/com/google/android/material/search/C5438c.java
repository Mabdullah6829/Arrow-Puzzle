package com.google.android.material.search;

/* JADX INFO: renamed from: com.google.android.material.search.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5438c implements SearchBarAnimationHelper.OnLoadAnimationInvocation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23455a;

    public /* synthetic */ C5438c(int i2) {
        this.f23455a = i2;
    }

    @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
    public final void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        switch (this.f23455a) {
            case 0:
                onLoadAnimationCallback.onAnimationStart();
                break;
            default:
                onLoadAnimationCallback.onAnimationEnd();
                break;
        }
    }
}
