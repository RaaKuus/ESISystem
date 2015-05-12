Ext.application({
    name: 'ESISystem',
    requires: [
        'ESISystem.util.splashscreen.LoginSplashscreen'
    ],
    splashscreen: null,
    launch: function () {
        this.splashscreen.fadeOut();
    },
    init: function () {
        this.splashscreen = Ext.widget('loginsplashscreen');
    }
});


