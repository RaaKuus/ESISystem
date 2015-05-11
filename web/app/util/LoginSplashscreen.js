Ext.define('ESISystem.util.LoginSplashscreen', {
    extend: 'ESISystem.util.Splashscreen',
    singleton: true,
    requires: [
        'ESISystem.view.login.LoginView'
    ],
    listeners: {
        loading: function () {
            console.log('[LoginSplashscreen] loading...');
        },
        afteranimate: function () {
            Ext.widget('login');
        }
    }
});


