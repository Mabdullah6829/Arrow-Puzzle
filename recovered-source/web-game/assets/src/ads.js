var integration = {}
integration.showBanner = function() { return;
    if (!integration.ads) {
        try {
            void 0
        } catch (e) {
            console.log(e)
        }
    } else {}
}
integration.showInterstitial = function() { return;
    if (!integration.ads) {
        try {
            void 0
        } catch (e) {
            console.log(e)
        }
    } else {}
}
integration.showRewardedAd = function() { integration.rewarded(); return;
    if (!integration.ads) {
        try {
            void 0;
        } catch (e) {
            // Android bridge unavailable (e.g. browser preview) — give reward directly
            integration.rewarded();
        }
    } else {
        integration.rewarded();
    }
}
integration.rewarded = function() {
    window.pendingReward = true;
};
integration.adClosed = function() {
    console.log("pendingReward:", window.pendingReward);
    console.log("pendingSkill:", window.pendingSkill);
    console.log("mainLayer:", window.mainLayer);
}
integration.noRewardedAdAvailable = function() {
    // Called by Java when no rewarded ad is loaded or no internet connection.
    // No reward is granted. Show a message to the player if needed.
    console.log("No rewarded ad available");
    if (typeof window.onNoRewardedAd === "function") {
        window.onNoRewardedAd();
    }
}

integration.landscape = function (){
    try{
        Android.landscape()
    }catch(e){
        console.log(e)
    }
}

integration.portrait = function (){
    try{
        Android.portrait()
    }catch(e){
        console.log(e)
    }
}


integration.removeAds = function(){ return;
    try{
        void 0
    }catch(e){
        console.log(e)
    }
}

integration.ads = true
integration.itsads = function(n){
    if(n == 1){
        integration.hideBanner()
        integration.ads = true
    }else{
        integration.ads = false
    }
}
