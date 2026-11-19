package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class NavigationBarMenu extends MenuBuilder {
    public static final int NO_MAX_ITEM_LIMIT = Integer.MAX_VALUE;
    private final int maxItemCount;
    private final boolean subMenuSupported;

    @NonNull
    private final Class<?> viewClass;

    public NavigationBarMenu(@NonNull Context context, @NonNull Class<?> cls, int i2, boolean z) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i2;
        this.subMenuSupported = z;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    @NonNull
    public MenuItem addInternal(int i2, int i3, int i4, @NonNull CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem menuItemAddInternal = super.addInternal(i2, i3, i4, charSequence);
            startDispatchingItemsChanged();
            return menuItemAddInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        StringBuilder sbM411s = AbstractC0271e0.m411s("Maximum number of items supported by ", simpleName, " is ");
        sbM411s.append(this.maxItemCount);
        sbM411s.append(". Limit can be checked with ");
        sbM411s.append(simpleName);
        sbM411s.append("#getMaxItemCount()");
        throw new IllegalArgumentException(sbM411s.toString());
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i2, int i3, int i4, @NonNull CharSequence charSequence) {
        if (!this.subMenuSupported) {
            throw new UnsupportedOperationException(this.viewClass.getSimpleName().concat(" does not support submenus"));
        }
        MenuItemImpl menuItemImpl = (MenuItemImpl) addInternal(i2, i3, i4, charSequence);
        NavigationBarSubMenu navigationBarSubMenu = new NavigationBarSubMenu(getContext(), this, menuItemImpl);
        menuItemImpl.setSubMenu(navigationBarSubMenu);
        return navigationBarSubMenu;
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }
}
