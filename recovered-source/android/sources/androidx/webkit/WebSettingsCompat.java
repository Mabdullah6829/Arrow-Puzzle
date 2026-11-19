package androidx.webkit;

import android.webkit.WebSettings;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ApiHelperForM;
import androidx.webkit.internal.ApiHelperForN;
import androidx.webkit.internal.ApiHelperForO;
import androidx.webkit.internal.ApiHelperForQ;
import androidx.webkit.internal.WebSettingsAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class WebSettingsCompat {
    public static final int ATTRIBUTION_BEHAVIOR_APP_SOURCE_AND_APP_TRIGGER = 3;
    public static final int ATTRIBUTION_BEHAVIOR_APP_SOURCE_AND_WEB_TRIGGER = 1;
    public static final int ATTRIBUTION_BEHAVIOR_DISABLED = 0;
    public static final int ATTRIBUTION_BEHAVIOR_WEB_SOURCE_AND_WEB_TRIGGER = 2;

    @Deprecated
    public static final int DARK_STRATEGY_PREFER_WEB_THEME_OVER_USER_AGENT_DARKENING = 2;

    @Deprecated
    public static final int DARK_STRATEGY_USER_AGENT_DARKENING_ONLY = 0;

    @Deprecated
    public static final int DARK_STRATEGY_WEB_THEME_DARKENING_ONLY = 1;

    @Deprecated
    public static final int FORCE_DARK_AUTO = 1;

    @Deprecated
    public static final int FORCE_DARK_OFF = 0;

    @Deprecated
    public static final int FORCE_DARK_ON = 2;
    public static final int SPECULATIVE_LOADING_DISABLED = 0;
    public static final int SPECULATIVE_LOADING_PRERENDER_ENABLED = 1;
    public static final int WEB_AUTHENTICATION_SUPPORT_FOR_APP = 1;
    public static final int WEB_AUTHENTICATION_SUPPORT_FOR_BROWSER = 2;
    public static final int WEB_AUTHENTICATION_SUPPORT_NONE = 0;

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalBackForwardCache {
    }

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalSpeculativeLoading {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDark {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDarkStrategy {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MenuItemFlags {
    }

    private WebSettingsCompat() {
    }

    private static WebSettingsAdapter getAdapter(WebSettings webSettings) {
        return WebViewGlueCommunicator.getCompatConverter().convertSettings(webSettings);
    }

    public static int getAttributionRegistrationBehavior(WebSettings webSettings) {
        if (WebViewFeatureInternal.ATTRIBUTION_REGISTRATION_BEHAVIOR.isSupportedByWebView()) {
            return getAdapter(webSettings).getAttributionRegistrationBehavior();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean getBackForwardCacheEnabled(WebSettings webSettings) {
        if (WebViewFeatureInternal.BACK_FORWARD_CACHE.isSupportedByWebView()) {
            return getAdapter(webSettings).getBackForwardCacheEnabled();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static int getDisabledActionModeMenuItems(WebSettings webSettings) {
        ApiFeature.C1793N c1793n = WebViewFeatureInternal.DISABLED_ACTION_MODE_MENU_ITEMS;
        if (c1793n.isSupportedByFramework()) {
            return ApiHelperForN.getDisabledActionModeMenuItems(webSettings);
        }
        if (c1793n.isSupportedByWebView()) {
            return getAdapter(webSettings).getDisabledActionModeMenuItems();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean getEnterpriseAuthenticationAppLinkPolicyEnabled(WebSettings webSettings) {
        if (WebViewFeatureInternal.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY.isSupportedByWebView()) {
            return getAdapter(webSettings).getEnterpriseAuthenticationAppLinkPolicyEnabled();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Deprecated
    public static int getForceDark(WebSettings webSettings) {
        ApiFeature.C1796Q c1796q = WebViewFeatureInternal.FORCE_DARK;
        if (c1796q.isSupportedByFramework()) {
            return ApiHelperForQ.getForceDark(webSettings);
        }
        if (c1796q.isSupportedByWebView()) {
            return getAdapter(webSettings).getForceDark();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Deprecated
    public static int getForceDarkStrategy(WebSettings webSettings) {
        if (WebViewFeatureInternal.FORCE_DARK_STRATEGY.isSupportedByWebView()) {
            return getAdapter(webSettings).getForceDark();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean getOffscreenPreRaster(WebSettings webSettings) {
        ApiFeature.C1792M c1792m = WebViewFeatureInternal.OFF_SCREEN_PRERASTER;
        if (c1792m.isSupportedByFramework()) {
            return ApiHelperForM.getOffscreenPreRaster(webSettings);
        }
        if (c1792m.isSupportedByWebView()) {
            return getAdapter(webSettings).getOffscreenPreRaster();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static Set<String> getRequestedWithHeaderOriginAllowList(WebSettings webSettings) {
        if (WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST.isSupportedByWebView()) {
            return getAdapter(webSettings).getRequestedWithHeaderOriginAllowList();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean getSafeBrowsingEnabled(WebSettings webSettings) {
        ApiFeature.C1794O c1794o = WebViewFeatureInternal.SAFE_BROWSING_ENABLE;
        if (c1794o.isSupportedByFramework()) {
            return ApiHelperForO.getSafeBrowsingEnabled(webSettings);
        }
        if (c1794o.isSupportedByWebView()) {
            return getAdapter(webSettings).getSafeBrowsingEnabled();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static int getSpeculativeLoadingStatus(WebSettings webSettings) {
        if (WebViewFeatureInternal.SPECULATIVE_LOADING.isSupportedByWebView()) {
            return getAdapter(webSettings).getSpeculativeLoadingStatus();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static UserAgentMetadata getUserAgentMetadata(WebSettings webSettings) {
        if (WebViewFeatureInternal.USER_AGENT_METADATA.isSupportedByWebView()) {
            return getAdapter(webSettings).getUserAgentMetadata();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static int getWebAuthenticationSupport(WebSettings webSettings) {
        if (WebViewFeatureInternal.WEB_AUTHENTICATION.isSupportedByWebView()) {
            return getAdapter(webSettings).getWebAuthenticationSupport();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static WebViewMediaIntegrityApiStatusConfig getWebViewMediaIntegrityApiStatus(WebSettings webSettings) {
        if (WebViewFeatureInternal.WEBVIEW_MEDIA_INTEGRITY_API_STATUS.isSupportedByWebView()) {
            return getAdapter(webSettings).getWebViewMediaIntegrityApiStatus();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean isAlgorithmicDarkeningAllowed(WebSettings webSettings) {
        if (WebViewFeatureInternal.ALGORITHMIC_DARKENING.isSupportedByWebView()) {
            return getAdapter(webSettings).isAlgorithmicDarkeningAllowed();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setAlgorithmicDarkeningAllowed(WebSettings webSettings, boolean z) {
        if (!WebViewFeatureInternal.ALGORITHMIC_DARKENING.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getAdapter(webSettings).setAlgorithmicDarkeningAllowed(z);
    }

    public static void setAttributionRegistrationBehavior(WebSettings webSettings, int i2) {
        if (!WebViewFeatureInternal.ATTRIBUTION_REGISTRATION_BEHAVIOR.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getAdapter(webSettings).setAttributionRegistrationBehavior(i2);
    }

    public static void setBackForwardCacheEnabled(WebSettings webSettings, boolean z) {
        if (!WebViewFeatureInternal.BACK_FORWARD_CACHE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getAdapter(webSettings).setBackForwardCacheEnabled(z);
    }

    public static void setDisabledActionModeMenuItems(WebSettings webSettings, int i2) {
        ApiFeature.C1793N c1793n = WebViewFeatureInternal.DISABLED_ACTION_MODE_MENU_ITEMS;
        if (c1793n.isSupportedByFramework()) {
            ApiHelperForN.setDisabledActionModeMenuItems(webSettings, i2);
        } else {
            if (!c1793n.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            getAdapter(webSettings).setDisabledActionModeMenuItems(i2);
        }
    }

    public static void setEnterpriseAuthenticationAppLinkPolicyEnabled(WebSettings webSettings, boolean z) {
        if (!WebViewFeatureInternal.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getAdapter(webSettings).setEnterpriseAuthenticationAppLinkPolicyEnabled(z);
    }

    @Deprecated
    public static void setForceDark(WebSettings webSettings, int i2) {
        ApiFeature.C1796Q c1796q = WebViewFeatureInternal.FORCE_DARK;
        if (c1796q.isSupportedByFramework()) {
            ApiHelperForQ.setForceDark(webSettings, i2);
        } else {
            if (!c1796q.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            getAdapter(webSettings).setForceDark(i2);
        }
    }

    @Deprecated
    public static void setForceDarkStrategy(WebSettings webSettings, int i2) {
        if (!WebViewFeatureInternal.FORCE_DARK_STRATEGY.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getAdapter(webSettings).setForceDarkStrategy(i2);
    }

    public static void setOffscreenPreRaster(WebSettings webSettings, boolean z) {
        ApiFeature.C1792M c1792m = WebViewFeatureInternal.OFF_SCREEN_PRERASTER;
        if (c1792m.isSupportedByFramework()) {
            ApiHelperForM.setOffscreenPreRaster(webSettings, z);
        } else {
            if (!c1792m.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            getAdapter(webSettings).setOffscreenPreRaster(z);
        }
    }

    public static void setRequestedWithHeaderOriginAllowList(WebSettings webSettings, Set<String> set) {
        if (!WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getAdapter(webSettings).setRequestedWithHeaderOriginAllowList(set);
    }

    public static void setSafeBrowsingEnabled(WebSettings webSettings, boolean z) {
        ApiFeature.C1794O c1794o = WebViewFeatureInternal.SAFE_BROWSING_ENABLE;
        if (c1794o.isSupportedByFramework()) {
            ApiHelperForO.setSafeBrowsingEnabled(webSettings, z);
        } else {
            if (!c1794o.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            getAdapter(webSettings).setSafeBrowsingEnabled(z);
        }
    }

    public static void setSpeculativeLoadingStatus(WebSettings webSettings, int i2) {
        if (!WebViewFeatureInternal.SPECULATIVE_LOADING.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getAdapter(webSettings).setSpeculativeLoadingStatus(i2);
    }

    public static void setUserAgentMetadata(WebSettings webSettings, UserAgentMetadata userAgentMetadata) {
        if (!WebViewFeatureInternal.USER_AGENT_METADATA.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getAdapter(webSettings).setUserAgentMetadata(userAgentMetadata);
    }

    public static void setWebAuthenticationSupport(WebSettings webSettings, int i2) {
        if (!WebViewFeatureInternal.WEB_AUTHENTICATION.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getAdapter(webSettings).setWebAuthenticationSupport(i2);
    }

    public static void setWebViewMediaIntegrityApiStatus(WebSettings webSettings, WebViewMediaIntegrityApiStatusConfig webViewMediaIntegrityApiStatusConfig) {
        if (!WebViewFeatureInternal.WEBVIEW_MEDIA_INTEGRITY_API_STATUS.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getAdapter(webSettings).setWebViewMediaIntegrityApiStatus(webViewMediaIntegrityApiStatusConfig);
    }
}
