Ext.application({
    name: 'ESISystem',
    requires: [
        'ESISystem.util.Splashscreen',
        'ESISystem.util.LoginSplashscreen'
    ],
    launch: function () {
        ESISystem.util.LoginSplashscreen.fadeOut(2000);
    },
    init: function () {
        ESISystem.util.LoginSplashscreen.init();  
    }
});


